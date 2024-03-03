

import javax.swing.JOptionPane;

public class Lista {
    Nodo Cabeza; // Nodo Cabeza de la lista

    public Lista() {
        this.Cabeza = null;
    }

    // metodos
    public void agregarPedido(Pedido pedido) {

        Nodo nodoNuevo = new Nodo(pedido);
        if (Cabeza == null) {
            Cabeza = nodoNuevo;

        } else {
            Nodo temporal = Cabeza;
            while (temporal.Siguiente != null) {
                temporal = temporal.Siguiente;
            }
            temporal.Siguiente = nodoNuevo;

        }
    };

    public void editarPedido(int posicion) {
        Pedido pedido = new Pedido();
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error: La posición debe ser no negativa.");
            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.Siguiente;
            indice++;
        }

        if (actual == null) {
            JOptionPane.showMessageDialog(null, "Error: La posición está más allá del final de la lista.");
        } else {
            pedido.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del pedido:"));
            pedido.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del pedido:"));
            pedido.setProducto(
                    JOptionPane.showInputDialog(null, "Ingrese el producto con el que desea reemplazar el actual:"));
            pedido.setCantidad((JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad de producto:")));

        }
        actual.Pedido = pedido;
        JOptionPane.showMessageDialog(null, "Pedido en la posición " + posicion + " editado correctamente.");
    }

    public void eliminarPedido(int posicion) {
        if (posicion < 0) {
            JOptionPane.showMessageDialog(null, "Error: La posición debe ser no negativa.");
            return;
        }

        if (posicion == 0) {
            Cabeza = Cabeza.Siguiente; // Elimina el primer nodo (cabeza).
            JOptionPane.showMessageDialog(null, "Pedido en la posición " + posicion + " eliminado correctamente.");
            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion - 1) {
            actual = actual.Siguiente;
            indice++;
        }

        if (actual == null || actual.Siguiente == null) {
            JOptionPane.showMessageDialog(null, "Error: La posición está más allá del final de la lista.");

            return;
        }

        actual.Siguiente = actual.Siguiente.Siguiente; // Elimina el nodo en la posición especificada.
        JOptionPane.showMessageDialog(null, "Pedido en la posición " + posicion + " eliminado correctamente.");

    }

    public void mostrarPedido() {
        if (Cabeza == null) {
            JOptionPane.showMessageDialog(null, "No hay pedidos en esta lista.");

        } else {
            Nodo temporal = Cabeza;
            JOptionPane.showMessageDialog(null, "Pedidos encontrados:");

            while (temporal != null) {
                JOptionPane.showMessageDialog(null, "Nombre: " + temporal.Pedido.getNombre() + " ");
                JOptionPane.showMessageDialog(null, "Dirección: " + temporal.Pedido.getDireccion() + " ");
                JOptionPane.showMessageDialog(null, "Producto: " + temporal.Pedido.getProducto() + " ");
                JOptionPane.showMessageDialog(null, "Cantidad: " + temporal.Pedido.getCantidad() + " ");

                temporal = temporal.Siguiente;
            }
            System.out.println();

        }
    };
}
