package dummy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestingClass {

    static boolean isPrimeNum(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        List<Integer> numList =
                Arrays.asList(2, 3, 5, 8, 10, 13, 15, 20);

        List<Integer> evenList = numList.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddList = numList.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> primeList = numList.stream()
                .filter(TestingClass::isPrimeNum)
                .collect(Collectors.toList());

        List<Integer> divisibleBy5List = numList.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());



        System.out.println("Even:" + evenList);
        System.out.println("Odd:" + oddList);
        System.out.println("Prime:" + primeList);
        System.out.println("Divisible by 5:" + divisibleBy5List);

    }

}
