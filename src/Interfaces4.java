interface Calculator33{
    public void mul();
    public void div();
}

abstract class MyCalculator implements Calculator{  //MyCalculator is abstract; cannot be instantiated
    int a;
    int b;
    int c;
    @Override
    public void mul(){
        a = 10;
        b = 20;
        c = a*b;
        System.out.println(c);
    }
}



public class Interfaces4 {
    public static void main(String[] args){
        MyCalculator C;//= new MyCalculator();
        
       
    }
    
}
