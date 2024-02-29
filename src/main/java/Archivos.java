
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabian
 */
public class Archivos {
    //Datos personales
    File archivo1;
    
      public void crearArchivo1() {
        try {
            archivo1 = new File("DatosPersonales.txt");
            if (archivo1.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo1(Datos persona1){
           try{
                FileWriter escribir1 = new FileWriter(archivo1);
                escribir1.write(persona1.getNombre() + "#"+  persona1.getOrganizacion() + "#" +persona1.getPuesto() + "#"+ persona1.getCorreo()+ "#"+ persona1.getPagina() + "#"+ persona1.gettTrabajo()+ "#"+persona1.gettParticular()+ "#"+ persona1.gettMovil()+ "#" +persona1.getdTrabajo()+ "#"+ "\r\n");
                escribir1.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      //Contactos
      File archivo2;
    
      public void crearArchivo2() {
        try {
            archivo2 = new File("Contactos.txt");
            if (archivo2.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo2(Datos persona2){
           try{
                FileWriter escribir2 = new FileWriter(archivo2, true);
                escribir2.write(persona2.getNombre2() + "#"+ persona2.getTelefono() +"#" +"\r\n");
                escribir2.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      File archivo3;
    
      public void crearArchivo3() {
        try {
            archivo3 = new File("Agenda.txt");
            if (archivo3.createNewFile()) {
                JOptionPane.showMessageDialog(null,"Archivo Creado");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
      }
      
      public void escribirEnArchivo3(Datos persona3){
           try{
                FileWriter escribir3 = new FileWriter(archivo3, true);
                escribir3.write(persona3.getNumero()+"#"+persona3.getAsunto() + "#"+ persona3.getFecha() +"#" +"\r\n");
                escribir3.close();
           }catch(IOException e){
               System.out.println(e);
           }
      }
      
}
