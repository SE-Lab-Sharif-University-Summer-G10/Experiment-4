import java.util.ArrayList;
import java.util.Scanner;

public class JavaCup {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press number1: ");
        int i = scanner.nextInt();
        System.out.println("Press number2: ");
        int j = scanner.nextInt();
        System.out.println("Press number3: ");
        int k = scanner.nextInt();
        temp();
        eval(i, j, k);
    }
    public static void eval(int i, int j, int k)
    {
        if (i * i + j * j == k * k || i * i == j * j + k * k || j * j == i * i + k * k)
        {
            System.out.println("YES");
        }
        else { System.out.println("NO"); }
    }

//    public static void temp() {
//        ArrayList a = new ArrayList();
//        for (int i = 0; i < 10000; i++)
//        {
//            for (int j = 0; j < 2000; j++) {
//                a.add(i + j);
//            }
//        }
//    }
//
    public static void temp() {
        int size1 = 10000;
        int size2 = 2000;
        ArrayList<Integer> a = new ArrayList<>();
        a.ensureCapacity(size1 * size2);
        for (int i = 0; i < size1; i++)
        {
            for (int j = 0; j < size2; j++) {
                a.add(i + j);
            }
        }
    }
}
