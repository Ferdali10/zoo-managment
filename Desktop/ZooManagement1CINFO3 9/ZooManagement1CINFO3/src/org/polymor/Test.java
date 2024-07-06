package org.polymor;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.talk();
        cat.talk();


        System.out.println("***************");
        Animal[] animals=new Animal[2];
        animals[0]=dog;
        animals[1]=cat;

        for(int i=0;i<animals.length;i++){
            if(animals[i] instanceof Dog){
                ((Dog)animals[i]).attack();
            } else{
                System.out.println("c'est pas un chien");
            }

        }

        System.out.println("test static method");
        for(int i=0;i<animals.length;i++){
            if (animals[i] instanceof Cat) {
                ((Cat) animals[i]).courir();
            }
            else {
                animals[i].courir();
            }
        }


        System.out.println("-----------------");




        Animal a = new Animal();
        a.nom="siamoi";
        a.age=2;

        Animal a2 = new Animal();
        a2.nom="siamoi";
        a2.age=2;


        System.out.println(a.equals(a));


    }
}
