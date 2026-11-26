// Muestra la configuración de algunos valores de la tienda que NO cambian por consola
public class ConfiguracionTienda {
    
    public static void main(String[] args) {
        
        // Valores constantes establecidos que NO cambian
        final String NOMBRE_TIENDA = "TECHSTORE";
        final double PORCENTAJE_IVA = 19;
        final double PORCENTAJE_DESCUENTO = 10;
        final double VALOR_MINIMO_ENVIO_GRATIS = 5000.0;

        // Variables para representar un producto
        String nombreProducto = "Teclado mecánico RGB";
        String codigoReferencia = "TEC-001";
        double precioProducto = 189900.0;
        int inventario = 15;
        boolean disponible = true;
        char inicialFabricante = 'L';

        // Calculo de precio con IVA
        double precioConIVA = precioProducto + (precioProducto * PORCENTAJE_IVA / 100);

        // Resultado en consola
        System.out.println("================================");
        System.out.println("          " + NOMBRE_TIENDA + "             ");
        System.out.println("================================");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Código: " + codigoReferencia);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Inventario: " + inventario + " unidades");
        System.out.println("Disponible: " + disponible);
        System.out.println("Fabricante: " + inicialFabricante);
        System.out.println("================================");
        System.out.println();
        System.out.println("- Nombre de la tienda: " + NOMBRE_TIENDA);
        System.out.println("- Porcentaje de IVA: " + PORCENTAJE_IVA + "%");
        System.out.println("- Porcentaje de descuento: " + PORCENTAJE_DESCUENTO + "%");
        System.out.println("- Valor mínimo de compra: $" + VALOR_MINIMO_ENVIO_GRATIS);
        System.out.println("---------------- o -------------------");
        System.out.println("Precio (con IVA): $" + precioConIVA);

    }

}
