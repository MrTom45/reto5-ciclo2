package reto5gui.model.vo;

public class CompraVo {
    private Integer id;
    private String constructora;
    private String banco_vinculado;
    
    public CompraVo(){
        this.id = null;
        this.constructora = null;
        this.banco_vinculado = null;
    }

    //getters and setters
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

    public String getBanco_vinculado() {
        return banco_vinculado;
    }

    public void setBanco_vinculado(String banco_vinculado) {
        this.banco_vinculado = banco_vinculado;
    }

    
}
