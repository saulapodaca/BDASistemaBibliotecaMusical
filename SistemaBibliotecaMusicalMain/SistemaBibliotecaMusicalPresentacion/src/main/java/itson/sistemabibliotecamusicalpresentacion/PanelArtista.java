/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package itson.sistemabibliotecamusicalpresentacion;

import itson.sistemabibliotecamusicaldominio.AlbumDominio;
import itson.sistemabibliotecamusicaldominio.ArtistaDominio;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author saula
 */
public class PanelArtista extends javax.swing.JPanel {

    private ArtistaDominio artista;
    /**
     * Creates new form PanelArtista
     */
    public PanelArtista(ArtistaDominio artista) {
        initComponents();
        this.artista = artista;
        SwingUtilities.invokeLater(() -> cargarImagenArtista());
        SwingUtilities.invokeLater(() -> cargarInfoArtista());
        SwingUtilities.invokeLater(() -> cargarAlbumes());
        
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
        panelImagenArtista = new javax.swing.JPanel();
        panelInfoArtista = new javax.swing.JPanel();
        panelAlbumesArtista = new javax.swing.JPanel();
        btnInformacion = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(75, 28, 113));

        contenedorPnl.setBackground(new java.awt.Color(219, 182, 238));
        contenedorPnl.setPreferredSize(new java.awt.Dimension(980, 548));

        panelImagenArtista.setBackground(new java.awt.Color(215, 161, 220));
        panelImagenArtista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelImagenArtistaLayout = new javax.swing.GroupLayout(panelImagenArtista);
        panelImagenArtista.setLayout(panelImagenArtistaLayout);
        panelImagenArtistaLayout.setHorizontalGroup(
            panelImagenArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        panelImagenArtistaLayout.setVerticalGroup(
            panelImagenArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelInfoArtista.setBackground(new java.awt.Color(215, 161, 220));
        panelInfoArtista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelInfoArtistaLayout = new javax.swing.GroupLayout(panelInfoArtista);
        panelInfoArtista.setLayout(panelInfoArtistaLayout);
        panelInfoArtistaLayout.setHorizontalGroup(
            panelInfoArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        panelInfoArtistaLayout.setVerticalGroup(
            panelInfoArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        panelAlbumesArtista.setBackground(new java.awt.Color(215, 161, 220));
        panelAlbumesArtista.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout panelAlbumesArtistaLayout = new javax.swing.GroupLayout(panelAlbumesArtista);
        panelAlbumesArtista.setLayout(panelAlbumesArtistaLayout);
        panelAlbumesArtistaLayout.setHorizontalGroup(
            panelAlbumesArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelAlbumesArtistaLayout.setVerticalGroup(
            panelAlbumesArtistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        btnInformacion.setBackground(new java.awt.Color(75, 28, 113));
        btnInformacion.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnInformacion.setForeground(new java.awt.Color(219, 182, 238));
        btnInformacion.setText("!");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorPnlLayout = new javax.swing.GroupLayout(contenedorPnl);
        contenedorPnl.setLayout(contenedorPnlLayout);
        contenedorPnlLayout.setHorizontalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelAlbumesArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenedorPnlLayout.createSequentialGroup()
                        .addComponent(panelImagenArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelInfoArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        contenedorPnlLayout.setVerticalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelImagenArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelInfoArtista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnInformacion))
                .addGap(18, 18, 18)
                .addComponent(panelAlbumesArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(contenedorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(contenedorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        mostrarPanelIntegrantes(artista);
    }//GEN-LAST:event_btnInformacionActionPerformed


    private void cargarImagenArtista() {
        panelImagenArtista.removeAll();
        ImageIcon icono = new ImageIcon(this.artista.getImagen());
        Image imagenEscalada = icono.getImage().getScaledInstance(
                panelImagenArtista.getWidth(), panelImagenArtista.getHeight(), Image.SCALE_SMOOTH);
        JLabel lblImagen = new JLabel(new ImageIcon(imagenEscalada));
        panelImagenArtista.setLayout(new BorderLayout());
        panelImagenArtista.add(lblImagen, BorderLayout.CENTER);
        panelImagenArtista.revalidate();
        panelImagenArtista.repaint();
    }

    private void cargarInfoArtista() {
        panelInfoArtista.removeAll();
        panelInfoArtista.setLayout(new BoxLayout(panelInfoArtista, BoxLayout.Y_AXIS));

        panelInfoArtista.add(new JLabel("Nombre: " + this.artista.getNombre()));

        String tipo;
        if (this.artista.isEsBanda()) {
            tipo = "Banda";
            btnInformacion.setVisible(true);
        } else {
            tipo = "Solista";
            btnInformacion.setVisible(false);
        }

        panelInfoArtista.add(new JLabel("Tipo: " + tipo));
        panelInfoArtista.add(new JLabel("Género: " + this.artista.getGenero()));

        panelInfoArtista.revalidate();
        panelInfoArtista.repaint();
    }
    
    private void cargarAlbumes(){
        panelAlbumesArtista.removeAll();
        panelAlbumesArtista.setLayout(new BoxLayout(panelAlbumesArtista, BoxLayout.Y_AXIS));
        for (AlbumDominio album : this.artista.getAlbumes()){
            JPanel panelAlbum = new JPanel(new BorderLayout());
            panelAlbum.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            panelAlbum.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));

            // Imagen del álbum
            ImageIcon icono = new ImageIcon(album.getImagenPortada());
            Image imagen = icono.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            JLabel lblImagen = new JLabel(new ImageIcon(imagen));
            panelAlbum.add(lblImagen, BorderLayout.WEST);

            // Info del álbum
            JPanel info = new JPanel(new GridLayout(2, 1));
            info.add(new JLabel("Nombre: " + album.getNombre()));
            info.add(new JLabel("Fecha: " + album.getFechaLanzamiento()));
            panelAlbum.add(info, BorderLayout.CENTER);

            // Evento al hacer clic
            panelAlbum.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    mostrarPanelAlbum(album);
                }
            });
            panelAlbumesArtista.add(panelAlbum);
        }
        panelAlbumesArtista.revalidate();
        panelAlbumesArtista.repaint();
    }

    private void mostrarPanelAlbum(AlbumDominio album) {
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        PanelAlbum panel = new PanelAlbum(album);

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
    
    private void mostrarPanelIntegrantes(ArtistaDominio artista){
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        PanelInformacionBanda panel = new PanelInformacionBanda(artista);

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInformacion;
    private javax.swing.JPanel contenedorPnl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelAlbumesArtista;
    private javax.swing.JPanel panelImagenArtista;
    private javax.swing.JPanel panelInfoArtista;
    // End of variables declaration//GEN-END:variables
}
