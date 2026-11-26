// Muestra la ficha de un producto en consola
public class FichaProducto {
    public static void main(String[] args) {
        
        String nombreProducto = "Teclado mecánico RGB";
        String codigoReferencia = "TEC-001";
        double precioProducto = 189900.0;
        int inventario = 15;
        boolean disponible = true;
        char inicialFabricante = 'L';

        System.out.println("================================");
        System.out.println("          TECHSTORE             ");
        System.out.println("================================");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Código: " + codigoReferencia);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Inventario: " + inventario + " unidades");
        System.out.println("Disponible: " + disponible);
        System.out.println("Fabricante: " + inicialFabricante);
        System.out.println("================================");

    }
}