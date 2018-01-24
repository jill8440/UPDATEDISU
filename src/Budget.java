
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Budget extends javax.swing.JFrame {

    //create two arrays for expenses and income to be used in the list
    IncomeItem inc[];
    ExpenseItem ex[];

    HashMap<String, ArrayList<BudgetItem>> budget = new HashMap<String, ArrayList<BudgetItem>>();
    
    public Budget() {
        initComponents();
        budget.put("Income", new ArrayList<BudgetItem>());
        budget.put("Expense", new ArrayList<BudgetItem>());
    }

    public int calculateIncome() {
        int nums = 0;
        for (int i = 0; i < budget.get("Income").size(); i++) {
            //  nums+ = tblinc.getValueAt(i, 1);
        }
        return nums;
    }

    public int calculateExpenses() {
        int nums = 0;
        for (int i = 0; i < budget.get("Expense").size(); i++) {
            // nums+ = tblex.getValueAt(i, 1);
        }
        return nums;
    }

    public int calculateDebt() {
        return (calculateIncome() - calculateExpenses());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbltotincome = new javax.swing.JLabel();
        lbltotexpenses = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblex = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblinc = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txttotincome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txttotexpenses = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnclear = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        mnuinc = new javax.swing.JMenu();
        incinsert = new javax.swing.JMenuItem();
        incremove = new javax.swing.JMenuItem();
        mnuex = new javax.swing.JMenu();
        exinsert = new javax.swing.JMenuItem();
        exremove = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Budget");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setText("Total Income: ");

        jLabel6.setText("Total Exepenses: ");

        lbltotincome.setText("$ 0.00");

        lbltotexpenses.setText("$ 0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotincome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltotexpenses)
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(lbltotincome)
                    .addComponent(lbltotexpenses))
                .addContainerGap())
        );

        tblex.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Expenses"
            }
        ));
        jScrollPane1.setViewportView(tblex);

        tblinc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Income"
            }
        ));
        jScrollPane2.setViewportView(tblinc);

        jLabel5.setText("Total Income:  $");

        jLabel7.setText("Total Expenses:  $");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttotincome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txttotexpenses))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txttotincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txttotexpenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))))
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setText("Income ");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel2.setText("Expenses");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Your total debt will be: ");

        btnclear.setText("Clear");
        btnclear.setEnabled(false);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        lbltotal.setText("$ 0.00");

        btnnew.setText("Start a New Budget");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        mnuinc.setText("Income item");
        mnuinc.setEnabled(false);

        incinsert.setText("Insert");
        incinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incinsertActionPerformed(evt);
            }
        });
        mnuinc.add(incinsert);

        incremove.setText("Remove");
        incremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incremoveActionPerformed(evt);
            }
        });
        mnuinc.add(incremove);

        jMenuBar1.add(mnuinc);

        mnuex.setText("Expense item");
        mnuex.setEnabled(false);

        exinsert.setText("Insert");
        exinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exinsertActionPerformed(evt);
            }
        });
        mnuex.add(exinsert);

        exremove.setText("Remove");
        exremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exremoveActionPerformed(evt);
            }
        });
        mnuex.add(exremove);

        jMenuBar1.add(mnuex);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbltotal))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addGap(105, 105, 105)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(btnnew))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnnew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnclear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltotal)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void incremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incremoveActionPerformed
       DefaultTableModel dm = (DefaultTableModel) tblinc.getModel();
       dm.setValueAt("", 1, tblinc.getSelectedRow());
 
    }//GEN-LAST:event_incremoveActionPerformed

    private void incinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incinsertActionPerformed
        Income form = new Income(this, true);
        form.setModal(true);
        form.setLocationRelativeTo(this);//forces popup over main form
        form.setVisible(true);
        
        double total = 0;
        //validate the data
        IncomeItem inc = form.getIncomeItem();
        try {
            String message = inc.validateData();

            if (message == null) {
                budget.get("Income").add(inc);
                //display on table
                tblinc.setValueAt(inc.toString(), budget.get("Income").size() - 1, 0);
                total+=inc.getAmount();
            } else {
                JOptionPane.showMessageDialog(this, message);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out all fields");
        }
        txttotincome.setText("" + total);

    }//GEN-LAST:event_incinsertActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void exinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exinsertActionPerformed
        Expense form = new Expense(this, true);
        form.setModal(true);
        form.setLocationRelativeTo(this);//forces popup over main form
        form.setVisible(true);
        
        double total = 150;

        //validate the data
        ExpenseItem ex = form.getExpenseItem();

        String message = ex.validateData();

        if (message == null) {
            budget.get("Expense").add(ex);
            //display on table
            tblex.setValueAt(ex.toString(), budget.get("Expense").size() - 1, 0);
            total +=ex.getAmount();
        } else {
            JOptionPane.showMessageDialog(this, message);
        }
        txttotexpenses.setText("" + total);
    }//GEN-LAST:event_exinsertActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        mnuinc.setEnabled(false);
        mnuex.setEnabled(false);
        btnclear.setEnabled(false);
        txttotincome.setText("");
        txttotexpenses.setText("");
        lbltotal.setText("$");
        //clearing the table using the DefaultTableModel
        DefaultTableModel dm = (DefaultTableModel) tblinc.getModel();
        for (int i = 0; i < dm.getRowCount(); i++) {
            for (int j = 0; j < dm.getColumnCount(); j++) {
                dm.setValueAt("", i, j);
            }
        }
        DefaultTableModel dm2 = (DefaultTableModel) tblex.getModel();
        for (int i = 0; i < dm2.getRowCount(); i++) {
            for (int j = 0; j < dm2.getColumnCount(); j++) {
                dm2.setValueAt("", i, j);
            }
        }
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        ExpenseItem e = new ExpenseItem("Application Fee", BudgetItem.getExpense(),"Jan 1", "1");
        mnuinc.setEnabled(true);
        mnuex.setEnabled(true);
        btnclear.setEnabled(true);
        budget.get("Expense").add(new ExpenseItem("Application Fee", BudgetItem.getExpense(), "Jan 1","1"));
        //display on table
        tblex.setValueAt(e.toString(), budget.get("Expense").size() - 1, 0);
    }//GEN-LAST:event_btnnewActionPerformed

    private void exremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exremoveActionPerformed
        DefaultTableModel dm = (DefaultTableModel) tblex.getModel();
        dm.setValueAt("", 1, tblex.getSelectedRow());
    }//GEN-LAST:event_exremoveActionPerformed

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
            java.util.logging.Logger.getLogger(Budget.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Budget.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Budget.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Budget.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Budget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnnew;
    private javax.swing.JMenuItem exinsert;
    private javax.swing.JMenuItem exremove;
    private javax.swing.JMenuItem incinsert;
    private javax.swing.JMenuItem incremove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotexpenses;
    private javax.swing.JLabel lbltotincome;
    private javax.swing.JMenu mnuex;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenu mnuinc;
    private javax.swing.JTable tblex;
    private javax.swing.JTable tblinc;
    private javax.swing.JTextField txttotexpenses;
    private javax.swing.JTextField txttotincome;
    // End of variables declaration//GEN-END:variables
}
