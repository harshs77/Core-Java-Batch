// class A{//normal class convert parent class
//     void show1(){
//         System.out.println("A class method");

//     }
// }
// class B{//normal class convert child class convert parameter
//     void show2(){
//         System.out.println("B class method");

//     }
// }

// class C{ // normal class convert child
//     void show3(){
//         System.out.println("C class method");
//     }
    
//     }
    
//     public class MultilevelBasic1 {
//     public static void main(String[] args) {
//         C k = new C();
//         k.show1();
//     k.show2();
//     k.show3();

// }
    
// }


class A { 
    void show1() {
        System.out.println("A class method");
    }
}

class B extends A { 
    void show2() {
        System.out.println("B class method");
    }
}

class C extends B { 
    void show3() {
        System.out.println("C class method");
    }
}

public class MultilevelBasic1 {
    public static void main(String[] args) {
        C k = new C(); 
        k.show1(); 
        k.show2(); 
        k.show3(); 
    }
}
