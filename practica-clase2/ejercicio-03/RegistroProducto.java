import java.util.Scanner;

// Permite a un empleado registrar un producto desde la consola
public class RegistroProducto {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        // Pedir datos al usuario y asignando a cada variable según su tipo
        System.out.print("Ingrese el nombre del producto: ");
        String nombreProducto = entrada.nextLine();

        System.out.print("Ingrese el código del producto: ");
        String codigoProducto = entrada.nextLine();

        System.out.print("Ingrese el precio: ");
        double precio = entrada.nextDouble();
        entrada.nextLine(); // esto se usa luego de leer un entero/double o numero.

        System.out.print("Ingrese la cantidad inicial en inventario: ");
        int cantidadInicial = entrada.nextInt();
        entrada.nextLine(); // esto se usa luego de leer un entero/double o numero.

        System.out.print("Ingrese el nombre del fabricante: ");
        String nombreFabricante = entrada.nextLine();

        entrada.close();

        // Imprimir la ficha del producto registrado
        System.out.println("================================");
        System.out.println("         FICHA PRODUCTO         ");
        System.out.println("================================");
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Código del producto: " + codigoProducto);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad inicial en inventario: " + cantidadInicial + " unidades.");
        System.out.println("Nombre del fabricante: " + nombreFabricante);
        System.out.println("================================");

    }

}
