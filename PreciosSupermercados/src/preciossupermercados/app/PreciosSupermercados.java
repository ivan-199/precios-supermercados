/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciossupermercados.app;

import preciossupermercados.persistencia.ConexionBD;

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
        
        try{
            ConexionBD.conectar();
            System.out.println("La conexion fue exitosa.");
            
        }catch(Exception e){
            System.out.println("ERROR al establecer la conexion. "+ e.getMessage());
            
        }
    }
    
}
