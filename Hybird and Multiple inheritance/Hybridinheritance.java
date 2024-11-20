class A{
    void show1(){
        System.out.println("A class");
    }
}

class B extends A{
    void show2(){
        System.out.println("C class");
    }
}

class C extends A{
    void show3(){
        System.out.println("C class");
    }
}

class D{
    void show4(){
        System.out.println("D class");
    }
}



public class Hybridinheritance {
    public static void main(String[] args) {
    
        A p = new A();
        p.show1();

        B q = new B();
        q.show1();
        q.show2();
        
C r = new C();
r.show1();
r.show3();

D s = new D();
s.show4();




    }


}
