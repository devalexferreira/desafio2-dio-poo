import br.dev.alex.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlex = new Dev();
        devAlex.setNome("Alex");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devAlex.getConteudosInscritos());
        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devAlex.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devAlex.getConteudosConcluidos());
        System.out.println("XP:"+devAlex.calcularTotalXp());
        System.out.println("-----------");
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP:"+devCamila.calcularTotalXp());
    }
}