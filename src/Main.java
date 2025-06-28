import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Cursi js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java Developer");
        bootcamp.setDescricao("Descrição: Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: "+ devLucas.calcularTotalXp());
        System.out.println("------------");

        Dev devBoris = new Dev();
        devBoris.setNome("Boris");
        devBoris.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Boris: " + devBoris.getConteudosInscritos());
        devBoris.progredir();
        devBoris.progredir();
        devBoris.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Boris: " + devBoris.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Boris: " + devBoris.getConteudosConcluidos());
        System.out.println("XP: "+ devBoris.calcularTotalXp());

    }
}
