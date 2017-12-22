package j9.tryWithRes;

class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Created...");
    }
    public void  op1(){
        System.out.println("op1...");
    }
    public void close(){
        System.out.println("closing...");
    }
}
public class Main {
    public  static void main(String[] a){
        try(Resource resource=new Resource()){
            resource.op1();
        }catch (Exception e){

        }

        //if we injected from outside ??
        Resource resource1=new Resource();
        try(resource1){
            resource1.op1();
        }

        //but!!!!
        System.out.println("Object available after clean up also :("+resource1);

    }
}
