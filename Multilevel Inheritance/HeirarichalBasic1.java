class A{
    void show1(){
        System.out.println("A class");
    }
}

class B extends A{
    void show2(){
        System.out.println("B class");
    }
}

class C extends A{
    void show3(){
        System.out.println("C class");
    }
}


public class HeirarichalBasic1 {
public static void main(String[] args) {
    B p = new B();
    p.show1();
    p.show2();
    C k = new C();
    k.show1();
    k.show3();
}
    
}