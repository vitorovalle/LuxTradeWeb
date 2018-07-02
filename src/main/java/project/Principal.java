/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Void
 */
public class Principal extends javax.swing.JFrame {

    //Boolean isVisible = true;
    static Object[] data = new Object[4];   
    static int total = 0;
    static String tot = "";
    static boolean signInStatus = false;
    static int wrongPass = 0;
    
    public Principal() {
        initComponents();
        
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = IluminacaoDAO.populaConteudo();
        
        Object rowData[] = new Object[7];
        
        DefaultTableModel model =  (DefaultTableModel) principalTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/iluminacao/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = HidraulicaDAO.populaConteudo();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/hidraulica/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        list.clear();
        
        list = EletroDAO.populaConteudo();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/eletro/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
        
    }
    

    
    public void doPanelHideShow()
    {
       
            
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        barraBusca = new javax.swing.JTextField();
        buscaBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        novidadesBtn = new javax.swing.JButton();
        iluminacaoBtn = new javax.swing.JButton();
        usuarioBtn = new javax.swing.JButton();
        carrinhoBtn = new javax.swing.JButton();
        hidraulicaBtn = new javax.swing.JButton();
        eletroBtn = new javax.swing.JButton();
        cardParentPanel = new javax.swing.JPanel();
        principalPanel = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        principalTable = new javax.swing.JTable();
        buscaPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        buscaTable = new javax.swing.JTable();
        iluminacaoPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        iluminacaoTable = new javax.swing.JTable();
        carrinhoPanel = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        carrinhoProdutoTable = new javax.swing.JTable();
        contaLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comprarBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hidraulicaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hidraulicaTable = new javax.swing.JTable();
        eletroPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        eletroTable = new javax.swing.JTable();
        cadastroPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cadastroNomeCampo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cadastroEmailCampo = new javax.swing.JTextField();
        vazioCampo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cadastroCartaoCampo = new javax.swing.JTextField();
        cadastroSenhaCampo = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        acessarBtn = new javax.swing.JButton();
        mostraSenha1 = new javax.swing.JCheckBox();
        cadastroConcluirBtn = new javax.swing.JButton();
        cadastroUsuarioCampo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cadastroNomeRepetido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        acessarPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        usuarioAcessoCampo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        usuarioSenhaCampo = new javax.swing.JPasswordField();
        logarBtn = new javax.swing.JButton();
        cadastroBtn = new javax.swing.JButton();
        mostraSenha2 = new javax.swing.JCheckBox();
        avisoLabel = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        fundoPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        fundoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(25, 25, 112));
        jPanel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1199, 72));

        jLabel1.setBackground(new java.awt.Color(25, 25, 112));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lux Trade");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(25, 25, 112));
        jLabel2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Shopping_Bag_48px.png"))); // NOI18N

        jSeparator6.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jSeparator6.setOpaque(true);

        barraBusca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        barraBusca.setBorder(null);
        barraBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barraBuscaMouseClicked(evt);
            }
        });
        barraBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBuscaActionPerformed(evt);
            }
        });

        buscaBtn.setBackground(new java.awt.Color(25, 25, 112));
        buscaBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        buscaBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Search_31px.png"))); // NOI18N
        buscaBtn.setToolTipText("Buscar");
        buscaBtn.setBorderPainted(false);
        buscaBtn.setContentAreaFilled(false);
        buscaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscaBtn.setOpaque(true);
        buscaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscaBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                buscaBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                buscaBtnMouseReleased(evt);
            }
        });
        buscaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaBtnActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(25, 25, 112));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Buscar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 350, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator6)
                    .addComponent(barraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(barraBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(3, 3, 3))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fundoPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(64, 224, 208));

        novidadesBtn.setBackground(new java.awt.Color(64, 224, 208));
        novidadesBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        novidadesBtn.setForeground(new java.awt.Color(255, 255, 255));
        novidadesBtn.setText("Novidades");
        novidadesBtn.setToolTipText("Confira nossos lançamentos!");
        novidadesBtn.setBorderPainted(false);
        novidadesBtn.setContentAreaFilled(false);
        novidadesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        novidadesBtn.setOpaque(true);
        novidadesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novidadesBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novidadesBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                novidadesBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                novidadesBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                novidadesBtnMouseReleased(evt);
            }
        });
        novidadesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novidadesBtnActionPerformed(evt);
            }
        });

        iluminacaoBtn.setBackground(new java.awt.Color(64, 224, 208));
        iluminacaoBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        iluminacaoBtn.setForeground(new java.awt.Color(255, 255, 255));
        iluminacaoBtn.setText("Iluminação");
        iluminacaoBtn.setToolTipText("Lâmpadas, luminárias, lustres...");
        iluminacaoBtn.setBorderPainted(false);
        iluminacaoBtn.setContentAreaFilled(false);
        iluminacaoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iluminacaoBtn.setOpaque(true);
        iluminacaoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iluminacaoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iluminacaoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iluminacaoBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iluminacaoBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                iluminacaoBtnMouseReleased(evt);
            }
        });
        iluminacaoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iluminacaoBtnActionPerformed(evt);
            }
        });

        usuarioBtn.setBackground(new java.awt.Color(64, 224, 208));
        usuarioBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        usuarioBtn.setForeground(new java.awt.Color(255, 255, 255));
        usuarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Person_48px.png"))); // NOI18N
        usuarioBtn.setToolTipText("Account Info");
        usuarioBtn.setBorderPainted(false);
        usuarioBtn.setContentAreaFilled(false);
        usuarioBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        usuarioBtn.setOpaque(true);
        usuarioBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usuarioBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usuarioBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usuarioBtnMouseReleased(evt);
            }
        });
        usuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioBtnActionPerformed(evt);
            }
        });

        carrinhoBtn.setBackground(new java.awt.Color(64, 224, 208));
        carrinhoBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        carrinhoBtn.setForeground(new java.awt.Color(255, 255, 255));
        carrinhoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_OpenCart_24px.png"))); // NOI18N
        carrinhoBtn.setText("Carrinho");
        carrinhoBtn.setToolTipText("Confira seu carrinho.");
        carrinhoBtn.setBorderPainted(false);
        carrinhoBtn.setContentAreaFilled(false);
        carrinhoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        carrinhoBtn.setMaximumSize(new java.awt.Dimension(67, 49));
        carrinhoBtn.setOpaque(true);
        carrinhoBtn.setPreferredSize(new java.awt.Dimension(67, 49));
        carrinhoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carrinhoBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                carrinhoBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                carrinhoBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                carrinhoBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                carrinhoBtnMouseReleased(evt);
            }
        });
        carrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBtnActionPerformed(evt);
            }
        });

        hidraulicaBtn.setBackground(new java.awt.Color(64, 224, 208));
        hidraulicaBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        hidraulicaBtn.setForeground(new java.awt.Color(255, 255, 255));
        hidraulicaBtn.setText("Hidráulica");
        hidraulicaBtn.setToolTipText("Chuveiros, duchas, assentos ...");
        hidraulicaBtn.setBorderPainted(false);
        hidraulicaBtn.setContentAreaFilled(false);
        hidraulicaBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hidraulicaBtn.setOpaque(true);
        hidraulicaBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidraulicaBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hidraulicaBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hidraulicaBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hidraulicaBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hidraulicaBtnMouseReleased(evt);
            }
        });
        hidraulicaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidraulicaBtnActionPerformed(evt);
            }
        });

        eletroBtn.setBackground(new java.awt.Color(64, 224, 208));
        eletroBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        eletroBtn.setForeground(new java.awt.Color(255, 255, 255));
        eletroBtn.setText("Utilidades");
        eletroBtn.setToolTipText("Eletrodomésticos e outros aparelhos para o lar");
        eletroBtn.setBorderPainted(false);
        eletroBtn.setContentAreaFilled(false);
        eletroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eletroBtn.setOpaque(true);
        eletroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eletroBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eletroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eletroBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eletroBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                eletroBtnMouseReleased(evt);
            }
        });
        eletroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eletroBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(novidadesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iluminacaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hidraulicaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(eletroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 323, Short.MAX_VALUE)
                .addComponent(carrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(usuarioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(usuarioBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(iluminacaoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(carrinhoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hidraulicaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(eletroBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(novidadesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fundoPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 1210, 50));

        cardParentPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        cardParentPanel.setLayout(new java.awt.CardLayout());

        principalPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        principalTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        principalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Estoque", "Nota Procel", "Descrição", "Imagem"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        principalTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        principalTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        principalTable.getTableHeader().setReorderingAllowed(false);
        principalTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(principalTable);

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(principalPanel, "card5");

        buscaPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        buscaTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        buscaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preco", "Estoque", "Nota Procel", "Descrição", "Imagem"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        buscaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscaTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        buscaTable.getTableHeader().setReorderingAllowed(false);
        buscaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscaTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(buscaTable);

        javax.swing.GroupLayout buscaPanelLayout = new javax.swing.GroupLayout(buscaPanel);
        buscaPanel.setLayout(buscaPanelLayout);
        buscaPanelLayout.setHorizontalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        buscaPanelLayout.setVerticalGroup(
            buscaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(buscaPanel, "card9");

        iluminacaoPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jScrollPane3.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        iluminacaoTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        iluminacaoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Estoque", "Nota Procel", "Descrição", "Imagem"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        iluminacaoTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iluminacaoTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        iluminacaoTable.getTableHeader().setReorderingAllowed(false);
        iluminacaoTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iluminacaoTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(iluminacaoTable);

        javax.swing.GroupLayout iluminacaoPanelLayout = new javax.swing.GroupLayout(iluminacaoPanel);
        iluminacaoPanel.setLayout(iluminacaoPanelLayout);
        iluminacaoPanelLayout.setHorizontalGroup(
            iluminacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        iluminacaoPanelLayout.setVerticalGroup(
            iluminacaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(iluminacaoPanel, "card4");

        carrinhoPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jScrollPane2.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        carrinhoProdutoTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        carrinhoProdutoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Modelo", "Preço", "Quantidade"
            }
        ));
        carrinhoProdutoTable.setEnabled(false);
        carrinhoProdutoTable.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(carrinhoProdutoTable);

        contaLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        contaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Reais");
        jLabel4.setToolTipText("");

        comprarBtn.setBackground(new java.awt.Color(0, 77, 64));
        comprarBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        comprarBtn.setForeground(new java.awt.Color(255, 255, 255));
        comprarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Buy_24px.png"))); // NOI18N
        comprarBtn.setText("Comprar");
        comprarBtn.setToolTipText("");
        comprarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comprarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setText("Total da fatura :");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(contaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(jLabel5)
                    .addContainerGap(746, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contaLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comprarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(435, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)))
        );

        javax.swing.GroupLayout carrinhoPanelLayout = new javax.swing.GroupLayout(carrinhoPanel);
        carrinhoPanel.setLayout(carrinhoPanelLayout);
        carrinhoPanelLayout.setHorizontalGroup(
            carrinhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(carrinhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        carrinhoPanelLayout.setVerticalGroup(
            carrinhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(carrinhoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(carrinhoPanelLayout.createSequentialGroup()
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );

        cardParentPanel.add(carrinhoPanel, "card8");

        hidraulicaPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jScrollPane1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        hidraulicaTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        hidraulicaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Estoque", "Nota Procel", "Descrição", "Imagem"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        hidraulicaTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        hidraulicaTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        hidraulicaTable.getTableHeader().setReorderingAllowed(false);
        hidraulicaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidraulicaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hidraulicaTable);

        javax.swing.GroupLayout hidraulicaPanelLayout = new javax.swing.GroupLayout(hidraulicaPanel);
        hidraulicaPanel.setLayout(hidraulicaPanelLayout);
        hidraulicaPanelLayout.setHorizontalGroup(
            hidraulicaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        hidraulicaPanelLayout.setVerticalGroup(
            hidraulicaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(hidraulicaPanel, "card3");

        eletroPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jScrollPane4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        eletroTable.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        eletroTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Preço", "Estoque", "Nota Procel", "Descrição", "Imagem"
            }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class,
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, javax.swing.Icon.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

            public Class getColumnClass(int columnIndex){
                return types [columnIndex];
            }

        });
        eletroTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eletroTable.setSelectionBackground(new java.awt.Color(0, 150, 136));
        eletroTable.getTableHeader().setReorderingAllowed(false);
        eletroTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eletroTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(eletroTable);

        javax.swing.GroupLayout eletroPanelLayout = new javax.swing.GroupLayout(eletroPanel);
        eletroPanel.setLayout(eletroPanelLayout);
        eletroPanelLayout.setHorizontalGroup(
            eletroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        eletroPanelLayout.setVerticalGroup(
            eletroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        cardParentPanel.add(eletroPanel, "card2");

        cadastroPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        cadastroPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(25, 25, 112));
        jLabel9.setText("Nome");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator1.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator1.setOpaque(true);
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 310, 2));

        cadastroNomeCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cadastroNomeCampo.setForeground(new java.awt.Color(25, 25, 112));
        cadastroNomeCampo.setBorder(null);
        cadastroNomeCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNomeCampoActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroNomeCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 310, 50));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(25, 25, 112));
        jLabel10.setText("Email");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator2.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator2.setOpaque(true);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 310, 2));

        cadastroEmailCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cadastroEmailCampo.setForeground(new java.awt.Color(25, 25, 112));
        cadastroEmailCampo.setBorder(null);
        cadastroEmailCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroEmailCampoActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroEmailCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 310, 50));

        vazioCampo.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        vazioCampo.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(vazioCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 390, 30));

        jSeparator3.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator3.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator3.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator3.setOpaque(true);
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(25, 25, 112));
        jLabel12.setText("Senha");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 40, -1));

        jSeparator4.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator4.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator4.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator4.setOpaque(true);
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(25, 25, 112));
        jLabel13.setText("Já possui cadastro ?");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator5.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator5.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator5.setOpaque(true);
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 310, 2));

        cadastroCartaoCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cadastroCartaoCampo.setForeground(new java.awt.Color(25, 25, 112));
        cadastroCartaoCampo.setBorder(null);
        cadastroCartaoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCartaoCampoActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroCartaoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 310, 50));

        cadastroSenhaCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cadastroSenhaCampo.setForeground(new java.awt.Color(25, 25, 112));
        cadastroSenhaCampo.setBorder(null);
        cadastroSenhaCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroSenhaCampoActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroSenhaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(25, 25, 112));
        jLabel14.setText("Cartão de crédito (opcional)");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 330, 210, -1));

        acessarBtn.setBackground(new java.awt.Color(255, 255, 255));
        acessarBtn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        acessarBtn.setForeground(new java.awt.Color(64, 224, 208));
        acessarBtn.setText("Acesse aqui.");
        acessarBtn.setToolTipText("Acesse com nome de usuário e senha.");
        acessarBtn.setBorder(null);
        acessarBtn.setBorderPainted(false);
        acessarBtn.setContentAreaFilled(false);
        acessarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        acessarBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acessarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                acessarBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acessarBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acessarBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                acessarBtnMouseReleased(evt);
            }
        });
        acessarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarBtnActionPerformed(evt);
            }
        });
        jPanel4.add(acessarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 502, 90, 30));

        mostraSenha1.setBackground(new java.awt.Color(255, 255, 255));
        mostraSenha1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mostraSenha1.setForeground(new java.awt.Color(25, 25, 112));
        mostraSenha1.setToolTipText("Exibe / oculta senha");
        mostraSenha1.setBorderPaintedFlat(true);
        mostraSenha1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mostraSenha1.setPreferredSize(new java.awt.Dimension(30, 30));
        mostraSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSenha1ActionPerformed(evt);
            }
        });
        jPanel4.add(mostraSenha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 20, 20));

        cadastroConcluirBtn.setBackground(new java.awt.Color(25, 25, 112));
        cadastroConcluirBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        cadastroConcluirBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastroConcluirBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Checked_24px.png"))); // NOI18N
        cadastroConcluirBtn.setText("Cadastrar");
        cadastroConcluirBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroConcluirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroConcluirBtnActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroConcluirBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 160, 50));

        cadastroUsuarioCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cadastroUsuarioCampo.setForeground(new java.awt.Color(25, 25, 112));
        cadastroUsuarioCampo.setBorder(null);
        cadastroUsuarioCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroUsuarioCampoActionPerformed(evt);
            }
        });
        jPanel4.add(cadastroUsuarioCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(25, 25, 112));
        jLabel24.setText("Nome de usuário");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 200, 140, -1));

        cadastroNomeRepetido.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        cadastroNomeRepetido.setForeground(new java.awt.Color(255, 51, 0));
        jPanel4.add(cadastroNomeRepetido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 160, 30));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(25, 25, 112));
        jLabel6.setText("Exibir senha");
        jLabel6.setToolTipText("");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 254, -1, 20));

        cadastroPanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 770, 590));

        jPanel5.setBackground(new java.awt.Color(25, 25, 112));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cadastre-se !");
        jLabel7.setToolTipText("");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 149, -1, 168));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rsz_accounts_main.png"))); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 168));

        cadastroPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        cardParentPanel.add(cadastroPanel, "card6");

        acessarPanel.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        acessarPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(25, 25, 112));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Acessar.");

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/login.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel18)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(162, 162, 162))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        acessarPanel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 590));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jPanel6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel6FocusGained(evt);
            }
        });
        jPanel6.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel6ComponentShown(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(25, 25, 112));
        jLabel19.setText("Nome de usuário");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 120, -1));

        jSeparator8.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator8.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator8.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator8.setOpaque(true);
        jPanel6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 310, 2));

        usuarioAcessoCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        usuarioAcessoCampo.setForeground(new java.awt.Color(25, 25, 112));
        usuarioAcessoCampo.setBorder(null);
        usuarioAcessoCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioAcessoCampoActionPerformed(evt);
            }
        });
        jPanel6.add(usuarioAcessoCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 310, 50));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(25, 25, 112));
        jLabel20.setText("Senha");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(25, 25, 112));
        jSeparator9.setForeground(new java.awt.Color(25, 25, 112));
        jSeparator9.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jSeparator9.setOpaque(true);
        jPanel6.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 310, 2));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(25, 25, 112));
        jLabel21.setText("Já tem cadastro ?");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 110, -1));

        usuarioSenhaCampo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        usuarioSenhaCampo.setForeground(new java.awt.Color(25, 25, 112));
        usuarioSenhaCampo.setBorder(null);
        jPanel6.add(usuarioSenhaCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 310, 50));

        logarBtn.setBackground(new java.awt.Color(25, 25, 112));
        logarBtn.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        logarBtn.setForeground(new java.awt.Color(255, 255, 255));
        logarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Login_24px.png"))); // NOI18N
        logarBtn.setText("Acessar");
        logarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        logarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logarBtnActionPerformed(evt);
            }
        });
        jPanel6.add(logarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 130, 50));

        cadastroBtn.setBackground(new java.awt.Color(255, 255, 255));
        cadastroBtn.setFont(new java.awt.Font("Calibri", 1, 15)); // NOI18N
        cadastroBtn.setForeground(new java.awt.Color(64, 224, 208));
        cadastroBtn.setText("Acesse agora !");
        cadastroBtn.setToolTipText("Acesse com seu nome de usuário e senha.");
        cadastroBtn.setBorderPainted(false);
        cadastroBtn.setContentAreaFilled(false);
        cadastroBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cadastroBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cadastroBtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadastroBtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cadastroBtnMouseReleased(evt);
            }
        });
        cadastroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtnActionPerformed(evt);
            }
        });
        jPanel6.add(cadastroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 502, 140, 30));

        mostraSenha2.setBackground(new java.awt.Color(255, 255, 255));
        mostraSenha2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mostraSenha2.setForeground(new java.awt.Color(25, 25, 112));
        mostraSenha2.setToolTipText("Show/Hide Password");
        mostraSenha2.setBorderPaintedFlat(true);
        mostraSenha2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mostraSenha2.setPreferredSize(new java.awt.Dimension(30, 30));
        mostraSenha2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostraSenha2ActionPerformed(evt);
            }
        });
        jPanel6.add(mostraSenha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 20, 20));

        avisoLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        avisoLabel.setForeground(new java.awt.Color(255, 0, 0));
        avisoLabel.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        avisoLabel.setBorder(null);
        avisoLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                avisoLabelActionPerformed(evt);
            }
        });
        jPanel6.add(avisoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 310, 50));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(25, 25, 112));
        jLabel11.setText("Exibir senha");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        acessarPanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 770, 590));

        cardParentPanel.add(acessarPanel, "card7");

        fundoPanel.add(cardParentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1200, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fundoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void novidadesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novidadesBtnActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(principalPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        //Adding last three entries from every categories in home
        
        ArrayList<ProductList> list = IluminacaoDAO.populaConteudo();
        
        Object rowData[] = new Object[7];
        
        DefaultTableModel model =  (DefaultTableModel) principalTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/iluminacao/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
        list.clear();
        
        list = HidraulicaDAO.populaConteudo();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/hidraulica/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        list.clear();
        
        list = EletroDAO.populaConteudo();
        
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        principalTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        principalTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/eletro/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            principalTable.setRowHeight(150);
            principalTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
        
    }//GEN-LAST:event_novidadesBtnActionPerformed

    private void novidadesBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novidadesBtnMouseReleased
        // TODO add your handling code here:
        novidadesBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_novidadesBtnMouseReleased

    private void novidadesBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novidadesBtnMousePressed
        // TODO add your handling code here:
        novidadesBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_novidadesBtnMousePressed

    private void novidadesBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novidadesBtnMouseExited
        // TODO add your handling code here:
        novidadesBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_novidadesBtnMouseExited

    private void novidadesBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novidadesBtnMouseEntered
        // TODO add your handling code here:;
        novidadesBtn.setBackground(new Color(0, 137, 123));

    }//GEN-LAST:event_novidadesBtnMouseEntered

    private void novidadesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novidadesBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_novidadesBtnMouseClicked

    private void iluminacaoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoBtnMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(iluminacaoPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_iluminacaoBtnMouseClicked

    private void iluminacaoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoBtnMouseEntered
        // TODO add your handling code here:
         iluminacaoBtn.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_iluminacaoBtnMouseEntered

    private void iluminacaoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoBtnMouseExited
        // TODO add your handling code here:
        iluminacaoBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_iluminacaoBtnMouseExited

    private void iluminacaoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoBtnMousePressed
        // TODO add your handling code here:
        iluminacaoBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_iluminacaoBtnMousePressed

    private void iluminacaoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoBtnMouseReleased
        // TODO add your handling code here:
         iluminacaoBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_iluminacaoBtnMouseReleased

    private void iluminacaoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iluminacaoBtnActionPerformed
        // TODO add your handling code here:
        InfoProduto.seletorCategoria = "iluminacao";
        ArrayList<ProductList> list = IluminacaoDAO.populaTabela();
        Object rowData[] = new Object[7];
        
        DefaultTableModel model =  (DefaultTableModel) iluminacaoTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        iluminacaoTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        iluminacaoTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        iluminacaoTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        iluminacaoTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        iluminacaoTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        iluminacaoTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/iluminacao/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            iluminacaoTable.setRowHeight(150);
            iluminacaoTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
    }//GEN-LAST:event_iluminacaoBtnActionPerformed

    private void usuarioBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioBtnMouseClicked

    private void usuarioBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBtnMouseEntered
        // TODO add your handling code here:
        usuarioBtn.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_usuarioBtnMouseEntered

    private void usuarioBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBtnMouseExited
        // TODO add your handling code here:
        usuarioBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_usuarioBtnMouseExited

    private void usuarioBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBtnMousePressed
        // TODO add your handling code here:
        usuarioBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_usuarioBtnMousePressed

    private void usuarioBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBtnMouseReleased
        // TODO add your handling code here:
        usuarioBtn.setBackground(new Color(64, 224, 208));

    }//GEN-LAST:event_usuarioBtnMouseReleased

    private void usuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioBtnActionPerformed
        // TODO add your handling code here:
        if(signInStatus==false){
            cardParentPanel.removeAll();
            cardParentPanel.add(cadastroPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
        }
        else{
            AvisoAcesso si = new AvisoAcesso();
            si.setVisible(true);
            si.loggerName.setText(logger);
        }
    }//GEN-LAST:event_usuarioBtnActionPerformed

    private void carrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoBtnActionPerformed
        cardParentPanel.removeAll();
        cardParentPanel.add(carrinhoPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
         DefaultTableModel model =  (DefaultTableModel) carrinhoProdutoTable.getModel();
         model.setRowCount(0);
         total = 0;
         tot = "";
        
        for(int i=0; i<InfoProduto.itemCarrinho.size(); i++){
            data[0] = InfoProduto.itemCarrinho.get(i).getMarca();
            data[1] = InfoProduto.itemCarrinho.get(i).getModelo();
            data[2] = InfoProduto.itemCarrinho.get(i).getPreco();
            data[3] = InfoProduto.itemCarrinho.get(i).getQuantidade();
            
            model.addRow(data);
            carrinhoProdutoTable.setRowHeight(20);
            total+=Integer.parseInt(carrinhoProdutoTable.getValueAt(i, 2)+"");
            
        }
        
        contaLabel.setText(String.valueOf(total));
    }//GEN-LAST:event_carrinhoBtnActionPerformed

    private void carrinhoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_carrinhoBtnMouseClicked

    private void carrinhoBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoBtnMouseEntered
        // TODO add your handling code here:
        carrinhoBtn.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_carrinhoBtnMouseEntered

    private void carrinhoBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoBtnMouseExited
        // TODO add your handling code here:
        carrinhoBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_carrinhoBtnMouseExited

    private void carrinhoBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoBtnMousePressed
        // TODO add your handling code here:
        carrinhoBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_carrinhoBtnMousePressed

    private void carrinhoBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carrinhoBtnMouseReleased
        // TODO add your handling code here:
        carrinhoBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_carrinhoBtnMouseReleased

    private void hidraulicaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaBtnMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(hidraulicaPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_hidraulicaBtnMouseClicked

    private void hidraulicaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaBtnMouseEntered
        // TODO add your handling code here:
        hidraulicaBtn.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_hidraulicaBtnMouseEntered

    private void hidraulicaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaBtnMouseExited
        // TODO add your handling code here:
        hidraulicaBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_hidraulicaBtnMouseExited

    private void hidraulicaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaBtnMousePressed
        // TODO add your handling code here:
        hidraulicaBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_hidraulicaBtnMousePressed

    private void hidraulicaBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaBtnMouseReleased
        // TODO add your handling code here:
        hidraulicaBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_hidraulicaBtnMouseReleased

    
    private void hidraulicaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidraulicaBtnActionPerformed
        // TODO add your handling code here:
        InfoProduto.seletorCategoria = "hidraulica";
        ArrayList<ProductList> list = HidraulicaDAO.populaTabela();
        String[] columnName = {};
        Object rowData[] = new Object[7];
        
        DefaultTableModel model =  (DefaultTableModel) hidraulicaTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        hidraulicaTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        hidraulicaTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        hidraulicaTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        hidraulicaTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        hidraulicaTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        hidraulicaTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/hidraulica/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            hidraulicaTable.setRowHeight(150);
            hidraulicaTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_hidraulicaBtnActionPerformed

    private void eletroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroBtnMouseClicked
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(eletroPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_eletroBtnMouseClicked

    private void eletroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroBtnMouseEntered
        // TODO add your handling code here:
        eletroBtn.setBackground(new Color(0, 137, 123));
    }//GEN-LAST:event_eletroBtnMouseEntered

    private void eletroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroBtnMouseExited
        // TODO add your handling code here:
        eletroBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_eletroBtnMouseExited

    private void eletroBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroBtnMousePressed
        // TODO add your handling code here:
        eletroBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_eletroBtnMousePressed

    private void eletroBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroBtnMouseReleased
        // TODO add your handling code here:
        eletroBtn.setBackground(new Color(64, 224, 208));
    }//GEN-LAST:event_eletroBtnMouseReleased

    private void eletroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eletroBtnActionPerformed
        // TODO add your handling code here:
        InfoProduto.seletorCategoria = "eletro";
        ArrayList<ProductList> list = EletroDAO.populaTabela();
        Object rowData[] = new Object[7];
        
        DefaultTableModel model =  (DefaultTableModel) eletroTable.getModel();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( JLabel.CENTER );
        eletroTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
        eletroTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
        eletroTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
        eletroTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
        eletroTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
        eletroTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );

       
        model.setRowCount(0); //To clear mobileTable
        
        for(int i=0; i<list.size(); i++){
            rowData[0] = list.get(i).getMarca();
            rowData[1] = list.get(i).getModelo();
            rowData[2] = list.get(i).getPreco();
            rowData[3] = list.get(i).getQuantidade();
            rowData[4] = list.get(i).getNotaProcel();
            rowData[5] = list.get(i).getDescricao();
            String temp = list.get(i).getImagem();
            ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/eletro/"+temp));
            Image resizedImage = ii.getImage();
            ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));
            
            rowData[6] = ii;
            model.addRow(rowData);
            eletroTable.setRowHeight(150);
            eletroTable.getColumnModel().getColumn(6).setPreferredWidth(150);
        }
        
    }//GEN-LAST:event_eletroBtnActionPerformed

    private void usuarioAcessoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioAcessoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioAcessoCampoActionPerformed
    static String logger;
    
    private void logarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logarBtnActionPerformed
        // TODO add your handling code here: 
        
        JFrame adminPanel = new AdminPanel();
        if(usuarioAcessoCampo.getText().equals("admin") && usuarioSenhaCampo.getText().equals("admin")){
            signInStatus = true;
            adminPanel.setVisible(true);
            logger = usuarioAcessoCampo.getText();
            usuarioAcessoCampo.setText("");
            usuarioSenhaCampo.setText("");
            avisoLabel.setText("");
            cardParentPanel.removeAll();
            cardParentPanel.add(principalPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
            wrongPass = 0;
        }
        else{
            
            boolean flag = ClienteDAO.logar(usuarioAcessoCampo.getText(), usuarioSenhaCampo.getText());
            
            if(flag){
                signInStatus = true;
                cardParentPanel.removeAll();
                cardParentPanel.add(principalPanel);
                cardParentPanel.repaint();
                cardParentPanel.revalidate();
                logger = usuarioAcessoCampo.getText();
                avisoLabel.setText("");
                usuarioAcessoCampo.setText("");
                usuarioSenhaCampo.setText("");
                wrongPass = 0;
            }
                
            else{
                avisoLabel.setText("Usuário e/ou senha inválidos!");
                wrongPass++;
                
                if(wrongPass>=3){
                    EsqueceuSenhaTela fpf = new EsqueceuSenhaTela();
                }
                
                usuarioAcessoCampo.setText("");
                usuarioSenhaCampo.setText("");
            }
                
        }
        
        
    }//GEN-LAST:event_logarBtnActionPerformed

    private void cadastroBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroBtnMouseEntered
        // TODO add your handling code here:
        cadastroBtn.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_cadastroBtnMouseEntered

    private void cadastroBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroBtnMouseExited
        // TODO add your handling code here:
        cadastroBtn.setForeground(new Color(64, 224, 208));
    }//GEN-LAST:event_cadastroBtnMouseExited

    private void cadastroBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroBtnMousePressed
        // TODO add your handling code here:
        cadastroBtn.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_cadastroBtnMousePressed

    private void cadastroBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroBtnMouseReleased
        // TODO add your handling code here:
        cadastroBtn.setForeground(new Color(64, 224, 208));
    }//GEN-LAST:event_cadastroBtnMouseReleased

    private void cadastroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtnActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(cadastroPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
    }//GEN-LAST:event_cadastroBtnActionPerformed

    private void mostraSenha2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSenha2ActionPerformed
        // TODO add your handling code here:
        if(mostraSenha2.isSelected()){
           usuarioSenhaCampo.setEchoChar((char)0);
        }
        else
            usuarioSenhaCampo.setEchoChar('*');
    }//GEN-LAST:event_mostraSenha2ActionPerformed

    private void jPanel6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel6FocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jPanel6FocusGained

    private void jPanel6ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel6ComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel6ComponentShown

    private void cadastroUsuarioCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroUsuarioCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroUsuarioCampoActionPerformed

    private void cadastroConcluirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroConcluirBtnActionPerformed
        // TODO add your handling code here:
        if(cadastroUsuarioCampo.getText().equals("")||cadastroNomeCampo.getText().equals("")||cadastroEmailCampo.getText().equals("")
           ||cadastroSenhaCampo.getText().equals(""))
            vazioCampo.setText("*Um ou mais campos obrigatórios não foram preenchidos!");
        else{
            int test = ClienteDAO.lancarCliente(cadastroUsuarioCampo.getText(), cadastroNomeCampo.getText(),
                cadastroEmailCampo.getText(), cadastroSenhaCampo.getText(),
                cadastroCartaoCampo.getText());

            if(test == 19){
                cadastroNomeRepetido.setText("Este nome de usuário já existe!");
                vazioCampo.setText("");
                cadastroUsuarioCampo.setText("");
            }

            else{
                cadastroUsuarioCampo.setText("");
                cadastroNomeCampo.setText("");
                cadastroEmailCampo.setText("");
                cadastroSenhaCampo.setText("");
                cadastroCartaoCampo.setText("");
                vazioCampo.setText("");
            }
        }

    }//GEN-LAST:event_cadastroConcluirBtnActionPerformed

    private void mostraSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostraSenha1ActionPerformed
        // TODO add your handling code here:
        if(mostraSenha1.isSelected()){
            cadastroSenhaCampo.setEchoChar((char)0);
        }
        else
        cadastroSenhaCampo.setEchoChar('*');
    }//GEN-LAST:event_mostraSenha1ActionPerformed

    private void acessarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarBtnActionPerformed
        // TODO add your handling code here:
        cardParentPanel.removeAll();
        cardParentPanel.add(acessarPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();

    }//GEN-LAST:event_acessarBtnActionPerformed

    private void acessarBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarBtnMouseReleased
        // TODO add your handling code here:
        acessarBtn.setForeground(new Color(64, 224, 208));
    }//GEN-LAST:event_acessarBtnMouseReleased

    private void acessarBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarBtnMousePressed
        // TODO add your handling code here:
        acessarBtn.setForeground(new Color(0, 77, 64));
    }//GEN-LAST:event_acessarBtnMousePressed

    private void acessarBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarBtnMouseExited
        // TODO add your handling code here:
        acessarBtn.setForeground(new Color(64, 224, 208));
    }//GEN-LAST:event_acessarBtnMouseExited

    private void acessarBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acessarBtnMouseEntered
        // TODO add your handling code here:
        acessarBtn.setForeground(new Color(48, 79, 254));
    }//GEN-LAST:event_acessarBtnMouseEntered

    private void cadastroCartaoCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCartaoCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroCartaoCampoActionPerformed

    private void cadastroEmailCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroEmailCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroEmailCampoActionPerformed

    private void cadastroNomeCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNomeCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroNomeCampoActionPerformed

    InfoProduto pi = new InfoProduto();
    
    private void hidraulicaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidraulicaTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = hidraulicaTable.getSelectedRow();
        TableModel tm = hidraulicaTable.getModel();
        
        String marca = tm.getValueAt(selectedRow, 0).toString();
        String modelo = tm.getValueAt(selectedRow, 1).toString();
        String preco = tm.getValueAt(selectedRow, 2).toString();
        String quantidade = tm.getValueAt(selectedRow, 3).toString();
        String descricao = tm.getValueAt(selectedRow, 5).toString();
        ImageIcon imagem = (ImageIcon) tm.getValueAt(selectedRow, 6);
        
        pi.productInfoMarca.setText(marca);
        pi.productInfoModelo.setText(modelo);
        pi.productInfoPreco.setText(preco);
        pi.productInfoEstoque.setText(quantidade);
        pi.productInfoDescricao.setText(descricao);
        pi.productImagem.setIcon(imagem);
    }//GEN-LAST:event_hidraulicaTableMouseClicked

    private void comprarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarBtnActionPerformed
        // TODO add your handling code here:
        if(!signInStatus){
        cardParentPanel.removeAll();
        cardParentPanel.add(acessarPanel);
        cardParentPanel.repaint();
        cardParentPanel.revalidate();
        
        avisoLabel.setText("Favor acessar o sistema.");

        }
        else{
            String pattern = "dd/MM/yyyy";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            String date = simpleDateFormat.format(new Date());
            JFrame da = new EnderecoEntrega(logger, Integer.parseInt(contaLabel.getText()), date.toString());
            da.setVisible(true);
        }
    }//GEN-LAST:event_comprarBtnActionPerformed

    private void avisoLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_avisoLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_avisoLabelActionPerformed

    private void iluminacaoTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iluminacaoTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = iluminacaoTable.getSelectedRow();
        TableModel tm = iluminacaoTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 5).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 6);
        
        pi.productInfoMarca.setText(brand);
        pi.productInfoModelo.setText(model);
        pi.productInfoPreco.setText(price);
        pi.productInfoEstoque.setText(stock);
        pi.productInfoDescricao.setText(feature);
        pi.productImagem.setIcon(img);
    }//GEN-LAST:event_iluminacaoTableMouseClicked

    private void eletroTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eletroTableMouseClicked
        // TODO add your handling code here:
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = eletroTable.getSelectedRow();
        TableModel tm = eletroTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 5).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 6);
        
        pi.productInfoMarca.setText(brand);
        pi.productInfoModelo.setText(model);
        pi.productInfoPreco.setText(price);
        pi.productInfoEstoque.setText(stock);
        pi.productInfoDescricao.setText(feature);
        pi.productImagem.setIcon(img);
    }//GEN-LAST:event_eletroTableMouseClicked

    private void principalTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = principalTable.getSelectedRow();
        
        if(rowIndex<=2)
            InfoProduto.seletorCategoria = "iluminacao";
        else if(rowIndex>2 && rowIndex<=5)
            InfoProduto.seletorCategoria = "hidraulica";
        else 
            InfoProduto.seletorCategoria = "eletro";
        
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = principalTable.getSelectedRow();
        TableModel tm = principalTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 5).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 6);
        
        pi.productInfoMarca.setText(brand);
        pi.productInfoModelo.setText(model);
        pi.productInfoPreco.setText(price);
        pi.productInfoEstoque.setText(stock);
        pi.productInfoDescricao.setText(feature);
        pi.productImagem.setIcon(img);
        
        
        
        
    }//GEN-LAST:event_principalTableMouseClicked

    private void barraBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraBuscaActionPerformed

    private void buscaBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaBtnMouseClicked

    private void buscaBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaBtnMouseEntered

    private void buscaBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaBtnMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaBtnMouseExited

    private void buscaBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaBtnMousePressed
        // TODO add your handling code here:
        buscaBtn.setBackground(new Color(0, 77, 64));
    }//GEN-LAST:event_buscaBtnMousePressed

    private void buscaBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaBtnMouseReleased
        // TODO add your handling code here:
        buscaBtn.setBackground(new Color(0, 121, 107));
    }//GEN-LAST:event_buscaBtnMouseReleased

    private void buscaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBtnActionPerformed
        // TODO add your handling code here:
        //ProductInformation.categoryChooser = "mobiles";
        Busca.iluminacao=0;
        Busca.hidraulica=0;
        Busca.eletro=0;
        
        ArrayList<ProductList> list = Busca.buscaGeral(barraBusca.getText());
        Object rowData[] = new Object[7];
        int i, j, k;
        
        
        if(barraBusca.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio!");
        else if(Busca.iluminacao==0 && Busca.hidraulica==0 && Busca.eletro==0)
            JOptionPane.showMessageDialog(null, "Ops! Este produto não existe.");
        else{
            cardParentPanel.removeAll();
            cardParentPanel.add(buscaPanel);
            cardParentPanel.repaint();
            cardParentPanel.revalidate();
                    
            DefaultTableModel model =  (DefaultTableModel) buscaTable.getModel();
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment( JLabel.CENTER );
            buscaTable.getColumnModel().getColumn(0).setCellRenderer( centerRenderer );
            buscaTable.getColumnModel().getColumn(1).setCellRenderer( centerRenderer );
            buscaTable.getColumnModel().getColumn(2).setCellRenderer( centerRenderer );
            buscaTable.getColumnModel().getColumn(3).setCellRenderer( centerRenderer );
            buscaTable.getColumnModel().getColumn(4).setCellRenderer( centerRenderer );
            buscaTable.getColumnModel().getColumn(5).setCellRenderer( centerRenderer );


            model.setRowCount(0);
            for(i=0 ; i<Busca.iluminacao; i++){
                rowData[0] = list.get(i).getMarca();
                rowData[1] = list.get(i).getModelo();
                rowData[2] = list.get(i).getPreco();
                rowData[3] = list.get(i).getQuantidade();
                rowData[4] = list.get(i).getNotaProcel();
                rowData[5] = list.get(i).getDescricao();
                String temp = list.get(i).getImagem();
                ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/iluminacao/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[6] = ii;
                model.addRow(rowData);
                buscaTable.setRowHeight(150);
                buscaTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            }
            for(k=i; k<Busca.hidraulica+Busca.iluminacao; k++){
                rowData[0] = list.get(k).getMarca();
                rowData[1] = list.get(k).getModelo();
                rowData[2] = list.get(k).getPreco();
                rowData[3] = list.get(k).getQuantidade();
                rowData[4] = list.get(k).getNotaProcel();
                rowData[5] = list.get(k).getDescricao();
                String temp = list.get(k).getImagem();
                ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/hidraulica/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[6] = ii;
                model.addRow(rowData);
                buscaTable.setRowHeight(150);
                buscaTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            }
            System.out.println();
            for(j=k; j<Busca.hidraulica+Busca.iluminacao+Busca.eletro; j++){
                rowData[0] = list.get(j).getMarca();
                rowData[1] = list.get(j).getModelo();
                rowData[2] = list.get(j).getPreco();
                rowData[3] = list.get(j).getQuantidade();
                rowData[4] = list.get(j).getNotaProcel();
                rowData[5] = list.get(j).getDescricao();
                String temp = list.get(j).getImagem();
                ImageIcon ii = new ImageIcon(getClass().getResource("/produtos/eletro/"+temp));
                Image resizedImage = ii.getImage();
                ii = new ImageIcon(resizedImage.getScaledInstance(160, 160, Image.SCALE_SMOOTH));

                rowData[6] = ii;
                model.addRow(rowData);
                buscaTable.setRowHeight(150);
                buscaTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            }
        }
        
        
    }//GEN-LAST:event_buscaBtnActionPerformed

    private void barraBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraBuscaMouseClicked
        // TODO add your handling code here:
        barraBusca.setText("");
    }//GEN-LAST:event_barraBuscaMouseClicked

    private void buscaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscaTableMouseClicked
        // TODO add your handling code here:
        int rowIndex = buscaTable.getSelectedRow();
        
        if(Busca.iluminacao!=0 && rowIndex<Busca.iluminacao)
            InfoProduto.seletorCategoria = "iluminacao";
        else if(Busca.hidraulica!=0 && rowIndex>=Busca.iluminacao && rowIndex<Busca.iluminacao+Busca.hidraulica)
            InfoProduto.seletorCategoria = "hidraulica";
        else 
            InfoProduto.seletorCategoria = "eletro";
        
        pi.setVisible(true);
        pi.pack();
        
        int selectedRow = buscaTable.getSelectedRow();
        TableModel tm = buscaTable.getModel();
        
        String brand = tm.getValueAt(selectedRow, 0).toString();
        String model = tm.getValueAt(selectedRow, 1).toString();
        String price = tm.getValueAt(selectedRow, 2).toString();
        String stock = tm.getValueAt(selectedRow, 3).toString();
        String feature = tm.getValueAt(selectedRow, 4).toString();
        ImageIcon img = (ImageIcon) tm.getValueAt(selectedRow, 5);
        
        pi.productInfoMarca.setText(brand);
        pi.productInfoModelo.setText(model);
        pi.productInfoPreco.setText(price);
        pi.productInfoEstoque.setText(stock);
        pi.productInfoDescricao.setText(feature);
        pi.productImagem.setIcon(img);
        
        
        
    }//GEN-LAST:event_buscaTableMouseClicked

    private void cadastroSenhaCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroSenhaCampoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroSenhaCampoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
        JFrame newMain = new Principal();
        newMain.setTitle("Lux Trade");
        newMain.setVisible(true);
        newMain.setResizable(false);
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessarBtn;
    private javax.swing.JPanel acessarPanel;
    private javax.swing.JTextField avisoLabel;
    private javax.swing.JTextField barraBusca;
    private javax.swing.JButton buscaBtn;
    private javax.swing.JPanel buscaPanel;
    private javax.swing.JTable buscaTable;
    private javax.swing.JButton cadastroBtn;
    private javax.swing.JTextField cadastroCartaoCampo;
    private javax.swing.JButton cadastroConcluirBtn;
    private javax.swing.JTextField cadastroEmailCampo;
    private javax.swing.JTextField cadastroNomeCampo;
    private javax.swing.JLabel cadastroNomeRepetido;
    private javax.swing.JPanel cadastroPanel;
    private javax.swing.JPasswordField cadastroSenhaCampo;
    private javax.swing.JTextField cadastroUsuarioCampo;
    private javax.swing.JPanel cardParentPanel;
    private javax.swing.JButton carrinhoBtn;
    private javax.swing.JPanel carrinhoPanel;
    public static javax.swing.JTable carrinhoProdutoTable;
    private javax.swing.JButton comprarBtn;
    public static javax.swing.JLabel contaLabel;
    private javax.swing.JButton eletroBtn;
    private javax.swing.JPanel eletroPanel;
    private javax.swing.JTable eletroTable;
    private javax.swing.JPanel fundoPanel;
    private javax.swing.JButton hidraulicaBtn;
    private javax.swing.JPanel hidraulicaPanel;
    private javax.swing.JTable hidraulicaTable;
    private javax.swing.JButton iluminacaoBtn;
    private javax.swing.JPanel iluminacaoPanel;
    private javax.swing.JTable iluminacaoTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton logarBtn;
    private javax.swing.JCheckBox mostraSenha1;
    private javax.swing.JCheckBox mostraSenha2;
    private javax.swing.JButton novidadesBtn;
    private javax.swing.JPanel principalPanel;
    private javax.swing.JTable principalTable;
    private javax.swing.JTextField usuarioAcessoCampo;
    private javax.swing.JButton usuarioBtn;
    private javax.swing.JPasswordField usuarioSenhaCampo;
    private javax.swing.JLabel vazioCampo;
    // End of variables declaration//GEN-END:variables
}
