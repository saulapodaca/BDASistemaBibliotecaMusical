/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import itson.sistemabibliotecamusicalpersistencia.daos.IConexionBD;
import itson.sistemabibliotecamusicalpersistencia.daos.IInsertMasivoDAO;
import itson.sistemabibliotecamusicalpersistencia.datos.DatosAInsertar;
import itson.sistemabibliotecamusicalpersistencia.excepciones.PersistenciaException;

/**
 *
 * @author Camila Zubía
 */
public class InsertMasivoDAO implements IInsertMasivoDAO{

    private IConexionBD conexionBD;
    private DatosAInsertar datos = new DatosAInsertar();

    public InsertMasivoDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
    
    @Override
    public void insertarDatosMasivos() throws PersistenciaException {
         try{
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);
            coleccion.insertMany(datos.obtenerDatos());
         }catch (Exception e) {
            throw new PersistenciaException("No se pudo cargar los datos de la base de datos" + e.getMessage());
        }
    }

    @Override
    public boolean existenDatosIniciales() throws PersistenciaException {
        try {
            MongoDatabase baseDatos = conexionBD.conexion();
            MongoCollection<ArtistaDominio> coleccion
                    = baseDatos.getCollection("artistas", ArtistaDominio.class);
            long cantidad = coleccion.countDocuments();
            return cantidad > 0;
        } catch (Exception e) {
            throw new PersistenciaException("No se pudo verificar si existian registros en la base de datos" + e.getMessage());
        }
    }
    
}
