public class CambiarMonedas {

    public static void conversion(String monedaBase, String cambioMoneda, ConsultaConversor consult, String cantidadMonedas) {
        double totalConversionMonedas;
        double cantidad;

        Monedas monedas = consult.buscaMonedas(monedaBase, cambioMoneda);
        System.out.println("Conversion: " + monedaBase + " a " + cambioMoneda);
        try {
            cantidad = Double.parseDouble(cantidadMonedas);
            totalConversionMonedas = cantidad * monedas.conversion_rates().get(cambioMoneda);
            System.out.println("El total es: "  + totalConversionMonedas + " " + cambioMoneda);
        } catch (NumberFormatException e) {
            System.out.println("La cantidad ingresada no es un número válido");
        }
    }
}

