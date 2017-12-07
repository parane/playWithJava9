package j8.stream.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static  void main(String[] a){
        System.out.println("-------FOREACH EXPRESSION------");
        java7();
        java8();
    }

    public static void java7(){
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");

        for(String item : items){

            System.out.println(item);
           // items.remove(item);
        }
        System.out.println("------------------------------");
        //using iterator design pattern
        //beware of We might get ConcurrentModificationException if iterator is not used properly.

        Iterator<String> iterator = items.iterator();
        //active iterator. so we have handled the iteration
        while (iterator.hasNext()){
            String item= iterator.next();
            System.out.println(item);
            iterator.remove();
        }


        System.out.println("------------------------------"+items.size());
    }

    public static  void java8(){
        List<String> items = new ArrayList<>(){{add("A");add("B");add("C");}};
        //passive iterator. so iterator itself handle order element print
        //polymorphic implement, so implement decided differently like parallel, sequencital or laziness
        items.forEach(new Consumer<String>() {

            public void accept(String t) {
                System.out.println(t);

            }

        });
        System.out.println("------------------------------");
        //plz refer lambda before it.single param ,no paranthesis
        items.forEach(item ->{System.out.println(item);
           // items.remove(item);
        });

    }
}
