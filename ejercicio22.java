import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio22 {
    static PrintStream screen = System.out; 
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int num=0;
        int res=0;
        String men="";
        String mensaje="";
        screen.println("ingrese un numero");
        num= keyboard.nextInt();
        res= num%2;
        if(res==0){
            mensaje="el numero ingresado es par";
        }
        else{
            mensaje="el numero ingresado es impar";
        }
        screen.println(mensaje);
        if(num<0){
            men="el numero es negativo";
        }
        else if(num==0){
            men="el numero es 0";
        }
        else{
            men="el numero es positivo";
        }
        screen.println(men);
    }
    
}
