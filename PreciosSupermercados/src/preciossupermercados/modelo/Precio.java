/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.modelo;

import java.time.LocalDate;


/**
 *
 * @author IVAN
 */
public class Precio implements Exportable{
    //ATRIBUTOS
    
    private int id;
    private Producto producto;
    private Supermercado supermercado;
    private double importe;
    private LocalDate fecha;
    private boolean enOferta;
    
    //CONSTRUCTOR PARA LOS ATRIBUTOS DE PRECIO
   
    
    public Precio(Producto productor, Supermercado supermercado, double importe, LocalDate fecha, boolean enOferta){
        
        setProducto(producto);
        setSupermercado(supermercado);
        setImporte(importe);
        setFecha(fecha);
        setEnOferta(enOferta);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            throw new IllegalArgumentException("ID no valido");
        }
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        if(producto == null){
            throw new IllegalArgumentException("Producto Obligatorio");
        }
        this.producto = producto;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        if(supermercado == null){
            throw new IllegalArgumentException("Supermercado obligatorio");
        }
        this.supermercado = supermercado;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        if(importe <= 0){
         throw new IllegalArgumentException("Importe no valido");
        }
        this.importe = importe;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        if(fecha == null){
            throw new IllegalArgumentException("Fecha Obligatoria");
        }
        this.fecha = fecha;
    }

    public boolean isEnOferta() {
        return enOferta;
    }

    public void setEnOferta(boolean enOferta) {
        this.enOferta = enOferta;
    }
    
    public double getPrecioUnitario(){
        return producto.getPrecioUnitario(importe);
    }

      @Override
    public String toString() {
        return producto.getNombre() + " en " + supermercado.getNombre() + ": "
                + String.format("%.2f €", importe)
                + String.format(" (%.2f €/%s)", getPrecioUnitario(), producto.getUnidadReferencia())
                + (enOferta ? " OFERTA" : "");
    }

    @Override
    public String toLineaExportar() {
        return id + ";" + producto + ";" + supermercado + ";" + importe + ";" + fecha + ";" + enOferta;
    }
    }
   

