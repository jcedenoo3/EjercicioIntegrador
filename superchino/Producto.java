/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author jimec
 */
class Producto {
    public int codigoPro;
    public String nombrePro;
    public float cantidad;
    public String tipo;

    public Producto(int codigoPro, String nombrePro, float cantidad, String tipo) {
        this.codigoPro = codigoPro;
        this.nombrePro = nombrePro;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getCodigoPro() {
        return codigoPro;
    }

    public void setCodigoPro(int codigoPro) {
        this.codigoPro = codigoPro;
    }

    public String getNombrePro() {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro) {
        this.nombrePro = nombrePro;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
  
    
    
    
    
}
