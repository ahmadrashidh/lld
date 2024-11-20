package org.example.designpatterns.creational.builder;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class DatabaseTest {

    @Test
    public void checkInstanceBuilder(){
        Database db = Database.builder().setName("mvcdb")
                .setDbType(DatabaseType.MONGO).withCredentials("ahmad","password").compressed().build();

        assertNotNull(db);
    }

}