package Trabajo_Toni_Sebas_Santos;

import javax.swing.JOptionPane;

public class MainApp {

    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Camiseta", 20.0, 50, 21);
        Producto producto2 = new Producto("Pantalón", 30.0, 30, 21);

        while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "---- Menú Principal ----\n" + "1. Ver lista de productos\n" + "2. Comprar producto\n"
                            + "3. Realizar venta\n" + "4. Modo Administrador\n" + "5. Salir\n"
                            + "Seleccione una opción:");

            if (opcion == null) {
                return;
            }

            switch (opcion) {
                case "1":
                  
                    mostrarProductos(producto1, producto2);
                    break;
                case "2":
                    System.out.println("Comprar producto");
                    // Aquí puedes implementar la lógica para comprar un producto
                    break;
                case "3":
                    System.out.println("Realizar venta");
                    // Aquí puedes implementar la lógica para realizar una venta
                    break;
                case "4":
                    System.out.println("Modo Administrador");
                    // Aquí puedes implementar la lógica para el modo administrador
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
            }
        }
    }

    private static void mostrarProductos(Producto... productos) {
        for (Producto producto : productos) {
            System.out.println(producto.getNombre() + "\t\t$" + producto.getPrecio() + "\t\t" +
                    producto.getCantidadDisponible() + "\t\t" + producto.getIva());
        }
    }
}

