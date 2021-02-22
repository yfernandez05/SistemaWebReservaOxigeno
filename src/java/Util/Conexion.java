/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FERNANDEZ
 */
public class Conexion {
        private String cadena = "jdbc:mysql://127.0.0.1:3306/citasOxigeno";
    private String usuario = "root";
    private String clave = "123";
    private  Connection xcon;
    
    public Connection Conectar(){        
    String driver  = "com.mysql.jdbc.Driver";
    try{
        Class.forName(driver);
        System.out.println("se cargo el driver de forma correcta");
        xcon = DriverManager.getConnection(cadena, usuario, clave);
        System.out.println("Se conecto a la base de datos");
    }catch (ClassNotFoundException | SQLException ex){
        System.err.println(ex.toString());
    }
    return xcon;
    }
    
 public java.sql.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
