import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio21 {
    static PrintStream screen = System.out; 
    static Scanner keyboard = new Scanner (System.in);
    public static void main(String[] args) {
        int num=0;
        String men="";
        screen.println("ingrese un numero");
        num=keyboard.nextInt();
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
