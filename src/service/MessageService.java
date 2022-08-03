package service;

import model.DataStorage;

public class MessageService {
    private final DataStorage dataStorage;

    public MessageService() {
        dataStorage = DataStorage.createStorage();
    }


}
