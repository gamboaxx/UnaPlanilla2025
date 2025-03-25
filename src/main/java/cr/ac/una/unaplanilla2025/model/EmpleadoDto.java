/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.una.unaplanilla2025.model;

import java.time.LocalDate;
import java.util.Objects;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author gambo
 */
public class EmpleadoDto {

    private StringProperty id;
    private StringProperty nombre;
    private StringProperty primerApellido;
    private StringProperty segundoApellido;
    private StringProperty cedula;
    private StringProperty genero;
    private StringProperty correo;
    private BooleanProperty administrador;
    private StringProperty usuario;
    private StringProperty clave;
    private ObjectProperty<LocalDate> fechaIngreso;
    private ObjectProperty<LocalDate> fechaSalida;
    private BooleanProperty activo;
    private Long version;
    private Boolean modificado;

    public EmpleadoDto() {
        this.id = new SimpleStringProperty("");
        this.nombre = new SimpleStringProperty("");
        this.primerApellido = new SimpleStringProperty("");
        this.segundoApellido = new SimpleStringProperty("");
        this.cedula = new SimpleStringProperty("");
        this.genero = new SimpleStringProperty("");
        this.correo = new SimpleStringProperty("");
        this.administrador = new SimpleBooleanProperty(false);
        this.usuario = new SimpleStringProperty("");
        this.clave = new SimpleStringProperty("");
        this.fechaIngreso = new SimpleObjectProperty<>(LocalDate.now());
        this.fechaSalida = new SimpleObjectProperty<>();
        this.activo = new SimpleBooleanProperty(true);
    }

    public Long getId() {
        if (this.id.get() != null && !this.id.get().isBlank()) {
            return Long.valueOf(this.id.get());
        } else {
            return null;
        }
    }

    public String getNombre() {
        return nombre.get();
    }

    public String getPrimerApellido() {
        return primerApellido.get();
    }

    public String getSegundoApellido() {
        return segundoApellido.get();
    }

    public String getCedula() {
        return cedula.get();
    }

    public String getGenero() {
        return genero.get();
    }

    public String getCorreo() {
        return correo.get();
    }

    public Boolean getAdministrador() {
        return administrador.get();
    }

    public String getUsuario() {
        return usuario.get();
    }

    public String getClave() {
        return clave.get();
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso.get();
    }

    public LocalDate getFechaSalida() {
        return fechaSalida.get();
    }

    public Boolean getActivo() {
        return activo.get();
    }

    public Long getVersion() {
        return version;
    }

    public Boolean getModificado() {
        return modificado;
    }

    public void setId(Long id) {
        this.id.set(id.toString());
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido.set(primerApellido);
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido.set(segundoApellido);
    }

    public void setCedula(String cedula) {
        this.cedula.set(cedula);
    }

    public void setGenero(String genero) {
        this.genero.set(genero);
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador.set(administrador);
    }

    public void setUsuario(String usuario) {
        this.usuario.set(usuario);
    }

    public void setClave(String clave) {
        this.clave.set(clave);
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso.set(fechaIngreso);
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida.set(fechaSalida);
    }

    public void setActivo(Boolean activo) {
        this.activo.set(activo);
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setModificado(Boolean modificado) {
        this.modificado = modificado;
    }

    public StringProperty getIdProperty() {
        return id;
    }

    public StringProperty getNombreProperty() {
        return nombre;
    }

    public StringProperty getPrimerApellidoProperty() {
        return primerApellido;
    }

    public StringProperty getSegundoApellidoProperty() {
        return segundoApellido;
    }

    public StringProperty getCedulaProperty() {
        return cedula;
    }

    public StringProperty getGeneroProperty() {
        return genero;
    }

    public StringProperty getCorreoProperty() {
        return correo;
    }

    public BooleanProperty getAdministradorProperty() {
        return administrador;
    }

    public StringProperty getUsuarioProperty() {
        return usuario;
    }

    public StringProperty getClaveProperty() {
        return clave;
    }

    public ObjectProperty<LocalDate> getFechaIngresoProperty() {
        return fechaIngreso;
    }

    public ObjectProperty<LocalDate> getFechaSalidaProperty() {
        return fechaSalida;
    }

    public BooleanProperty getActivoProperty() {
        return activo;
    }

    public Long getVersionProperty() {
        return version;
    }

    public Boolean getModificadoProperty() {
        return modificado;
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
