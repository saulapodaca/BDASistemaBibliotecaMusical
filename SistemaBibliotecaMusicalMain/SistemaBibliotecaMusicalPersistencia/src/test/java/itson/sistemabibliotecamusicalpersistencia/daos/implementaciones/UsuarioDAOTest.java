/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package itson.sistemabibliotecamusicalpersistencia.daos.implementaciones;

import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author saula
 */
public class UsuarioDAOTest {
    
    public UsuarioDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of obtenerUsuarioPorNombre method, of class UsuarioDAO.
     */
    @Test
    public void testObtenerUsuarioPorNombre() throws Exception {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String nombreBuscar = "Saulin";
        UsuarioDominio usuario = usuarioDAO.obtenerUsuarioPorNombre(nombreBuscar);
        assertEquals(nombreBuscar, usuario.getNombreUsuario());
    }

    /**
     * Test of obtenerUsuarioPorCorreo method, of class UsuarioDAO.
     */
    @Test
    public void testObtenerUsuarioPorCorreo() throws Exception {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        String correoBuscar = "saul@gmail.com";
        UsuarioDominio usuario = usuarioDAO.obtenerUsuarioPorCorreo(correoBuscar);
        assertEquals(correoBuscar, usuario.getCorreo());
    }

    /**
     * Test of registrarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testRegistrarUsuario() throws Exception {
    }

    /**
     * Test of modificarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testModificarUsuario() throws Exception {
    }

    /**
     * Test of actualizarGenerosNoDeseados method, of class UsuarioDAO.
     */
    @Test
    public void testActualizarGenerosNoDeseados() throws Exception {
    }

    /**
     * Test of obtenerGenerosNoDeseados method, of class UsuarioDAO.
     */
    @Test
    public void testObtenerGenerosNoDeseados() throws Exception {
    }
    
}
