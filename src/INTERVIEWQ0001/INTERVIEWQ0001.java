package INTERVIEWQ0001;

import java.util.List;
import java.util.stream.IntStream;

public class INTERVIEWQ0001 {

    public static boolean isPrime(int n){
        if(n<2) return false;

        return IntStream.rangeClosed(2,(int) Math.sqrt(n)).noneMatch(i-> n%i==0);
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(2, 3, 5, 8, 10, 13, 15, 20);

        List<Integer> evenList = list.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println("EvenList: " + evenList);

        List<Integer> oddList = list.stream()
                .filter(x -> x % 2 != 0)
                .toList();

        System.out.println("OddList: " + oddList);

        List<Integer> primeList = list.stream()
                .filter(INTERVIEWQ0001::isPrime)
                .toList();

        System.out.println("PrimeList: " + primeList);

        List<Integer> divisbleBy5 = list.stream()
                .filter(x -> x % 5 == 0)
                .toList();

        System.out.println("DivisbleBy5: " + divisbleBy5);

    }
}
