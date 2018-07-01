package entities;

import java.math.BigDecimal;

public class Cpus {

    private String id;
    private String modelo;
    private String frequencia;
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

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
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

    public Cpus(String id, String modelo, String frequencia, int foto, BigDecimal preco) {
        this.id = id;
        this.modelo = modelo;
        this.frequencia = frequencia;
        this.foto = foto;
        this.preco = preco;
    }

    public Cpus() {
    }
}