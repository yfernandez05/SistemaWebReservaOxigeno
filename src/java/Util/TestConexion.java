/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author FERNANDEZ
 */
public class TestConexion {
    public static void main(String[] args) {
        Conexion c =  new Conexion();
        if(c.Conectar()!=null){
            System.out.println("Coneccion correcta");
        }else{
        System.out.print("Fallo en la conexion a la Base de Datos");
        }
    }
}
