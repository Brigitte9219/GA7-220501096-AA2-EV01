
package Gestion_Usuarios;

//Definición de la clase Usuarios

import java.sql.Date;

public class Usuarios {
    
    //Definición de los atributos o variables de la clase
    public int idusuario;
    public String Nombre_Completo;
    public String Usuario;
    public String Contraseña;
    public String Confirmar_Contraseña;
    public String Proyecto;
    public String Genero;
    public java.sql.Date Fecha_Nacimiento;
    public String Correo_Electronico;
    public String Telefono_Movil;

    public Usuarios(int idusuario, String Nombre_Completo, String Usuario, String Contraseña, String Confirmar_Contraseña, String Proyecto, String Genero, Date Fecha_Nacimiento, String Correo_Electronico, String Telefono_Movil) {
        this.idusuario = idusuario;
        this.Nombre_Completo = Nombre_Completo;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Confirmar_Contraseña = Confirmar_Contraseña;
        this.Proyecto = Proyecto;
        this.Genero = Genero;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Correo_Electronico = Correo_Electronico;
        this.Telefono_Movil = Telefono_Movil;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre_Completo() {
        return Nombre_Completo;
    }

    public void setNombre_Completo(String Nombre_Completo) {
        this.Nombre_Completo = Nombre_Completo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConfirmar_Contraseña() {
        return Confirmar_Contraseña;
    }

    public void setConfirmar_Contraseña(String Confirmar_Contraseña) {
        this.Confirmar_Contraseña = Confirmar_Contraseña;
    }

    public String getProyecto() {
        return Proyecto;
    }

    public void setProyecto(String Proyecto) {
        this.Proyecto = Proyecto;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    public String getTelefono_Movil() {
        return Telefono_Movil;
    }

    public void setTelefono_Movil(String Telefono_Movil) {
        this.Telefono_Movil = Telefono_Movil;
    }

}
    