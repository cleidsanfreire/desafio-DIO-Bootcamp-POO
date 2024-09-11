package br.com.desafio.dominio;

public class Curso {
    private String title;
    private String description;
    private int cargaHoraria;

    public Curso() {
    }

    public Curso(String title, String description, int cargaHoraria) {
        this.title = title;
        this.description = description;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    //Criando os metodos acessores Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
