/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Tier1Role;

import Business.EcoSystem;
import Business.Departments.Departments;
import Business.Departments.Tier1Department;
import Business.Departments.Tier2Department;
import Business.Location.Location;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Tier1WorkRequest;
import Business.WorkQueue.Tier2WorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jyoti
 */
public class Tier1WorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Tier1WorkAreaJPanel
     */
    private JPanel userProcessContainer;
    //private EcoSystem business;
    Location enterprise;
    private UserAccount account;
    private Tier1Department organization;

    public Tier1WorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Departments organization, Location enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = (Tier1Department) organization;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            Tier1WorkRequest tier1 = (Tier1WorkRequest) request;
            Object[] row = new Object[4];
            row[0] = tier1.getStatus();
            row[1] = tier1.getReceiver() == null ? null : request.getReceiver().getPerson().getPersonID();
            row[2] = tier1.getRequestDate();
            row[3] = tier1.getWorkProgress();

            model.addRow(row);
        }
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
        workRequestJTable = new javax.swing.JTable();
        BtnCreateCase = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(220, 226, 235));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));

        workRequestJTable.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Receiver", "Start Date", "Progress Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setHeaderValue("Status");
            workRequestJTable.getColumnModel().getColumn(1).setHeaderValue("Receiver");
            workRequestJTable.getColumnModel().getColumn(2).setHeaderValue("Start Date");
            workRequestJTable.getColumnModel().getColumn(3).setHeaderValue("Progress Status");
        }

        BtnCreateCase.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        BtnCreateCase.setText("Create Case");
        BtnCreateCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateCaseActionPerformed(evt);
            }
        });

        btnProcess.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        assignJButton.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Account Access Work Request");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(assignJButton)
                            .addGap(208, 208, 208)
                            .addComponent(btnProcess)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCreateCase))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCreateCase)
                        .addComponent(btnProcess))
                    .addComponent(assignJButton))
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        Tier1WorkRequest request = (Tier1WorkRequest)organization.getWorkQueue().getWorkRequestList().get(selectedRow);
        
        if((request.getReceiver()) == null){
        request.setReceiver(account);
        request.setWorkProgress("Pending");
        populateTable();
        }else{
            JOptionPane.showMessageDialog(null, "The receiver is already set.");
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    boolean incorrectPassword;
    
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        Tier1WorkRequest request = (Tier1WorkRequest) organization.getWorkQueue().getWorkRequestList().get(selectedRow);

        request.setWorkProgress("Processing");
        request.getUser().setWrongCounter(0);
        if ((request.getStatus()).equalsIgnoreCase("Unknown device and incorrect security pin")){
        request.getUser().getStoredIPAddressDirectory().addIPAddress(request.getIpAddress());
        incorrectPassword = false;
        }else{
            if ((request.getStatus()).equalsIgnoreCase("Multiple entry of wrong username and password"))
            incorrectPassword = true;
        }
        
        if(incorrectPassword){
            sendEmail(request.getUser().getPerson().getEmail(), request.getUser().getPassword());
        }
        else{
            sendEmail(request.getUser().getPerson().getEmail(), String.valueOf(request.getUser().getPin()));
        }
        
        

        Tier1ProcessArea tier1ProcessArea = new Tier1ProcessArea(userProcessContainer, account, enterprise, request);
        userProcessContainer.add("Tier1ProcessArea", tier1ProcessArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    
    
    private void sendEmail(String sendToUser, String passWord) {

//        String username = txtEmail.getText();
//        
//        String password = JOptionPane.showInputDialog(null, "Enter the password");
        
        final String password = "itdoesmorenow";

        
        
        final String username = "jtsharma2308@gmail.com";
		//final String password = "";
        
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jtsharma2308@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(sendToUser));
            message.setSubject("ReSet Password");
            message.setText("Dear User,\n\n Here is your security credentials=>"+passWord);

            Transport.send(message);

            System.out.println("Done");
            JOptionPane.showMessageDialog(null, "The password/pin has been sent to the secure email");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
    
    
    private void BtnCreateCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateCaseActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        Tier1WorkRequest request = (Tier1WorkRequest) organization.getWorkQueue().getWorkRequestList().get(selectedRow);
        
        Tier2WorkRequest pRequest = new Tier2WorkRequest();
        pRequest.setSender(account);
        pRequest.setWorkProgress("Sent for detailed investigation");
        pRequest.setStatus(request.getStatus());
        //pRequest.setPrescription(p);

        Departments org = null;
        for (Departments organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof Tier2Department) {
                org = organization;
                //System.out.println(organization);
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequestList().add(pRequest);
            account.getWorkQueue().getWorkRequestList().add(pRequest);
        }
        
        JOptionPane.showMessageDialog(null, "Case created and escalated to tier 2");
    }//GEN-LAST:event_BtnCreateCaseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreateCase;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}