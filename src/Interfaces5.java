interface Calculator21{
    public void mul();
    public void div();
}

class MyCalculator12 implements Calculator21{
    int a,b,c;
    @Override
    public void mul(){
        a = 10;
        b = 20; 
        c = a * b ;
        System.out.println(c);
    }
    @Override
    public void div(){
        a = 1000;
        b = 20; 
        c = a/b ;
        System.out.println(c);
    }
    
    public void add(){
        a = 10;
        b = 20; 
        c = a + b ;
        System.out.println(c);
    }

    
}
public class Interfaces5 {
    public static void main(String[] args){
        MyCalculator12 C122;
        C122 = new MyCalculator12();
        Calculator21 ref;
        ref = C122;
        ref.mul();
        ref.div();
        
        ((MyCalculator12)(ref)).add();    //DOWNCASTING OF SPECIALIZED METHODS
    }
}
