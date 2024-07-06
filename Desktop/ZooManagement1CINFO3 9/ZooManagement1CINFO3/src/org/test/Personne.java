package org.test;

public abstract class Personne {
    int cin;
    String nom ,prenom;

    public Personne(){
        System.out.println("Person created");
    }

    public Personne(int cin,String nom,String prenom){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
    }

    public  void appler(int numero){
        System.out.println("Appelle en cours de"+numero);
    }


    public abstract void afficherVancances();



}
