/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;

/**
 *
 * @author jimec
 */
public class SuperChino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //informacion de producto
         Producto arrProducto[] = new Producto[1];
        for(int x=0; x< arrProducto.length; x++){
         int codigoPro = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto:"));
         String nombrePro = JOptionPane.showInputDialog("Nombre del producto");
         float cantidad = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite la cantidad de productos:"));
         String tipo = JOptionPane.showInputDialog("Tipo de produtos:");
      
         
         
         
         
         //informacion de supermercado
        Supermercado arrSupermercado[] = new Supermercado[1];
        for(int i=0; x< arrSupermercado.length; x++){
            int codigoSuper = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del supermercado:"));
         String nombreSuper = JOptionPane.showInputDialog("Nombre del supermercado");
            
            
        }
         
         
          
    }
    
}
    }
