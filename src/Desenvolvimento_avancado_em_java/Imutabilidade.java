package Desenvolvimento_avancado_em_java;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[]args){
        int valor = 20;

        UnaryOperator<Integer> retornaDobro = v -> v * 2;
        System.out.println(retornaDobro.apply(valor));//RETORNA O DOBRO DO VALOR
        System.out.println(valor);//VALOR NÃO SERA ALTERADO
    }
}
