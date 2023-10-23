import java.io.PrintStream;
import java.util.Scanner;
public class ejercicio27 {

    public static PrintStream screen = System.out;

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int dia;
        int mes;
        screen.println("Ingrese el dia en el que usted nacio");
        dia= keyboard.nextInt();
        screen.println("Ingrese el numero del mes al que usted nacio");
        mes= keyboard.nextInt();
        switch (mes) {
            case 1:
                /*enero */
                if (dia >= 21)
                    System.out.println("Su signo es acuario");
                else
                    System.out.println("Su signo es capricornio");
                break;
            case 2:
                /*febrero */
                if (dia >= 20)
                    System.out.println("Su signo es piscis");
                else
                    System.out.println("Su signo es acuario");
                break;
            case 3:
                /*marzo */
                if (dia >= 21)
                    System.out.println("Su signo es aries");
                else
                    System.out.println("Su signo es piscis");
                break;
            case 4:
                /*abril */
                if (dia >= 20)
                    System.out.println("Su signo es tauro");
                else
                    System.out.println("Su signo es aries");
                break;
            case 5:
                /*mayo */
                if (dia >= 21)
                    System.out.println("Su signo es geminis");
                else
                    System.out.println("Su signo es tauro");
                break;
            case 6:
                /*junio */
                if (dia >= 21)
                    System.out.println("Su signo es cancer");
                else
                    System.out.println("Su signo es geminis");
                break;
            case 7:
                /*julio */
                if (dia >= 23)
                    System.out.println("Su signo es leo");
                else
                    System.out.println("Su signo es cancer");
                break;
            case 8:
                /*agosto */
                if (dia >= 23)
                    System.out.println("Su signo es virgo");
                else
                    System.out.println("Su signo es leo");
                break;
            case 9:
                /*desde septiembre */
                if (dia >= 23)
                    System.out.println("Su signo es libra");
                else
                    System.out.println("Su signo es virgo");
                break;
            case 10:
                /*octubre */
                if (dia >= 23)
                    System.out.println("Su signo es escorpio");
                else
                    System.out.println("Su signo es libra");
                break;
            case 11:
                /*se siente noviembre */
                if (dia >= 22)
                    System.out.println("Su signo es sagitario");
                else
                    System.out.println("Su signo es escorpio");
                break;
            case 12:
                /*que viene diciembre */
                if (dia >= 22)
                    System.out.println("Su signo es capricornio");
                else
                    System.out.println("Su signo es sagitario");
                break;
        }
    }
}