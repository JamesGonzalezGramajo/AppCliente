package gui.Frames;

import AnalisisUsuarios.AnalizadorUsuarios;
import Analizadores.Analizador;
import Conexion.Cliente;
import Conexion.Servidor;
import Manejadores.ManejadorVerificacionObligatorios;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.text.BadLocationException;

/**
 *
 * @author james
 */
public class VentanaAppCliente extends javax.swing.JFrame implements Observer {

    public static String USUARIO_ACTUAL = null;

    public static VentanaIniciarSesion ventanaIniciarSesion;
    public static VentanaAcercaDe ventanaAcercaDe;

    public VentanaAppCliente() {
        initComponents();

        setTitle("App Clientes");
        setLocationRelativeTo(null);
        setResizable(false);
        /*
         */
        this.textAreaPrincipal.setCaretColor(Color.CYAN);
        ventanaIniciarSesion = new VentanaIniciarSesion(this, true);
        ventanaAcercaDe = new VentanaAcercaDe(this, true);
        botonAnalisisSintactico.setEnabled(false);
        botonAnalisisLexico.setEnabled(false);
        botonLimpiar.setEnabled(false);
        textAreaPrincipal.setEnabled(false);
        /*
         */

        Servidor s = new Servidor(5011);
        s.addObserver(this);
        Thread t = new Thread(s);
        t.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaPrincipal = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaErroresLexicos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaErroresSintacticos = new javax.swing.JTextArea();
        panelBotones = new javax.swing.JPanel();
        botonLimpiar = new javax.swing.JButton();
        botonAnalisisLexico = new javax.swing.JButton();
        botonAnalisisSintactico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        labelNumeroColumna = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelNumeroLinea = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        botonIniciarSesion = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaRespuestaDelServidor = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menuPrincipal = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuIniciarSesion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuAcercaDe = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 1, 1));

        panelPrincipal.setBackground(new java.awt.Color(1, 1, 1));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaPrincipal.setBackground(new java.awt.Color(2, 39, 57));
        textAreaPrincipal.setColumns(20);
        textAreaPrincipal.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        textAreaPrincipal.setForeground(new java.awt.Color(0, 179, 255));
        textAreaPrincipal.setRows(5);
        textAreaPrincipal.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                textAreaPrincipalCaretUpdate(evt);
            }
        });
        textAreaPrincipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textAreaPrincipalKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(textAreaPrincipal);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 187, 497, 711));

        textAreaErroresLexicos.setEditable(false);
        textAreaErroresLexicos.setBackground(new java.awt.Color(35, 51, 59));
        textAreaErroresLexicos.setColumns(20);
        textAreaErroresLexicos.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        textAreaErroresLexicos.setForeground(new java.awt.Color(218, 31, 33));
        textAreaErroresLexicos.setRows(5);
        jScrollPane2.setViewportView(textAreaErroresLexicos);

        panelPrincipal.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 182, 435, 340));

        jLabel1.setBackground(new java.awt.Color(1, 1, 1));
        jLabel1.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Errores Lexicos:");
        panelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 151, 126, 30));

        jLabel2.setBackground(new java.awt.Color(1, 1, 1));
        jLabel2.setFont(new java.awt.Font("Noto Sans", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Errores Sintacticos:");
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 198, 30));

        textAreaErroresSintacticos.setEditable(false);
        textAreaErroresSintacticos.setBackground(new java.awt.Color(35, 51, 59));
        textAreaErroresSintacticos.setColumns(20);
        textAreaErroresSintacticos.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        textAreaErroresSintacticos.setForeground(new java.awt.Color(218, 31, 33));
        textAreaErroresSintacticos.setRows(5);
        jScrollPane3.setViewportView(textAreaErroresSintacticos);

        panelPrincipal.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 435, 322));

        panelBotones.setBackground(new java.awt.Color(35, 51, 59));
        panelBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonLimpiar.setBackground(new java.awt.Color(42, 59, 67));
        botonLimpiar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(247, 252, 254));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });
        panelBotones.add(botonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 110, 50));

        botonAnalisisLexico.setBackground(new java.awt.Color(42, 59, 67));
        botonAnalisisLexico.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonAnalisisLexico.setForeground(new java.awt.Color(32, 170, 48));
        botonAnalisisLexico.setText("Lexico");
        botonAnalisisLexico.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        botonAnalisisLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalisisLexicoActionPerformed(evt);
            }
        });
        panelBotones.add(botonAnalisisLexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 96, 50));

        botonAnalisisSintactico.setBackground(new java.awt.Color(42, 59, 67));
        botonAnalisisSintactico.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonAnalisisSintactico.setForeground(new java.awt.Color(32, 170, 48));
        botonAnalisisSintactico.setText("Enviar");
        botonAnalisisSintactico.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        botonAnalisisSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalisisSintacticoActionPerformed(evt);
            }
        });
        panelBotones.add(botonAnalisisSintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 60, 96, 50));

        jLabel3.setBackground(new java.awt.Color(35, 51, 59));
        jLabel3.setFont(new java.awt.Font("Noto Sans", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 1, 1));
        jLabel3.setText("|");
        panelBotones.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, 80));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Inicio");
        panelBotones.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("El cursor esta en:");
        panelBotones.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 140, -1));

        jLabel6.setBackground(new java.awt.Color(35, 51, 59));
        jLabel6.setFont(new java.awt.Font("Noto Sans", 0, 70)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 1, 1));
        jLabel6.setText("|");
        panelBotones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 80));

        jLabel7.setBackground(new java.awt.Color(35, 51, 59));
        jLabel7.setFont(new java.awt.Font("Noto Sans", 0, 70)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(1, 1, 1));
        jLabel7.setText("|");
        panelBotones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 80));

        jLabel9.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setText("Opciones Analizadores");
        panelBotones.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 140, -1));

        labelNumeroColumna.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        labelNumeroColumna.setForeground(new java.awt.Color(20, 228, 209));
        panelBotones.add(labelNumeroColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 80, 20));

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Columna:");
        panelBotones.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 80, -1));

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("     Linea:");
        panelBotones.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 60, 80, -1));

        labelNumeroLinea.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        labelNumeroLinea.setForeground(new java.awt.Color(20, 228, 209));
        panelBotones.add(labelNumeroLinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 60, 80, 20));

        jLabel11.setBackground(new java.awt.Color(35, 51, 59));
        jLabel11.setFont(new java.awt.Font("Noto Sans", 0, 70)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 1, 1));
        jLabel11.setText("|");
        panelBotones.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 20, -1, 80));

        botonSalir.setBackground(new java.awt.Color(147, 8, 27));
        botonSalir.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(254, 254, 254));
        botonSalir.setText("Salir");
        botonSalir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 3)));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        panelBotones.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 120, 50));

        botonIniciarSesion.setBackground(new java.awt.Color(0, 79, 116));
        botonIniciarSesion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(254, 254, 254));
        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 210, 255)));
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        panelBotones.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, 50));

        jLabel14.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(254, 254, 254));
        jLabel14.setText("Opciones Editor");
        panelBotones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        panelPrincipal.add(panelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, 1520, 122));

        textAreaRespuestaDelServidor.setEditable(false);
        textAreaRespuestaDelServidor.setBackground(new java.awt.Color(1, 45, 30));
        textAreaRespuestaDelServidor.setColumns(20);
        textAreaRespuestaDelServidor.setFont(new java.awt.Font("DialogInput", 0, 16)); // NOI18N
        textAreaRespuestaDelServidor.setForeground(new java.awt.Color(2, 253, 149));
        textAreaRespuestaDelServidor.setRows(5);
        jScrollPane4.setViewportView(textAreaRespuestaDelServidor);

        panelPrincipal.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 187, 560, 711));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Respuesta del Servidor:");
        panelPrincipal.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(974, 161, -1, -1));

        jLabel10.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(254, 254, 254));
        jLabel10.setText("Instrucciones:");
        panelPrincipal.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        menuPrincipal.setBackground(new java.awt.Color(1, 1, 1));
        menuPrincipal.setForeground(new java.awt.Color(254, 254, 254));
        menuPrincipal.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N

        menuInicio.setBackground(new java.awt.Color(1, 32, 50));
        menuInicio.setForeground(new java.awt.Color(0, 114, 255));
        menuInicio.setText("Inicio");
        menuInicio.setFont(new java.awt.Font("Noto Sans", 1, 17)); // NOI18N

        menuIniciarSesion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        menuIniciarSesion.setForeground(new java.awt.Color(0, 176, 255));
        menuIniciarSesion.setText("Iniciar Sesion");
        menuIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIniciarSesionActionPerformed(evt);
            }
        });
        menuInicio.add(menuIniciarSesion);

        menuSalir.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        menuSalir.setForeground(new java.awt.Color(163, 4, 2));
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuInicio.add(menuSalir);

        menuPrincipal.add(menuInicio);

        menuAcercaDe.setBackground(new java.awt.Color(1, 32, 50));
        menuAcercaDe.setForeground(new java.awt.Color(254, 254, 254));
        menuAcercaDe.setText("Acerca de ...");
        menuAcercaDe.setFont(new java.awt.Font("Noto Sans", 1, 17)); // NOI18N
        menuAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAcercaDeMouseClicked(evt);
            }
        });
        menuPrincipal.add(menuAcercaDe);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_menuSalirActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonAnalisisLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalisisLexicoActionPerformed
        ManejadorVerificacionObligatorios.imprimirListadoSitiosWeb();
    }//GEN-LAST:event_botonAnalisisLexicoActionPerformed

    private void botonAnalisisSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalisisSintacticoActionPerformed
        String texto = textAreaPrincipal.getText();
        Analizador.analizar(texto, this);

//        String mensaje = "CLIENTE:   " + this.textAreaPrincipal.getText() + "\n\n";
//        this.textAreaPrincipal.append(mensaje);
//        Cliente c = new Cliente(6011, mensaje);
//        Thread t = new Thread(c);
//        t.start();
    }//GEN-LAST:event_botonAnalisisSintacticoActionPerformed

    private void textAreaPrincipalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaPrincipalKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

        }
    }//GEN-LAST:event_textAreaPrincipalKeyReleased

    private void textAreaPrincipalCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_textAreaPrincipalCaretUpdate
        int pos = evt.getDot();
        try {
            int row = textAreaPrincipal.getLineOfOffset(pos) + 1;
            int col = pos - textAreaPrincipal.getLineStartOffset(row - 1) + 1;
            labelNumeroLinea.setText(row + "");
            labelNumeroColumna.setText(col + "");
        } catch (BadLocationException exc) {
            System.out.println(exc);
        }
    }//GEN-LAST:event_textAreaPrincipalCaretUpdate

    private void menuIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIniciarSesionActionPerformed
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_menuIniciarSesionActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        ventanaIniciarSesion.setVisible(true);
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void menuAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAcercaDeMouseClicked
       ventanaAcercaDe.setVisible(true);
    }//GEN-LAST:event_menuAcercaDeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonAnalisisLexico;
    public static javax.swing.JButton botonAnalisisSintactico;
    private javax.swing.JButton botonIniciarSesion;
    public static javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelNumeroColumna;
    private javax.swing.JLabel labelNumeroLinea;
    private javax.swing.JMenu menuAcercaDe;
    private javax.swing.JMenuItem menuIniciarSesion;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextArea textAreaErroresLexicos;
    private javax.swing.JTextArea textAreaErroresSintacticos;
    public static javax.swing.JTextArea textAreaPrincipal;
    private javax.swing.JTextArea textAreaRespuestaDelServidor;
    // End of variables declaration//GEN-END:variables

    public void enviarTextoAlServidor(String texto) {
        Cliente c = new Cliente(6011, texto);
        Thread t = new Thread(c);
        t.start();
    }

    /*
    
    
    
    
    
    
    
    
    
     */
    public void limpiar() {
        textAreaPrincipal.setText("");
        textAreaErroresLexicos.setText("");
        textAreaErroresSintacticos.setText("");
        textAreaRespuestaDelServidor.setText("");
        labelNumeroLinea.setText("");
        labelNumeroColumna.setText("");
    }

    public void escribirEnTextAreaDeRespuestaDelServidor(String texto) {
        this.textAreaRespuestaDelServidor.append(texto + "\n");
    }

    public void escribirEnTextAreaDeErroresLexicos(String texto) {
        this.textAreaErroresLexicos.setText(texto);
    }

    public void escribirEnTextAreaDeErroresSintacticos(String texto) {
        this.textAreaErroresSintacticos.setText(texto);
    }

    public void escribirRespuestaSegunResultado(boolean resultado, String mensajeOk, String mensajeError) {

        if (resultado == true) {
            escribirEnTextAreaDeRespuestaDelServidor("     >    " + mensajeOk);
        } else {
            escribirEnTextAreaDeRespuestaDelServidor("     >    " + mensajeError);

        }
    }

    @Override
    public void update(Observable o, Object arg) {
        this.textAreaRespuestaDelServidor.append((String) arg);
    }

}
