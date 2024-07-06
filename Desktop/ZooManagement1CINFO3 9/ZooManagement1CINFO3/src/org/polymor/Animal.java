package org.polymor;

public class Animal {
    int age ;
    String nom;


    @Override
    public boolean equals(Object obj) {
        //1
        if(obj == null)return false;
        //2
        if(this == obj)return true;
        //3
        if(obj.getClass()==Animal.class){
            Animal a = (Animal) obj;
            return a.age==this.age&&a.nom.equals(this.nom);
        }
        return false;

    }

    public void talk(){
        System.out.println("je suis un animal");
    }

    public void eat(){
        System.out.println("Animal mange");

    }
    public static void courir(){
        System.out.println("animal run");
    }
}
