package org.example.designpatterns.behavioural.observer;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class BitcoinTest {

    private BitcoinManager bitcoinManager;

    @Before
    public void setUp(){
        Bitcoin bitcoin = new Bitcoin(100.0);
        bitcoinManager = new BitcoinManager(new Bitcoin(20.52));
        bitcoinManager.addSubscriber(new EmailAlert());
        bitcoinManager.addSubscriber(new SMSAlert());
    }

    @Test
    public void testNotification(){
        bitcoinManager.updatePrice(30.62);
    }

}