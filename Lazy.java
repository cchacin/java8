import java.util.*;

public class Lazy {

    private static final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

    public static boolean isEven(int n) {
        System.out.println("isEven: " + n);
        return n % 2 == 1;
    }

    public static int doubleIt(int n) {
        System.out.println("doubleIt: " + n);
        return n * 2;
    }

    public static boolean isGT5(int n) {
        System.out.println("isGT5: " + n);
        return n > 5;
    }

    public static void main(final String args[]) {

        // Take only a even numbers, double them and print
        // the first one greater than 5

        for (int n : numbers) {
            if(n % 2 == 1) {
                int n2 = n * 2;
                if (n2 > 5) {
                    System.out.println(n2);
                    break;
                }
            }
        }

        List<Integer> l1 = new ArrayList<>();
        for (int n : numbers) {
            if(isEven(n)) l1.add(n);
        }

        List<Integer> l2 = new ArrayList<>();
        for (int n : l1) {
            l2.add(doubleIt(n));
        }

        List<Integer> l3 = new ArrayList<>();
        for (int n : l2) {
            if(isGT5(n)) l3.add(n);
        }

        System.out.println(l3.get(0));
    }
}
