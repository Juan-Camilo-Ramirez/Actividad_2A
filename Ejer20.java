import java.io.PrintStream;
import java.util.Scanner;

public class Ejer20{
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        int num=0;
        screen.println("ingrese un número entero:");
        num=keyboard.nextInt();
        if(num%2==0){screen.println("el número " + num + " es par.");}
        else{screen.println("el número " + num + " es impar." );} 

               





    }

}