package br.com.desafio.dominio;

import java.util.*;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){ // Inscrevendo os devs no bootcamp
        this.conteudosIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void inscreverCursos(Curso curso) { // Inscrevendo os devs em apenas um curso por vez
        this.conteudosIncritos.add(curso);
        curso.getDevsIncritos().add(this);
    }

    public void inscreverMentoria(Mentoria mentoria) { // Inscrevendo os devs em apenas uma mentoria por vez
        this.conteudosIncritos.add(mentoria);
        mentoria.getDevsIncritos().add(this);
    }

    public Dev() {
    }

    public Dev(String name) {
        this.name = name;
    }

    public void progredir(){ // Progredindo no conteudo (conluindo o conteudo)
        Optional<Conteudo> conteudo = conteudosIncritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConluidos.add(conteudo.get());
            this.conteudosIncritos.remove(conteudo.get());
        } else {
            System.err.println("Nenhum conteudo encontrado!");
        }
    }

    public double calcularTotalXp(){ // Calculando todo o XP ja ganho e somando com o total
        return this.conteudosConluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Conteudo> getConteudosIncritos() {
        return conteudosIncritos;
    }

    public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
        this.conteudosIncritos = conteudosIncritos;
    }

    public Set<Conteudo> getConteudosConluidos() {
        return conteudosConluidos;
    }

    public void setConteudosConluidos(Set<Conteudo> conteudosConluidos) {
        this.conteudosConluidos = conteudosConluidos;
    }

    // Metodos Equals and HashCode para evitar que o Dev esteja matriculado no mesmo curso 2 vezes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(conteudosIncritos, dev.conteudosIncritos) && Objects.equals(conteudosConluidos, dev.conteudosConluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, conteudosIncritos, conteudosConluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", conteudosIncritos=" + conteudosIncritos +
                ", conteudosConluidos=" + conteudosConluidos +
                '}';
    }
}
