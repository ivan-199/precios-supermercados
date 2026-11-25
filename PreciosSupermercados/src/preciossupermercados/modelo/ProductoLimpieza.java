/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.modelo;

/**
 *
 * @author IVAN
 */
public class ProductoLimpieza extends Producto {

    // Para numero de lavados 
    private int usos;
    //UBICAR EL PRODUCTO
    private String ambito;

    //CONSTANTES 
    public static final String TIPO = "LIMPIEZA";

    public static final String UNIDAD_L = "l";
    public static final String UNIDAD_ML = "ml";
    public static final String UNIDAD = "unidad";

    public static final String HOGAR = "HOGAR";
    public static final String ROPA = "ROPA";
    public static final String VAJILLA = "VAJILLA";

    public static final String USO = "uso";

    // Creamos el constructor
    public ProductoLimpieza(String nombre, String marca, String categoria, double cantidad, String unidad, int usos, String ambito) {
        super(nombre, marca, categoria, cantidad, unidad);

        setUnidad(unidad);
        setUsos(usos);
        setAmbito(ambito);
    }
    //Metodo para heredar de producto

    @Override
    public String getTipo() {
        return TIPO;

    }

    @Override
    public String getUnidadReferencia() {

        return USO;
    }

    @Override
    public double getPrecioUnitario(double importe) {

        return importe / usos;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        if (usos < 1) {
            throw new IllegalArgumentException("Los usos deben ser mayores que 0");
        }
        this.usos = usos;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {

        if (HOGAR.equals(ambito) || ROPA.equals(ambito) || VAJILLA.equals(ambito)) {
            throw new IllegalArgumentException("Ambito no valido");
        }
        this.ambito = ambito;
    }

    @Override
    public String toLineaExportar() {
        return datosComunes() + ";;" + usos + ";" + ambito;

    }
/*
    @Override
    public String toString() {
        return super.toString() + " Usos: " + usos + " Ambito: " + ambito;
    }*/

    @Override
    public String toString() {
       
        return "ProductoLimpieza{" + super.toString() + ", usos=" + usos + ", ambito=" + ambito + '}';
    }
    
}
