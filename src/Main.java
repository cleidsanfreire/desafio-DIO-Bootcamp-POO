import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Curso curso = new Curso("Java","POO",20);
        //Curso curso2 = new Curso("C#","POO",20);
        Curso curso3 = new Curso();
        curso3.setTitle("JS");
        curso3.setDescription("Curso de js");
        curso3.setCargaHoraria(25);

        //System.out.println(curso);
        //System.out.println(curso2);
        System.out.println(curso3);

        System.out.println("!!!!!!!!**********!!!!!!!!!");

        //Mentoria mentoria = new Mentoria("Mentoria de Java","Mentoria POO",LocalDate.now());
        //Mentoria mentoria2 = new Mentoria("Mentoria de C#","Mentoria POO",LocalDate.now());
        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitle("Mentoria de JS");
        mentoria3.setDescription("Mentoria de js");
        mentoria3.setDate(LocalDate.of(2024,9,15));

        //System.out.println(mentoria);
        //System.out.println(mentoria2);
        System.out.println(mentoria3);

        System.out.println("!!!!!!!!**********!!!!!!!!!");



    }
}