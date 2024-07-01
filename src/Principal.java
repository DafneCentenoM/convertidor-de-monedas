import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String cantidadMonedas;
        int opcionMenu=0;

        Scanner sc = new Scanner(System.in);
        ConsultaConversor consult = new ConsultaConversor();

        while (opcionMenu != 7){
                try {

                    System.out.println("*************************************************");
                    System.out.println("Sea bienvenido/a al Conversor de Monedas ");
                    System.out.println("Elija una opción válida");
                    System.out.println(
                            "1) Dólar =>> Peso argentino \n" +
                                    "2) Peso argentino =>> Dólar \n" +
                                    "3) Dólar =>> Real Brasileño \n" +
                                    "4) Real Brasileño =>> Dólar \n" +
                                    "5) Dólar =>> Peso colombiano \n" +
                                    "6) Peso colimbiano =>> Dólar \n" +
                                    "7) Salir"
                    );
                    opcionMenu = sc.nextInt();
                    sc.nextLine();

                    System.out.println("*************************************************");

                    switch (opcionMenu) {
                        case 1:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("1) Dólar =>> Peso argentino");
                            CambiarMonedas.conversion("USD", "ARS", consult, cantidadMonedas);
                            break;
                        case 2:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("2) Peso argentino =>> Dólar");
                            CambiarMonedas.conversion("ARS", "USD", consult, cantidadMonedas);
                            break;
                        case 3:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("3) Dólar =>> Real Brasileño");
                            CambiarMonedas.conversion("USD", "BRL", consult, cantidadMonedas);
                            break;
                        case 4:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("4) Real Brasileño =>> Dólar");
                            CambiarMonedas.conversion("BRL", "USD", consult, cantidadMonedas);
                            break;
                        case 5:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("5) Dólar =>> Peso colombiano");
                            CambiarMonedas.conversion("USD", "COP", consult, cantidadMonedas);
                            break;
                        case 6:
                            System.out.println("Inserta la cantidad de monedas a convertir: ");
                            cantidadMonedas = sc.nextLine();
                            System.out.println("6) Peso colombiano =>> Dólar");
                            CambiarMonedas.conversion("COP", "USD", consult, cantidadMonedas);
                            break;
                        case 7:
                            System.out.println("Saliendo del programa");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción incorrecta. Ingresa una opción válida");
                    }
                }catch (Exception e){
                    System.out.println("Dato inválido intenta de nuevo " );
                    break;
                }

        }
    }
}