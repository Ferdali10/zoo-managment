package org.polymor;

public class Cat extends Animal{
    @Override
    public void talk() {
        System.out.println("Meow");
    }
    public void sratch(){
        System.out.println("scratch");
    }
    public void eat(){
        System.out.println("chat mange");
    }

    public static void courir(){
        System.out.println("cat run");
    }
}
