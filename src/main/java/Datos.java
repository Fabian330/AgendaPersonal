/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabian
 */
public class Datos {
    //Datos personales
    String Nombre;
    String Organizacion;
    String Puesto;
    String Correo;
    String Pagina;
    int tTrabajo;
    int tParticular;
    int tMovil;
    String dTrabajo;
    
    //Contactos
    String Nombre2;
    int Telefono;
    
    //Agenda
    int Numero;
    String Asunto;
    String Fecha;
    
    public Datos(String Nombre, String Organizacion, String Puesto, String Correo, String Pagina, int tTrabajo, int tParticular, int tMovil, String dTrabajo){
    //Datos personales
    this.Nombre = Nombre;
    this.Organizacion = Organizacion;
    this.Puesto = Puesto;
    this.Correo = Correo;
    this.Pagina = Pagina;
    this.tTrabajo = tTrabajo;
    this.tParticular = tParticular;
    this.tMovil = tMovil;
    this.dTrabajo = dTrabajo;
}
    //Contactos
    public Datos(String Nombre2, int Telefono){
    this.Nombre2 = Nombre2;
    this.Telefono = Telefono;
    }
    
    //Agenda
    public Datos(int Numero, String Asunto, String Fecha){
    this.Numero = Numero;
    this.Asunto = Asunto;
    this.Fecha = Fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String Organizacion) {
        this.Organizacion = Organizacion;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getPagina() {
        return Pagina;
    }

    public void setPagina(String Pagina) {
        this.Pagina = Pagina;
    }

    public int gettTrabajo() {
        return tTrabajo;
    }

    public void settTrabajo(int tTrabajo) {
        this.tTrabajo = tTrabajo;
    }

    public int gettParticular() {
        return tParticular;
    }

    public void settParticular(int tParticular) {
        this.tParticular = tParticular;
    }

    public int gettMovil() {
        return tMovil;
    }

    public void settMovil(int tMovil) {
        this.tMovil = tMovil;
    }

    public String getdTrabajo() {
        return dTrabajo;
    }

    public void setdTrabajo(String dTrabajo) {
        this.dTrabajo = dTrabajo;
    }

    public String getNombre2() {
        return Nombre2;
    }

    public void setNombre2(String Nombre2) {
        this.Nombre2 = Nombre2;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public String getAsunto() {
        return Asunto;
    }

    public void setAsunto(String Asunto) {
        this.Asunto = Asunto;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
}
