package week9;

import java.io.*;

public class Utils {

    public static String readContentFromFile(String path){
        File file = new File(path);

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String text;
            while ((text = br.readLine()) != null){
                System.out.println(text);
            }

            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound");
        } catch (IOException e) {
            System.out.println("IO Error");
        }
        return "Successful";
    }

    public static void writeContentToFile(String path){
        File file = new File(path);

        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Be yourself, be loved.");
            bw.close();
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }

    public static void writeMore(String path) {
        File file = new File(path);

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.newLine();
            bw.write("Don't change yourself to win someone's heart.");
            bw.newLine();
            bw.write("Stay true and you'll find someone who likes you for being yourself.");
            bw.close();
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
    public static File findFileByName(String folderPath, String fileName) {
        File file, f = null;
        File[] files;
        file = new File(folderPath);
        if (file.exists()) {
            files = file.listFiles();

            for (int i = 0; i < files.length; i++) {
                if (files[i].getName().equals(fileName)) {
                    f = files[i];
                    break;
                }
            }
            return f;
        }
        else return null;
        /*} catch (Exception e) {
            System.out.println("Somethingwrong");
        }*/
        //return f;
    }

    public static void main(String[] args){
        String path = "C:\\OOP_7.txt";
        readContentFromFile(path);
        System.out.println("\n");

        /*writeContentToFile(path);
        readContentFromFile(path);
        System.out.println("\n");*/

        writeMore(path);
        readContentFromFile(path);
        System.out.println("\n");

        writeContentToFile(path);
        readContentFromFile(path);
        System.out.println("\n");

        /*File file_1 = new File((findFileByName("C:\\OOP_7", "Howhow.txt")).getAbsolutePath());
        readContentFromFile(file_1.getPath());
        System.out.println("\n");

        String filepath = findFileByName("C:\\OOP_7", "leuleu.txt").getAbsolutePath();
        File file_2 = new File(filepath);
        readContentFromFile(filepath);
        System.out.println("\n");*/

        System.out.println(findFileByName("C:\\OOP_7", "leuleu.txt"));
        System.out.println(findFileByName("C:\\OOP_7", "OOP_7.txt"));
    }
}