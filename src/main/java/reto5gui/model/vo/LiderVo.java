package reto5gui.model.vo;

public class LiderVo {
    
    private Integer id;
    private String nombre;
    private String primer_apellido;
    private String ciudad;

    public LiderVo(){
        this.id = null;
        this.nombre = null;
        this.primer_apellido = null;
        this.ciudad = null;
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
