//package repository;
//
//import model.Message;
//import model.User;
//
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.function.Predicate;
//
//public class MessageRepository implements IRepository{
//    String filePath = "UserData";
//
//    private String fileNameChar = "Book_Data_Character.txt";
//    private String fileNameByte = "Book_Data_Byte.txt";
//
//    List<Message> messageList = new ArrayList<>();
//
//
//    public MessageRepository() {
//        createFolder();
//    }
//
//    public void saveListMessageAsByte(ArrayList<Message> listMsg) {
//        FileOutputStream fos = null;
//        ObjectOutputStream oos = null;
//        try {
//            fos = new FileOutputStream(filePath + "\\" + fileNameByte);
//            oos = new ObjectOutputStream(fos);
//
//            oos.writeObject(listMsg);
//            oos.flush();
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                fos.close();
//                oos.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//
//    public ArrayList<Message> readListMessageAsByte() {
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        ArrayList<Message> listMsg = new ArrayList<>();
//        try {
//            fis = new FileInputStream(filePath + "\\" + fileNameByte);
//            ois = new ObjectInputStream(fis);
//            listMsg = (ArrayList<Message>) ois.readObject();
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } catch (ClassNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                fis.close();
//                ois.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//        return listMsg;
//    }
//
//    public void saveListMessageAsChar(ArrayList<Message> listMsg) {
//        FileWriter fw = null;
//        BufferedWriter bw = null;
//        try {
//            fw = new FileWriter(filePath + "\\" + fileNameChar);
//            bw = new BufferedWriter(fw);
//
//            for (int i = 0; i < listMsg.size(); i++) {
//                bw.write(listMsg.get(i).toString());
//                bw.newLine();
//            }
//
//            bw.flush();
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            try {
//                fw.close();
//                bw.close();
//            } catch (IOException ex) {
//                System.out.println(ex.getMessage());
//            }
//        }
//    }
//
//    public void createFolder() {
//        File folder = new File(filePath);
//        if (folder.exists()) {
//            System.out.println("Folder exist");
//        } else {
//            folder.mkdirs();
//            System.out.println("Folder created");
//        }
//    }
//
//
////
////    @Override
////    public Message get(String keyword) {
////        for (Message msg: messageList) {
////            if (msg.getContent().contains(keyword)) {
////                return msg;
////            }
////        }
////        return null;
////    }
////
////    public List<Message> getSearchResult(List<Message> userMessages, String keyword) {
////        List<Message> searchResult = new ArrayList<>();
////        for (Message msg: userMessages) {
////            if (msg.getContent().contains(keyword)) {
////                searchResult.add(msg);
////            }
////        }
////        return searchResult;
////    }
////
////    public List<Message> getLatestMessage(List<Message> userMessages, String keyword) {
////        List<Message> searchResult = new ArrayList<>();
////        for (Message msg: userMessages) {
////            if (msg.getContent().contains(keyword)) {
////                searchResult.add(msg);
////            }
////        }
////        return searchResult;
////    }
////
////
////    @Override
////    public int getIndex(String id) {
////        return 0;
////    }
////
////    @Override
////    public List<Message> getAll() {
////        return null;
////    }
////
////    @Override
////    public void add(Object obj) {
////        if (!messageList.contains((Message) obj)) {
////            messageList.add((Message) obj);
////        }
////    }
////
////    @Override
////    public void update(Object obj) {
////
////    }
////
////    @Override
////    public void remove(String id) {
////
////    }
//
//}
