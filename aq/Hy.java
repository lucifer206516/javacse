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

public class Hy {
    public static void main(String[] args) {
        Third thirdObj = new Third();
        thirdObj.helper();
        
        Child childObj = new Child();
        childObj.display();
    }
}
