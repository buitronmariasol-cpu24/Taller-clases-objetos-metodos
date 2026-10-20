import java.time.LocalDate;
import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primer nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Dia de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.print("Anio de nacimiento: ");
        int anio = entrada.nextInt();

        // validaciones de la fecha
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            System.out.println("Fecha invalida");
            return;
        }
        if (anio > LocalDate.now().getYear() || anio < 1900) {
            System.out.println("Anio invalido");
            return;
        }

        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

        System.out.println("\nNombre: " + persona.obtenerPrimerNombre() + " " + persona.obtenerApellido());
        System.out.println("Fecha de nacimiento: " + persona.obtenerDiaNacimiento() + "/"
                + persona.obtenerMesNacimiento() + "/" + persona.obtenerAnioNacimiento());
        System.out.println("Edad: " + persona.calcularEdad() + " anios");
        System.out.println("Frecuencia cardiaca maxima: " + persona.calcularFrecuenciaMaxima());
        System.out.println("Rango esperado: " + persona.calcularFrecuenciaEsperadaMinima()
                + " - " + persona.calcularFrecuenciaEsperadaMaxima());

        entrada.close();
    }
}