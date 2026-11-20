/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preciossupermercados.persistencia;

import java.sql.*;

/**
 *
 * @author IVAN
 */
public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/comparadorprecios";
    private static final String USUARIO = "root";
    private static final String  CLAVE = "";
    
    public static Connection conectar()throws SQLException {
        
        return DriverManager.getConnection(URL,USUARIO,CLAVE);
    }
}

