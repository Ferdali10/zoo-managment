package org.polymor;

public class Dog extends Animal{
    @Override
    public void talk() {
        System.out.println("oueuf");
    }
    public void attack(){
        System.out.println("j'attaque");
    }

}
