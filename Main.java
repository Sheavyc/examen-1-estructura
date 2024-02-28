import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        int Opcion = 0;
        int posicion;

        do {
            try {
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Bienvenido a su sistema administrador de pedidos, seleccione un valor para continuar \n"
                                + "1 - Agregar nuevo pedido\n"
                                + "2 - Editar pedido \n"
                                + "3 - Eliminar pedido existente \n"
                                + "4 - Mostrar pedidos almacenados \n"
                                + "5 - Salir"));
                switch (Opcion) {
                    case 1:
                        Pedido producto = new Pedido();
                        producto.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del pedido:"));
                        producto.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la dirección del pedido:"));
                        producto.setProducto(JOptionPane.showInputDialog(null, "Ingrese el producto del pedido:"));
                        producto.setCantidad(
                                JOptionPane.showInputDialog(null, "Ingrese la cantidad de producto del pedido:"));
                        lista.agregarPedido(producto);
                        JOptionPane.showMessageDialog(null, "Pedido Agregado");
                        break;
                    case 2:
                        posicion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "En qué posición se encuentra el pedido que quieres editar?"));
                        lista.editarPedido(posicion);
                        break;
                    case 3:
                        // según posición o dirección de envío
                        posicion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "En qué posición se encuentra el pedido que quieres eliminar?"));
                        lista.eliminarPedido(posicion);
                        break;
                    case 4:
                        lista.mostrarPedido();
                        break;
                    case 5:
                        if (JOptionPane.showConfirmDialog(null, "Seguro que desea salir?") != 0) {
                            Opcion = 0;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Cerrando sesión en el programa de gestión de pedidos...");
                            JOptionPane.showMessageDialog(null, "Nos vemos pronto!");
                        }
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione un valor del 1 al 6");
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }

        } while (Opcion != 5);

    }
}