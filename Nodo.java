public class Nodo {

    // Se crea un objeto de tipo producto, el cual sera mi nodo
    Pedido Pedido;
    // Segundo Elemento: Otro Nodo
    Nodo Siguiente;

    public Nodo(Pedido pedido) {
        Pedido = pedido;
        Siguiente = null;
    }
}
