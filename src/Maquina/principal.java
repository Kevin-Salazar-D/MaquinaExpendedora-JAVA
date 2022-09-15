
package Maquina;

import java.awt.Color;
import javafx.scene.Cursor;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JOptionPane;
import tipografia.tipografias;

public class principal extends javax.swing.JFrame {
   int boton = 0;
    Color a = new Color(41,46,48);
    Color b = new Color(119,131,135);
    Color c = new Color(172,173,173);
    Color d = new Color (65,65,65);
    Color e = new Color (1,1,1);
    Color f = new Color (50,120,144);
    Color g = new Color (255,255,255);
    Color h = new Color (1,238,12);
    Color i = new Color (24,210,232);
    
    tipografias tipofuentes;

    public principal() {
        initComponents();
        tipofuentes =new tipografias();
        setTitle("Maquina expendedora");
        
        tipografias tipofuentes;
        customjframe();
        customprincipal();
        customCabecera();
        customPanelP();
        custompanelSprite();
        custompanelSabritas();
        custompanelGalletas();
        custompanelAgua();
        customMenuArea();
        customCobro();
        customBotones();
        customCambiof();
        customComprarBTN();
        
        
        
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        cabecera = new javax.swing.JPanel();
        tituloI = new javax.swing.JLabel();
        panelP = new javax.swing.JPanel();
        panelSabritas = new javax.swing.JPanel();
        sabritasLabel = new javax.swing.JLabel();
        BtnA2 = new javax.swing.JButton();
        panelSprite = new javax.swing.JPanel();
        spriteLabel = new javax.swing.JLabel();
        BtnA1 = new javax.swing.JButton();
        panelGalletas = new javax.swing.JPanel();
        choquisLabel = new javax.swing.JLabel();
        BtnB1 = new javax.swing.JButton();
        panelAgua = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnB2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MenuArea = new javax.swing.JTextArea();
        tituloCanL = new javax.swing.JLabel();
        cobro = new javax.swing.JTextField();
        Btnp1 = new javax.swing.JButton();
        Btnp2 = new javax.swing.JButton();
        Btnp3 = new javax.swing.JButton();
        Btnp4 = new javax.swing.JButton();
        Btnp5 = new javax.swing.JButton();
        Btnp6 = new javax.swing.JButton();
        Btnp7 = new javax.swing.JButton();
        Btnp8 = new javax.swing.JButton();
        Btnp9 = new javax.swing.JButton();
        Btnpunto = new javax.swing.JButton();
        Btnlimpear = new javax.swing.JButton();
        cambioJL = new javax.swing.JLabel();
        cambioF = new javax.swing.JTextField();
        BtnComprar = new javax.swing.JButton();
        Btnp0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(255, 204, 51));

        tituloI.setText("MAQUINA EXPENDEDORA");

        javax.swing.GroupLayout cabeceraLayout = new javax.swing.GroupLayout(cabecera);
        cabecera.setLayout(cabeceraLayout);
        cabeceraLayout.setHorizontalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabeceraLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(tituloI, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        cabeceraLayout.setVerticalGroup(
            cabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sabritasLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/sabritas.png"))); // NOI18N

        BtnA2.setText("A2");
        BtnA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnA2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnA2MouseExited(evt);
            }
        });
        BtnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnA2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSabritasLayout = new javax.swing.GroupLayout(panelSabritas);
        panelSabritas.setLayout(panelSabritasLayout);
        panelSabritasLayout.setHorizontalGroup(
            panelSabritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSabritasLayout.createSequentialGroup()
                .addGroup(panelSabritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSabritasLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(sabritasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSabritasLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BtnA2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelSabritasLayout.setVerticalGroup(
            panelSabritasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSabritasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sabritasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnA2)
                .addContainerGap())
        );

        spriteLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/sprite.png"))); // NOI18N

        BtnA1.setText("A1");
        BtnA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnA1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnA1MouseExited(evt);
            }
        });
        BtnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnA1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSpriteLayout = new javax.swing.GroupLayout(panelSprite);
        panelSprite.setLayout(panelSpriteLayout);
        panelSpriteLayout.setHorizontalGroup(
            panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLayout.createSequentialGroup()
                .addGroup(panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSpriteLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(spriteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSpriteLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(BtnA1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSpriteLayout.setVerticalGroup(
            panelSpriteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSpriteLayout.createSequentialGroup()
                .addComponent(spriteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnA1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        choquisLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/chokis.png"))); // NOI18N

        BtnB1.setText("B1");
        BtnB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnB1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnB1MouseExited(evt);
            }
        });
        BtnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGalletasLayout = new javax.swing.GroupLayout(panelGalletas);
        panelGalletas.setLayout(panelGalletasLayout);
        panelGalletasLayout.setHorizontalGroup(
            panelGalletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGalletasLayout.createSequentialGroup()
                .addGroup(panelGalletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGalletasLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(choquisLabel))
                    .addGroup(panelGalletasLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(BtnB1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        panelGalletasLayout.setVerticalGroup(
            panelGalletasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGalletasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choquisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnB1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/productos/epura.png"))); // NOI18N

        BtnB2.setText("B2");
        BtnB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnB2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnB2MouseExited(evt);
            }
        });
        BtnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAguaLayout = new javax.swing.GroupLayout(panelAgua);
        panelAgua.setLayout(panelAguaLayout);
        panelAguaLayout.setHorizontalGroup(
            panelAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAguaLayout.createSequentialGroup()
                .addGroup(panelAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAguaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelAguaLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(BtnB2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAguaLayout.setVerticalGroup(
            panelAguaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAguaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnB2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPLayout = new javax.swing.GroupLayout(panelP);
        panelP.setLayout(panelPLayout);
        panelPLayout.setHorizontalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPLayout.createSequentialGroup()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSprite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelGalletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSabritas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelPLayout.setVerticalGroup(
            panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPLayout.createSequentialGroup()
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelSprite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSabritas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelGalletas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelAgua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuArea.setColumns(20);
        MenuArea.setRows(5);
        jScrollPane1.setViewportView(MenuArea);

        tituloCanL.setText("INGRESE EL DINERO");

        cobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobroActionPerformed(evt);
            }
        });

        Btnp1.setText("1");
        Btnp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp1MouseExited(evt);
            }
        });
        Btnp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp1ActionPerformed(evt);
            }
        });

        Btnp2.setText("2");
        Btnp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp2MouseExited(evt);
            }
        });
        Btnp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp2ActionPerformed(evt);
            }
        });

        Btnp3.setText("3");
        Btnp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp3MouseExited(evt);
            }
        });
        Btnp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp3ActionPerformed(evt);
            }
        });

        Btnp4.setText("4");
        Btnp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp4MouseExited(evt);
            }
        });
        Btnp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp4ActionPerformed(evt);
            }
        });

        Btnp5.setText("5");
        Btnp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp5MouseExited(evt);
            }
        });
        Btnp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp5ActionPerformed(evt);
            }
        });

        Btnp6.setText("6");
        Btnp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp6MouseExited(evt);
            }
        });
        Btnp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp6ActionPerformed(evt);
            }
        });

        Btnp7.setText("7");
        Btnp7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp7MouseExited(evt);
            }
        });
        Btnp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp7ActionPerformed(evt);
            }
        });

        Btnp8.setText("8");
        Btnp8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp8MouseExited(evt);
            }
        });
        Btnp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp8ActionPerformed(evt);
            }
        });

        Btnp9.setText("9");
        Btnp9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp9MouseExited(evt);
            }
        });
        Btnp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp9ActionPerformed(evt);
            }
        });

        Btnpunto.setText(".");
        Btnpunto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnpuntoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnpuntoMouseExited(evt);
            }
        });
        Btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnpuntoActionPerformed(evt);
            }
        });

        Btnlimpear.setText("L");
        Btnlimpear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnlimpearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnlimpearMouseExited(evt);
            }
        });
        Btnlimpear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnlimpearActionPerformed(evt);
            }
        });

        cambioJL.setText("TU CAMBIO ES");

        cambioF.setText("0");

        BtnComprar.setBackground(new java.awt.Color(255, 0, 0));
        BtnComprar.setText("Comprar");
        BtnComprar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnComprarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnComprarMouseExited(evt);
            }
        });
        BtnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnComprarActionPerformed(evt);
            }
        });

        Btnp0.setText("0");
        Btnp0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btnp0MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btnp0MouseExited(evt);
            }
        });
        Btnp0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btnp0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(panelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tituloCanL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(Btnp1))
                                            .addComponent(Btnp4))
                                        .addGap(18, 18, 18)
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(Btnp2)
                                                .addGap(18, 18, 18)
                                                .addComponent(Btnp3))
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(Btnp5)
                                                .addGap(18, 18, 18)
                                                .addComponent(Btnp6))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, principalLayout.createSequentialGroup()
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Btnp7)
                                            .addComponent(Btnp0))
                                        .addGap(18, 18, 18)
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(Btnpunto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Btnlimpear))
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(Btnp8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Btnp9)))))
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(principalLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cambioJL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(principalLayout.createSequentialGroup()
                                                .addComponent(cambioF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnComprar)
                                        .addGap(36, 36, 36))))
                            .addComponent(cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addComponent(cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(principalLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(tituloCanL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cobro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btnp1)
                            .addComponent(Btnp2)
                            .addComponent(Btnp3)
                            .addComponent(BtnComprar))
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btnp4)
                                    .addComponent(Btnp5)
                                    .addComponent(Btnp6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btnp7)
                                    .addComponent(Btnp8)
                                    .addComponent(Btnp9))
                                .addGap(18, 18, 18)
                                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Btnpunto)
                                    .addComponent(Btnlimpear)
                                    .addComponent(Btnp0)))
                            .addGroup(principalLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(cambioJL, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cambioF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//EVENTONS DE BOTON DEL PRODUCTO SPRITE
    private void BtnA1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnA1MouseEntered
        BtnA1.setBackground(Color.red);
        BtnA1.setForeground(g);
    }//GEN-LAST:event_BtnA1MouseEntered

    private void BtnA1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnA1MouseExited
        BtnA1.setBackground(b);
        BtnA1.setForeground(a);
    }//GEN-LAST:event_BtnA1MouseExited

    private void BtnA2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnA2MouseEntered
        BtnA2.setBackground(Color.red);
        BtnA2.setForeground(g);
    }//GEN-LAST:event_BtnA2MouseEntered

    private void BtnA2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnA2MouseExited
       BtnA2.setBackground(b);
       BtnA2.setForeground(a);
    }//GEN-LAST:event_BtnA2MouseExited

    private void BtnB1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnB1MouseEntered
        BtnB1.setBackground(Color.red);
        BtnB1.setForeground(g);
    }//GEN-LAST:event_BtnB1MouseEntered

    private void BtnB1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnB1MouseExited
       BtnB1.setBackground(b);
       BtnB1.setForeground(a);
    }//GEN-LAST:event_BtnB1MouseExited

    private void BtnB2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnB2MouseEntered
        BtnB2.setBackground(Color.red);
        BtnB2.setForeground(g);
    }//GEN-LAST:event_BtnB2MouseEntered

    private void BtnB2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnB2MouseExited
       BtnB2.setBackground(b);
       BtnB2.setForeground(a);// TODO add your handling code here:
    }//GEN-LAST:event_BtnB2MouseExited

    private void cobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cobroActionPerformed

    private void Btnp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp1MouseEntered
        Btnp1.setBackground(Color.red);
        Btnp1.setForeground(g);
    }//GEN-LAST:event_Btnp1MouseEntered

    private void Btnp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp1MouseExited
        Btnp1.setBackground(g);
        Btnp1.setForeground(a);
    }//GEN-LAST:event_Btnp1MouseExited

    private void Btnp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp2MouseEntered
        Btnp2.setBackground(Color.red);
        Btnp2.setForeground(g);
    }//GEN-LAST:event_Btnp2MouseEntered

    private void Btnp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp2MouseExited
        Btnp2.setBackground(g);
        Btnp2.setForeground(a);
    }//GEN-LAST:event_Btnp2MouseExited

    private void Btnp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp3MouseEntered
        Btnp3.setBackground(Color.red);
        Btnp3.setForeground(g);
    }//GEN-LAST:event_Btnp3MouseEntered

    private void Btnp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp3MouseExited
        Btnp3.setBackground(g);
        Btnp3.setForeground(a);
    }//GEN-LAST:event_Btnp3MouseExited

    private void Btnp4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp4MouseEntered
        Btnp4.setBackground(Color.red);
        Btnp4.setForeground(g);
    }//GEN-LAST:event_Btnp4MouseEntered

    private void Btnp4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp4MouseExited
        Btnp4.setBackground(g);
        Btnp4.setForeground(a);
    }//GEN-LAST:event_Btnp4MouseExited

    private void Btnp5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp5MouseEntered
        Btnp5.setBackground(Color.red);
        Btnp5.setForeground(g);
    }//GEN-LAST:event_Btnp5MouseEntered

    private void Btnp5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp5MouseExited
        Btnp5.setBackground(g);
        Btnp5.setForeground(a);
    }//GEN-LAST:event_Btnp5MouseExited

    private void Btnp6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp6MouseEntered
        Btnp6.setBackground(Color.red);
        Btnp6.setForeground(g);
    }//GEN-LAST:event_Btnp6MouseEntered

    private void Btnp6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp6MouseExited
        Btnp6.setBackground(g);
        Btnp6.setForeground(a);
    }//GEN-LAST:event_Btnp6MouseExited

    private void Btnp7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp7MouseEntered
        Btnp7.setBackground(Color.red);
        Btnp7.setForeground(g);
    }//GEN-LAST:event_Btnp7MouseEntered

    private void Btnp7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp7MouseExited
        Btnp7.setBackground(g);
        Btnp7.setForeground(a);
    }//GEN-LAST:event_Btnp7MouseExited

    private void Btnp8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp8MouseEntered
        Btnp8.setBackground(Color.red);
        Btnp8.setForeground(g);
    }//GEN-LAST:event_Btnp8MouseEntered

    private void Btnp8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp8MouseExited
        Btnp8.setBackground(g);
        Btnp8.setForeground(a);
    }//GEN-LAST:event_Btnp8MouseExited

    private void Btnp9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp9MouseEntered
        Btnp9.setBackground(Color.red);
        Btnp9.setForeground(g);
    }//GEN-LAST:event_Btnp9MouseEntered

    private void Btnp9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp9MouseExited
        Btnp9.setBackground(g);
        Btnp9.setForeground(a);
    }//GEN-LAST:event_Btnp9MouseExited

    private void BtnpuntoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnpuntoMouseEntered
        Btnpunto.setBackground(Color.red);
        Btnpunto.setForeground(g);
    }//GEN-LAST:event_BtnpuntoMouseEntered

    private void BtnpuntoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnpuntoMouseExited
        Btnpunto.setBackground(g);
        Btnpunto.setForeground(a);
    }//GEN-LAST:event_BtnpuntoMouseExited

    private void BtnlimpearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnlimpearMouseEntered
       Btnlimpear.setBackground(Color.blue);
       Btnlimpear.setForeground(g);
    }//GEN-LAST:event_BtnlimpearMouseEntered

    private void BtnlimpearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnlimpearMouseExited
       Btnlimpear.setBackground(i);
       Btnlimpear.setForeground(g);
    }//GEN-LAST:event_BtnlimpearMouseExited

    private void Btnp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp1ActionPerformed

       cobro.setText(cobro.getText()+"1");
       
    }//GEN-LAST:event_Btnp1ActionPerformed

    private void Btnp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp2ActionPerformed
        cobro.setText(cobro.getText()+"2");
    }//GEN-LAST:event_Btnp2ActionPerformed

    private void Btnp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp3ActionPerformed
        cobro.setText(cobro.getText()+"3");
    }//GEN-LAST:event_Btnp3ActionPerformed

    private void Btnp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp4ActionPerformed
        cobro.setText(cobro.getText()+"4");
    }//GEN-LAST:event_Btnp4ActionPerformed

    private void Btnp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp5ActionPerformed
        cobro.setText(cobro.getText()+"5");
    }//GEN-LAST:event_Btnp5ActionPerformed

    private void Btnp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp6ActionPerformed
        cobro.setText(cobro.getText()+"6");
    }//GEN-LAST:event_Btnp6ActionPerformed

    private void Btnp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp7ActionPerformed
        cobro.setText(cobro.getText()+"7");
    }//GEN-LAST:event_Btnp7ActionPerformed

    private void Btnp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp8ActionPerformed
        cobro.setText(cobro.getText()+"8");
    }//GEN-LAST:event_Btnp8ActionPerformed

    private void Btnp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp9ActionPerformed
        cobro.setText(cobro.getText()+"9");
    }//GEN-LAST:event_Btnp9ActionPerformed

    private void BtnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnpuntoActionPerformed
        cobro.setText(cobro.getText()+".");
    }//GEN-LAST:event_BtnpuntoActionPerformed

    private void BtnlimpearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnlimpearActionPerformed
        cobro.setText("");
    }//GEN-LAST:event_BtnlimpearActionPerformed

    private void Btnp0MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp0MouseEntered
       Btnp0.setBackground(Color.red);
       Btnp0.setForeground(g);
    }//GEN-LAST:event_Btnp0MouseEntered

    private void Btnp0MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btnp0MouseExited
        Btnp0.setBackground(g);
        Btnp0.setForeground(a);
    }//GEN-LAST:event_Btnp0MouseExited

    private void Btnp0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btnp0ActionPerformed
        cobro.setText(cobro.getText()+"0");
    }//GEN-LAST:event_Btnp0ActionPerformed
  
    private void BtnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnA1ActionPerformed
        MenuArea.setText("Elegiste un Sprite:      Cantidad: 600mls               Costo: 18.00$                  Compre el producto....");
        boton=1;
    }//GEN-LAST:event_BtnA1ActionPerformed

    private void BtnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnA2ActionPerformed
       MenuArea.setText("Elegiste unas Sabritas:       Sabor Original               Costo: 15.00$                    Compre el producto....");
       boton =2;
    }//GEN-LAST:event_BtnA2ActionPerformed

    private void BtnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnB1ActionPerformed
        MenuArea.setText("Elegiste unas Galletas        Chokis sabor chocolate    Costo: 11.00$                   Compre el producto....");
        boton = 3;
    }//GEN-LAST:event_BtnB1ActionPerformed

    private void BtnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnB2ActionPerformed
        MenuArea.setText("Eligiste una botella Epura  Contiene 600 mls:          Costo: 13.00$                     Compre el producto....");
        boton =4;
    }//GEN-LAST:event_BtnB2ActionPerformed
    double producto =0;
    double cambio =0;
    double precio = 0;
    private void BtnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnComprarActionPerformed
          precio = Double.parseDouble(cobro.getText());
          switch(boton){
              case 1:
                  producto = 18;
                  if(precio<0){
                     negativo nv= new negativo();
                     nv.setVisible(true);
                  }
                  if(precio < producto && precio>=0){
                     advertencia ad = new advertencia();
                     ad.setVisible(true);
                  }else if(precio >= producto){
                      MenuArea.setText("HAS COMPRADO EL PRODUCTO                        -(•_^)/");
                      cambio = precio-producto;
                      cambioF.setText(""+cambio+"$");
                      comprado cp = new comprado();
                      cp.setVisible(true);
                  }
                  break;
              case 2:
                   producto = 15;
                   if(precio<0){
                     negativo nv= new negativo();
                     nv.setVisible(true);
                  }
                  if(precio < producto && precio>=0){
                      advertencia ad = new advertencia();
                      ad.setVisible(true);
                  }else if(precio >= producto){
                      MenuArea.setText("HAS COMPRADO EL PRODUCTO                        -(•_^)/");
                      cambio = precio-producto;
                      cambioF.setText(""+cambio+"$");
                      comprado2 cp2 = new comprado2();
                      cp2.setVisible(true);
                  }
                  break;
              case 3:
                    producto = 11;
                  if(precio<0){
                     negativo nv= new negativo();
                     nv.setVisible(true);
                  }
                  if(precio < producto && precio>=0){
                      advertencia ad = new advertencia();
                      ad.setVisible(true);
                  }else if(precio >= producto){
                      MenuArea.setText("HAS COMPRADO EL PRODUCTO                        -(•_^)/");
                      cambio = precio-producto;
                      cambioF.setText(""+cambio+"$");
                      comprado3 cp3 = new comprado3();
                      cp3.setVisible(true);
                  }
                  break;
              case 4:
                    producto = 13;
                    if(precio<0){
                     negativo nv= new negativo();
                     nv.setVisible(true);
                  }
                  if(precio < producto && precio>=0){
                      advertencia ad = new advertencia();
                      ad.setVisible(true);
                  }else if(precio >= producto){
                     MenuArea.setText("HAS COMPRADO EL PRODUCTO                        -(•_^)/");
                      cambio = precio-producto;
                      cambioF.setText(""+cambio+"$");
                      comprado4 cp4 = new comprado4();
                      cp4.setVisible(true);
                  }
                  break;
              default: 
                  Noeligioproducto n = new Noeligioproducto();
                  n.setVisible(true);
          
          }
    }//GEN-LAST:event_BtnComprarActionPerformed

    private void BtnComprarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnComprarMouseEntered
        BtnComprar.setBackground(Color.white);
    }//GEN-LAST:event_BtnComprarMouseEntered

    private void BtnComprarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnComprarMouseExited
        BtnComprar.setBackground(Color.red);
    }//GEN-LAST:event_BtnComprarMouseExited
         
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
               
            }
        });
    }
    public void customprincipal(){
        principal.setBackground(d);
        

}
    public void customCabecera(){
  
        cabecera.setBackground(b);
        cabecera.setBorder(BorderFactory.createLineBorder(a,10));
        
        //Personalizacion etiqueta titulo
        tituloI.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 50));
        tituloI.setForeground(Color.white);
    }
    public void customPanelP(){
        panelP.setBackground(c);
        panelP.setBorder(BorderFactory.createLineBorder(e,10));
        tituloCanL.setFont(tipofuentes.fuente(tipofuentes.datefruit,0,35));
        tituloCanL.setForeground(g);
        cambioJL.setFont(tipofuentes.fuente(tipofuentes.datefruit,0,35));
        cambioJL.setForeground(g);
    
    }
    public void customPanelLo(){
        //PanelLo.setBackground(d);
    }
    public void custompanelSprite(){
       panelSprite.setBorder(BorderFactory.createLineBorder(e,10));
       panelSprite.setBackground(f);
       BtnA1.setBackground(b);
       BtnA1.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 30));
       BtnA1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));//para que el elemneto se vea de forma de cursor de mano
    }
    public void custompanelSabritas(){
       panelSabritas.setBorder(BorderFactory.createLineBorder(e,10));
       panelSabritas.setBackground(f);
       BtnA2.setBackground(b);
       BtnA2.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 30));
       BtnA2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));//para que el elemneto se vea de forma de cursor de mano
       
    }
    public  void custompanelAgua(){
     panelAgua.setBorder(BorderFactory.createLineBorder(e,10));
     panelAgua.setBackground(f);
     BtnB1.setBackground(b);
     BtnB1.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 30));
     BtnB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));//para que el elemneto se vea de forma de cursor de mano
    }
    public void custompanelGalletas(){
        panelGalletas.setBorder(BorderFactory.createLineBorder(e,10));
        panelGalletas.setBackground(f);
        BtnB2.setBackground(b);
        BtnB2.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 30));
        BtnB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));//para que el elemneto se vea de forma de cursor de mano
    }
    public void customMenuArea(){
        MenuArea.setBackground(e);
        MenuArea.setBorder(BorderFactory.createLineBorder(b,10));
        MenuArea.setFont(tipofuentes.fuente(tipofuentes.digital,0,35));
        MenuArea.setText("                 Bienvenido:                          Elige un producto                              (/^_^)/");
        MenuArea.setLineWrap(true);
        MenuArea.setWrapStyleWord(true);
        MenuArea.setForeground(h);
    }
    public void customCobro(){
        cobro.setBorder(BorderFactory.createLineBorder(b,10));
        cobro.setBackground(e);
        cobro.setFont(tipofuentes.fuente(tipofuentes.digital, 0, 35));
        cobro.setForeground(h);
        cobro.setHorizontalAlignment(SwingConstants.CENTER);
        
    
    }
    public void customBotones(){
        Btnp0.setBackground(g);
        Btnp0.setForeground(e);
        Btnp0.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp1.setBackground(g);
        Btnp1.setForeground(e);
        Btnp1.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
        Btnp2.setBackground(g);
        Btnp2.setForeground(e);
        Btnp2.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp3.setBackground(g);
        Btnp3.setForeground(e);
        Btnp3.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp4.setBackground(g);
        Btnp4.setForeground(e);
        Btnp4.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp5.setBackground(g);
        Btnp5.setForeground(e);
        Btnp5.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp6.setBackground(g);
        Btnp6.setForeground(e);
        Btnp6.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp7.setBackground(g);
        Btnp7.setForeground(e);
        Btnp7.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp8.setBackground(g);
        Btnp8.setForeground(e);
        Btnp8.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnp9.setBackground(g);
        Btnp9.setForeground(e);
        Btnp9.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnp9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnpunto.setBackground(g);
        Btnpunto.setForeground(e);
        Btnpunto.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnpunto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        Btnlimpear.setBackground(i);
        Btnlimpear.setForeground(g);
        Btnlimpear.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 20));
        Btnlimpear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    
    }
    public void customCambiof(){
      cambioF.setBackground(e);
      cambioF.setBorder(BorderFactory.createLineBorder(b,10));
      cambioF.setFont(tipofuentes.fuente(tipofuentes.digital, 0, 35));
      cambioF.setForeground(h);
     
    }
    public void customComprarBTN(){
       BtnComprar.setBackground(g);
       BtnComprar.setForeground(e);
       BtnComprar.setFont(tipofuentes.fuente(tipofuentes.datefruit, 0, 25));
       BtnComprar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }
    
    public void customLimpiar1(){
     cobro.setText(" ");
    }
   
    public void customjframe(){
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnA1;
    private javax.swing.JButton BtnA2;
    private javax.swing.JButton BtnB1;
    private javax.swing.JButton BtnB2;
    private javax.swing.JButton BtnComprar;
    private javax.swing.JButton Btnlimpear;
    private javax.swing.JButton Btnp0;
    private javax.swing.JButton Btnp1;
    private javax.swing.JButton Btnp2;
    private javax.swing.JButton Btnp3;
    private javax.swing.JButton Btnp4;
    private javax.swing.JButton Btnp5;
    private javax.swing.JButton Btnp6;
    private javax.swing.JButton Btnp7;
    private javax.swing.JButton Btnp8;
    private javax.swing.JButton Btnp9;
    private javax.swing.JButton Btnpunto;
    private javax.swing.JTextArea MenuArea;
    private javax.swing.JPanel cabecera;
    private javax.swing.JTextField cambioF;
    private javax.swing.JLabel cambioJL;
    private javax.swing.JLabel choquisLabel;
    private javax.swing.JTextField cobro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelAgua;
    private javax.swing.JPanel panelGalletas;
    private javax.swing.JPanel panelP;
    private javax.swing.JPanel panelSabritas;
    private javax.swing.JPanel panelSprite;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel sabritasLabel;
    private javax.swing.JLabel spriteLabel;
    private javax.swing.JLabel tituloCanL;
    private javax.swing.JLabel tituloI;
    // End of variables declaration//GEN-END:variables
}
