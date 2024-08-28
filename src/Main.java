import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una palabra:");
        String Palabra = scanner.nextLine();

        // Las expresiones regulares
        String HolaMundo = "(?i)^Hola mundo$";
        String PalabrasVarias = "\\b(?:Java|Python|Go|Pascal|Perl)\\b";
        String unisoncorreo = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        String nombrearchivo = "^ISI\\d{4}-[12]\\.(?:txt|csv)$";

        // comparacion de palabras
        System.out.println("¿Es una expresión válida?");
        System.out.println("Hola mundo: " + Pattern.matches(HolaMundo, Palabra));
        System.out.println("Palabras: " + Pattern.matches(PalabrasVarias, Palabra));
        System.out.println("Correo UNISON: " + Pattern.matches(unisoncorreo, Palabra));
        System.out.println("Nombre de archivo: " + Pattern.matches(nombrearchivo, Palabra));

        scanner.close();
    }
}