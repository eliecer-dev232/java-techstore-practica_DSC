// Calculadora de Compras por consola

import java.util.Scanner;

public class CalculadoraCompras {

    public static void main(String[] args) {

        // Valores constantes establecidos que NO cambian
        final double PORCENTAJE_IVA = 19;
        final double PORCENTAJE_DESCUENTO = 10;

        Scanner entrada = new Scanner(System.in);

        System.out.println("-- CALCULADORA DE COMPRAS --");

        // Pedir datos al usuario y asignando a cada variable según su tipo
        System.out.print("- Ingrese el nombre del producto: ");
        String nombreProducto = entrada.nextLine();

        System.out.print("- Ingrese el precio unitario: $");
        double precioUnitario = entrada.nextDouble();

        System.out.print("- Ingrese la cantidad que desea comprar: ");
        int cantidad = entrada.nextInt();
        entrada.nextLine(); // esto se usa luego de leer un entero/double o numero.

        entrada.close();

        // Fórmulas de calculadora
        double subTotal = precioUnitario * cantidad;
        double iva = subTotal * PORCENTAJE_IVA / 100;
        double total = subTotal + iva;
        // plus: Reto adicional
        double dineroAhorrado = subTotal * PORCENTAJE_DESCUENTO / 100;

        // Impresión de resultados de la calculadora
        System.out.println("---------------------- o -----------------------");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("IVA: $" + iva);
        System.out.println("----------------------");
        System.out.println("TOTAL A PAGAR: $" + total);
        System.out.println("=============");
        System.out.println("Dinero ahorrado (descuento del 10%): $" + dineroAhorrado);

    }

}