package j8.stream.example1;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public class Main {

    public static  void main(String[] a){
        playWithStream2();
        playWithStream();
        playWithStream1();
        playWithStream3();
    }

    public static void playWithStream(){

        List<Author> authors = new ArrayList<>(){{
            add(new Author("Para",20));
            add(new Author("Para2",30));
            add(new Author("Para3",40));
            add(new Author("Para4",50));
        }};

        //Get the unique surnames in uppercase of the first(by age) 3 book authors that are 30 years old or older.

        List newList = authors.stream().
                filter(s -> s.getAge()>10)
                .sorted((s1,s2)-> s2.getAge().compareTo(s1.getAge()))
                .map(Author::getSurnames)
                .map(String::toUpperCase)
                .distinct()
                .limit(3)
                .collect(toList());

        newList.stream().forEach(System.out::println);

    }

    public static void playWithStream1(){
        List<Author> authors = new ArrayList<>(){{
            add(new Author("Para",20));
            add(new Author("Para2",30));
            add(new Author("Para3",40));
            add(new Author("Para4",50));
       /*     add(new Author("Para4",50));*/
        }};

        //converted this list to map with key as name+age

        Map<String,Author> map= authors.stream().collect(toMap(e->e.getSurnames()+"-"+e.getAge(),e->e));
        System.out.println(map.size());
    }

    public static void playWithStream2(){

        //how stream works in Venkat
        List<Integer> number = Arrays.asList(1,2,5,7,6,8,10);


        System.out.println(number.stream()
                .filter(e->{System.out.println("GR3 "+e);return e>3;})
                .filter(e->{System.out.println("EVN "+e);return e%2==0;})
                .map(e->{System.out.println("DOU  "+e);return e*2;})
                .findFirst());

    }

    public static void playWithStream3(){

        //infinte loop

        System.out.println();
        Stream.iterate(100,i->i+1)
                .filter(e->{System.out.println("GR3 "+e);return e>3;})
                .filter(e->{System.out.println("EVN "+e);return e%2==0;})
                .map(e->{System.out.println("DOU  "+e);return e*2;})
                .limit(10)
                .forEach(System.out::println);


    }

}
