
package healthconsultant;

public class covidTest extends javax.swing.JFrame {

    /**
     * Creates new form covidTest
     */
    public covidTest() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        answer1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        answer2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        answer3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        answer4 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        answer5 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        answer6 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        answer7 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        answer8 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        msg1 = new javax.swing.JLabel();
        probability = new javax.swing.JLabel();
        msg2 = new javax.swing.JLabel();
        testBTN = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        sugg = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        commentBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COVID-19 Test");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("COVID-19 Test");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 330, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthconsultant/Screenshot (68).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 110));

        jLabel3.setFont(new java.awt.Font("Kalpurush", 0, 20)); // NOI18N
        jLabel3.setText("১। আপনি কি recently কোনো করোনা আক্রান্ত দেশে গিয়েছিলেন? ");

        answer1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel4.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel4.setText("উত্তর:  ");

        jLabel5.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel5.setText("২। আপনার কি সর্দি আছে? ");

        jLabel6.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel6.setText("উত্তর:  ");

        answer2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));
        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel7.setText("৩। আপনার কি হাচি / কাশি রয়েছে? ");

        jLabel8.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel8.setText("উত্তর:  ");

        answer3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel9.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel9.setText("৫। আপনার কি শ্বাস নিতে কষ্ট হয়? ");

        jLabel10.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel10.setText("উত্তর:  ");

        answer4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel11.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel11.setText("৪। আপনার কি গলাব্যাথা আছে? ");

        jLabel12.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel12.setText("উত্তর:  ");

        answer5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel13.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel13.setText("৬। আপনার কি জ্বর আছে? ");

        jLabel14.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel14.setText("উত্তর:  ");

        answer6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel15.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel15.setText("৭। আপনার কি মাথা ব্যাথা করে? ");

        jLabel16.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel16.setText("উত্তর:  ");

        answer7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        jLabel17.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        jLabel17.setText("৮। আপনার কি অবসাদ মনে হয়?  ");

        jLabel18.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel18.setText("উত্তর:  ");

        answer8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        answer8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO", "YES" }));

        msg1.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        msg1.setForeground(java.awt.Color.darkGray);
        msg1.setText("                                                   ");

        probability.setFont(new java.awt.Font("Kalpurush", 0, 60)); // NOI18N
        probability.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        msg2.setFont(new java.awt.Font("Kalpurush", 0, 48)); // NOI18N
        msg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        testBTN.setBackground(java.awt.Color.red);
        testBTN.setFont(new java.awt.Font("Kalpurush", 0, 36)); // NOI18N
        testBTN.setForeground(java.awt.Color.white);
        testBTN.setText("ফলাফল দেখুন");
        testBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testBTNActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Kalpurush", 0, 18)); // NOI18N
        jLabel22.setForeground(java.awt.Color.blue);
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("ফলাফল দেখুন এ ক্লিক করার আগে বাম দিকে সঠিকভাবে উত্তর দিন");

        sugg.setFont(new java.awt.Font("Kalpurush", 0, 24)); // NOI18N
        sugg.setForeground(java.awt.Color.darkGray);
        sugg.setText("             ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(msg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(probability, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sugg, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(msg1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(testBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124))))
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(testBTN)
                .addGap(18, 18, 18)
                .addComponent(msg1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(probability, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sugg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        commentBox.setEditable(false);
        commentBox.setBackground(new java.awt.Color(238, 238, 238));
        commentBox.setColumns(20);
        commentBox.setFont(new java.awt.Font("Kalpurush", 0, 22)); // NOI18N
        commentBox.setRows(5);
        jScrollPane1.setViewportView(commentBox);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(answer2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(answer3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(answer4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(answer5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(answer6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(answer7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(answer8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1010, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answer2ActionPerformed

    private void testBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testBTNActionPerformed
        double point = 0, sombhobona=0;
        
        if(answer1.getSelectedIndex() == 1){
            point += 2;
        }
        if(answer2.getSelectedIndex() == 1){
            point += 0.5;
        }
        if(answer3.getSelectedIndex() == 1){
            point += 0.5;
        }
        point += answer4.getSelectedIndex();
        point += answer5.getSelectedIndex();
        point += answer6.getSelectedIndex();
        point += answer7.getSelectedIndex();
        point += answer8.getSelectedIndex();
        //System.out.println("point = " + point);
        
        sombhobona = (point / 8) * 100;
        if(sombhobona >= 100){sombhobona = 99;}
        msg1.setText("আপনার এই মুহুর্তে করোনাতে আক্রান্ত হবার সম্ভাবনা ");
        sugg.setText("পরামর্শঃ");
        if(sombhobona < 20){
            msg2.setForeground(java.awt.Color.black);
            msg2.setText("খুবই কম");
            commentBox.setForeground(java.awt.Color.black);
            commentBox.setText("এই মুহুর্তে আপনার করোনা ভাইরাসে আক্রান্ত হবার \nসম্ভবনা খুবই কম। ঝুকি এড়াতে নিয়মিত হাত ধুতে \nথাকুন এবং জনসমাগম থেকে দূরে থাকুন। ");
        }
        else if(sombhobona < 40){
            msg2.setForeground(java.awt.Color.black);
            msg2.setText("কম");
            commentBox.setForeground(java.awt.Color.black);
            commentBox.setText("এই মুহুর্তে আপনার করোনা ভাইরাসে আক্রান্ত হবার \nসম্ভবনা অল্প। ঝুকি এড়াতে নিয়মিত হাত ধুতে থাকুন \nএবং জনসমাগম থেকে দূরে থাকুন। জরুরী পরিস্থিতিতে \nডাক্তারের শরনাপন্ন হোন।  ");
        }
        else if(sombhobona < 60){
            msg2.setForeground(java.awt.Color.blue);
            msg2.setText("মাঝারি");
            commentBox.setForeground(java.awt.Color.black);
            commentBox.setText("আপনার মাঝে করনা ভাইরাসে আক্রান্ত হওয়ার \nমাঝারি সম্ভাবনা দেখা দিয়েছে। দয়া করে মাস্ক use \nকরুন এবং জনসমাগম এড়িয়ে চলুন। দয়া করে \n১৪ দিন হোম কোয়ারেন্টাইনে থাকুন। জরুরী পরিস্থিতিতে \n৩৩৩ এ যোগাযোগ করুন। ");
        }
        else if(sombhobona < 75){
            msg2.setForeground(java.awt.Color.red);
            msg2.setText("বেশি");
            commentBox.setForeground(java.awt.Color.red);
            commentBox.setText("আপনার মাঝে করোনা ভাইরাস থাকার বেশি সম্ভাবনা \nআছে। দয়া করে নিজেকে অন্যদের মাঝে থেকে আলাদা \nরাখুন এবং কোয়ারেন্টাইনে থাকার ব্যবস্থা করুন। জরুরী \nপ্রয়োজনে IEDCR এর হটলাইন ৩৩৩ এ যোগাযোগ \nকরুন। ");
        }
        else{
            msg2.setForeground(java.awt.Color.red);
            msg2.setText("অনেক বেশি");
            commentBox.setForeground(java.awt.Color.red);
            commentBox.setText("আপনার মাঝে করোনা ভাইরাস হওয়ার অধিক পরিমাণ \nসম্ভাবনা দেখা দিয়েছে। নিজেকে আইসোলেটেড করে \nরাখুন এবং নিয়মিত মাস্ক use করুন যাতে অন্যদের \nমাঝে না ছড়ায়। আপনাকে যত তাড়াতাড়ি সম্ভব IEDCR \nএর হটলাইন ৩৩৩ এ যোগাযোগ করতে বলা হল। ");
        }
        
        probability.setText(String.valueOf(String.format("%.0f%%", sombhobona)));
    }//GEN-LAST:event_testBTNActionPerformed

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
            java.util.logging.Logger.getLogger(covidTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(covidTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(covidTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(covidTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new covidTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> answer1;
    private javax.swing.JComboBox<String> answer2;
    private javax.swing.JComboBox<String> answer3;
    private javax.swing.JComboBox<String> answer4;
    private javax.swing.JComboBox<String> answer5;
    private javax.swing.JComboBox<String> answer6;
    private javax.swing.JComboBox<String> answer7;
    private javax.swing.JComboBox<String> answer8;
    private javax.swing.JTextArea commentBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel msg1;
    private javax.swing.JLabel msg2;
    private javax.swing.JLabel probability;
    private javax.swing.JLabel sugg;
    private javax.swing.JButton testBTN;
    // End of variables declaration//GEN-END:variables
}