package service;

import model.datastorage.DataStorage;
import model.enums.FileType;

import java.io.*;

public class FileService {
    private static String filePath = "FileData";

    private DataStorage dataStorage;


    public FileService() {
        dataStorage = DataStorage.createStorage();
        createFolder();
    }

    public boolean createFolder() {
        File folder = new File(filePath);
        if (!folder.exists()) {
            return folder.mkdirs();
        }
        return false;
    }

    public model.File createFile(String filename, FileType fileType, String sender, String receiver) {
        model.File file = new model.File(filename, fileType, sender, receiver);
        dataStorage.fileRepository.insert(file);
        return file;
    }

    public void saveFileToFolder(model.File file) throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(filePath + "\\" + file.getFilename());
            bw = new BufferedWriter(fw);

            bw.write(file.toString());
            bw.newLine();

            bw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                fw.close();
                bw.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void removeFile(model.File file) {
        dataStorage.fileRepository.delete(file);
    }

    public boolean removeSavedFile(String fileName) {
        File file = new File(filePath + "\\" + fileName);
        try {
            return file.delete();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }


}
