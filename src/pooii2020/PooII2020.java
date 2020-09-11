package pooii2020;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ghelfer
 */
public class PooII2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        exercicio1();
        exercicio2();
    }

    private static void exercicio1() {
        List lista = new ArrayList();
        lista.add(1);
        lista.add(2.0);
        lista.add(3.0f);
        lista.add(4);
        lista.add(5);

        int sumInt = 0;
        int count = 0;
        float sumFloat = 0;
        double sumDouble = 0;
        for (Object i : lista) {
            if (i instanceof Integer) {
                sumInt += (int) i;
            } else {
                if (i instanceof Double) {
                    sumFloat += (double) i;
                    count++;
                } else {
                    if (i instanceof Float) {
                        sumFloat += (float) i;
                        count++;
                    }
                }
            }
            sumDouble += Double.parseDouble(i.toString());
        }
        System.out.println("sumInt=" + sumInt);
        System.out.println("media ponto flutuante=" + sumFloat / count);
        System.out.println("sumDouble=" + sumDouble);
    }

    private static void exercicio2() {
        double x = 0;
        double y = 0;
        String s = "";
        while(x < 1) {
            y = x*x + 2*Math.sin((Math.PI + x)/(Math.pow(x, 3))) + 1;
            s += (x + " " + y + "\n");            
            x +=0.001;
        }
        System.out.println(s.replace(".",","));
    }

}
