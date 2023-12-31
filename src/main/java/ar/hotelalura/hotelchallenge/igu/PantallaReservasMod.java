/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ar.hotelalura.hotelchallenge.igu;


import ar.hotelalura.hotelchallenge.logica.Controladora;
import ar.hotelalura.hotelchallenge.logica.Reserva;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;


import java.awt.Color;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.swing.JTextField;


public class PantallaReservasMod extends javax.swing.JFrame {
    
     Date fechaCheckIn = null;
     Date fechaCheckOut = null;
     Mensaje mensajeError = null;
     Controladora control = null;
    Reserva reserva;
     
     int numHuesped;
     int numReserva;
    int xMouse, yMouse;
    public PantallaReservasMod(int numReserva,int numHuesped) {
        initComponents();
        FlatMaterialLighterIJTheme.setup();
        control = new Controladora();
        
        this.numHuesped = numHuesped;
        this.numReserva = numReserva;
        cargarDatos(numReserva);
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelizquierdo = new javax.swing.JPanel();
        txtReserva = new javax.swing.JLabel();
        txtFormaDePago = new javax.swing.JLabel();
        txtCheckIn = new javax.swing.JLabel();
        txtCheckOut1 = new javax.swing.JLabel();
        txtValor = new javax.swing.JLabel();
        inputCheckIn = new com.toedter.calendar.JDateChooser();
        inputCheckOut = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtValorTotal = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        comBoxFormaPago = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        btnSiguiente = new javax.swing.JPanel();
        txtSiguiente = new javax.swing.JLabel();
        panelderecho = new javax.swing.JPanel();
        imgIcono = new javax.swing.JLabel();
        imgReservas = new javax.swing.JLabel();
        panelSuperior = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelizquierdo.setBackground(new java.awt.Color(255, 255, 255));

        txtReserva.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        txtReserva.setForeground(new java.awt.Color(14, 139, 199));
        txtReserva.setText("EDICION DE RESERVAS");

        txtFormaDePago.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtFormaDePago.setForeground(new java.awt.Color(102, 102, 102));
        txtFormaDePago.setText("FORMA DE PAGO");

        txtCheckIn.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtCheckIn.setForeground(new java.awt.Color(102, 102, 102));
        txtCheckIn.setText("FECHA DE CHECK IN");

        txtCheckOut1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtCheckOut1.setForeground(new java.awt.Color(102, 102, 102));
        txtCheckOut1.setText("FECHA DE CHECK OUT");

        txtValor.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtValor.setForeground(new java.awt.Color(102, 102, 102));
        txtValor.setText("VALOR DE LA RESERVA");

        inputCheckIn.setBackground(new java.awt.Color(255, 255, 255));
        inputCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        inputCheckIn.setDateFormatString("y MMM d");
        inputCheckIn.setInheritsPopupMenu(true);

        inputCheckOut.setBackground(new java.awt.Color(255, 255, 255));
        inputCheckOut.setForeground(new java.awt.Color(0, 0, 0));
        inputCheckOut.setDateFormatString("y MMM d");
        inputCheckOut.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                inputCheckOutPropertyChange(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(14, 139, 199));
        jSeparator1.setForeground(new java.awt.Color(14, 139, 199));

        jSeparator2.setBackground(new java.awt.Color(14, 139, 199));
        jSeparator2.setForeground(new java.awt.Color(14, 139, 199));

        txtValorTotal.setEditable(false);
        txtValorTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtValorTotal.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtValorTotal.setBorder(null);
        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(14, 139, 199));
        jSeparator3.setForeground(new java.awt.Color(14, 139, 199));

        comBoxFormaPago.setBackground(new java.awt.Color(255, 255, 255));
        comBoxFormaPago.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        comBoxFormaPago.setForeground(new java.awt.Color(0, 0, 0));
        comBoxFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta Credito", "Tarjeta Debito" }));
        comBoxFormaPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxFormaPagoActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(14, 139, 199));
        jSeparator4.setForeground(new java.awt.Color(14, 139, 199));

        btnSiguiente.setBackground(new java.awt.Color(14, 139, 199));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseClicked(evt);
            }
        });

        txtSiguiente.setBackground(new java.awt.Color(14, 139, 199));
        txtSiguiente.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        txtSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        txtSiguiente.setText("   SIGUIENTE");
        txtSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSiguienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSiguienteLayout = new javax.swing.GroupLayout(btnSiguiente);
        btnSiguiente.setLayout(btnSiguienteLayout);
        btnSiguienteLayout.setHorizontalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSiguienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSiguienteLayout.setVerticalGroup(
            btnSiguienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSiguienteLayout.createSequentialGroup()
                .addComponent(txtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelizquierdoLayout = new javax.swing.GroupLayout(panelizquierdo);
        panelizquierdo.setLayout(panelizquierdoLayout);
        panelizquierdoLayout.setHorizontalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelizquierdoLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelizquierdoLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(txtReserva))
                    .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelizquierdoLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        panelizquierdoLayout.setVerticalGroup(
            panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelizquierdoLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(txtReserva)
                .addGap(21, 21, 21)
                .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(inputCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtCheckOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(inputCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelizquierdoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelizquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFormaDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(comBoxFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        background.add(panelizquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 540));

        panelderecho.setBackground(new java.awt.Color(14, 139, 199));

        imgIcono.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Bravo\\Desktop\\HotelChallenge2\\src\\imagenes\\Ha-100px.png")); // NOI18N

        imgReservas.setIcon(new javax.swing.ImageIcon("C:\\Users\\Juan Bravo\\Desktop\\HotelChallenge2\\src\\imagenes\\reservas-img-3.png")); // NOI18N

        javax.swing.GroupLayout panelderechoLayout = new javax.swing.GroupLayout(panelderecho);
        panelderecho.setLayout(panelderechoLayout);
        panelderechoLayout.setHorizontalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelderechoLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelderechoLayout.createSequentialGroup()
                        .addComponent(imgIcono)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelderechoLayout.createSequentialGroup()
                        .addComponent(imgReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        panelderechoLayout.setVerticalGroup(
            panelderechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelderechoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(imgIcono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(panelderecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 500, 480));

        panelSuperior.setBackground(new java.awt.Color(14, 139, 199));
        panelSuperior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(14, 139, 199));

        txtExit.setBackground(new java.awt.Color(0, 0, 0));
        txtExit.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        txtExit.setForeground(new java.awt.Color(255, 255, 255));
        txtExit.setText("X");
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(txtExit)
                .addGap(28, 28, 28))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(txtExit)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(panelSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered

        txtExit.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited

        txtExit.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txtExitMouseExited

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void comBoxFormaPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxFormaPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxFormaPagoActionPerformed

    public Date convertirFecha(Date fecha){
        long fechaD = fecha.getTime();
        java.sql.Date fechaFinal = new java.sql.Date(fechaD);
        return fechaFinal;
    }
    
    public long calcularDias(Date fechaCheckIn, Date fechaCheckOut){
    
    long fechaIn = fechaCheckIn.getTime();
    long fechaOut = fechaCheckOut.getTime();
    
    long tiempoTranscurrido = fechaOut - fechaIn;
    
    TimeUnit unidad = TimeUnit.DAYS;
    
    long dias = unidad.convert(tiempoTranscurrido, TimeUnit.MILLISECONDS);
    
    return dias;
    
    }
    
    public double calcularValor(Date fechaCheckIn, Date fechaCheckOut){
          double valorDia = 60.0;
          double diasTranscurridos =  calcularDias(fechaCheckIn, fechaCheckOut);
         double valorFinal = valorDia * diasTranscurridos;
         return valorFinal;
    }
    
    private void txtSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSiguienteMouseClicked
         fechaCheckIn = inputCheckIn.getDate();
         fechaCheckOut = inputCheckOut.getDate();
         String formaPago = (String) comBoxFormaPago.getSelectedItem();
        
        if(fechaCheckOut.before(fechaCheckIn)){
            mensajeError = new Mensaje("ADVERTENCIA","La fecha de check out no puede ser menor a la de check in.");
            mensajeError.setVisible(true);
            mensajeError.setLocationRelativeTo(null);
            
        
        }else{
        if(fechaCheckIn != null && fechaCheckOut !=null && formaPago !=null){
        double valor = Double.parseDouble(txtValorTotal.getText());
        
        Date checkIn = convertirFecha(fechaCheckIn);
        Date checkOut = convertirFecha(fechaCheckOut);
            
            
        PantallaRegistroHuspedesMod huesped = new PantallaRegistroHuspedesMod(numReserva,numHuesped);
         
        huesped.setDatos(checkIn,checkOut,valor,formaPago);
        huesped.setVisible(true);
        huesped.setLocationRelativeTo(null);
        
        this.dispose( );
        }else{
            mensajeError = new Mensaje("ADVERTENCIA","Debe completar todos los campos para continuar.");
            mensajeError.setVisible(true);
            mensajeError.setLocationRelativeTo(null);
        }
        }
       
    }//GEN-LAST:event_txtSiguienteMouseClicked

    private void btnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseClicked
          
    }//GEN-LAST:event_btnSiguienteMouseClicked

    private void inputCheckOutPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_inputCheckOutPropertyChange
        
        if(evt.getOldValue() != null ){
            fechaCheckIn = inputCheckIn.getDate();
            fechaCheckOut = inputCheckOut.getDate();
        
             calcularValor(fechaCheckIn, fechaCheckOut);
              txtValorTotal.setText(String.valueOf(calcularValor(fechaCheckIn, fechaCheckOut)));
        }
    }//GEN-LAST:event_inputCheckOutPropertyChange

 private void cargarDatos(int numReserva) {
         this.reserva = control.buscarReserva(numReserva);
         inputCheckIn.setDate(reserva.getCheckIn());
         inputCheckOut.setDate(reserva.getCheckOut());
         txtValorTotal.setText(String.valueOf(reserva.getValor()));
         
         //InputNacimiento.setDate(huesped.getfNacimiento());
         
    }
		
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnSiguiente;
    private javax.swing.JComboBox<String> comBoxFormaPago;
    private javax.swing.JLabel imgIcono;
    private javax.swing.JLabel imgReservas;
    public com.toedter.calendar.JDateChooser inputCheckIn;
    private com.toedter.calendar.JDateChooser inputCheckOut;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelderecho;
    private javax.swing.JPanel panelizquierdo;
    private javax.swing.JLabel txtCheckIn;
    private javax.swing.JLabel txtCheckOut1;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtFormaDePago;
    private javax.swing.JLabel txtReserva;
    private javax.swing.JLabel txtSiguiente;
    private javax.swing.JLabel txtValor;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
