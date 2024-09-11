package br.com.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    //Criando os metodos acessores Getters and Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Conteudo{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", cargaHoraria='" + cargaHoraria + '\'' +
                '}';
    }
}
