package org.example.designpatterns.creational.singleton;

import org.junit.Test;
import static org.junit.Assert.assertSame;


public class DatabaseTest {

    @Test
    public void checkSingleton(){
        Database instance = Database.getInstance();
        assertSame(Database.getInstance(), instance);
    }

}
