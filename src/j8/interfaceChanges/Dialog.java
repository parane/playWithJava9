package j8.interfaceChanges;

public class Dialog implements Sim, Sim5G{
    @Override
    public void call() {
        //dialog call
    }
    //Dialog won't compile without having it's own internet5g() implementation
    //actually it will be decide which protocol
    public void internet5g(){
        //hurray !!! this is dialog version of 5g
    }

    //can not override static
}
