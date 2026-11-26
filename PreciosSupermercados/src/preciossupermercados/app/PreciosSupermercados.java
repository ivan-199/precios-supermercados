/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciossupermercados.app;

import java.awt.BorderLayout;
import preciossupermercados.persistencia.ConexionBD;
import preciossupermercados.modelo.Producto;
import preciossupermercados.modelo.ProductoAlimentario;
import preciossupermercados.modelo.ProductoLimpieza;
import preciossupermercados.modelo.Supermercado;

/**
 *
 * @author IVAN
 */
public class PreciosSupermercados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("COMPARADOR DE PRECIOS");
        System.out.println("Bienvenidos al comparador de supermercados.");

        try {
            ConexionBD.conectar();
            System.out.println("La conexion fue exitosa.");

        } catch (Exception e) {
            System.out.println("ERROR al establecer la conexion. " + e.getMessage());

        }

        //PRUEBA
        Producto leche = new ProductoAlimentario("Leche", "Pascual", "Lacteos", 1, "l", false);
        Producto arroz = new ProductoAlimentario("Arroz", "SOS", "Cereales", 1, "kg", false);
        Producto detergente = new ProductoLimpieza("Detergente", "Ariel", "Ropa", 2, "1", 40, "Ropa");

        //MUESTRTA DE LA PRUEBA
        System.out.println("\n PRODUCTOS DE PRUEBA");
        System.out.println(leche);
        System.out.println(arroz);
        System.out.println(detergente);

        // PRUEBA DE PRECIOS UNITARIOS
        System.out.println("\nPRECIOS UNITARIOS");
        System.out.println("Leche: " + leche.getPrecioUnitario(0.85) + " euros/" + leche.getUnidadReferencia());
        System.out.println("Arroz: " + arroz.getPrecioUnitario(1.20) + " euros/" + arroz.getUnidadReferencia());
        System.out.println("Detergente: " + detergente.getPrecioUnitario(8.00) + " euros/" + detergente.getUnidadReferencia());

        // PROBAR conversiones
        Producto pasta = new ProductoAlimentario("Pasta", "Gallo", "Pasta", 500, "g", false);
        Producto zumo = new ProductoAlimentario("Zumo", "Don Simon", "Bebidas", 500, "ml", false);
        Producto huevos = new ProductoAlimentario("Huevos", "Coren", "Huevos", 12, "ud", true);

        //PRUEBA De conversiones
        System.out.println("Pasta: " + pasta.getPrecioUnitario(0.60) + " euros/" + pasta.getUnidadReferencia());
        System.out.println("zumo: " + zumo.getPrecioUnitario(0.90) + " euros/" + zumo.getUnidadReferencia());
        System.out.println("Huevos: " + huevos.getPrecioUnitario(2.40) + " euros/" + huevos.getUnidadReferencia());

        // Prueba de validaciones
        System.out.println("\nPRUEBA DE VALIDACIONES");

        try {
            Producto incorrecto = new ProductoAlimentario("Pasta", "Gallo", "Pasta", 500, "metros", false);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            Producto incorrecto = new ProductoLimpieza("Detergente", "Ariel", "Ropa", 2, "1", 0, "ROPA");

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nPRUEBA DE EXPORTACION");
        
        System.out.println(leche.toLineaExportar());
        System.out.println(arroz.toLineaExportar());
        System.out.println(detergente.toLineaExportar());
        System.out.println(huevos.toLineaExportar());
        
        //PRUEBA DE SUPERMERCADOS
        System.out.println("\nPRUEBA DE SUPERMECADOS");
        
        Supermercado mercadona = new Supermercado("Mercadona", "Caceres", "Centro");
        Supermercado lidl = new Supermercado("Lidl", "Caceres", "Norte");
        
        System.out.println(mercadona);
        System.out.println(lidl);
    }
  
}
