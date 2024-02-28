//import javax.swing.JOptionPane;

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
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del dato que desea cambiar: \n"
                + "1- Nombre \n"
                + "2-Dirección \n"
                + "3-Producto \n"
                + "4- Cantidad \n"));
        switch (op) {
            case 1:
                pedido.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del pedido:"));
                break;
            case 2:
                pedido.setDireccion(JOptionPane.showInputDialog(null, "Ingrese la nueva dirección del pedido:"));
                break;
                case 3:
                pedido.setProducto(JOptionPane.showInputDialog(null, "Ingrese el producto con el que desea reemplazar el actual:"));
                break;
                case 4:
                pedido.setProducto(JOptionPane.showInputDialog(null, "Ingrese la nueva cantidad de producto:"));
                break;

            default:
                break;
        }

       

        if (posicion < 0) {
            System.out.println("Error: La posición debe ser no negativa.");
            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion) {
            actual = actual.Siguiente;
            indice++;
        }

        if (actual == null) {
            System.out.println("Error: La posición está más allá del final de la lista.");
        } else {
            actual.Pedido = pedido;
            System.out.println("Nodo en la posición " + posicion + " editado correctamente.");
        }
    }

    public void eliminarPedido(int posicion) {
        if (posicion < 0) {
            System.out.println("Error: La posición debe ser no negativa.");
            return;
        }

        if (posicion == 0) {
            Cabeza = Cabeza.Siguiente; // Elimina el primer nodo (cabeza).
            System.out.println("Pedido en la posición " + posicion + " eliminado correctamente.");
            return;
        }

        Nodo actual = Cabeza;
        int indice = 0;

        while (actual != null && indice < posicion - 1) {
            actual = actual.Siguiente;
            indice++;
        }

        if (actual == null || actual.Siguiente == null) {
            System.out.println("Error: La posición está más allá del final de la lista.");
            return;
        }

        actual.Siguiente = actual.Siguiente.Siguiente; // Elimina el nodo en la posición especificada.
        System.out.println("Pedido en la posición " + posicion + " eliminado correctamente.");
    }

    public void mostrarPedido() {
        if (Cabeza == null) {
            System.out.print("No hay pedidos en esta lista.");
        } else {
            Nodo temporal = Cabeza;
            System.out.print("Pedidos encontrados:");
            while (temporal != null) {
                System.out.print(temporal.Pedido.getNombre() + " ");
                temporal = temporal.Siguiente;
            }
            System.out.println();

        }
    };
}
