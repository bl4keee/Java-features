package Lambdas;

public class Greeter {

    public static <MyLambda> void main(String[] args) {

        Lambdas.MyLambda myLambdaFunction = () -> System.out.println("Hello World!");

    }
}

interface MyLambda {
    void foo();
}

