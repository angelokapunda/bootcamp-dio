import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Bootcamp Java");
        curso1.setCaraHoraria(120);


        Curso curso2 = new Curso();
        curso2.setTitulo("Javascrip");
        curso2.setDescricao("Curso de  Javascript");
        curso2.setCaraHoraria(8);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre a linguagem de programção Java");
        mentoria.setData(LocalDate.now());



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJr = new Dev();
        devJr.setNome("Angelo");
        devJr.inscreverBootcaamp(bootcamp);
        System.out.println("Conteúdos Inscritos dev Angelo" + devJr.getConteudosInscritos());
        devJr.progredir();
        System.out.println("#########################################################################################");
        System.out.println("Conteúdos Inscritos dev Angelo" + devJr.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos dev Angelo" + devJr.getConteudosConcluidos());
        System.out.println("XP : " + devJr.calaculaTotaXp());


        System.out.println("*---------------------------------------*--------------------------------------------*");
        Dev devPl = new Dev();
        devPl.setNome("Carlos");
        devPl.inscreverBootcaamp(bootcamp);
        System.out.println("Conteúdos Inscritos dev Carlos" + devPl.getConteudosInscritos());
        devPl.progredir();
        devPl.progredir();
        System.out.println("#########################################################################################");
        System.out.println("Conteúdos Inscritos dev Carlos" + devPl.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos dev Carlos" + devPl.getConteudosConcluidos());
        System.out.println("XP : " + devPl.calaculaTotaXp());


        System.out.println("*---------------------------------------*--------------------------------------------*");
        Dev devSr = new Dev();
        devSr.setNome("Kapunda");
        devSr.inscreverBootcaamp(bootcamp);
        System.out.println("Conteúdos Inscritos dev Carlos" + devSr.getConteudosInscritos());
        devSr.progredir();
        devSr.progredir();
        devSr.progredir();
        System.out.println("#########################################################################################");
        System.out.println("Conteúdos Inscritos dev Kapunda" + devPl.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos dev Kapunda" + devPl.getConteudosConcluidos());
        System.out.println("XP : " + devSr.calaculaTotaXp());
    }
}