Method reference is used to refer method of functional interface.
Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference

There are following types of method references in java:
    >Reference to a static method.
    >Reference to an instance method.
    >Reference to a constructor.

Method Reference, passing the param through to function.
p->F()->p'
Dont forget Those different :
map(e-> String.valueOf(e))  = map(String::valueOf)
map(e->e.toString()) =  ??? param as target ---map(Integer::toString)

Dont do method reference :
 if u do any manuplation to data.