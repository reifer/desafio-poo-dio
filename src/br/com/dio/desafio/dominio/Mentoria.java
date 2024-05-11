package br.com.dio.desafio.dominio;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@ToString
@Setter
@Getter
public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

//    @Override
//    public String toString() {
//        return "Mentoria{" +
//                "data=" + data +
//                '}';
//    }
}