
import java.util.Scanner;

interface Calculator {

    public void mul();

    public void div();
}

class MyCalculator1 implements Calculator {

    int a, b, c;

    @Override
    public void mul() {
        a = 100;
        b = 50;
        c = a * b;
        System.out.println(c);
    }

    @Override
    public void div() {
        a = 100;
        b = 50;
        c = a / b;
        System.out.println(c);
    }
}

class MyCalculator2 implements Calculator {

    int a, b, c;

    @Override
    public void mul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        a = scan.nextInt();
        System.out.println("Enter Second Number");
        b = scan.nextInt();
        c = a * b;
        System.out.println(c);
    }

    @Override
    public void div() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First number");
        a = scan.nextInt();
        System.out.println("Enter Second Number");
        b = scan.nextInt();
        c = a / b;
        System.out.println(c);
    }
}

class MyCalculator3 implements Calculator {

    int a, b, c;

    @Override
    public void mul() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = scan.nextInt();
        System.out.println("Enter the second Number");
        b = scan.nextInt();
        if (a != 0 && b != 0) {
            c = a * b;
            System.out.println(c);
        } else {
            System.out.println("Invalid Input");
        }
    }

    public void div() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First Number");
        a = scan.nextInt();
        System.out.println("Enter the second Number");
        b = scan.nextInt();
        if (b != 0) {
            c = a / b;
            System.out.println(c);
        } else {
            System.out.println("Invalid Input");
        }
    }
}

class Scientist {

    public void permit(Calculator ref) {
        ref.mul();
        ref.div();
    }
}

public class Interfaces1 {

    public static void main(String[] args) {
        MyCalculator1 C1 = new MyCalculator1();
        MyCalculator2 C2 = new MyCalculator2();
        MyCalculator3 C3 = new MyCalculator3();

        Scientist s = new Scientist();
        s.permit(C1);
        s.permit(C2);
        s.permit(C3);

    }
}
