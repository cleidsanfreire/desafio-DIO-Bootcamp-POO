package br.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Mentoria extends Conteudo{
    private LocalDate date;
    private Set<Dev> devsIncritos = new HashSet<>();


    @Override
    public double calcularXP() { // Calculando o XP a cada mentoria concluida somando + 20 pontos
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

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
