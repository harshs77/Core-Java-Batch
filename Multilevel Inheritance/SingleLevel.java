class A{
    protected int a = 9;
}

class B extends A{
    void show(){
        System.out.println(a);
    }

    public void show1() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'show1'");
    }
}

public class SingleLevel {
public static void main(String[] args) {
    B p = new B();
    p.show();
}
    
}