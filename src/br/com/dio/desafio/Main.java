package br.com.dio.desafio;


import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de Java Bootcamp Santander juntamente com a plataforma DIO.");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Curso de Python Bootcamp Vivo juntamente com a plataforma DIO.");
        curso2.setCargaHoraria(100);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Bootcamp Java");
        mentoria.setDescricao("Mentoria disponibilizada para alunos inscritos no Bootcamp Santander 2023");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devReinaldo = new Dev();
        devReinaldo.setNome("Reinaldo");
        devReinaldo.inscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Reinaldo" + devReinaldo.getConteudosInscritos());
        devReinaldo.progredir();
        System.out.println("Conteúdos Inscritos de Reinaldo" + devReinaldo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Reinaldo" + devReinaldo.getConteudosConcluidos());
        System.out.println("XP: " + devReinaldo.calcularXpTotal());

        System.out.println("-------");

        Dev devJunior = new Dev();
        devJunior.setNome("Junior");
        devJunior.inscreverBootcamp(bootcamp);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Junior" + devJunior.getConteudosInscritos());
        devJunior.progredir();
        System.out.println("Conteúdos Inscritos de Junior" + devJunior.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Junior" + devJunior.getConteudosConcluidos());
        System.out.println("XP: " + devJunior.calcularXpTotal());
    }
}