package br.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate date;

    public Mentoria() {
    }


    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria(LocalDate date) {
        this.date = date;
    }


    //Criando os metodos acessores Getters and Setters
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
