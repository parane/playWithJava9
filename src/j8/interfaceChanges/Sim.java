package j8.interfaceChanges;

public interface Sim {

    //old tech, every vendor should give
    void call();

    //introduce new without effect vendor.
    default public void internet5g(){
        //internet 5g protocol
        helper5gPrototcol();
    }
    //Java interface static method is visible to interface methods only,
    static void helper5gPrototcol(){
        System.out.println("This is for interface usages,not for override ");
    }

    //java 9 --> private method also support for reusable component go here
    private int helper(){
        return 1;
    }

}
