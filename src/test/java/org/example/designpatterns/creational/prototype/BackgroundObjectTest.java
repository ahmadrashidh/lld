package org.example.designpatterns.creational.prototype;

import org.junit.Test;

import static org.junit.Assert.assertNotSame;

public class BackgroundObjectTest {

    @Test
    public void checkClone(){
        BackgroundObject bgObj = new BackgroundObject(2.1,3.4,4.78,13.23,25.23,BackgroundType.TREE);

        assertNotSame(bgObj, bgObj.clone());
    }
}
