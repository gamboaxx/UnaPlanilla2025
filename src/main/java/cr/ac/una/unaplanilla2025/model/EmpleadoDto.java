/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.unaplanilla2025.model;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author gambo
 */
public class EmpleadoDto {

    private Long id;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String cedula;
    private String genero;
    private String correo;
    private Boolean administrador;
    private String usuario;
    private String clave;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private Boolean activo;
    private Long version;
    private Boolean modificado;

    public EmpleadoDto(Long id, String nombre, String primerApellido, String segundoApellido, String cedula, String genero, String correo, Boolean administrador, String usuario, String clave, LocalDate fechaIngreso, LocalDate fechaSalida, Boolean activo, Long version, Boolean modificado) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.cedula = cedula;
        this.genero = genero;
        this.correo = correo;
        this.administrador = administrador;
        this.usuario = usuario;
        this.clave = clave;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.activo = activo;
        this.version = version;
        this.modificado = modificado;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getGenero() {
        return genero;
    }

    public String getCorreo() {
        return correo;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public Boolean getActivo() {
        return activo;
    }

    public Long getVersion() {
        return version;
    }

    public Boolean getModificado() {
        return modificado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setModificado(Boolean modificado) {
        this.modificado = modificado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EmpleadoDto other = (EmpleadoDto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "EmpleadoDto{" + "id=" + id + ", nombre=" + nombre + ", primerApellido=" + primerApellido + ", cedula=" + cedula + '}';
    }

}
