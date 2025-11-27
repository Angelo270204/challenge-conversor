package lad.com.alura.conversor;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaConversion consulta = new ConsultaConversion();

        try {
            RespuestaPeticion response = consulta.obtenerDatos();

            Double pesoArgentino = response.conversionRates().get("ARS");
            Double realBrasileno = response.conversionRates().get("BRL");
            Double pesoColombiano = response.conversionRates().get("COP");

            int opcion;
            double cantidad;

            while (true) {
                InterfazConsola.exhibirMenu();
                opcion = scan.nextInt();

                if (opcion == 7) {
                    break;
                }

                if (opcion > 7 || opcion < 1) {
                    System.out.println("⚠️ Elija una opción válida, por favor.");
                    continue;
                }

                System.out.print("Ingrese la cantidad que desea convertir: ");
                cantidad = scan.nextDouble();

                String mensaje = switch (opcion) {
                    case 1 ->
                            String.format("El valor %.1f [USD] corresponde al valor final de =>>> %.2f [ARS]", cantidad, cantidad * pesoArgentino);
                    case 3 ->
                            String.format("El valor %.1f [USD] corresponde al valor final de =>>> %.2f [BRL]", cantidad, cantidad * realBrasileno);
                    case 5 ->
                            String.format("El valor %.1f [USD] corresponde al valor final de =>>> %.2f [COP]", cantidad, cantidad * pesoColombiano);

                    case 2 ->
                            String.format("El valor %.1f [ARS] corresponde al valor final de =>>> %.2f [USD]", cantidad, cantidad / pesoArgentino);
                    case 4 ->
                            String.format("El valor %.1f [BRL] corresponde al valor final de =>>> %.2f [USD]", cantidad, cantidad / realBrasileno);
                    case 6 ->
                            String.format("El valor %.1f [COP] corresponde al valor final de =>>> %.2f [USD]", cantidad, cantidad / pesoColombiano);

                    default -> "Error inesperado";
                };

                System.out.println(mensaje);
            }

            System.out.println("Gracias por usar la aplicación!!!");

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
