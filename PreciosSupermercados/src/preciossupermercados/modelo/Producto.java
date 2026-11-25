/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.modelo;

/**
 *
 * @author IVAN
 */
public abstract class Producto implements Exportable {

    // ATRIBUTOS DEL PRODUCTO
    private int id;
    private String nombre;
    private String marca;
    private String categoria;
    private double cantidad;
    private String unidad;
    
    //CONSTRUCTOR PARA LOS ATRIBUTOS DEL PRODUCTO
    
   public Producto (String nombre, String marca, String categoria, double cantidad, String unidad) {
       
       this.setNombre(nombre);
       this.setMarca(marca);
       this.setCategoria(categoria);
       this.setCantidad(cantidad);
       this.setUnidad(unidad);
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String getTipo(); 
        
    public abstract String getUnidadReferencia();
    
    public abstract double getPrecioUnitario(double importe);

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCantidad() {
        
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if(cantidad <= 0){
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
   public String datosComunes(){
       return id + ";" + getTipo() + ";" + nombre + ";" + marca + ";" + categoria + ";" + cantidad + ";" + unidad;
       
   }
   @Override
   public String toString (){
       return id + ", Nombre: " + nombre + ", Marca:  " + marca + ", Categoria:  " + categoria + ", Cantidad: " + cantidad + ", Unidad:  " + unidad + ", " + getTipo();
   }
   
          
           
}
