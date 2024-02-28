import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int Opcion = 0;
      
        do {
            try {
            Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a su sistema administrador de pedidos, seleccione un valor para continuar \n"
                    + "1 - Agregar nuevo pedido\n"
                    + "2 - Editar pedido \n"
                    + "3 - Eliminar pedido existente \n"
                    + "4 - Mostrar pedidos almacenados \n"
                    + "5 - Salir"));
                switch (Opcion) {
                    case 1:
                       
                        break;
                    case 2:
                        
                        break;
                     case 3:
                        
                        break;
                    case 4:
                        //según posición o dirección de envío
                        break;
                    case 5:
                                       
                        break;  
                        case 6:
                        
                        if (JOptionPane.showConfirmDialog(null, "Seguro que desea salir?")!=0) {
                            Opcion = 0;
                        }else{
                            JOptionPane.showMessageDialog(null, "Cerrando sesión en el programa de gestión de pedidos...");
                            JOptionPane.showMessageDialog(null, "Nos vemos pronto!");
                        }
                        break;       
                    default:
                        JOptionPane.showMessageDialog(null, "Seleccione un valor del 1 al 6");
                }
                
                
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(null, e);
            }
                    
            
            
        } while (Opcion != 6);
        
    }
}