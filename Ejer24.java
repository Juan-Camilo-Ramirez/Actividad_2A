import java.io.PrintStream;
import java.util.Scanner;

public class Ejer24 {
    static PrintStream screen = System.out;
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        float alt1 =0;
        float alt2 =0;
        float alt3 =0;
        float altM=0;
        float altm=0;
        float altp=0;
        float aux=0;
    
        screen.println("Ingresar la altura de la persona 1 en cm:");
        alt1 = keyboard.nextFloat();
        screen.println("Ingresar la altura de la persona 2 en cm:");
        alt2 = keyboard.nextFloat();
        screen.println("Ingresar la altura de la persona 3 en cm:");
        alt3 = keyboard.nextFloat();
       altM=alt1;
       altm=alt2;
       altp=alt3;
       if(altp>altm){
        aux=altp;
        altp=altm;
        altm=aux;}
        if(altm>altM){
            aux=altm;
            altm=altM;
            altM=aux;}
        if(altp>altm){
            aux=altp;
            altp=altm;
            altm=aux;}
            screen.println("el orden ascendente de las alturas es: " + altp + " , " + altm + " , " + altM);

    }
}