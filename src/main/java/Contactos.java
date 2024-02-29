
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
public class Contactos extends javax.swing.JFrame {

    /**
     * Creates new form Contactos
     */
    DefaultTableModel modelo1;
    public Contactos() {
        initComponents();
        setLocationRelativeTo(null);
        try{
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Telefono");
        this.jTable1.setModel(modelo1);
        cargarArchivo2();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    private void cargarArchivo2() throws IOException{
        String fila[];
        
        try{
           
            FileReader archivo = new FileReader("Contactos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
           
            
            while(linea != null){
                 fila = linea.split("#");
                 modelo1.addRow(fila);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jIngresar = new javax.swing.JButton();
        jModificar = new javax.swing.JButton();
        jEliminar = new javax.swing.JButton();
        jCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Contactos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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

        jCerrar.setText("Volver");
        jCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCerrarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Telefono:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Opciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(233, 233, 233))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2)
                                    .addComponent(jIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel4))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCerrar)))
                .addGap(20, 20, 20)
                .addComponent(jIngresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
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
        Archivos archivo2 = new Archivos();
        archivo2.crearArchivo2();
        String n = jTextField1.getText();
        String t = jTextField2.getText();
        
        if (!n.isEmpty()){
            if(!t.isEmpty()){
        String [] info = new String [2];
        info[0] = jTextField1.getText();
        info[1] = jTextField2.getText();
        modelo1.addRow(info);
        jTextField1.setText("");
        jTextField2.setText("");
        Datos persona2 = new Datos(n,Integer.parseInt(t));
        archivo2.escribirEnArchivo2(persona2);
        JOptionPane.showMessageDialog(null, "Contacto agregado.");
            }else{
                JOptionPane.showMessageDialog(null, "El campo de Telefono esta vacío");
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo de Nombre esta vacío");
        }
    }//GEN-LAST:event_jIngresarActionPerformed

    private void jEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarActionPerformed
        // TODO add your handling code here:
        ArrayList<String> al = new ArrayList<String>();
        File f=new File("Contactos.txt");
        FileWriter fichero = null;
        PrintWriter pw = null;
        String inf;
        int cont=1;
        if(f.exists()){
           try{
             String buscar = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea borrar.");
             FileReader fr=new FileReader(f);
             BufferedReader b = new BufferedReader(fr);
             while((inf=b.readLine())!=null){
                 String[] n = inf.split("#");
                 if (!n[0].equals(buscar))
                 {
                         al.add(inf);
                 }
                 else{
                JOptionPane.showMessageDialog(null, "Contacto eliminado.");}
             }
              fr.close();
              b.close();
              File newfile = new File("Contactos.txt");
              newfile.delete();
              fichero = new FileWriter("Contactos.txt");
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
        modelo1.removeRow(i);}
        String fila2[];
        
        try{
           
            FileReader archivo = new FileReader("Contactos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
            
            while(linea != null){
                 fila2 = linea.split("#");
                 modelo1.addRow(fila2);
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
        File f=new File("Contactos.txt");
        FileWriter fichero = null;
        PrintWriter pw = null;
        String inf;
        int cont=1;
        if(f.exists()){
           try{
             String buscar = JOptionPane.showInputDialog(null, "Ingrese el nombre del contacto que desea modificar.");
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
                     n[0] = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre.");
                     n[1] = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero.");
                     al.add(n[0] + "#" + n[1] + "#");
                     JOptionPane.showMessageDialog(null, "Contacto modificado.");
                 }
             }
              fr.close();
              b.close();
              File newfile = new File("Contactos.txt");
              newfile.delete();
              fichero = new FileWriter("Contactos.txt");
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
        modelo1.removeRow(i);}
        String fila2[];
        
        try{
           
            FileReader archivo = new FileReader("Contactos.txt");
            BufferedReader lectura = new BufferedReader(archivo);
            
            String linea = lectura.readLine();
            
            while(linea != null){
                 fila2 = linea.split("#");
                 modelo1.addRow(fila2);
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
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contactos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contactos().setVisible(true);
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
    private javax.swing.JButton jModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}