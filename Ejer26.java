public class Ejer26 extends Base {

public static void main(String[] args) {
    long pref=0;
    long numcel=0;
    int temporal=0;
    String operador="";

    screen.println("Ingrese el numero de celular");
    numcel=keyboard.nextLong();
    pref=(numcel)/10000000;
    temporal=Math.toIntExact(pref);

    if((temporal>=310 && temporal<=314)||(temporal>=320 && temporal<=323)){operador="CLARO";}
    if(temporal>=315 && temporal<=318){operador="MOVISTAR";}
    if(temporal==319){operador="VIRGIN MOBILE";}
    if(temporal==303){operador="UFF MOVIL";}
    if((temporal>=300 && temporal<=302)||(temporal >= 304 && temporal<=305)){operador="TIGO";}
    

    screen.println("El prefijo es: " + temporal + ", y el operador es: " + operador);}
}
