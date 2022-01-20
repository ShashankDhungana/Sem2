package Specs;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package optometrists;

/**
 *
 * @author Omen
 */
public class Specialist extends javax.swing.JFrame {

    /**
     * Creates new form Opto
     */
    public Specialist() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        OtpoBtn = new javax.swing.JButton();
        SpecialistBackground = new javax.swing.JPanel();
        SpecalistTxt = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        GynoBtn = new javax.swing.JButton();
        NeuroBtn = new javax.swing.JButton();
        PedaBtn = new javax.swing.JButton();
        DermaBtn = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swastha Sewa");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OtpoBtn.setBackground(new java.awt.Color(0, 0, 0));
        OtpoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OtpoBtn.setForeground(new java.awt.Color(255, 255, 255));
        OtpoBtn.setText("Optometrist");
        OtpoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtpoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(OtpoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 164, 109));

        SpecialistBackground.setBackground(new java.awt.Color(102, 204, 255));

        SpecalistTxt.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        SpecalistTxt.setText("Specialist");

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("<");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SpecialistBackgroundLayout = new javax.swing.GroupLayout(SpecialistBackground);
        SpecialistBackground.setLayout(SpecialistBackgroundLayout);
        SpecialistBackgroundLayout.setHorizontalGroup(
                SpecialistBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SpecialistBackgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(BackBtn)
                                .addGap(221, 221, 221)
                                .addComponent(SpecalistTxt)
                                .addContainerGap(289, Short.MAX_VALUE))
        );
        SpecialistBackgroundLayout.setVerticalGroup(
                SpecialistBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SpecialistBackgroundLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(SpecialistBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SpecalistTxt)
                                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(SpecialistBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -5, 740, 120));

        GynoBtn.setBackground(new java.awt.Color(0, 0, 0));
        GynoBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GynoBtn.setForeground(new java.awt.Color(255, 255, 255));
        GynoBtn.setText("Gynocologist");
        GynoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GynoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(GynoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 164, 109));

        NeuroBtn.setBackground(new java.awt.Color(0, 0, 0));
        NeuroBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NeuroBtn.setForeground(new java.awt.Color(255, 255, 255));
        NeuroBtn.setText("Neurotherapist");
        NeuroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeuroBtnActionPerformed(evt);
            }
        });
        jPanel1.add(NeuroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 180, 109));

        PedaBtn.setBackground(new java.awt.Color(0, 0, 0));
        PedaBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PedaBtn.setForeground(new java.awt.Color(255, 255, 255));
        PedaBtn.setText("Peadiatrician");
        PedaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(PedaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 164, 109));

        DermaBtn.setBackground(new java.awt.Color(0, 0, 0));
        DermaBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DermaBtn.setForeground(new java.awt.Color(255, 255, 255));
        DermaBtn.setText("Dermatologist");
        DermaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DermaBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DermaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, 164, 109));

        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\Omen\\Documents\\NetBeansProjects\\Optometrists\\src\\optometrists\\background image.png")); // NOI18N
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 120, 800, 670));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>




