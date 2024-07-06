package org.test;

public class Etudiant extends Personne{


    String niveau;

    public Etudiant(){

       //super();
        System.out.println("student created");
    }

    public Etudiant(int cin,String nom , String prenom , String niveau){
        super(cin, nom, prenom);

        this.niveau=niveau;

    }

    public float calculerMoyenne(int x,int y ){
        return x+y/2;
    }

    public float calculerMoyenne(int x, int y , int z){
        return x+y+z/3;
    }


    public void appler(int x){

    }

    @Override
    public void afficherVancances() {

    }

}
