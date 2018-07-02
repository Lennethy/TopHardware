package entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Gpus implements Serializable{

    private String id;
    private String modelo;
    private String memoria;
    private int foto;
    private BigDecimal preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Gpus(String id, String modelo, String memoria, int foto, BigDecimal preco) {
        this.id = id;
        this.modelo = modelo;
        this.memoria = memoria;
        this.foto = foto;
        this.preco = preco;
    }

    public Gpus() {
    }
}
