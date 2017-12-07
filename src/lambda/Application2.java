package lambda;

import lambda.extra.State;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application2 {

    public void testing() {
        System.out.println("-------APP2: DYNAMIC OPS------");
        State s1=new State("bbb");
        State s2=new State("aaa");
        List<State> states=new ArrayList<>(){{add(s1);add(s2);}};

        System.out.println("Before Sort :"+states);
        states.sort(( o1,  o2) -> {return o1.getStateName().compareTo(o2.getStateName());});
        System.out.println("After Sort :"+states);


        //
        List<String> stringList=new ArrayList<String>(){{add("bbb");
            add("ccc");
        add("aaa");}};

        //String is implemented Comparable (method compareTo(S s)). so sorting is possible
        Collections.sort(stringList);
        System.out.println("After Sort :"+stringList);
        //Comparator(method compare(S s1,S s2)) allow more flexible
        Collections.sort(stringList,(str1,str2)->{
            return str2.compareTo(str1);
        });

        System.out.println("After Reverse Sort using comparator :"+stringList);
        System.out.println("-------------------------------");
    }
}
