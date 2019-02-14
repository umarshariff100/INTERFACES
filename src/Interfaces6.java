interface Calculator22{            
    public void mul();
    public void div();
}

interface Calculator331{
    public void mul();
    public void sub1();
}


class MyCalculator13 implements Calculator22,Calculator331{     //A CLASS CAN HAVE MULTIPLE INTREFACES//
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
    
    public void sub1(){
        a = 100;
        b = 20; 
        c = a - b ;
        System.out.println(c);
    }

   
}
public class Interfaces6{
    public static void main(String[] args){
        MyCalculator13 C13;
        C13 = new MyCalculator13();
        C13.add();
        C13.mul();
        C13.div();
        C13.sub1();
    }
}
