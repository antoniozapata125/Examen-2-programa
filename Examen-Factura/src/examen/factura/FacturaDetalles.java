/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.factura;

/**
 *
 * @author Bryan Sandoval
 */
public class FacturaDetalles {
    
    double Cantida;
    String Descripccion;
    double valor;
    String Detalle;
    double total;



   public FacturaDetalles(double Cantida, String Descripccion, double valor,double total) {
        this.Cantida = Cantida;
        this.Descripccion = Descripccion;
        this.valor = valor;
        this.total= Cantida * valor;
       
    }

    
    
    public double gettotal() {
        return total;
    }

    public void settotal(double total) {
        this.total = Cantida * valor;
    }
   
    public FacturaDetalles() {
    }

    public double getCantida() {
        return Cantida;
    }

    public void setCantida(double Cantida) {
        this.Cantida = Cantida;
    }

    public String getDescripccion() {
        return Descripccion;
    }

    public void setDescripccion(String Descripccion) {
        this.Descripccion = Descripccion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 
    
}
