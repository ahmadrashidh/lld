package org.example.designpatterns.creational.singleton;


public class Database {
    // 1. Create a private static field to refer the instance
    private static Database INSTANCE;

    // 2. Make default constructor private to prevent other object from using new operator.
    private Database(){}

    // 3. Create static method that acts as a constructor but modified to return if an instance already exists.
    public static Database getInstance(){

        // 4. Synchronise the lock using `double-checked lock` mechanism
        if(INSTANCE == null){
            synchronized(Database.class){
                if(INSTANCE == null)
                    INSTANCE = new Database();
            }
        }

        return INSTANCE;
    }

}
