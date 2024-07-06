package org.test;

public class B extends A{
    int y ;
    public B(int x,int y){
        //super();
        this.x=x;
        this.y=y;
    }

    @Override
    public void meth1(int x) {
        System.out.println("from B "+x);
    }
}
