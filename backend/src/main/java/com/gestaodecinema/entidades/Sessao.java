package main.java.com.gestaodecinema.entidades;

import java.time.LocalTime;

public class Sessao {
    private int id;
    private Filme filme;
    private Sala sala;
    private LocalTime horarioInicio;
    private LocalTime horarioFim;
    private double valorBase;

    public Sessao(int id, Filme filme, Sala sala, LocalTime horarioInicio, LocalTime horarioFim, double valorBase) {
        this.id = id;
        this.filme = filme;
        this.sala = sala;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.valorBase = valorBase;
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public LocalTime getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(LocalTime horarioFim) {
        this.horarioFim = horarioFim;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}
