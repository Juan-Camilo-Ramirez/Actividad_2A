import java.io.PrintStream;
import java.util.Scanner;

public class Ejer21 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        int num=0;
        screen.println("Ingresar un número");
        num=keyboard.nextInt();
        if(num==0){screen.println("El número es cero(0)");}
        else if(num>0){screen.println("el número es positivo(+)");}
        else if(num<0){screen.println("El número es negativo(-)");}    
    }    
}
