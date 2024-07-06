package tn.esprit.zoomanegment.entities;

public interface Omnivore<T> extends Carnivore<T> , Herbivore<T>{
    void eatPlantandMeat(T food);


}
