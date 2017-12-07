package lambda.methodReference;

public class Application1 {
    //we need to operate add, substract, etc operation send as param


    public void testing(){
        System.out.println("-------APP1: DYNAMIC OPS------");
        MathOperation add = (int a, int b) -> {return a+b;};
        MathOperation subtract = (a, b) -> {return (a-b);};
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

    public static int dynamicOp(int a,int b, MathOperation mathOperation){
        return mathOperation.operate(a,b);
    }
}