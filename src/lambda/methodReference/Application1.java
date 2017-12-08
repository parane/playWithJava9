package lambda.methodReference;

public class Application1 {
    //we need to operate add, substract, etc operation send as param


    public static  int add(int a, int b){
        return a+b;
    }



    public void testing(){
        System.out.println("-------APP1: DYNAMIC OPS------");
        Subtract subtract1=new Subtract();

        MathOperation add = Application1::add;  //(a, b) -> {return (a+b);}
        MathOperation subtract = subtract1::doSubtract;//FooClass::foo -> subtract1.doSubtract(a,b);
        MathOperation multiply = (a, b) -> a*b;

        DynamicOperationWithStaticMethod dynamicOperation = new DynamicOperationWithStaticMethod();

        int a= 10,b=5;
        System.out.println("Add a =      "+a+" b = " + b +" Ans="+ dynamicOperation.dynamicOp(a,b,add));
        System.out.println("subtract a = "+a+" b = " + b +" Ans="+ dynamicOperation.dynamicOp(a,b,subtract));
        System.out.println("multiply a = "+a+" b = " + b +" Ans="+ dynamicOperation.dynamicOp(a,b,multiply));
        System.out.println("-------------------------------");
    }
}

interface MathOperation{
    public int operate(int a, int b);
}

class DynamicOperationWithStaticMethod{

    public  int dynamicOp(int a,int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}

class Subtract {
    public   int doSubtract(int a, int b){
        return a-b;
    }
}