package healthconsultant;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class test extends javax.swing.JFrame {
    public test() {
        initComponents();
    }

    private void initComponents() {
        home = new javax.swing.JDesktopPane();
        healthCalculatorBTN = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dengueTestBTN = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Consultant");
        setResizable(false);

        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        healthCalculatorBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthconsultant/unnamed.png"))); // NOI18N
        healthCalculatorBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                healthCalculatorBTNMouseClicked(evt);
            }
        });
        home.add(healthCalculatorBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Health Calculator");
        home.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 393, 220, 51));

        dengueTestBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthconsultant/covid19.png"))); // NOI18N
        dengueTestBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dengueTestBTNMouseClicked(evt);
            }
        });
        home.add(dengueTestBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 239, 195));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Dengue Test ");
        home.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 393, 200, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to our app");
        home.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 470, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HEALTH CONSULTANT");
        home.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 450, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.lightGray);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Java Swing Project Under Construction");
        home.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 430, 30));
        home.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 930, 20));
        home.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 330, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.lightGray);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mahamudul Hasan Ridoy");
        home.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 250, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthconsultant/Screenshot (68).png"))); // NOI18N
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 700));

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenu1.setText("Menu   ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem1.setText("Health Calculator");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem2.setText("Dengue Test");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem4.setText("Source Code");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Statistics   ");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenuBar1.add(jMenu4);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
        setLocationRelativeTo(null);
        setVisible(true); // Added this line to make sure the frame is visible
    }

    private void healthCalculatorBTNMouseClicked(java.awt.event.MouseEvent evt) {
        health obj = new health();
        obj.setVisible(true);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        health obj = new health();
        obj.setVisible(true);
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        dengueTest obj = new dengueTest();
        obj.setVisible(true);
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        int flag = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?", "Confirmation",
                JOptionPane.YES_NO_OPTION);
        if (flag == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {
        help object = new help();
        object.setVisible(true);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI("#"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void dengueTestBTNMouseClicked(java.awt.event.MouseEvent evt) {
        dengueTest obj2 = new dengueTest();
        obj2.setVisible(true);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new test().setVisible(true);
            }
        });
    }

    private javax.swing.JLabel dengueTestBTN;
    private javax.swing.JLabel healthCalculatorBTN;
    private javax.swing.JDesktopPane home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
}
