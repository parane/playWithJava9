package lambda.methodReference;

import lambda.Application1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //::
    public static  void main(String[] a){
        List<String> items = new ArrayList<>(){{add("A");add("B");add("C");}};

        //method reference
        //They can only be used to replace a single-method lambda expression.
        items.forEach(System.out::println);

        new Application1().testing();

    }

}
