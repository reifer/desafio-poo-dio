package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;
//import lombok.ToString;

@Getter
@Setter
//@ToString
public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
//
//    public int getCargaHoraria() {
//        return cargaHoraria;
//    }
//
//    public void setCargaHoraria(int cargaHoraria) {
//        this.cargaHoraria = cargaHoraria;
//    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}