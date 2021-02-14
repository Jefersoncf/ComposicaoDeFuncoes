package Desenvolvimento_avancado_em_java;

import java.util.HashMap;
import java.util.Map;

public class FatorialMrmoization {
    static Map<Integer, Integer> MAP_FATORIAL = new HashMap<>();
    public static void main(String[]args) {
        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        long F = System.nanoTime();
        System.out.println("FATORIAL 1: " + (F - I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        F = System.nanoTime();
        System.out.println("FATORIAL 2: " + (F - I));
    }

    public static Integer fatorialComMemoization(Integer value){
        if (value ==1){
            return value;
        }
        else{
            if (MAP_FATORIAL.containsKey(value)){
                return MAP_FATORIAL.get(value);
            }
            else{
                Integer resultado = value * fatorialComMemoization(value-1);
                MAP_FATORIAL.put(value, resultado);
                return  resultado;
            }
        }
    }
}
