/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.modelo;

/**
 *
 * @author IVAN
 */
public class ProductoAlimentario extends Producto {

    // CONSTANTES
    public static final String TIPO = "ALIMENTARIO";
    public static final String UNIDAD_G = "g";
    public static final String UNIDAD_KG = "kg";
    public static final String UNIDAD_L = "l";
    public static final String UNIDAD_ML = "ml";
    public static final String UNIDAD = "ud";

    //Declaramos la variable ecologica
    private boolean ecologico;
    // Creamos el constructor

    public ProductoAlimentario(String nombre, String marca, String categoria, double cantidad, String unidad, boolean ecologico) {

        super(nombre, marca, categoria, cantidad, unidad);
        this.ecologico = ecologico;

        //METODO HEREDADO DE PRODUCTO
    }

    @Override
    public void setUnidad(String unidad) {
        if (!(UNIDAD_G.equals(unidad) || UNIDAD_KG.equals(unidad) || UNIDAD_ML.equals(unidad) || UNIDAD_L.equals(unidad) || UNIDAD.equals(unidad))) {
            throw new IllegalArgumentException("Unidad no permitida");
        }
        super.setUnidad(unidad);
    }

    @Override
    public String getTipo() {
        return TIPO;

    }

    @Override
    public String getUnidadReferencia() {
        if (UNIDAD_G.equals(getUnidad()) || UNIDAD_KG.equals(getUnidad())) {
            return UNIDAD_KG;
        }
        if (UNIDAD_ML.equals(getUnidad()) || UNIDAD_L.equals(getUnidad())) {
            return UNIDAD_L;
        }
        return UNIDAD;
    }

    private double conversion() {
        if (UNIDAD_G.equals(getUnidad()) || UNIDAD_ML.equals(getUnidad())) {
            return getCantidad() / 1000;

        }
        return getCantidad();
    }

    @Override
    public double getPrecioUnitario(double importe) {
        return importe / conversion();

    }

    public boolean isEcologico() {
        return ecologico;
    }

    public void setEcologico(boolean ecologico) {
        this.ecologico = ecologico;
    }

    @Override
    public String toLineaExportar() {
        return datosComunes() + ";" + ecologico + ";;";

    }
/*
    @Override
    public String toString() {
        return super.toString() + " Ecologico: " + ecologico;

    }*/

    @Override
    public String toString() {
        return "ProductoAlimentario{" + super.toString() + ", ecologico=" + ecologico + '}';
    }
    
    

}
