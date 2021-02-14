package Desenvolvimento_avancado_em_java;

import java.util.function.BiPredicate;

public class FuncoesPuras {
    public static void main(String[]args){
        BiPredicate<Integer, Integer> VerificaSeEMais =
                (parametro, valorComparacao) -> parametro > valorComparacao;

        System.out.println(VerificaSeEMais.test(13, 12));
        System.out.println(VerificaSeEMais.test(13, 12));
    }
}
