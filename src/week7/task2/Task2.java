package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {
    public void NullPointerException() throws NullPointerException{
        String s = null;
        System.out.println(s.length());
    }

    public void ArrayIndexOfBoundException() throws ArrayIndexOutOfBoundsException{
        int array[] = new int[1];
        System.out.println(array[2]);
    }

    public void ArithmeticException() throws ArithmeticException{
        int division = 1/0;
        System.out.println(division);
    }

    public void ClassCastException() throws ClassCastException{
        class person{};
        class student extends person{};

        person A = new person();
        student B = (student)A;
    }

    public void IOException() throws IOException{
        File file = new File("C:\\OOP_7");
    }

    public void FileNotFound() throws FileNotFoundException{
        File file = new File("C:\\OOP");
        FileReader f = new FileReader(file);
    }

    public static void main(String[] args){
        Task2 Hm = new Task2();

        try {
            Hm.NullPointerException();
        }catch (NullPointerException e){
            System.out.println("NullPoint");
        }

        try {
            Hm.ArrayIndexOfBoundException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOfBound");
        }

        try {
            Hm.ArithmeticException();
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }

        try {
            Hm.ClassCastException();
        }catch (ClassCastException e){
            System.out.println("ClassCast Error");
        }

        try {
            Hm.FileNotFound();
        }catch (FileNotFoundException e){
            System.out.println("FileNotFound");
        }
    }
}
