package com.bg.db;

import org.junit.Test;
import static org.junit.Assert.*;

public class DBTest {
    private IDB createDB(){
        return new SimpleDB();
    }

    @Test
    public void storeToBase(){
        IDB db = createDB();
        db.storeData("String 1");
        assertEquals("Received data is :","String 1",db.receiveData());
    }
}
