package java_practice;

public class PracticeJava {

    public PracticeJava(){
        System.out.println("Hey constructor");
    }

    static PracticeJava t;

    public static void main(String[] args) {
        System.out.println("Hello world!");

        new PracticeJava();
        System.out.println(t);
    }
}