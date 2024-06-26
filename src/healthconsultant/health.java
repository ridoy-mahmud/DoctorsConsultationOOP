package healthconsultant;

import javax.swing.JOptionPane;

public class health extends javax.swing.JFrame {
    public health() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        heightField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        weightField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        excersize = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        calculateBTN = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        showInput1 = new javax.swing.JLabel();
        showInput2 = new javax.swing.JLabel();
        showBMI = new javax.swing.JLabel();
        showBMR = new javax.swing.JLabel();
        showNormalWeightRange = new javax.swing.JLabel();
        calDemand = new javax.swing.JLabel();
        showDemandINC = new javax.swing.JLabel();
        showDemandDEC = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        showComment = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Health Calculator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HEALTH Calculator");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 330, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthconsultant/Screenshot (68).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1032, 110));

        jLabel3.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        jLabel3.setText("আপনার বয়সঃ ");

        ageField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        jLabel4.setText("আপনার উচ্চতাঃ (Ex: 5.11)");

        heightField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        heightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        jLabel5.setText("আপনার ওজনঃ (kg)");

        weightField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        weightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        jLabel6.setText("লিঙ্গঃ");

        gender.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "পুরুষ", "মহিলা" }));

        jLabel7.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        jLabel7.setText("আপনি কেমন শরীরচর্চা করেন?");

        excersize.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        excersize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "কোনো শরীরচর্চা করেন না",
                "হালকা শরীরচর্চা (সপ্তাহে ১-৩ দিন)", "মধ্যম শরীরচর্চা (সপ্তাহে ৩-৫ দিন)",
                "উত্তম শরীরচর্চা (সপ্তাহে ৬-৭ দিন)", "ভারি শরীরচর্চা (প্রতিদিন দুইবার)" }));

        jLabel8.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel8.setForeground(java.awt.Color.blue);
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("আপনার সম্পর্কে জানান");

        calculateBTN.setBackground(java.awt.Color.darkGray);
        calculateBTN.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        calculateBTN.setForeground(java.awt.Color.white);
        calculateBTN.setText("নির্ণয় করুন");
        calculateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateBTNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Kalpurush", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.blue);
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ফলাফল দেখুন ");

        jPanel3.setBackground(java.awt.Color.white);

        showInput1.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showInput1.setText(" ");

        showInput2.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showInput2.setText(" ");

        showBMI.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showBMI.setText(" ");

        showBMR.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showBMR.setText(" ");

        showNormalWeightRange.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showNormalWeightRange.setForeground(java.awt.Color.blue);
        showNormalWeightRange.setText(" ");

        calDemand.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        calDemand.setForeground(java.awt.Color.magenta);
        calDemand.setText(" ");

        showDemandINC.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showDemandINC.setText(" ");

        showDemandDEC.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        showDemandDEC.setText(" ");

        showComment.setEditable(false);
        showComment.setColumns(20);
        showComment.setFont(new java.awt.Font("Kalpurush", 0, 20)); // NOI18N
        showComment.setForeground(java.awt.Color.red);
        showComment.setRows(5);
        showComment.setText(" ");
        jScrollPane2.setViewportView(showComment);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(showDemandDEC, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showDemandINC, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(calDemand, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showNormalWeightRange,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showBMR, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showBMI, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showInput2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(showInput1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 372,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(26, Short.MAX_VALUE)));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(showInput1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showInput2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showBMI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showBMR)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showNormalWeightRange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calDemand)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showDemandINC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showDemandDEC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap()));
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(weightField)
                                        .addComponent(heightField)
                                        .addComponent(ageField)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 217,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(excersize, 0, 271, Short.MAX_VALUE)
                                        .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(calculateBTN, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172,
                                        Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 238,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 179,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(176, 176, 176)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(heightField, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(weightField, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(excersize, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(calculateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(133, 133, 133)));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 990, 590));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1030, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 30, Short.MAX_VALUE));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1030, 30));

        pack();
        setLocationRelativeTo(null);
    }

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void heightFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void weightFieldActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private double maleBMR(double weight, double height, double age) {
        double bmr = 66 + (13.7 * weight) + (5 * height * 2.54) - (6.8 * age);
        return bmr;
    }

    private double femaleBMR(double weight, double height, double age) {
        double bmr = 655 + (9.6 * weight) + (1.8 * height * 2.54) - (4.7 * age);
        return bmr;
    }

    private void calculateBTNActionPerformed(java.awt.event.ActionEvent evt) {//
        String age = ageField.getText();
        String height = heightField.getText();
        String weight = weightField.getText();
        String sex = gender.getSelectedItem().toString();
        int sexValue = gender.getSelectedIndex();
        int exr = excersize.getSelectedIndex();

        if (age.equals("") || height.equals("") || weight.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter valid input", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        } else {
            double foot, inch, heig;
            foot = height.charAt(0) - 48;

            // split height to inch (calculate foot value and inch value first)
            inch = Double.parseDouble(height);
            inch -= foot;

            if (inch >= 0.12) {
                inch *= 10;
            } else {
                if (height.equals("5.1") || height.equals("4.1") || height.equals("3.1") || height.equals("6.1")) {
                    inch *= 10;
                } else {
                    inch *= 100;
                }
            }
            heig = (foot * 12) + inch;
            // System.out.println(foot);
            // System.out.println(inch);

            // System.out.println(exr);
            double rate = 0;
            if (exr == 0) {
                rate = 1.2;
            }
            if (exr == 1) {
                rate = 1.375;
            }
            if (exr == 2) {
                rate = 1.55;
            }
            if (exr == 3) {
                rate = 1.725;
            }
            if (exr == 4) {
                rate = 1.9;
            }

            double AGE = Double.parseDouble(age);
            double WEIGHT = Double.parseDouble(weight);
            double BMR, BMI;
            double normalRange1, normalRange2;

            BMI = WEIGHT / ((heig * 0.0254) * (heig * 0.0254));
            if (sexValue == 0) {
                // male
                BMR = maleBMR(WEIGHT, heig, AGE);
            } else {
                // female
                BMR = femaleBMR(WEIGHT, heig, AGE);
            }

            normalRange1 = 18.5 * (heig * 0.0254) * (heig * 0.0254);
            normalRange2 = 24.9 * (heig * 0.0254) * (heig * 0.0254);

            String cmnt = "null";
            if (BMI < 18.5) {
                cmnt = "আপনার শরীরের ওজন কম। পরিমিত খাবার\nগ্রহণ করে ওজন বাড়াতে হবে। আপনি\nপ্রতি সপ্তাহে ১ কেজি ওজন বাড়াতেপ্রতিদিন \n";
                cmnt += (int) (BMR * rate) + 1000;
                cmnt += " কিলোক্যালরি খাবার গ্রহণ করুন। ";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                cmnt = "আপনার BMI একদম ঠিক আছে। \nএভাবে চালিয়ে যান। ";
            } else if (BMI >= 25.0 && BMI <= 29.9) {
                cmnt = "আপনার শরীরে অতিরিক্ত ওজন রয়েছে। \nএক্সারসাইজ করে ওজন কমাতে হবে। ";
            } else if (BMI >= 30 && BMI <= 34.9) {
                cmnt = "আপনি মোটা হওয়ার ১ম পর্যায়ে আছেন।\nবেছে খাবার খাওয়া এবং এক্সারসাইজ করা \nউচিত। ";
            } else if (BMI >= 35 && BMI <= 39.9) {
                cmnt = "আপনি মোটা হওয়ার ২য় পর্যায়ে আছেন। \nপরিমিত খাবার খেতে হবে এবং এক্সারসাইজ \nকরতে হবে। ";
            } else {
                cmnt = "আপনার দেহে অতিরিক্ত ওজন রয়েছে। \nদয়া করে ডাক্তারের পরামর্শ নিন। ";
            }

            showInput1.setText(String.valueOf("বয়স: " + age + " বছর, লিঙ্গ: " + sex));
            showInput2.setText(String.valueOf("উচ্চতা: " + height + " ফুট, ওজন: " + weight + " KG"));
            showBMI.setText(String.valueOf(String.format("BMI: %.2f", BMI)));
            showBMR.setText(String.valueOf(String.format("BMR: %.2f", BMR)));
            showNormalWeightRange
                    .setText(String.valueOf(String.format("আদর্শ ওজন: %.0f - %.0f কেজি", normalRange1, normalRange2)));
            calDemand.setText(String.valueOf(String.format("দৈনিক Calorie চাহিদা: %.2f ", BMR * rate)));
            showDemandINC
                    .setText(String.valueOf(String.format("ওজন সপ্তাহে ১ কেজি বাড়াতে: %.2f ", (BMR * rate) + 1000)));
            showDemandDEC
                    .setText(String.valueOf(String.format("ওজন সপ্তাহে ১ কেজি কমাতে:  %.2f ", (BMR * rate) - 1000)));
            showComment.setText(cmnt);

        }
    }// GEN-LAST:event_calculateBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(health.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new health().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel calDemand;
    private javax.swing.JButton calculateBTN;
    private javax.swing.JComboBox<String> excersize;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField heightField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel showBMI;
    private javax.swing.JLabel showBMR;
    private javax.swing.JTextArea showComment;
    private javax.swing.JLabel showDemandDEC;
    private javax.swing.JLabel showDemandINC;
    private javax.swing.JLabel showInput1;
    private javax.swing.JLabel showInput2;
    private javax.swing.JLabel showNormalWeightRange;
    private javax.swing.JTextField weightField;
    // End of variables declaration//GEN-END:variables
}
