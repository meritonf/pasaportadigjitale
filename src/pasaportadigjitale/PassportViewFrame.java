
package pasaportadigjitale;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import org.json.*;
import theClasses.DB;
import theClasses.Person;


public class PassportViewFrame extends javax.swing.JFrame {

    public PassportViewFrame() {
        initComponents();
        
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPassports = new javax.swing.JList<>();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblPersonaLnumber = new javax.swing.JLabel();
        txtPersonalNumber = new javax.swing.JTextField();
        lblIssueDate = new javax.swing.JLabel();
        lblExpirationDate = new javax.swing.JLabel();
        btnNewPassport = new javax.swing.JButton();
        btnChange = new javax.swing.JButton();
        txtIssueDay = new javax.swing.JTextField();
        txtIssueMonth = new javax.swing.JTextField();
        txtIssueYear = new javax.swing.JTextField();
        txtExpirationDay = new javax.swing.JTextField();
        txtExpirationMonth = new javax.swing.JTextField();
        txtExpirationYear = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstPassports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstPassportsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstPassports);

        lblName.setText("Name :");

        lblLastName.setText("Last Name :");

        lblPersonaLnumber.setText("Personal Number");

        lblIssueDate.setText("Issue Date");

        lblExpirationDate.setText("Expiration Date");

        btnNewPassport.setText("New Passport");
        btnNewPassport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewPassportMouseClicked(evt);
            }
        });

        btnChange.setText("Make Changes");
        btnChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnNewPassport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtIssueDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIssueMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtIssueYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(lblIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(179, 179, 179)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtExpirationDay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpirationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpirationYear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblName)
                                            .addGap(44, 44, 44))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblLastName)
                                            .addGap(29, 29, 29)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(txtName)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(btnChange))
                                .addComponent(lblExpirationDate, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblPersonaLnumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPersonalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersonalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonaLnumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblIssueDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIssueDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIssueMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIssueYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(lblExpirationDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtExpirationDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpirationMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtExpirationYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewPassport)
                    .addComponent(btnChange))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewPassportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPassportMouseClicked
        // TODO add your handling code here:
        showAddpassportFrame();
    }//GEN-LAST:event_btnNewPassportMouseClicked

    private void btnChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeMouseClicked
        // TODO add your handling code here:
        MakeChangesFrame makeChangesFrame=new MakeChangesFrame();
        makeChangesFrame.setVisible(true);
    }//GEN-LAST:event_btnChangeMouseClicked

    private void lstPassportsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstPassportsMouseClicked
        // TODO add your handling code here:
        loadInformation(lstPassports.getSelectedValue());
       
    }//GEN-LAST:event_lstPassportsMouseClicked

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
            java.util.logging.Logger.getLogger(PassportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassportViewFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassportViewFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnNewPassport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExpirationDate;
    private javax.swing.JLabel lblIssueDate;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonaLnumber;
    private javax.swing.JList<String> lstPassports;
    private javax.swing.JTextField txtExpirationDay;
    private javax.swing.JTextField txtExpirationMonth;
    private javax.swing.JTextField txtExpirationYear;
    private javax.swing.JTextField txtIssueDay;
    private javax.swing.JTextField txtIssueMonth;
    private javax.swing.JTextField txtIssueYear;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPersonalNumber;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Person> pList;
    private String dbFile = "C:\\Users\\lenovo\\Desktop\\passport.txt";
    
    public void setPassportList(ArrayList<Person> pList) {
    
        this.pList = pList;
        loadPassportList();
        refreshpassportList();
    }
    
    private void showAddpassportFrame() {
    
        AddPassportFrame addpassportFrame = new AddPassportFrame();
        addpassportFrame.setpersonlist(pList);
        addpassportFrame.setParentWindow(this);
        addpassportFrame.setVisible(true);
    }
    
    public void refreshpassportList() {
    
        DefaultListModel defaultListModel = new DefaultListModel();
        
        for(int i=0;i<pList.size();i++) {
        
            defaultListModel.addElement(pList.get(i).getName());
        }
        
        lstPassports.setModel(defaultListModel);
    }
    
    private Person getPassportByName(String name) {
    
        for(Person p : pList) {
        
            if(p.getName().equals(name)) {
            
                return p;
            }
        }
        
        return null;
    }
    
    private void loadInformation(String theName) {
    
        txtName.setText(theName);
        txtLastName.setText("");
        txtPersonalNumber.setText("");
        txtIssueDay.setText("");
        txtIssueMonth.setText("");
        txtIssueYear.setText("");
        txtExpirationDay.setText("");
        txtExpirationMonth.setText("");
        txtExpirationYear.setText("");
        
    }
    public void savePassportList() {
    
        JSONArray jsonpassList = new JSONArray();
        
        for(Person book : pList) {
        
            jsonpassList.put(book.getJSONObject());
        }
        
        try{
            
            PrintWriter out = new PrintWriter(dbFile);
            out.print(jsonpassList.toString());
            out.close();
        }
        catch(FileNotFoundException ex) {
        
            ex.printStackTrace();
        }
    }
    
    public void loadPassportList() {
    
        String jsonString = readFile(dbFile);
        
        if(jsonString != null) {
        
            try {
                
                JSONArray jsonArray = new JSONArray(jsonString);
                
                for(int i=0;i<jsonArray.length();i++) {
                
                    JSONObject jsonpassObject = jsonArray.getJSONObject(i);
                    
                    pList.add(new Person(jsonpassObject));
                }
            }
            catch(JSONException ex) {
            
            }
        }
    }
    
    private String readFile(String fileName) {
    
        try {
            
            InputStream is = new FileInputStream(fileName); 
            BufferedReader buf = new BufferedReader(new InputStreamReader(is)); 

            String line = buf.readLine(); StringBuilder sb = new StringBuilder(); 

            while(line != null){ 
                sb.append(line).append("\n"); 
                line = buf.readLine(); 
            } 

            return sb.toString();
        }
        catch(IOException ex) {
        
            return null;
        }
    }
   
   
  
 
}
