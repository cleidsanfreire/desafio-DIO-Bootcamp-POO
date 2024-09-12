import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitle("Java");
        curso.setDescription("Java Basico");
        curso.setCargaHoraria(60);

        Curso curso1 = new Curso();
        curso1.setTitle("C#");
        curso1.setDescription("C# Basic");
        curso1.setCargaHoraria(65);

        Mentoria mentoria = new Mentoria(LocalDate.of(2024,9,15));
        mentoria.setTitle("Collections Java");
        mentoria.setDescription("Aprendendo Collections com Java");

        Bootcamp bootcamp = new Bootcamp("Intensivo", "Aprendendo Java Com C#");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

//        Dev devEu = new Dev("Freire");
//        devEu.inscreverBootcamp(bootcamp);
//
//        System.out.println(devEu.getConteudosIncritos());

        Dev dev2 = new Dev("Freire");
        dev2.inscreverCursos(curso);
        dev2.inscreverCursos(curso1);
        dev2.inscreverMentoria(mentoria);
        dev2.inscreverBootcamp(bootcamp); // Verificando se ao se inscrever no bootcamp repetiria todos os cursos novamente
        dev2.progredir();
        System.out.println("O Dev " + dev2.getName() + " Esta inscrito no Curso: " + dev2.getConteudosIncritos() + " Cursos Conluidos" + dev2.getConteudosConluidos() + " Seu XP: " + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();
        System.out.println("O Dev " + dev2.getName() + " Esta inscrito no Curso: " + dev2.getConteudosIncritos() + " Cursos Conluidos" + dev2.getConteudosConluidos() + " Seu XP: " + dev2.calcularTotalXp());

    }
}