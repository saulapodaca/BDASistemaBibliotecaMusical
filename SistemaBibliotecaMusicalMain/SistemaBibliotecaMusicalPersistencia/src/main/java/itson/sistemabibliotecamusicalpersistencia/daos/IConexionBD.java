/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos;

import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Camila Zubía
 */
public interface IConexionBD {
    
    /**
     * crea una conexion a la base de datos
     * @return 
     */
    public MongoDatabase conexion();
    
}
