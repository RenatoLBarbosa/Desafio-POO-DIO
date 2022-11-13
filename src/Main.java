import br.dio.desafio.dominio.Bootcamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao cuso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao cuso javascript");
        curso2.setCargahoraria(8);

    //    System.out.println(curso1);
    //    System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

    //    System.out.println(mentoria1);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java dev");
        bootcamp.setDescricao("Descricao bootcamp java dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Renato");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+dev.getNome() + " :" + dev.getConteudosIncritos());
        dev.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos "+dev.getNome() + " :" + dev.getConteudosIncritos());
        System.out.println("Conteúdos concluídos "+dev.getNome() + " :" + dev.getConteudosConcluidos());
        System.out.println("XP :" +dev.calculartotalXP());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos concluídos "+dev.getNome() + " :" + dev.getConteudosConcluidos());
        System.out.println("XP :" +dev.calculartotalXP());

        System.out.println("***********************");

        Dev dev2 = new Dev();
        dev2.setNome("Bruno");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos "+dev2.getNome() + " :" + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos "+dev2.getNome() + " :" + dev2.getConteudosIncritos());
        System.out.println("Conteúdos concluídos "+dev2.getNome() + " :" + dev2.getConteudosConcluidos());
        System.out.println("XP :" +dev2.calculartotalXP());


    }
}