package main.java.com.gestaodecinema.entidades;

public class Poltrona {
    private int id;
    private int numero;
    private String fileira;
    private String sala;
    private boolean ocupada;
    private String tipo;
    private Boolean acessibilidade;

    public Poltrona(int id, int numero, String fileira, String sala, boolean ocupada, String tipo, Boolean acessibilidade) {
        this.id = id;
        this.numero = numero;
        this.fileira = fileira;
        this.sala = sala;
        this.ocupada = ocupada;
        this.tipo = tipo;
        this.acessibilidade = acessibilidade;
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

    public String getFileira() {
        return fileira;
    }

    public void setFileira(String fileira) {
        this.fileira = fileira;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(Boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }

}
