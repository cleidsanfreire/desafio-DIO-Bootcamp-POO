package br.com.desafio.dominio;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){}

    public void progredir(){}

    public void calcularTotalXp(){}

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
}
