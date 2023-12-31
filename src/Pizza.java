
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RoszkopfAdélLéna(SZO
 */
public class Pizza extends javax.swing.JFrame {
    
    /**
     * Creates new form Pizza
     */
    public Pizza() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        btngMeret = new javax.swing.ButtonGroup();
        btngTeszta = new javax.swing.ButtonGroup();
        pnlFejlec = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        pnlTeszta = new javax.swing.JPanel();
        rbtVekony = new javax.swing.JRadioButton();
        rbtVastag = new javax.swing.JRadioButton();
        rbtFitnesz = new javax.swing.JRadioButton();
        pnlFeltet = new javax.swing.JPanel();
        chkSonka = new javax.swing.JCheckBox();
        chkSzalami = new javax.swing.JCheckBox();
        chkKukorica = new javax.swing.JCheckBox();
        chkGomba = new javax.swing.JCheckBox();
        chkGouda = new javax.swing.JCheckBox();
        chkKolbasz = new javax.swing.JCheckBox();
        chkMozzarella = new javax.swing.JCheckBox();
        chkPepperoni = new javax.swing.JCheckBox();
        chkBacon = new javax.swing.JCheckBox();
        chkCsirke = new javax.swing.JCheckBox();
        chkAnanasz = new javax.swing.JCheckBox();
        chkPaprika = new javax.swing.JCheckBox();
        pnlMeret = new javax.swing.JPanel();
        rbtKozepes = new javax.swing.JRadioButton();
        rbtNagy = new javax.swing.JRadioButton();
        txtNagy = new javax.swing.JTextField();
        txtKozepes = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblDarab = new javax.swing.JLabel();
        cmbDarab = new javax.swing.JComboBox<>();
        lblReszosszeg = new javax.swing.JLabel();
        txtReszosszeg = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        btnMegse = new javax.swing.JButton();
        lblLink = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizza");
        setSize(new java.awt.Dimension(550, 500));

        pnlFejlec.setBackground(new java.awt.Color(102, 0, 0));

        lblTitle.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("build your pizza");

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/Pizza6.png"))); // NOI18N

        javax.swing.GroupLayout pnlFejlecLayout = new javax.swing.GroupLayout(pnlFejlec);
        pnlFejlec.setLayout(pnlFejlecLayout);
        pnlFejlecLayout.setHorizontalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFejlecLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblIcon)
                .addGap(18, 32, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlFejlecLayout.setVerticalGroup(
            pnlFejlecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlFejlecLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addContainerGap())
        );

        pnlTeszta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tészta típusa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btngTeszta.add(rbtVekony);
        rbtVekony.setText("Vékony");
        rbtVekony.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVekonyActionPerformed(evt);
            }
        });

        btngTeszta.add(rbtVastag);
        rbtVastag.setText("Vastag");
        rbtVastag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtVastagActionPerformed(evt);
            }
        });

        btngTeszta.add(rbtFitnesz);
        rbtFitnesz.setText("Fitnesz");
        rbtFitnesz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFitneszActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlTesztaLayout = new javax.swing.GroupLayout(pnlTeszta);
        pnlTeszta.setLayout(pnlTesztaLayout);
        pnlTesztaLayout.setHorizontalGroup(
            pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtFitnesz)
                    .addComponent(rbtVastag)
                    .addComponent(rbtVekony))
                .addGap(57, 57, 57))
        );
        pnlTesztaLayout.setVerticalGroup(
            pnlTesztaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTesztaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtVekony)
                .addGap(18, 18, 18)
                .addComponent(rbtVastag)
                .addGap(18, 18, 18)
                .addComponent(rbtFitnesz)
                .addGap(13, 13, 13))
        );

        pnlFeltet.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Feltétek", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        chkSonka.setText("Sonka");
        chkSonka.setEnabled(false);
        chkSonka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSonkaActionPerformed(evt);
            }
        });

        chkSzalami.setText("Szalámi");
        chkSzalami.setEnabled(false);
        chkSzalami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSzalamiActionPerformed(evt);
            }
        });

        chkKukorica.setText("Kukorica");
        chkKukorica.setEnabled(false);
        chkKukorica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKukoricaActionPerformed(evt);
            }
        });

        chkGomba.setText("Gomba");
        chkGomba.setEnabled(false);
        chkGomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGombaActionPerformed(evt);
            }
        });

        chkGouda.setText("Gouda");
        chkGouda.setEnabled(false);
        chkGouda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGoudaActionPerformed(evt);
            }
        });

        chkKolbasz.setText("Kolbász");
        chkKolbasz.setEnabled(false);
        chkKolbasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKolbaszActionPerformed(evt);
            }
        });

        chkMozzarella.setText("Mozzarella");
        chkMozzarella.setEnabled(false);
        chkMozzarella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMozzarellaActionPerformed(evt);
            }
        });

        chkPepperoni.setText("Pepperóni");
        chkPepperoni.setEnabled(false);
        chkPepperoni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPepperoniActionPerformed(evt);
            }
        });

        chkBacon.setText("Bacon");
        chkBacon.setEnabled(false);
        chkBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBaconActionPerformed(evt);
            }
        });

        chkCsirke.setText("Csirke");
        chkCsirke.setEnabled(false);
        chkCsirke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCsirkeActionPerformed(evt);
            }
        });

        chkAnanasz.setText("Ananász");
        chkAnanasz.setEnabled(false);
        chkAnanasz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnanaszActionPerformed(evt);
            }
        });

        chkPaprika.setText("Paprika");
        chkPaprika.setEnabled(false);
        chkPaprika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPaprikaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFeltetLayout = new javax.swing.GroupLayout(pnlFeltet);
        pnlFeltet.setLayout(pnlFeltetLayout);
        pnlFeltetLayout.setHorizontalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkBacon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCsirke, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkAnanasz, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPaprika, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(chkSonka, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkKukorica, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(chkSzalami, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkGouda, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(chkKolbasz, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkMozzarella, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(chkGomba, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkPepperoni, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlFeltetLayout.setVerticalGroup(
            pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFeltetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addComponent(chkBacon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkCsirke)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkAnanasz)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkPaprika))
                    .addGroup(pnlFeltetLayout.createSequentialGroup()
                        .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkSonka)
                            .addComponent(chkKukorica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkSzalami)
                            .addComponent(chkGouda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkKolbasz)
                            .addComponent(chkMozzarella))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFeltetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkGomba)
                            .addComponent(chkPepperoni))))
                .addContainerGap())
        );

        pnlMeret.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Méret", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        btngMeret.add(rbtKozepes);
        rbtKozepes.setText("Közepes");
        rbtKozepes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtKozepesItemStateChanged(evt);
            }
        });
        rbtKozepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtKozepesActionPerformed(evt);
            }
        });

        btngMeret.add(rbtNagy);
        rbtNagy.setText("Nagy");
        rbtNagy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNagyActionPerformed(evt);
            }
        });

        txtNagy.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtNagy.setText("45cm");

        txtKozepes.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtKozepes.setText("32cm");

        javax.swing.GroupLayout pnlMeretLayout = new javax.swing.GroupLayout(pnlMeret);
        pnlMeret.setLayout(pnlMeretLayout);
        pnlMeretLayout.setHorizontalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMeretLayout.createSequentialGroup()
                        .addComponent(rbtNagy, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtNagy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMeretLayout.createSequentialGroup()
                        .addComponent(rbtKozepes)
                        .addGap(3, 3, 3)
                        .addComponent(txtKozepes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        pnlMeretLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtKozepes, txtNagy});

        pnlMeretLayout.setVerticalGroup(
            pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMeretLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtKozepes)
                    .addComponent(txtKozepes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMeretLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNagy)
                    .addComponent(txtNagy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlMeretLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtKozepes, txtNagy});

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDarab.setText("Darabszám:");

        cmbDarab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        cmbDarab.setMinimumSize(new java.awt.Dimension(60, 22));
        cmbDarab.setPreferredSize(new java.awt.Dimension(60, 22));

        lblReszosszeg.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblReszosszeg.setText("Részösszeg:");

        txtReszosszeg.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtReszosszeg.setEnabled(false);
        txtReszosszeg.setMinimumSize(new java.awt.Dimension(55, 22));
        txtReszosszeg.setPreferredSize(new java.awt.Dimension(55, 22));

        btnOk.setBackground(new java.awt.Color(51, 0, 0));
        btnOk.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        btnOk.setForeground(new java.awt.Color(255, 255, 255));
        btnOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kepek/miniPizza5.png"))); // NOI18N
        btnOk.setIconTextGap(0);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        btnMegse.setBackground(new java.awt.Color(51, 0, 0));
        btnMegse.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnMegse.setForeground(new java.awt.Color(255, 255, 255));
        btnMegse.setText("Mégse");
        btnMegse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMegseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMegseMouseExited(evt);
            }
        });
        btnMegse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMegseActionPerformed(evt);
            }
        });

        lblLink.setText("<html><a href=\"\">Ismerje meg receptünket!</a></html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDarab, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDarab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblReszosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtReszosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMegse, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDarab)
                            .addComponent(cmbDarab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLink, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReszosszeg)
                            .addComponent(txtReszosszeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnOk))
                    .addComponent(btnMegse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnMegse, btnOk});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbDarab, txtReszosszeg});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFejlec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlTeszta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlFeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFejlec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTeszta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFeltet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMeret, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMegseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegseMouseEntered
        btnMegse.setText("MÉGSE");// TODO add your handling code here:
    }//GEN-LAST:event_btnMegseMouseEntered

    private void btnMegseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMegseMouseExited
        btnMegse.setText("Mégse");// TODO add your handling code here:
    }//GEN-LAST:event_btnMegseMouseExited

    private void btnMegseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMegseActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_btnMegseActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
    
    boolean vanKozepesMeretValasztva = rbtKozepes.isSelected();
    boolean vanNagyMeretValasztva = rbtNagy.isSelected();
    boolean vanVekonyTesztaValasztva = rbtVekony.isSelected();
    boolean vanVastagTesztaValasztva = rbtVastag.isSelected();
    boolean vanFitneszTesztaValasztva = rbtFitnesz.isSelected();
   
    String uzenet;
    if((vanKozepesMeretValasztva || vanNagyMeretValasztva)&&(vanVekonyTesztaValasztva || vanVastagTesztaValasztva || vanFitneszTesztaValasztva)){
        uzenet= "Rendelését befogadtuk!";
    }else{
        uzenet= "Nincs méret vagy típus kiválasztva!";
    }
     
    String cim = "FIGYELEM!";
    int ikonTipus = JOptionPane.INFORMATION_MESSAGE;//0
    JOptionPane.showMessageDialog(null,uzenet, cim, ikonTipus); 
    if((vanKozepesMeretValasztva || vanNagyMeretValasztva)&&(vanVekonyTesztaValasztva || vanVastagTesztaValasztva || vanFitneszTesztaValasztva)){
        System.exit(0);
    }
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbtKozepesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtKozepesItemStateChanged
        csere();        // TODO add your handling code here:
    }//GEN-LAST:event_rbtKozepesItemStateChanged

    private void rbtVekonyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVekonyActionPerformed
    boolean vanVekonyTesztaValasztva = rbtVekony.isSelected();
    if (vanVekonyTesztaValasztva){
        txtReszosszeg.setText("+1000Ft");
        feltetEnabled();
        }
    
    }//GEN-LAST:event_rbtVekonyActionPerformed

    private void feltetEnabled() {
        if (rbtVekony.isSelected() || rbtVastag.isSelected() || rbtFitnesz.isSelected() || rbtKozepes.isSelected() || rbtNagy.isSelected()){
            chkSonka.setEnabled(true);
            chkSzalami.setEnabled(true);
            chkKolbasz.setEnabled(true);
            chkGomba.setEnabled(true);
            chkKukorica.setEnabled(true);
            chkGouda.setEnabled(true);
            chkMozzarella.setEnabled(true);
            chkPepperoni.setEnabled(true);
            chkBacon.setEnabled(true);
            chkCsirke.setEnabled(true);
            chkPaprika.setEnabled(true);
            chkAnanasz.setEnabled(true);
        }
    }

    private void rbtVastagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtVastagActionPerformed
    boolean vanVastagTesztaValasztva = rbtVastag.isSelected();
    if (vanVastagTesztaValasztva){
        txtReszosszeg.setText("+1300Ft");
        feltetEnabled();
        }
    }//GEN-LAST:event_rbtVastagActionPerformed

    private void rbtKozepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtKozepesActionPerformed
    boolean vanKozepesValasztva = rbtKozepes.isSelected();
    if (vanKozepesValasztva){
        txtReszosszeg.setText("+0Ft");
        feltetEnabled();
        }
    }//GEN-LAST:event_rbtKozepesActionPerformed

    private void rbtFitneszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFitneszActionPerformed
    boolean vanFitneszTesztaValasztva = rbtFitnesz.isSelected();
    if (vanFitneszTesztaValasztva){
        txtReszosszeg.setText("+1200Ft");
        feltetEnabled();
        }
    }//GEN-LAST:event_rbtFitneszActionPerformed

    private void rbtNagyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNagyActionPerformed
    boolean vanNagyKivalasztva = rbtNagy.isSelected();
    if (vanNagyKivalasztva){
        txtReszosszeg.setText("+800Ft");
        feltetEnabled();
        }
    }//GEN-LAST:event_rbtNagyActionPerformed

    private void chkBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBaconActionPerformed
    feltetReszosszeg();
    }//GEN-LAST:event_chkBaconActionPerformed

    private void chkCsirkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCsirkeActionPerformed
    feltetReszosszeg();
    }//GEN-LAST:event_chkCsirkeActionPerformed

    private void chkAnanaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAnanaszActionPerformed
    feltetReszosszeg();
    }//GEN-LAST:event_chkAnanaszActionPerformed

    private void chkPaprikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPaprikaActionPerformed
    feltetReszosszeg();
    }//GEN-LAST:event_chkPaprikaActionPerformed

    private void chkSonkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSonkaActionPerformed
    feltetReszosszeg();        // TODO add your handling code here:
    }//GEN-LAST:event_chkSonkaActionPerformed

    private void chkSzalamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSzalamiActionPerformed
    feltetReszosszeg();        // TODO add your handling code here:
    }//GEN-LAST:event_chkSzalamiActionPerformed

    private void chkKolbaszActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKolbaszActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkKolbaszActionPerformed

    private void chkGombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGombaActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkGombaActionPerformed

    private void chkKukoricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkKukoricaActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkKukoricaActionPerformed

    private void chkPepperoniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPepperoniActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkPepperoniActionPerformed

    private void chkMozzarellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMozzarellaActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkMozzarellaActionPerformed

    private void chkGoudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGoudaActionPerformed
        feltetReszosszeg(); 
    }//GEN-LAST:event_chkGoudaActionPerformed

    private void feltetReszosszeg() {
        if (chkBacon.isSelected()||chkCsirke.isSelected()||chkAnanasz.isSelected()||chkPaprika.isSelected()||chkSonka.isSelected()||chkSzalami.isSelected()||chkKolbasz.isSelected()||chkGomba.isSelected()||chkKukorica.isSelected()||chkGouda.isSelected()||chkMozzarella.isSelected()||chkPepperoni.isSelected()){
            txtReszosszeg.setText("+200Ft");
        }
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMegse;
    private javax.swing.JButton btnOk;
    private javax.swing.ButtonGroup btngMeret;
    private javax.swing.ButtonGroup btngTeszta;
    private javax.swing.JCheckBox chkAnanasz;
    private javax.swing.JCheckBox chkBacon;
    private javax.swing.JCheckBox chkCsirke;
    private javax.swing.JCheckBox chkGomba;
    private javax.swing.JCheckBox chkGouda;
    private javax.swing.JCheckBox chkKolbasz;
    private javax.swing.JCheckBox chkKukorica;
    private javax.swing.JCheckBox chkMozzarella;
    private javax.swing.JCheckBox chkPaprika;
    private javax.swing.JCheckBox chkPepperoni;
    private javax.swing.JCheckBox chkSonka;
    private javax.swing.JCheckBox chkSzalami;
    private javax.swing.JComboBox<String> cmbDarab;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDarab;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblLink;
    private javax.swing.JLabel lblReszosszeg;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlFejlec;
    private javax.swing.JPanel pnlFeltet;
    private javax.swing.JPanel pnlMeret;
    private javax.swing.JPanel pnlTeszta;
    private javax.swing.JRadioButton rbtFitnesz;
    private javax.swing.JRadioButton rbtKozepes;
    private javax.swing.JRadioButton rbtNagy;
    private javax.swing.JRadioButton rbtVastag;
    private javax.swing.JRadioButton rbtVekony;
    private javax.swing.JTextField txtKozepes;
    private javax.swing.JTextField txtNagy;
    private javax.swing.JTextField txtReszosszeg;
    // End of variables declaration//GEN-END:variables

    private void csere() {
        String s = txtKozepes.getText();
        txtKozepes.setText(txtNagy.getText());
        txtNagy.setText(s);

    } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

