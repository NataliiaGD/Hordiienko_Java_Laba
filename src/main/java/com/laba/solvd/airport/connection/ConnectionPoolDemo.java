package com.laba.solvd.airport.connection;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionPoolDemo {
    public static void main(String[] args) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        ExecutorService executorService = Executors.newFixedThreadPool(7);

        CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    Connection connection = connectionPool.getConnection();
                    System.out.println(Thread.currentThread().getName() + " T" + (i + 1) + "has received connection: " + connection.getName());
                    Thread.sleep(2000);
                    connectionPool.releaseConnection(connection);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, executorService);

        CompletableFuture<Void> completableFuture2 = CompletableFuture.runAsync(() -> {
            try {
                for (int i = 0; i < 2; i++) {
                    Connection connection = connectionPool.getConnection();
                    System.out.println(Thread.currentThread().getName() + " T" + (i + 1) + " has received connection " + connection.getName());
                    Thread.sleep(2000);
                    connectionPool.releaseConnection(connection);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, executorService);

        CompletableFuture.allOf(completableFuture1, completableFuture2).join();
        executorService.shutdown();

    }
}
