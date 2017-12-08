package lambda.functionComposition;

import java.util.function.Function;

public class Main {

    /*pipeline function

     */
    static Function<Integer, Integer> times2 = e -> e * 2;

    static Function<Integer, Integer> squared = e -> e * e;
    public static  void main(String[] a) {
        times2.compose(squared).apply(4);
// Returns 32

        times2.andThen(squared).apply(4);
// Returns 64
    }
}
