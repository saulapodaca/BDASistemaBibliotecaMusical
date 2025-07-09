/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package itson.sistemabibliotecamusicalpresentacion;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.IAlbumFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.IUsuarioFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.implementaciones.AlbumFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.implementaciones.UsuarioFachada;
import itson.sistemabibliotecamusicalpresentacion.utilidades.SesionUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author adell
 */
public class CatalogoAlbumesFrm extends javax.swing.JFrame {

    IAlbumFachada albumFachada;
    IUsuarioFachada usuarioFachada;
    UsuarioDominio usuario = SesionUsuario.getUsuario();

    /**
     * Creates new form CatalogoAlbumesFrm
     */
    public CatalogoAlbumesFrm() {
        this.albumFachada = new AlbumFachada();
        this.usuarioFachada = new UsuarioFachada();
        
        initComponents();
        cargarBiblioteca();
        
    }

    private void cargarBiblioteca() {
        try {
            List<AlbumDominio> albumes = albumFachada.listarTodosLosAlbumes(usuario.getGenerosNoDeseados());

            infoAlbumesPnl.removeAll();
            infoAlbumesPnl.setLayout(new BoxLayout(infoAlbumesPnl, BoxLayout.Y_AXIS));

            for (Object o : albumes) {
                if (!(o instanceof AlbumDominio album)) {
                    continue;
                }

                JPanel panelElemento = new JPanel(new BorderLayout());
                panelElemento.setPreferredSize(new Dimension(700, 60));
                panelElemento.setBackground(new Color(219, 182, 238));

                JLabel lblInfo = new JLabel(album.getImagenPortada() + " "
                        + album.getNombre() + " - "
                        + album.getGeneroMusical()+ " ("
                        + album.getFechaLanzamiento() + ")");
                lblInfo.setFont(new Font("Arial", Font.PLAIN, 14));
                
                
                JButton btnInfo = new JButton("Ver Canciones");
                JButton btnFavorito = new JButton();
                btnFavorito.setFocusPainted(false);

                try {
                    if (usuarioFachada.esFavorito(album.getId())) {
                        btnFavorito.setText("★️");
                        btnFavorito.setForeground(Color.BLACK);
                        btnFavorito.setToolTipText("Eliminar de favoritos");
                    } else {
                        btnFavorito.setText("☆");
                        btnFavorito.setForeground(Color.BLACK);
                        btnFavorito.setToolTipText("Agregar a favoritos");
                    }
                } catch (NegocioException ex) {
                    Logger.getLogger(PanelBuscar.class.getName()).log(Level.SEVERE, null, ex);
                }

                btnFavorito.addActionListener(e -> {
                    try {
                        if (usuarioFachada.esFavorito(album.getId())) {
                            usuarioFachada.eliminarFavorito(album.getId());
                            btnFavorito.setText("☆");
                            btnFavorito.setForeground(Color.GRAY);
                            btnFavorito.setToolTipText("Agregar a favoritos");
                        } else {
                            usuarioFachada.agregarFavorito(album.getId());
                            btnFavorito.setText("★️");
                            btnFavorito.setForeground(Color.BLACK);
                            btnFavorito.setToolTipText("Eliminar de favoritos");
                        }
                    } catch (NegocioException ex) {
                        Logger.getLogger(CatalogoAlbumesFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });

                btnInfo.addActionListener(e -> {
                    new CancionesFrm().setVisible(true);
                    this.setVisible(false);
                });

                JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
                panelBotones.add(btnInfo);
                panelBotones.add(btnFavorito);

                panelElemento.add(lblInfo, BorderLayout.WEST);
                panelElemento.add(panelBotones, BorderLayout.EAST);

                infoAlbumesPnl.add(panelElemento);
            }

            infoAlbumesPnl.revalidate();
            infoAlbumesPnl.repaint();
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se pudo cargar el contenido de álbumes.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        contenedorPnl = new javax.swing.JPanel();
        infoArtistaPnl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        infoAlbumesPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 648));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(75, 28, 113));

        contenedorPnl.setBackground(new java.awt.Color(219, 182, 238));
        contenedorPnl.setPreferredSize(new java.awt.Dimension(980, 548));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("ALBUMES");

        javax.swing.GroupLayout infoArtistaPnlLayout = new javax.swing.GroupLayout(infoArtistaPnl);
        infoArtistaPnl.setLayout(infoArtistaPnlLayout);
        infoArtistaPnlLayout.setHorizontalGroup(
            infoArtistaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoArtistaPnlLayout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel2)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        infoArtistaPnlLayout.setVerticalGroup(
            infoArtistaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoArtistaPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout infoAlbumesPnlLayout = new javax.swing.GroupLayout(infoAlbumesPnl);
        infoAlbumesPnl.setLayout(infoAlbumesPnlLayout);
        infoAlbumesPnlLayout.setHorizontalGroup(
            infoAlbumesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        infoAlbumesPnlLayout.setVerticalGroup(
            infoAlbumesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorPnlLayout = new javax.swing.GroupLayout(contenedorPnl);
        contenedorPnl.setLayout(contenedorPnlLayout);
        contenedorPnlLayout.setHorizontalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(infoArtistaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorPnlLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(infoAlbumesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        contenedorPnlLayout.setVerticalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(infoArtistaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(infoAlbumesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(contenedorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(contenedorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedorPnl;
    private javax.swing.JPanel infoAlbumesPnl;
    private javax.swing.JPanel infoArtistaPnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
