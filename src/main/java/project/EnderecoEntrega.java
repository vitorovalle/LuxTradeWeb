/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import static project.Principal.logger;
import boleto.GeraBoleto;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import static project.ParameterStringBuilder.getParamsString;
import project.SetExpressCheckout;

/**
 *
 * @author Void
 */
public class EnderecoEntrega extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryAddress
     */
    public EnderecoEntrega(String logger, int valor, String data) {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        FaturamentoDAO.lancarFaturamento(logger, valor, data);
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
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        concluirBtn = new javax.swing.JButton();
        closeButton1 = new javax.swing.JButton();
        enderecoCampo = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(25, 25, 112));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Informe o endereço de entrega");
        jLabel13.setToolTipText("");

        concluirBtn.setBackground(new java.awt.Color(25, 25, 112));
        concluirBtn.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        concluirBtn.setForeground(new java.awt.Color(255, 255, 255));
        concluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Vote_24px_1.png"))); // NOI18N
        concluirBtn.setText("Concluir");
        concluirBtn.setBorder(null);
        concluirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        concluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                concluirBtnActionPerformed(evt);
            }
        });

        closeButton1.setBackground(new java.awt.Color(25, 25, 112));
        closeButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        closeButton1.setForeground(new java.awt.Color(255, 255, 255));
        closeButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Cancel_24px_1.png"))); // NOI18N
        closeButton1.setText("Fechar");
        closeButton1.setToolTipText("");
        closeButton1.setBorder(null);
        closeButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton1ActionPerformed(evt);
            }
        });

        enderecoCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        enderecoCampo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        enderecoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoCampoActionPerformed(evt);
            }
        });

        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 25, 112));
        jLabel1.setText("Informe a modalidade de pagamento");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/visa-logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mastercard-logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paypal-logo.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/boleto-logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enderecoCampo)
                .addContainerGap())
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 130, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton3))
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4)))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(closeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(concluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(158, 158, 158))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enderecoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 48, Short.MAX_VALUE)
                        .addComponent(jRadioButton4)
                        .addGap(125, 125, 125))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jRadioButton1))
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(concluirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(closeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 620, 410));

        jPanel13.setBackground(new java.awt.Color(25, 25, 112));
        jPanel13.setToolTipText("");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Aviso");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void concluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_concluirBtnActionPerformed
        this.dispose();
        DefaultTableModel dt = (DefaultTableModel) Principal.carrinhoProdutoTable.getModel();
        dt.setRowCount(0);
        Principal.contaLabel.setText("0");
        InfoProduto.itemCarrinho.clear();
        JFrame ps = new EnvioTela();
        ps.setVisible(true);

    }//GEN-LAST:event_concluirBtnActionPerformed

    private void closeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closeButton1ActionPerformed

    private void enderecoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoCampoActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    public class SetExpressCheckout {
    
    public SetExpressCheckout() throws IOException {
        
        URL url = new URL("https://api-3t.sandbox.paypal.com/nvp");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("application/x-www-form-urlencoded", "charset=utf-8");
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);
        
        Map<String,String> parameters = new HashMap<>();
        parameters.put("USER","vitorovalle_api1.gmail.com");
        parameters.put("PWD","5US83U9RYJ3Q5SBF");
        parameters.put("SIGNATURE","AqXEa4qVWnSZ.Ss4MDQQAppYR5VHAu5MmytaCt9UEnDM7gtebbXu53-o");
        
        parameters.put("METHOD","SetExpressCheckout");
        parameters.put("VERSION","114.0");
        
        parameters.put("PAYMENTREQUEST_0_PAYMENTACTION","SALE");
        parameters.put("PAYMENTREQUEST_0_AMT","22.00");
        parameters.put("PAYMENTREQUEST_0_CURRENCYCODE","BRL");
        parameters.put("PAYMENTREQUEST_0_ITEMAMT","22.00");
        parameters.put("PAYMENTREQUEST_0_INVNUM","1234");
        parameters.put("L_PAYMENTREQUEST_0_NAME0","Item A");
        parameters.put("L_PAYMENTREQUEST_0_DESC0","Produto A – 110V");
        parameters.put("L_PAYMENTREQUEST_0_AMT0","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY0","1");
        parameters.put("L_PAYMENTREQUEST_0_ITEMAMT","11.00");
        parameters.put("L_PAYMENTREQUEST_0_NAME1","Item B");
        parameters.put("L_PAYMENTREQUEST_0_DESC1","Produto B – 220V");
        parameters.put("L_PAYMENTREQUEST_0_AMT1","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY1","1");
        
        parameters.put("RETURNURL","https://www.paypal.com/br/home");
        parameters.put("CANCELURL","https://www.paypal.com/br/home");
        
        parameters.put("BUTTONSOURCE","BR_EC_EMPRESA");
        parameters.put("SUBJECT","vitorovalle@gmail.com");
        
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();
        
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
           content.append(inputLine);
            }
        in.close();
        con.disconnect();
        
        String token = inputLine.substring(7, 26);

        System.out.print(inputLine.substring(7, 26));
}
    }
    
    public class DoExpressCheckoutPayment {
        
        public DoExpressCheckoutPayment() throws IOException {
            
        URL url = new URL("https://api-3t.sandbox.paypal.com/nvp");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("application/x-www-form-urlencoded", "charset=utf-8");
        con.setConnectTimeout(10000);
        con.setReadTimeout(10000);
        
        Map<String,String> parameters = new HashMap<>();
        parameters.put("USER","vitorovalle_api1.gmail.com");
        parameters.put("PWD","5US83U9RYJ3Q5SBF");
        parameters.put("SIGNATURE","AqXEa4qVWnSZ.Ss4MDQQAppYR5VHAu5MmytaCt9UEnDM7gtebbXu53-o");
        
        parameters.put("VERSION","114.0");
        parameters.put("METHOD","DoExpressCheckoutPayment");
        parameters.put("TOKEN","");
        parameters.put("PAYERID","");
        parameters.put("PAYMENTREQUEST_0_PAYMENTACTION","SALE");
        parameters.put("PAYMENTREQUEST_0_AMT","22.00");
        parameters.put("PAYMENTREQUEST_0_CURRENCYCODE","BRL");
        parameters.put("PAYMENTREQUEST_0_ITEMAMT","22.00");
        parameters.put("PAYMENTREQUEST_0_INVNUM","12345");
        parameters.put("L_PAYMENTREQUEST_0_NAME0","Item A");
        parameters.put("L_PAYMENTREQUEST_0_DESC0","Produto A – 110V");
        parameters.put("L_PAYMENTREQUEST_0_AMT0","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY0","1");
        parameters.put("L_PAYMENTREQUEST_0_ITEMAMT","11.00");
        parameters.put("L_PAYMENTREQUEST_0_NAME1","Item B");
        parameters.put("L_PAYMENTREQUEST_0_DESC1","Produto B – 220V");
        parameters.put("L_PAYMENTREQUEST_0_AMT1","11.00");
        parameters.put("L_PAYMENTREQUEST_0_QTY1","1");
        
        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();
        
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(
        new InputStreamReader(con.getInputStream()));
        String inputLineFinal;
        StringBuffer content = new StringBuffer();
        while ((inputLineFinal = in.readLine()) != null) {
           content.append(inputLineFinal);
            }
        in.close();
        con.disconnect();
        
        System.out.print(inputLineFinal);
            
        }
    }
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton1;
    private javax.swing.JButton concluirBtn;
    private javax.swing.JTextField enderecoCampo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
    }
