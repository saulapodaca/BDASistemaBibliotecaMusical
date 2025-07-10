/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package itson.sistemabibliotecamusicalpresentacion;

import itson.sistemabibliotecamusicaldominio.CancionDominio;
import itson.sistemabibliotecamusicaldominio.UsuarioDominio;
import itson.sistemabibliotecamusicalnegocio.excepciones.NegocioException;
import itson.sistemabibliotecamusicalnegocio.fachada.ICancionFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.IUsuarioFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.implementaciones.CancionFachada;
import itson.sistemabibliotecamusicalnegocio.fachada.implementaciones.UsuarioFachada;
import itson.sistemabibliotecamusicalpresentacion.utilidades.SesionUsuario;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

/**
 *
 * @author adell
 */
public class CatalogoCancionesFrm extends javax.swing.JFrame {

    /**
     * Creates new form CatalogoCancionesFrm
     */
    ICancionFachada cancionFachada;
    IUsuarioFachada usuarioFachada;

    UsuarioDominio usuario = SesionUsuario.getUsuario();

    public CatalogoCancionesFrm() throws NegocioException {

        this.cancionFachada = new CancionFachada();
        this.usuarioFachada = new UsuarioFachada();

        initComponents();
        cargarBiblioteca();
        this.setLocationRelativeTo(null);

    }

    private void cargarBiblioteca() throws NegocioException {
        try {
            List<CancionDominio> canciones = cancionFachada.listarTodasLasCanciones(usuario.getGenerosNoDeseados());

            JPanel panelInterno = new JPanel();
            panelInterno.setLayout(new BoxLayout(panelInterno, BoxLayout.Y_AXIS));
            panelInterno.setPreferredSize(new Dimension(700, canciones.size() * 60));
            panelInterno.setBackground(new Color(219, 182, 238));
            for (CancionDominio cancion : canciones) {
                JPanel panelElemento = new JPanel();
                panelElemento.setLayout(new BoxLayout(panelElemento, BoxLayout.X_AXIS));
                panelElemento.setPreferredSize(new Dimension(700, 50));
                panelElemento.setMaximumSize(new Dimension(700, 50));
                panelElemento.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
                panelElemento.setBackground(new Color(219, 182, 238));

                JButton btnInfo = new JButton();
                btnInfo.setFont(new Font("Arial", Font.PLAIN, 14));
                btnInfo.setAlignmentX(Component.LEFT_ALIGNMENT);
                btnInfo.setHorizontalAlignment(SwingConstants.LEFT);
                btnInfo.setPreferredSize(new Dimension(600, 40));
                btnInfo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

                JButton btnFavorito = new JButton("☆");
                btnFavorito.setFocusPainted(false);
                btnFavorito.setForeground(Color.GRAY);
                btnFavorito.setPreferredSize(new Dimension(50, 40));
                btnFavorito.setMaximumSize(new Dimension(50, 40));

                System.out.println(cancion.getNombre());
                btnInfo.setText(cancion.getNombre());
                btnInfo.addActionListener(e -> {
                    
                });

                btnFavorito.addActionListener(e -> {
                    try {
                        if (usuarioFachada.esFavorito(cancion.getId())) {
                            usuarioFachada.eliminarFavorito(cancion.getId());
                            btnFavorito.setText("☆");
                            btnFavorito.setForeground(Color.GRAY);
                        } else {
                            usuarioFachada.agregarFavorito(cancion.getId());
                            btnFavorito.setText("★️");
                            btnFavorito.setForeground(Color.BLACK);
                        }
                    } catch (NegocioException ex) {
                    }
                });

                panelElemento.add(btnInfo);
                panelElemento.add(Box.createHorizontalStrut(10));
                panelElemento.add(btnFavorito);
                panelInterno.add(panelElemento);
            }

            JScrollPane scrollPane = new JScrollPane(panelInterno);
            scrollPane.setPreferredSize(new Dimension(750, 400));
            scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
           

            infoCancionesPnl.removeAll();
            infoCancionesPnl.setLayout(new BorderLayout());
            infoCancionesPnl.add(scrollPane, BorderLayout.CENTER);
            infoCancionesPnl.revalidate();
            infoCancionesPnl.repaint();

        } catch (HeadlessException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "No se pudo cargar el contenido de la biblioteca musical");
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
        infoCancionesPnl = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 648));

        jPanel2.setBackground(new java.awt.Color(75, 28, 113));

        contenedorPnl.setBackground(new java.awt.Color(219, 182, 238));
        contenedorPnl.setPreferredSize(new java.awt.Dimension(980, 548));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel2.setText("CANCIONES");

        javax.swing.GroupLayout infoArtistaPnlLayout = new javax.swing.GroupLayout(infoArtistaPnl);
        infoArtistaPnl.setLayout(infoArtistaPnlLayout);
        infoArtistaPnlLayout.setHorizontalGroup(
            infoArtistaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoArtistaPnlLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        infoArtistaPnlLayout.setVerticalGroup(
            infoArtistaPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoArtistaPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        infoCancionesPnl.setPreferredSize(new java.awt.Dimension(750, 356));

        javax.swing.GroupLayout infoCancionesPnlLayout = new javax.swing.GroupLayout(infoCancionesPnl);
        infoCancionesPnl.setLayout(infoCancionesPnlLayout);
        infoCancionesPnlLayout.setHorizontalGroup(
            infoCancionesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        infoCancionesPnlLayout.setVerticalGroup(
            infoCancionesPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contenedorPnlLayout = new javax.swing.GroupLayout(contenedorPnl);
        contenedorPnl.setLayout(contenedorPnlLayout);
        contenedorPnlLayout.setHorizontalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(infoArtistaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(infoCancionesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorPnlLayout.setVerticalGroup(
            contenedorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorPnlLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(infoArtistaPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(infoCancionesPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(contenedorPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
    private javax.swing.JPanel infoArtistaPnl;
    private javax.swing.JPanel infoCancionesPnl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
