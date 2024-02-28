public class Pedido {
   private String Nombre;
   private String Direccion;
   private String Producto;
   private String Cantidad;
   //revisar despues implementacion de variantes como tamano, color, modelo
   //No se crea constructor para mayor flexibilidad del codigo
public String getNombre() {
    return Nombre;
}
public void setNombre(String nombre) {
    Nombre = nombre;
}
public String getDireccion() {
    return Direccion;
}
public void setDireccion(String direccion) {
    Direccion = direccion;
}
public String getProducto() {
    return Producto;
}
public void setProducto(String producto) {
    Producto = producto;
}
public String getCantidad() {
    return Cantidad;
}
public void setCantidad(String cantidad) {
    Cantidad = cantidad;
}
   
}
