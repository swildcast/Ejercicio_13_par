
package pjbanco;

import java.awt.Image;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cristhian Grisales
 */
public class Banco extends javax.swing.JFrame {
    
    DefaultTableModel modelMovs = new DefaultTableModel(); //para poder ingresar datos a la tabla
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<String> listaTipoCuenta=new ArrayList<String>();
    Cliente cliente;
    Cuenta cuenta;
    String fecha = "dd/MM/yyyy";
    private double consolidado=0;
  
    public Banco() {
        
        initComponents();
        setTitle("BANCO FINTECH"); /*Para por titulo en la ventana del frame*/
        setLocationRelativeTo(null); /*Comando para centrar la ventana en la pantalla*/
        setSize(920,700);   /*comando para ponerle tamano fijo al formulario*/
        setIconImage(getIconImage()); /*cambia el icono de la ventana por el escogido en getIconImage*/
        ImageIcon img = new ImageIcon("src/img/Fintech.png");
        Icon icono = new ImageIcon(img.getImage().getScaledInstance(lblLogo.getWidth(),lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(icono);
        this.repaint(); //para que se apliquen los cambios
        modelMovs.addColumn("CUENTA");
        modelMovs.addColumn("FECHA");
        modelMovs.addColumn("TIPO");
        modelMovs.addColumn("MONTO");
        modelMovs.addColumn("COMISION");
        tblMovimientos.setModel(modelMovs);
        
        
    }
    
    //icono del frame
    @Override
    public Image getIconImage()
    {
        Image retVaule = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/Fintech.png"));
        return retVaule;
    }
    public double getConsolidado() {
        return consolidado;
    }

    public void setConsolidado(double consolidado) {
        this.consolidado = consolidado;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo = new javax.swing.JLabel();
        lblFintech = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JPanel();
        lblNombreNC = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefonoNC = new javax.swing.JLabel();
        txtTelefonoCliente = new javax.swing.JTextField();
        lblDireccionNC = new javax.swing.JLabel();
        txtDireccionCliente = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();
        lblApellidoN = new javax.swing.JLabel();
        txtApellidoN = new javax.swing.JTextField();
        lblCedulaN = new javax.swing.JLabel();
        txtCedulaN = new javax.swing.JTextField();
        jPNuevaCuenta = new javax.swing.JPanel();
        lblClienteN = new javax.swing.JLabel();
        cboCuentaCliente = new javax.swing.JComboBox<>();
        lblTipoCuentaN = new javax.swing.JLabel();
        cboTipoCuenta = new javax.swing.JComboBox<>();
        lblMontoN = new javax.swing.JLabel();
        btnAgregarTipoCuenta = new javax.swing.JButton();
        txtMontoInicial = new javax.swing.JTextField();
        btnAgregarCuenta = new javax.swing.JButton();
        jPMovimientos = new javax.swing.JPanel();
        lblClienteMovimiento = new javax.swing.JLabel();
        cboConsultaCliente = new javax.swing.JComboBox<>();
        lblTipoCuentaMovimeitno = new javax.swing.JLabel();
        cboConsultaTipoCuenta = new javax.swing.JComboBox<>();
        lblTipoMovimiento = new javax.swing.JLabel();
        cboTipoMovimiento = new javax.swing.JComboBox<>();
        lblMontoMovimiento = new javax.swing.JLabel();
        txtMontoMovimiento = new javax.swing.JTextField();
        btnAgregarMovimiento = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cboClienteATransferir = new javax.swing.JComboBox<>();
        jPDatosCuenta = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDireccionCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblMontoInicial = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovimientos = new javax.swing.JTable();
        lblSaldo = new javax.swing.JLabel();
        lblSaldotex = new javax.swing.JLabel();
        lblComision = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fintech.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 180));

        lblFintech.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFintech.setText("FINTECH");
        getContentPane().add(lblFintech, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVO CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        txtNombreCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreNC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombreNC.setText("Nombre");
        txtNombreCliente.add(lblNombreNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombreCliente.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 130, -1));

        lblTelefonoNC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefonoNC.setText("Telefono ");
        txtNombreCliente.add(lblTelefonoNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 20));

        txtTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.add(txtTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, -1));

        lblDireccionNC.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDireccionNC.setText("Correo Electronico");
        txtNombreCliente.add(lblDireccionNC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));

        txtDireccionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.add(txtDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 130, -1));

        btnAgregarCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarCliente.setText("Agregar Cliente");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        txtNombreCliente.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 130, -1));

        lblApellidoN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblApellidoN.setText("Apellido");
        txtNombreCliente.add(lblApellidoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 50, 20));
        txtNombreCliente.add(txtApellidoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 130, -1));

        lblCedulaN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCedulaN.setText("Cedula");
        txtNombreCliente.add(lblCedulaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, -1));
        txtNombreCliente.add(txtCedulaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, -1));

        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 300, 230));

        jPNuevaCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NUEVA CUENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPNuevaCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClienteN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteN.setText("Cliente :");
        jPNuevaCuenta.add(lblClienteN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        jPNuevaCuenta.add(cboCuentaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, -1));

        lblTipoCuentaN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoCuentaN.setText("Tipo de Cuenta :");
        jPNuevaCuenta.add(lblTipoCuentaN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jPNuevaCuenta.add(cboTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 140, -1));

        lblMontoN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMontoN.setText("Monto :");
        jPNuevaCuenta.add(lblMontoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        btnAgregarTipoCuenta.setText("+");
        btnAgregarTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTipoCuentaActionPerformed(evt);
            }
        });
        jPNuevaCuenta.add(btnAgregarTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 50, -1));

        txtMontoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoInicialActionPerformed(evt);
            }
        });
        jPNuevaCuenta.add(txtMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        btnAgregarCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgregarCuenta.setText("Agregar Cuenta");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });
        jPNuevaCuenta.add(btnAgregarCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 120, -1));

        getContentPane().add(jPNuevaCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 320, 190));

        jPMovimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MOVIMIENTOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPMovimientos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClienteMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClienteMovimiento.setText("Cliente :");
        jPMovimientos.add(lblClienteMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 20));

        cboConsultaCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaClienteActionPerformed(evt);
            }
        });
        jPMovimientos.add(cboConsultaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));

        lblTipoCuentaMovimeitno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoCuentaMovimeitno.setText("Tipo Cuenta :");
        jPMovimientos.add(lblTipoCuentaMovimeitno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 20));

        cboConsultaTipoCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboConsultaTipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboConsultaTipoCuentaActionPerformed(evt);
            }
        });
        jPMovimientos.add(cboConsultaTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 140, 30));

        lblTipoMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoMovimiento.setText("Tipo Movimiento :");
        jPMovimientos.add(lblTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, 20));

        cboTipoMovimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cboTipoMovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DEPOSITO", "RETIRO", "TRANSFERENCIA" }));
        cboTipoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoMovimientoActionPerformed(evt);
            }
        });
        jPMovimientos.add(cboTipoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, 30));

        lblMontoMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMontoMovimiento.setText("Monto :");
        jPMovimientos.add(lblMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, -1, 20));

        txtMontoMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoMovimientoActionPerformed(evt);
            }
        });
        jPMovimientos.add(txtMontoMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 160, 30));

        btnAgregarMovimiento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregarMovimiento.setText("Agregar Movimientos");
        btnAgregarMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMovimientoActionPerformed(evt);
            }
        });
        jPMovimientos.add(btnAgregarMovimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cliente a Transferir :");
        jPMovimientos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));

        cboClienteATransferir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPMovimientos.add(cboClienteATransferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        getContentPane().add(jPMovimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 710, 160));

        jPDatosCuenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS CUENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPDatosCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNombreCliente.setMaximumSize(new java.awt.Dimension(38, 16));
        lblNombreCliente.setMinimumSize(new java.awt.Dimension(38, 16));
        lblNombreCliente.setName(""); // NOI18N
        lblNombreCliente.setPreferredSize(new java.awt.Dimension(38, 16));
        jPDatosCuenta.add(lblNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 130, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre :");
        jPDatosCuenta.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPDatosCuenta.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Telefono :");
        jPDatosCuenta.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblDireccionCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPDatosCuenta.add(lblDireccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 130, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Correo Electronico:");
        jPDatosCuenta.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, -1));

        lblTipoCuenta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPDatosCuenta.add(lblTipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 130, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Tipo Cuenta :");
        jPDatosCuenta.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 80, -1));

        lblMontoInicial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPDatosCuenta.add(lblMontoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Monto Inicial :");
        jPDatosCuenta.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 80, -1));

        jLabel1.setText("Cedula :");
        jPDatosCuenta.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));
        jPDatosCuenta.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, 20));

        getContentPane().add(jPDatosCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 300, 230));

        tblMovimientos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblMovimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMovimientos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 550, 180));

        lblSaldo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSaldo.setText("$ 0.00 COP");
        getContentPane().add(lblSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, 290, -1));

        lblSaldotex.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblSaldotex.setText("SALDO");
        getContentPane().add(lblSaldotex, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 620, 120, -1));

        lblComision.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblComision.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblComision.setText("$ 0.00 COP");
        getContentPane().add(lblComision, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 160, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("COMISION");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMontoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoInicialActionPerformed

    private void txtMontoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoMovimientoActionPerformed

    private void cboConsultaTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaTipoCuentaActionPerformed
        verDatos();
        VerMovimientos();
        
    }//GEN-LAST:event_cboConsultaTipoCuentaActionPerformed

    private void btnAgregarTipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTipoCuentaActionPerformed
        String tipoCuenta=JOptionPane.showInputDialog(this,"TIPO CUENTA");
        listaTipoCuenta.add(tipoCuenta);
        llenarComoboTipoCuenta();
    }//GEN-LAST:event_btnAgregarTipoCuentaActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed
       cliente=listaClientes.get(cboCuentaCliente.getSelectedIndex());
       Cuenta cuenta = new Cuenta();
       cuenta.setTipoCuenta(listaTipoCuenta.get(cboTipoCuenta.getSelectedIndex()));
       cuenta.setMontoInicial(Double.parseDouble(txtMontoInicial.getText()));
       
       cliente.addCuenta(cuenta);
       
       Movimiento m = new Movimiento();
       m.setFechaMovimiento(new SimpleDateFormat(fecha).format(new Date()));
       m.setTipoMovimiento("APERTURA");
       m.setMonto(Double.parseDouble(txtMontoInicial.getText()));
       cuenta.addMovimiento(m);
       borrarFromCuenta();
       refrescarComboCuenta();
       verDatos();
       
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void cboConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboConsultaClienteActionPerformed
        refrescarComboCuenta();
        VerMovimientos();
        verDatos();
    }//GEN-LAST:event_cboConsultaClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente c = new Cliente();
        c.setNombre(txtNombre.getText());
        c.setApellidos(txtApellidoN.getText());
        c.setCedula(txtCedulaN.getText());
        c.setTelefono(txtTelefonoCliente.getText());
        c.setDireccion(txtDireccionCliente.getText());
        listaClientes.add(c);
        borrarFromCliente();
        llenarCombosCliente();
        verDatos();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void txtDireccionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionClienteActionPerformed

    private void txtTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoClienteActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMovimientoActionPerformed
  
       Movimiento m = new Movimiento();
       
    
       m.setFechaMovimiento(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
       m.setTipoMovimiento(cboTipoMovimiento.getSelectedItem().toString());
      
       double monto = Double.parseDouble(txtMontoMovimiento.getText().toString());
       double comision=0;
       cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex()); 
       cuenta = cliente.getMisCuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
       
       comision = monto*0.0005;
       setConsolidado(comision); 
       
       switch (m.getTipoMovimiento()) {
            case "DEPOSITO":
                if (cuenta.getTipoCuenta().equalsIgnoreCase("CREDITO")) 
                {
                    JOptionPane.showMessageDialog(this, "NO SE PUEDE DEPOSITAR PORQUE ES UNA CUENTA CREDITO");
                } else 
                {
                    m.setMonto((monto-comision));
                    cuenta.addMovimiento(m);
                    VerMovimientos();
                }
                
                break;
            case "RETIRO":
                m.setMonto((monto+comision)*-1);
                cuenta.addMovimiento(m);
                VerMovimientos(); 
                break;
            case "TRANSFERENCIA":
                m.setMonto((monto+comision)*-1);
                cuenta.addMovimiento(m);
                
                Cliente clienteDestino = listaClientes.get(cboClienteATransferir.getSelectedIndex());
                Cuenta cuentaDestino = clienteDestino.getMisCuentas().get(cboConsultaTipoCuenta.getSelectedIndex());

                Movimiento mDestino = new Movimiento();
                mDestino.setFechaMovimiento(new SimpleDateFormat(fecha).format(new Date()));
                mDestino.setTipoMovimiento(cboTipoMovimiento.getSelectedItem().toString());
             
                mDestino.setMonto(monto);
                cuentaDestino.addMovimiento(mDestino);
                VerMovimientos();
                break;
            default:
                throw new AssertionError();
        }
       
         
       
    }//GEN-LAST:event_btnAgregarMovimientoActionPerformed

    private void cboTipoMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoMovimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboTipoMovimientoActionPerformed

    public void VerMovimientos()
    {//rellenar la tabla
       cliente = listaClientes.get(cboConsultaCliente.getSelectedIndex()); 
       cuenta = cliente.getMisCuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
       
       double saldo = 0,comision=0;
       
       while (modelMovs.getRowCount() > 0)//borra los elementos de la tabla
       {
           modelMovs.removeRow(0);
       }
        for (Movimiento m : cuenta.getMisMovimientos()) {
            Object mov[] = new Object[5];
            mov[0] = cuenta.getTipoCuenta();
            mov[1] = m.getFechaMovimiento();
            mov[2] = m.getTipoMovimiento();
            mov[3] = aMoneda(m.getMonto());
            mov[4] = aMoneda(m.getMonto()*0.0005);
            saldo += m.getMonto();
            comision += getConsolidado();
            modelMovs.addRow(mov);
        }
        tblMovimientos.setModel(modelMovs);
        lblSaldo.setText(aMoneda(saldo));
        lblComision.setText(aMoneda(comision));
    }  
   
    public String aMoneda(double cantidad)
    {
        cantidad = Math.round(cantidad*100.0)/100.0;
        DecimalFormat formato = new DecimalFormat("$ #,###,###.## COP");
        return formato.format(cantidad);
    }
    
    public void verDatos(){//imprime los datos en los lbl
        cliente=listaClientes.get(cboConsultaCliente.getSelectedIndex());
        lblNombreCliente.setText(cliente.getNombre()+" "+cliente.getApellidos());
        lblCedula.setText(cliente.getCedula());
        lblTelefono.setText(cliente.getTelefono());
        lblDireccionCliente.setText(cliente.getDireccion());
        
        if(cliente.getMisCuentas().size()>0)
        {
            cuenta = cliente.getMisCuentas().get(cboConsultaTipoCuenta.getSelectedIndex());
            lblTipoCuenta.setText(cuenta.getTipoCuenta());
            lblMontoInicial.setText(aMoneda(cuenta.getMontoInicial()));
        }
        else
        {
            lblTipoCuenta.setText(("NO HAY CUENTA"));
            lblMontoInicial.setText(("NO HAY CUENTA"));
        }
    }
   
    public void refrescarComboCuenta()  
    {
        cliente=listaClientes.get(cboConsultaCliente.getSelectedIndex());
        int i = 0;
        ArrayList<String> cuentas = new ArrayList<String>();
        for (Cuenta c : cliente.getMisCuentas()) 
        {
            cuentas.add(c.getTipoCuenta());
        }
        cboConsultaTipoCuenta.setModel(new DefaultComboBoxModel(cuentas.toArray()));
    }
    
    //metodo para poner en blanco los comboBox en el from cuenta
    public void borrarFromCuenta()
    {
        cboCuentaCliente.setSelectedIndex(0);
        cboTipoCuenta.setSelectedIndex(0);
        txtMontoInicial.setText("");
    }
    
    //metodo para poner en blanco los txt en el from cliente
    public void borrarFromCliente()
    {
      txtNombre.setText("");
      txtApellidoN.setText("");
      txtCedulaN.setText("");
      txtTelefonoCliente.setText("");
      txtDireccionCliente.setText("");
    }
    
    @SuppressWarnings("unchecked")
    
    public void llenarCombosCliente()
    {
        Object clientes[] = new Object[listaClientes.size()];
        int i = 0;
        for (Cliente c : listaClientes) 
        {
            clientes[i] = c.getNombre()+" "+ c.getApellidos();
            i++;
        }
        cboCuentaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboConsultaCliente.setModel(new DefaultComboBoxModel(clientes));
        cboClienteATransferir.setModel(new DefaultComboBoxModel(clientes));
    }
    public void llenarComoboTipoCuenta()
    {
        Object tipos[] = new Object[listaTipoCuenta.size()];
        int i = 0;
        for (String tipo : listaTipoCuenta) 
        {
            tipos[i] = tipo;
            i++;
        }
        cboTipoCuenta.setModel(new DefaultComboBoxModel(tipos));
        cboConsultaTipoCuenta.setModel(new DefaultComboBoxModel(tipos) );
    }
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
           /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Banco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnAgregarMovimiento;
    private javax.swing.JButton btnAgregarTipoCuenta;
    private javax.swing.JComboBox<String> cboClienteATransferir;
    private javax.swing.JComboBox<String> cboConsultaCliente;
    private javax.swing.JComboBox<String> cboConsultaTipoCuenta;
    private javax.swing.JComboBox<String> cboCuentaCliente;
    private javax.swing.JComboBox<String> cboTipoCuenta;
    private javax.swing.JComboBox<String> cboTipoMovimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDatosCuenta;
    private javax.swing.JPanel jPMovimientos;
    private javax.swing.JPanel jPNuevaCuenta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoN;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedulaN;
    private javax.swing.JLabel lblClienteMovimiento;
    private javax.swing.JLabel lblClienteN;
    private javax.swing.JLabel lblComision;
    private javax.swing.JLabel lblDireccionCliente;
    private javax.swing.JLabel lblDireccionNC;
    private javax.swing.JLabel lblFintech;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMontoInicial;
    private javax.swing.JLabel lblMontoMovimiento;
    private javax.swing.JLabel lblMontoN;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombreNC;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblSaldotex;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoNC;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JLabel lblTipoCuentaMovimeitno;
    private javax.swing.JLabel lblTipoCuentaN;
    private javax.swing.JLabel lblTipoMovimiento;
    private javax.swing.JTable tblMovimientos;
    private javax.swing.JTextField txtApellidoN;
    private javax.swing.JTextField txtCedulaN;
    private javax.swing.JTextField txtDireccionCliente;
    private javax.swing.JTextField txtMontoInicial;
    private javax.swing.JTextField txtMontoMovimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPanel txtNombreCliente;
    private javax.swing.JTextField txtTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
