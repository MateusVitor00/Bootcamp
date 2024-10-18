import br.com.desafio.dominio.Bootcamp;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso2 = new Curso();
        curso2.setTitulo("POO2");
        curso2.setDescricao("Programação Orientada");
        curso2.setCargaHoraria(25);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("POO");
        mentoria1.setDescricao("Bootcamp Javascript");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Novo Bootcamp");
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev = new Dev();
        dev.setNome("Mateus Vitor");
        dev.inscreverBootcamp(bootcamp);
        dev.progedir();
        System.out.println("Conteudos concluidos" + dev.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + dev.getConteudosIncritos());

        Dev dev2 = new Dev();
        dev.setNome("Vitor");
        dev2.inscreverBootcamp(bootcamp);
        dev2.progedir();
        System.out.println("Conteudos concluidos" + dev.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + dev2.getConteudosIncritos());
        dev2.calcularTotalXp();



        /*
        System.out.println("---------------Cursos---------------------");
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println("-----------------Mentorias-----------------------");
        System.out.println(mentoria1);
        System.out.println(mentoria2);
*/
    }
}