import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;
    public static void main(String[] args) {
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        //Вводим переменные в целых числах int
        if (X < A)
            //Проверяем принадлежит ли 1 промежутку (-inf;A), если да, выводим на экран
            out.println(1);
        else
            if (X > A && X < B)
            //Проверяем принадлежит ли 2 промежутку (A;B), если да, выводим на экран
            out.println(2);
            else
                if (X > B && X < C)
            //Проверяем принадлежит ли 3 промежутку (B;C), если да, выводим на экран
                    out.println(3);
                else
                    if (X > C && X < D)
            //Проверяем принадлежит ли 4 промежутку (C;D), если да, выводим на экран
                        out.println(4);
                    else
            //Если принадлежит (D;+inf), выводим на экран, что принадлежит 5 промежутку
                        if (X > D)
                            out.println(5);
                        else
            //Если не подходит под предыдущие условия, значит число X равно одному из чисел A,B,C,D, тогда выводим,
            //что противоречит условию ("Contradicts the condition")
                            out.println("Contradicts the condition");


    }
}
