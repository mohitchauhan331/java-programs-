public class calcirunner{
    public static void main(String args[]){
        Calci calciobject =new Calci();
        
        calciobject.sum();
        calciobject.sub();
    }
    }
    class Calci {
    public static void sum(){
        System.out.println("welcome to the sum function .");
    }
    public void sub (){
        System.out.println("welcome to the sub function .");
    }
}