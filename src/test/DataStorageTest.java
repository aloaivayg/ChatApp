package test;

import model.DataStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataStorageTest {
    DataStorage dataStorage;
    @BeforeEach
    void setUp() {
        dataStorage = DataStorage.createStorage();
    }

    @Test
    void addUser() {
        String un = "Bao";
        String pwd = "admin";

        assertTrue(dataStorage.addUser(un, pwd));
    }
}