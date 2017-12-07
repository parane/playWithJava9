package lambda;

import lambda.extra.State;

public class Main {

    //()->{}
    public static  void main(String[] a){
        System.out.println("-------LAMBDA EXPRESSION------");
        new Application1().testing();
        new Application2().testing();
    }


    /*
       intro
     */
    public static void java7(){
        StateOwner stateOwner = new StateOwner();

        //Before java 8, anonymous interface implementations.
        stateOwner.addStateListener(new StateChangeListener() {
            @Override
            public void onStateChange(State oldState, State newState) {
                System.out.println("State changed");
            }
        });
    }

    public static  void java8(){
        StateOwner stateOwner = new StateOwner();
        //lambda param & return type must fit functional(only one method) interface method
        stateOwner.addStateListener((State oldState, State newState)->  System.out.println("State changed"));
    }

    public static  void java8LambdaWithoutParamType(){
        StateOwner stateOwner = new StateOwner();
        //lambda param & return type must fit functional(only one method) interface method
        stateOwner.addStateListener((oldState,newState)->  System.out.println("State changed"));
    }
    public static  void java8LambdaWithFunctionBody(){
        StateOwner stateOwner = new StateOwner();
        //lambda param & return type must fit functional(only one method) interface method
        stateOwner.addStateListener((oldState,newState)->
        {
            System.out.println("State changed");
            System.out.println("State");

        });
    }
}
