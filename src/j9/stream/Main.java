package j9.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public  static void main(String[] a){
       // test3();
        test4();
    }

    public static void test1(){
        List<Integer> numbers = Arrays.asList(11,2,21,34,5,56);

        //filter,limit,skip --->java 8 with some max value
        numbers.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("_____________________________");
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);


        System.out.println("_____________________________");
        //java 9 limit with condition dropWhile (continue),takeWhile(break) introduce

        numbers.stream()
                .takeWhile(e->e<34)
                .forEach(System.out::println);
        System.out.println("_____________________________");
        numbers.stream()
                .dropWhile(e->e<20) //skip it
                .forEach(System.out::println);
    }

    public static void test2(){
       //java8 Stream.iterate(0, i->i+1).forEach(System.out::println);

        //java 9
        IntStream.iterate(0,i->i<=5,i->i+2)
                .forEach(System.out::println);
    }

    public static void test3(){
        //java8 -optional in stream
        List<Integer> numbers = Arrays.asList(11,2,21,34,5,56);
        System.out.println(
               numbers.stream().filter(i->i>7000).findFirst().get()
        );

        //java 9
        //if u have empty collection , just return it not null

        numbers.stream()
                .filter(i->i>7000)
                .findFirst()
                .ifPresentOrElse(e -> System.out.println(e),()->System.out.println("nope"));


    }

    public static void test4(){
        List<Integer> numbers = Arrays.asList(11,2,21,34,5,56);
        System.out.println(numbers.getClass());
       // numbers.add(5); //immutable

        //customize list
        List<Integer> numbers1 = List.of(11,2,21,34,5,56);
        System.out.println(numbers1.getClass());
        numbers1.add(5);
        Set<Integer> numbers3 = Set.of(11,2,12);

        Map<String,Integer> map = Map.of("1",1,"2",2,"3",3);

    }

}
