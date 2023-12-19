package com.laba.solvd.airport.connection;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ConnectionPool {
    private static final int POOL_SIZE = 5;
    private static BlockingQueue<Connection> connectionPool;
    private volatile static ConnectionPool instance;

    private ConnectionPool() {
        initializePool();
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    private static synchronized void initializePool() {
        if (connectionPool == null) {
            connectionPool = new LinkedBlockingQueue<>(POOL_SIZE);
            for (int i = 0; i < POOL_SIZE; i++) {
                connectionPool.offer(new Connection("Connection: " + i));
            }
        }

    }

    public static Connection getConnection() {
        initializePool();
        try {
            return connectionPool.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void releaseConnection(Connection connection) {
        initializePool();
        try {
            connectionPool.put(connection);
        } catch (InterruptedException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
