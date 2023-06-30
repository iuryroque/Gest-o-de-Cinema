package main.java.com.gestaodecinema.entidades;

import java.time.LocalDate;

public class Bilhete {
    private int id;
    private Sessao sessao;
    private Poltrona poltrona;
    private Cliente cliente;
    private double valor;
    private LocalDate dataCompra;
    private String codigoBarra;
    private String tipoIngresso; // O tipo de ingresso (inteiro, meia-entrada, VIP, etc.).

    public Bilhete(int id, Sessao sessao, Poltrona poltrona, Cliente cliente, double valor, LocalDate dataCompra,
            String codigoBarra, String tipoIngresso) {
        this.id = id;
        this.sessao = sessao;
        this.poltrona = poltrona;
        this.cliente = cliente;
        this.valor = valor;
        this.dataCompra = dataCompra;
        this.codigoBarra = codigoBarra;
        this.tipoIngresso = tipoIngresso;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Poltrona getPoltrona() {
        return poltrona;
    }

    public void setPoltrona(Poltrona poltrona) {
        this.poltrona = poltrona;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
}
