package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.Set;

public class Curso extends Conteudo{
    private int cargaHoraria;
    private Set<Dev> devsIncritos = new HashSet<>();

    public Curso() {
    }

    @Override
    public double calcularXP() { // Calculando o XP do dev ao concluir um Curso * pela carga horaria do curso
        return XP_PADRAO * cargaHoraria;
    }

    //Criando os metodos acessores Getters and Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public void setDevsIncritos(Set<Dev> devsIncritos) {
        this.devsIncritos = devsIncritos;
    }

    @Override
    public String toString() {
        return "Cursos{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
