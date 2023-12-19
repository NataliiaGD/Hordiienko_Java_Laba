package com.laba.solvd.airport.reflection;

import com.laba.solvd.airport.Aircraft;
import com.laba.solvd.airport.Airline;
import com.laba.solvd.airport.CustomLinkedList;
import com.laba.solvd.airport.Employee;
import com.laba.solvd.airport.enums.AirlineName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import static com.laba.solvd.airport.enums.AirlineName.LUFTHANSA;

public class Reflection {

    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Reflection.class);

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {

        List<Aircraft> listOfAircraft = new ArrayList<>();
        listOfAircraft.add(new Aircraft(1, "Boeing777"));
        listOfAircraft.add(new Aircraft(2, "AirBus320"));

        CustomLinkedList<Employee> listOfEmployees = new CustomLinkedList<>();
        listOfEmployees.add(new Employee("Bob", 35, "1abc", "Pilot", 5));
        listOfEmployees.add(new Employee("Robert", 37, "2abc", "Pilot", 8));
        listOfEmployees.add(new Employee("Kate", 30, "3abc", "CabinCrew", 5));

        Class<?> airlineClass = Airline.class;

        Field[] fields = airlineClass.getDeclaredFields();
        for (Field field : fields) {
            LOGGER.info(field);
        }
        Constructor<?>[] constructor = airlineClass.getDeclaredConstructors();
        for (Constructor constructor1 : constructor) {
            LOGGER.info(constructor1);
        }
        Method[] methods = airlineClass.getDeclaredMethods();
        for (Method method : methods) {
            LOGGER.info(method);
        }

        Constructor<?> airlineConstructor = airlineClass.getDeclaredConstructor(AirlineName.class, int.class, List.class, CustomLinkedList.class);
        Airline airline = (Airline) airlineConstructor.newInstance(LUFTHANSA, 200, listOfAircraft, listOfEmployees);

        Method printMethod = airlineClass.getDeclaredMethod("printAirLineInfo");
        printMethod.invoke(airline);
    }
}
