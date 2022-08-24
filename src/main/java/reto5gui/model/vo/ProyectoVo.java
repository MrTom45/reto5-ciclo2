package reto5gui.model.vo;

public class ProyectoVo {

    private Integer id;
    private String constructora;
    private Integer numero_habitaciones;
    private String ciudad;

    public ProyectoVo() {
        this.id = null;
        this.constructora = null;
        this.numero_habitaciones = null;
        this.ciudad = null;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getNumero_habitaciones() {
        return numero_habitaciones;
    }

    public void setNumero_habitaciones(Integer numero_habitaciones) {
        this.numero_habitaciones = numero_habitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
