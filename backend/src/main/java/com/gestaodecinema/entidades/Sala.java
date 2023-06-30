package main.java.com.gestaodecinema.entidades;

import java.util.List;

public class Sala {
    private int id;
    private int numero;
    private int capacidade;
    private String tipo;
    private boolean acessibilidade;
    private boolean disponivel;
    private List<Poltrona> poltronas;

    public Sala(int id, int numero, int capacidade, String tipo, boolean acessibilidade, boolean disponivel, List<Poltrona> poltronas) {
        this.id = id;
        this.numero = numero;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.acessibilidade = acessibilidade;
        this.disponivel = disponivel;
        this.poltronas = poltronas;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Poltrona> getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(List<Poltrona> poltronas) {
        this.poltronas = poltronas;
    }
}
