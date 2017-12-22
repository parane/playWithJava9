package j9.completableFuture;

import java.util.concurrent.*;

public class Main {

    public static  int factory(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 42;
        }
        return 42;
    }

    public  static void main(String[] a){
        CompletableFuture<Void> i= CompletableFuture.supplyAsync(Main::factory)
        .thenAccept(System.out::println);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
