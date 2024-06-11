/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolCliente;

/**
 *
 * @author CLAUDIA CORTEZ
 */
public class ClienteArbol {
    private int clave;
    private String nombre;
    private String telefono;
    private String direccion;
    private String gmail;

    

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    
    public ClienteArbol(){
        this.clave = 0;
        this.nombre = null;
        this.telefono = null;
        this.direccion = null;
        this.gmail = null;
    }
    public ClienteArbol(int clave, String nombre, String telefono, String direccion, String gmail) {
        this.clave = clave;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.gmail = gmail;
    }

    public int getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getGmail() {
        return gmail;
    }

    @Override
    public String toString() {
        return "Cliente [clave=" + clave + ", nombre=" + nombre + ", telefono=" + telefono + 
               ", direccion=" + direccion + ", razonSocial=" + gmail + "]";
    }
}

