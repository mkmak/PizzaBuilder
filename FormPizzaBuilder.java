
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class FormPizzaBuilder extends javax.swing.JFrame {
    
    private PizzaBase pizza;
    private int numIngredient;

    /**
     * Creates new form FormPizzaBuilder
     */
    public FormPizzaBuilder() {
        initComponents();
        radio1.setSelected(true);
        pizza = FactoryPizza.getPizza(1);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient = 0;
        num_ingredient_label.setText(numIngredient + " ingredient");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        P_btn = new javax.swing.JButton();
        S_btn = new javax.swing.JButton();
        H_btn = new javax.swing.JButton();
        C_btn = new javax.swing.JButton();
        E_btn = new javax.swing.JButton();
        O_btn = new javax.swing.JButton();
        G_btn = new javax.swing.JButton();
        B_btn = new javax.swing.JButton();
        n_btn = new javax.swing.JButton();
        M_btn = new javax.swing.JButton();
        A_btn = new javax.swing.JButton();
        r_btn = new javax.swing.JButton();
        order_label = new javax.swing.JLabel();
        num_ingredient_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cancel_btn = new javax.swing.JButton();
        confirm_btn = new javax.swing.JButton();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select pizza size:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Select ingredients:");

        P_btn.setText("Pepperoni, $2.00");
        P_btn.setToolTipText("");
        P_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_btnActionPerformed(evt);
            }
        });

        S_btn.setText("Sausage, $2.00");
        S_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_btnActionPerformed(evt);
            }
        });

        H_btn.setText("Hamburger, $2.00");
        H_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_btnActionPerformed(evt);
            }
        });

        C_btn.setText("Canadian Bacon, $2.75");
        C_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_btnActionPerformed(evt);
            }
        });

        E_btn.setText("Extra cheese, $1.85");
        E_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_btnActionPerformed(evt);
            }
        });

        O_btn.setText("Onions, 1.50");
        O_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O_btnActionPerformed(evt);
            }
        });

        G_btn.setText("Green Pepper, $1.50");
        G_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_btnActionPerformed(evt);
            }
        });

        B_btn.setText("Black olives, $1.50");
        B_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_btnActionPerformed(evt);
            }
        });

        n_btn.setText("Green olives, $1.35");
        n_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_btnActionPerformed(evt);
            }
        });

        M_btn.setText("Mushrooms, $1.75");
        M_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_btnActionPerformed(evt);
            }
        });

        A_btn.setText("Anchovies, Free");
        A_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_btnActionPerformed(evt);
            }
        });

        r_btn.setText("Beer, $ 3.25");
        r_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_btnActionPerformed(evt);
            }
        });

        order_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        order_label.setText("<html> Order: Small - $8.0 </html>");
        order_label.setAlignmentX(O_btn.getAlignmentX());
        order_label.setAlignmentY(n_btn.getAlignmentY());

        num_ingredient_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        num_ingredient_label.setText("0 ingredients");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("End order");

        cancel_btn.setText("Cancel");
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        confirm_btn.setText("Confirm");
        confirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btnActionPerformed(evt);
            }
        });

        buttonGroup.add(radio1);
        radio1.setText("Small, $8.00");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        buttonGroup.add(radio2);
        radio2.setText("Medium, $10.00");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        buttonGroup.add(radio3);
        radio3.setText("Large, $12.00");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });

        buttonGroup.add(radio4);
        radio4.setText("Family, $16.00");
        radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirm_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(order_label, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radio1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio4))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(C_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(E_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(O_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(G_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r_btn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(num_ingredient_label)
                                    .addComponent(n_btn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(M_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A_btn))
                            .addComponent(jLabel5))
                        .addGap(0, 0, 0)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio1)
                    .addComponent(radio2)
                    .addComponent(radio3)
                    .addComponent(radio4))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P_btn)
                    .addComponent(S_btn)
                    .addComponent(H_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C_btn)
                    .addComponent(E_btn)
                    .addComponent(O_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G_btn)
                    .addComponent(B_btn)
                    .addComponent(r_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n_btn)
                    .addComponent(M_btn)
                    .addComponent(A_btn))
                .addGap(18, 18, 18)
                .addComponent(order_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(num_ingredient_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel_btn)
                    .addComponent(confirm_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        pizza = FactoryPizza.getPizza(1);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        pizza = FactoryPizza.getPizza(2);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
    }//GEN-LAST:event_radio2ActionPerformed

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
        pizza = FactoryPizza.getPizza(3);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
    }//GEN-LAST:event_radio3ActionPerformed

    private void radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio4ActionPerformed
        pizza = FactoryPizza.getPizza(4);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
    }//GEN-LAST:event_radio4ActionPerformed

    private void P_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("P", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_P_btnActionPerformed

    private void S_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("S", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_S_btnActionPerformed

    private void H_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("H", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_H_btnActionPerformed

    private void C_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("C", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_C_btnActionPerformed

    private void E_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("E", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_E_btnActionPerformed

    private void O_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("O", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_O_btnActionPerformed

    private void G_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("G", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_G_btnActionPerformed

    private void B_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("B", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_B_btnActionPerformed

    private void r_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("r", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_r_btnActionPerformed

    private void n_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("n", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_n_btnActionPerformed

    private void M_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("M", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_M_btnActionPerformed

    private void A_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_btnActionPerformed
        pizza = FactoryIngredient.getIngredient("A", pizza);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient++;
        num_ingredient_label.setText(numIngredient + " ingredients");
    }//GEN-LAST:event_A_btnActionPerformed

    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_btnActionPerformed
        JOptionPane.showMessageDialog(null, "Order Completed");
        radio1.setSelected(true);
        pizza = FactoryPizza.getPizza(1);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient = 0;
        num_ingredient_label.setText(numIngredient + " ingredient");
    }//GEN-LAST:event_confirm_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        JOptionPane.showMessageDialog(null, "Order Canceled");
        radio1.setSelected(true);
        pizza = FactoryPizza.getPizza(1);
        order_label.setText("<html>Order: " + pizza.getDesc() + " - $" + pizza.cost() + "</html>");
        numIngredient = 0;
        num_ingredient_label.setText(numIngredient + " ingredient");
    }//GEN-LAST:event_cancel_btnActionPerformed

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
            java.util.logging.Logger.getLogger(FormPizzaBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPizzaBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPizzaBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPizzaBuilder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPizzaBuilder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_btn;
    private javax.swing.JButton B_btn;
    private javax.swing.JButton C_btn;
    private javax.swing.JButton E_btn;
    private javax.swing.JButton G_btn;
    private javax.swing.JButton H_btn;
    private javax.swing.JButton M_btn;
    private javax.swing.JButton O_btn;
    private javax.swing.JButton P_btn;
    private javax.swing.JButton S_btn;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton cancel_btn;
    private javax.swing.JButton confirm_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton n_btn;
    private javax.swing.JLabel num_ingredient_label;
    private javax.swing.JLabel order_label;
    private javax.swing.JButton r_btn;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    // End of variables declaration//GEN-END:variables
}
