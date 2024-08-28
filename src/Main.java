import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Se valida si se introdujo un argumento
        if(args.length <= 0){
            System.out.println("No se introdujo ningun argumento");
        }else {
            //se le asigna el argumento a la cadena Argumento
            String Argumento = args[0];
            System.out.println("La cadena es:" + Argumento);


            // Las expresiones regulares
            String HolaMundo = "(?i)^Hola mundo$";
            String PalabrasVarias = "\\b(?:Java|Python|Go|Pascal|Perl)\\b";
            String unisoncorreo = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
            String nombrearchivo = "^ISI\\d{4}-[12]\\.(?:txt|csv)$";

            // comparacion de palabras
            System.out.println("¿Es una expresión válida?");
            System.out.println("Hola mundo: " + Pattern.matches(HolaMundo, Argumento));
            System.out.println("Palabras: " + Pattern.matches(PalabrasVarias, Argumento));
            System.out.println("Correo UNISON: " + Pattern.matches(unisoncorreo, Argumento));
            System.out.println("Nombre de archivo: " + Pattern.matches(nombrearchivo, Argumento));

            scanner.close();
        }

    }
}