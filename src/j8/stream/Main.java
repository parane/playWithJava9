package j8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static  void main(String[] a){
        playWithStream();
    }

    public static void playWithStream(){
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //filter below 3, and double it and sum up !!!
        System.out.println(sequentialStream
                .filter(i -> i<3)
                .map(i->i*2)
               /* .forEach(System.out::println)*/
                .reduce(0,(sum,i)->sum+i));

    }
}
