
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabian
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    DefaultTableModel modelo2;
    public Agenda() {
        initComponents();
        setLocationRelativeTo(null);
        try{
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Numero");
        modelo2.addColumn("Asunto");
        modelo2.addColumn("Fecha");
        this.jTable1.setModel(modelo2);
        cargarArchivo3();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    private void cargarArchivo3() throws IOException{
        String fila[];
        
        try{
           
            FileReader archivo = new FileReader("Agenda.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
           
            
            while(linea != null){
                 fila = linea.split("#");
                 modelo2.addRow(fila);
                 linea = lectura.readLine();
            }
            
       }catch(FileNotFoundException e){
           System.out.println(e);
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jIngresar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Agenda");

        jIngresar.setText("Ingresar");
        jIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIngresarActionPerformed(evt);
            }
        });

        jModificar.setText("Modificar");
        jModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModificarActionPerformed(evt);
            }
        });

        jEliminar.setText("Eliminar");
        jEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jCerrar.setText("Volver");
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Asunto:");

        jLabel3.setText("Fecha:");

        jLabel4.setText("Numero:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(14, 14, 14)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCerrar)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jIngresar)))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCerrarActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jCerrarActionPerformed

    private void jIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIngresarActionPerformed
        // TODO add your handling code here:
        Archivos archivo3 = new Archivos();
        archivo3.crearArchivo3();
        String n = jTextField3.getText();
        String a = jTextField1.getText();
        String f = jTextField4.getText();
        
        if (!a.isEmpty()){
            if(!f.isEmpty()){
                if(!n.isEmpty()){
        String [] info = new String [3];
        info[0] = jTextField3.getText();
        info[1] = jTextField1.getText();
        info[2] = jTextField4.getText();
        modelo2.addRow(info);
        jTextField3.setText("");
        jTextField1.setText("");
        jTextField4.setText("");
        Datos persona3 = new Datos(Integer.parseInt(n), a, f);
        archivo3.escribirEnArchivo3(persona3);
        JOptionPane.showMessageDialog(null, "Asunto agendado.");
            }else{
                JOptionPane.showMessageDialog(null, "El campo de Numero esta vacío");
            }
            }else{
                JOptionPane.showMessageDialog(null, "El campo de Fecha esta vacío");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo de Asunto esta vacío");
        }
    }//GEN-LAST:event_jIngresarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        ArrayList<String> al = new ArrayList<String>();
        File f=new File("Agenda.txt");
        FileWriter fichero = null;
        PrintWriter pw = null;
        String inf;
        int cont=1;
        if(f.exists()){
           try{
             String buscar = JOptionPane.showInputDialog(null, "Ingrese el numero del asunto que desea borrar.");
             FileReader fr=new FileReader(f);
             BufferedReader b = new BufferedReader(fr);
             while((inf=b.readLine())!=null){
                 String[] n = inf.split("#");
                 if (!n[0].equals(buscar))
                 {
                         al.add(inf);
                 }
                 else{
                JOptionPane.showMessageDialog(null, "Asunto eliminado.");}
             }
              fr.close();
              b.close();
              File newfile = new File("Agenda.txt");
              newfile.delete();
              fichero = new FileWriter("Agenda.txt");
              pw = new PrintWriter(fichero);
              for (int i = 0; i < al.size(); i++)
                pw.println(al.get(i).toString());

              pw.close();
              fichero.close();
            }catch(IOException ex){ex.printStackTrace();}
           finally
           {

           }
        }
        int fila = jTable1.getRowCount();
        for (int i = fila-1; i >=0; i--) {
        modelo2.removeRow(i);}
        String fila2[];
        
        try{
           
            FileReader archivo = new FileReader("Agenda.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
            
            while(linea != null){
                 fila2 = linea.split("#");
                 modelo2.addRow(fila2);
                 linea = lectura.readLine();
            }
            
       }catch(FileNotFoundException e){
           System.out.println(e);
       }    catch (IOException ex) {
                Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jEliminarActionPerformed

    private void jModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModificarActionPerformed
        // TODO add your handling code here:
        ArrayList<String> al = new ArrayList<String>();
        File f=new File("Agenda.txt");
        FileWriter fichero = null;
        PrintWriter pw = null;
        String inf;
        int cont=1;
        if(f.exists()){
           try{
             String buscar = JOptionPane.showInputDialog(null, "Ingrese el numero del asunto que desea modificar.");
             FileReader fr=new FileReader(f);
             BufferedReader b = new BufferedReader(fr);
             while((inf=b.readLine())!=null){
                 String[] n = inf.split("#");
                 if (!n[0].equals(buscar))
                 {
                         al.add(inf);
                 }
                 else
                 {
                     n[1] = JOptionPane.showInputDialog(null, "Ingrese el nuevo Asunto.");
                     n[2] = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha.");
                     al.add(n[0]+"#"+n[1] + "#" + n[2] + "#");
                     JOptionPane.showMessageDialog(null, "Asunto modificado.");
                 }
             }
              fr.close();
              b.close();
              File newfile = new File("Agenda.txt");
              newfile.delete();
              fichero = new FileWriter("Agenda.txt");
              pw = new PrintWriter(fichero);
              for (int i = 0; i < al.size(); i++)
                pw.println(al.get(i).toString());

              pw.close();
              fichero.close();
            }catch(IOException ex){ex.printStackTrace();}
           finally
           {
           }
        }
        int fila = jTable1.getRowCount();
        for (int i = fila-1; i >=0; i--) {
        modelo2.removeRow(i);}
        String fila2[];
        
        try{
            FileReader archivo = new FileReader("Agenda.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
            
            while(linea != null){
                 fila2 = linea.split("#");
                 modelo2.addRow(fila2);
                 linea = lectura.readLine();
            }
            
       }catch(FileNotFoundException e){
           System.out.println(e);
       }    catch (IOException ex) {
                Logger.getLogger(Contactos.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCerrar;
    private javax.swing.JButton jEliminar;
    private javax.swing.JButton jIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
