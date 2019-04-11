/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.edu.sydrack.view;

import guru.edu.sydrack.connection.ConnectionFactory;
import guru.edu.sydrack.converter.LocalDateAttributeConverter;
import guru.edu.sydrack.model.bean.Employee;
import guru.edu.sydrack.model.bean.JobTitle;
import guru.edu.sydrack.model.dao.EmployeeDAO;
import guru.edu.sydrack.model.dao.JobTitleDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sadrac
 */
public class ViewCadastro extends javax.swing.JFrame {

    /**
     * Creates new form ViewCadastro
     */
    public ViewCadastro() {
        initComponents();      
        readCombox();
    }
    ArrayList<Integer> IDs ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entityManager1 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjectJPAPU").createEntityManager();
        entityManager2 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ProjectJPAPU").createEntityManager();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDataAdm = new javax.swing.JTextField();
        txtDataNasc = new javax.swing.JTextField();
        comboxCargo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnCanc = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Mincho Light", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de funcionário");

        jLabel2.setText("Nome:");

        jLabel3.setText("Data de admissão:");

        jLabel4.setText("Data de nascimento:");

        jLabel5.setText("Cargo:");

        btnCanc.setBackground(new java.awt.Color(255, 51, 51));
        btnCanc.setText("Cancelar");
        btnCanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 102, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(comboxCargo, 0, 359, Short.MAX_VALUE)
                        .addComponent(txtDataAdm)
                        .addComponent(txtDataNasc)
                        .addComponent(txtNome)))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCanc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDataAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCanc)
                    .addComponent(btnCadastrar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ConnectionFactory.closeConnection();
    }//GEN-LAST:event_btnCancActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        Employee e = new Employee();
        EmployeeDAO eDAO = new EmployeeDAO();
        JobTitle jt = new JobTitle();
        JobTitleDAO jtDAO = new JobTitleDAO();
        // Cargo
        
       jtDAO.findByName(comboxCargo.getItemAt(comboxCargo.getSelectedIndex())).forEach(j ->{
           jt.setId(j.getId());
       });
        e.setJob_title(jt);
        //int indice = comboxCargo.getSelectedIndex()+1;
        
        // Nome
        e.setName(txtNome.getText());
        //Data Nascimento
        String date_string = txtDataNasc.getText();
        String[] date_preformated = date_string.split("/");
        LocalDate date_nasciment = LocalDate.of(Integer.parseInt(date_preformated[2]), Integer.parseInt(date_preformated[1]), Integer.parseInt(date_preformated[0]));
        Date ldac =new LocalDateAttributeConverter().convertToDatabaseColumn(date_nasciment);
        e.setData_nascimento(ldac);
        //Data admissão
        String date_str = txtDataAdm.getText();
        String[] date_preformated_nasc = date_str.split("/");
        LocalDate date_admission = LocalDate.of(Integer.parseInt(date_preformated_nasc[2]), Integer.parseInt(date_preformated_nasc[1]), Integer.parseInt(date_preformated_nasc[0]));
        Date admissao =new LocalDateAttributeConverter().convertToDatabaseColumn(date_admission);
        e.setData_admissao(admissao);
        eDAO.saveAndUpdate(e);
        JOptionPane.showMessageDialog(null,"salvo");
        //JOptionPane.showMessageDialog(null,comboxCargo.getItemAt(comboxCargo.getSelectedIndex()));
    }//GEN-LAST:event_btnCadastrarActionPerformed
    public void readCombox(){
        
        JobTitleDAO jtDAO = new JobTitleDAO();
        jtDAO.findAll().forEach(j -> {
            comboxCargo.addItem(j.getName());
        });
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
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCanc;
    private javax.swing.JComboBox<String> comboxCargo;
    private javax.persistence.EntityManager entityManager1;
    private javax.persistence.EntityManager entityManager2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtDataAdm;
    private javax.swing.JTextField txtDataNasc;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}