package epn.edu.ec;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("Ejecutable");
        Calculator c = new Calculator();
        int suma = c.suma(13, 2);
        System.out.println("Suma: " + "c.suma(13,2) = " + suma);
        int resta = c.resta(13, 2);
        System.out.println("Resta: " + "c.resta(13,2) = " + resta);

        int multiplicacion = c.multiplicacion(13, 2);
        System.out.println("Multiplicacion: " + "c.multiplicacion(13,2) = " + multiplicacion);

        double division = c.division(13, 2);
        System.out.println("Division: " + "c.division(13,2) = " + division);

        System.out.println("A continuacion se agregara una nueva operacion matematica");
        double division2 = c.division(14, 8);
        System.out.println("Division: " + "c.division(14,8) = " + division2);
        System.out.println("Excelente fin");
        System.out.println("Se agrego correctamente todo :)");
    }
}
