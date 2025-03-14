class Parent {
    public void add() {
        System.out.println("HELLO WORLD");
    }
}

class Child extends Parent {
    void display() {
        add();
    }
}

class Third extends Child {
    void helper() {
        display();
    }
}

public class a{
    public static void main(String[] args) {
        Third obj1 = new Third();
        obj1.helper();
        
        Child obj2 = new Child();
        obj2.display();
    }
}
