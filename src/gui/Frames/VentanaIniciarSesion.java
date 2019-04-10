package gui.Frames;

import AnalisisUsuarios.AnalizadorUsuarios;
import Manejadores.ManejadorUsuarios;
import Modelos.Usuario;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class VentanaIniciarSesion extends javax.swing.JDialog {

    ArrayList<Usuario> listadoUsuarios = new ArrayList<>();

    public VentanaIniciarSesion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        rellenarListado();

        setTitle("Iniciar Sesion");
        setLocationRelativeTo(null);
        setResizable(false);
        this.labelErrorCampos.setVisible(false);
        this.labelErrorUsuarioContrasenia.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonIniciarSesion = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        textUsuario = new javax.swing.JTextField();
        textContrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        labelErrorCampos = new javax.swing.JLabel();
        labelErrorUsuarioContrasenia = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 1, 1));

        botonIniciarSesion.setBackground(new java.awt.Color(35, 51, 59));
        botonIniciarSesion.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(254, 254, 254));
        botonIniciarSesion.setText("Iniciar");
        botonIniciarSesion.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 181)));
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });

        botonRegistrarse.setBackground(new java.awt.Color(35, 51, 59));
        botonRegistrarse.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(254, 254, 254));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 255, 223)));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        textUsuario.setBackground(new java.awt.Color(35, 51, 59));
        textUsuario.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        textUsuario.setForeground(new java.awt.Color(0, 224, 255));
        textUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 35, 35), 1, true));
        textUsuario.setCaretColor(new java.awt.Color(0, 218, 255));

        textContrasenia.setBackground(new java.awt.Color(35, 51, 59));
        textContrasenia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        textContrasenia.setForeground(new java.awt.Color(0, 224, 255));
        textContrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textContrasenia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(35, 35, 35), 1, true));
        textContrasenia.setCaretColor(new java.awt.Color(0, 218, 255));
        textContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textContraseniaKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(37, 146, 206));
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 146, 206));
        jLabel2.setText("Contraseña:");

        botonCancelar.setBackground(new java.awt.Color(35, 51, 59));
        botonCancelar.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(254, 254, 254));
        botonCancelar.setText("Cancelar");
        botonCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 10, 0)));
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        labelErrorCampos.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        labelErrorCampos.setForeground(new java.awt.Color(255, 15, 0));
        labelErrorCampos.setText("* No ha llenado todos los campos");

        labelErrorUsuarioContrasenia.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        labelErrorUsuarioContrasenia.setForeground(new java.awt.Color(255, 15, 0));
        labelErrorUsuarioContrasenia.setText("*Usuario y/o contrasenia no validos");

        botonLimpiar.setBackground(new java.awt.Color(1, 1, 1));
        botonLimpiar.setForeground(new java.awt.Color(254, 254, 254));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(35, 51, 59)));
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelErrorUsuarioContrasenia)
                    .addComponent(labelErrorCampos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorCampos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelErrorUsuarioContrasenia)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        limpiar();
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        registrarUsuario();
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void textContraseniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textContraseniaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
           iniciarSesion();
        }
    }//GEN-LAST:event_textContraseniaKeyReleased

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelErrorCampos;
    private javax.swing.JLabel labelErrorUsuarioContrasenia;
    private javax.swing.JPasswordField textContrasenia;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables

    public void limpiar() {
        textUsuario.setText("");
        textContrasenia.setText("");
        labelErrorCampos.setVisible(false);
        labelErrorUsuarioContrasenia.setVisible(false);
    }

    public void enlistarUsuarios(String usuario, String contrasenia) {// se ejecuta en el cup
        Usuario usuarioNuevo = new Usuario(usuario, contrasenia);
        listadoUsuarios.add(usuarioNuevo);
    }

    public void mostrarListadoUsuarios() {
        System.out.println("\n=== Listado de Usuarios ===");
        for (int i = 0; i < listadoUsuarios.size(); i++) {
            System.out.println("        Usuario: " + listadoUsuarios.get(i).getUsuario());
            System.out.println("    Contrasenia: " + listadoUsuarios.get(i).getContrasenia());
            System.out.println("\n");
        }
    }

    public void rellenarListado() {
        String texto = ManejadorUsuarios.extraerContenidoDeArchivo("usuarios.txt");
        AnalizadorUsuarios.analizarUsuarios(texto, this);
    }

//================ Registrar Usuario ==========================================================================
    public boolean verificarExistenciaDeUsuario() {

        for (int i = 0; i < listadoUsuarios.size(); i++) {

            if (listadoUsuarios.get(i).getUsuario().equals(textUsuario.getText())) {
                System.out.println("Si existe el usuario");
                System.out.println(listadoUsuarios.get(i).getUsuario() + " = " + textUsuario.getText());
                return true;// Significa que el usuario si existe
            } else {
                System.out.println("-------");
            }
        }
        System.out.println("No existe el usuario");
        return false;
    }

    public void registrarUsuario() {
        if (textUsuario.getText().isEmpty() || textContrasenia.getText().isEmpty()) {
            labelErrorCampos.setVisible(true);
        } else {
            labelErrorCampos.setVisible(false);

            boolean existeUsuario = verificarExistenciaDeUsuario();

            if (existeUsuario == true) {
                System.out.println("Ya existe el usuario");
                labelErrorUsuarioContrasenia.setVisible(true);
            } else {
                System.out.println("no existio");
                labelErrorUsuarioContrasenia.setVisible(false);
                char[] contrasenia = textContrasenia.getPassword();
                String contraseniaFormateada = new String(contrasenia);
                ManejadorUsuarios.escribirDatosUsuarioEnArchivo(textUsuario.getText(), contraseniaFormateada);
                listadoUsuarios.clear();
                rellenarListado();

            }

        }
    }

//================ Iniciar Sesion ==========================================================================
    public boolean verificarContraseniaDeUsuario() {

        char[] contrasenia = textContrasenia.getPassword();
        String contraseniaFormateada = new String(contrasenia);

        for (int i = 0; i < listadoUsuarios.size(); i++) {

            if (listadoUsuarios.get(i).getUsuario().equals(textUsuario.getText()) && listadoUsuarios.get(i).getContrasenia().equals(contraseniaFormateada)) {
                System.out.println("Uusario Y Contrasenia Valida");

                return true;// Significa que el usuario si existe
            } else {
                System.out.println("-------");
            }
        }
        System.out.println("No existe el usuario o contrasenia NO valida");
        return false;
    }

    public void iniciarSesion() {
        if (textUsuario.getText().isEmpty() || textContrasenia.getText().isEmpty()) {
            labelErrorCampos.setVisible(true);
        } else {
            labelErrorCampos.setVisible(false);

            boolean existeUsuario = verificarContraseniaDeUsuario();

            if (existeUsuario == false) {

                labelErrorUsuarioContrasenia.setVisible(true);
            } else {

                VentanaAppCliente.botonAnalisisSintactico.setEnabled(true);
                VentanaAppCliente.botonAnalisisLexico.setEnabled(true);
                VentanaAppCliente.botonLimpiar.setEnabled(true);
                VentanaAppCliente.textAreaPrincipal.setEnabled(true);
                VentanaAppCliente.USUARIO_ACTUAL = textUsuario.getText();
                labelErrorUsuarioContrasenia.setVisible(false);
                limpiar();
                this.dispose();
            }

        }
    }

}
