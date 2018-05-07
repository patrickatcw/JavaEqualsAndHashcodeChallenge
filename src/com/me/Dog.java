package com.me;

//step 2 challenge, make dog class
@SuppressWarnings("ALL")
public class Dog {

    //step 3 challenge field, and make final
    private final String name;

    //step 4 challenge constructor
    public Dog(String name) {
        this.name = name;
    }

    //step 5 challenge getter
    public String getName() {
        return name;
    }

    //step 6 challenge override
    @Override
    //public boolean equals(Object obj) {
        //step 19 challenge change to final to ensure can't be overwritten...
        //step 20 challenge back to labrador class cant use override if we uncommented
        //steo 21 to dogmain to test by running...
    public final boolean equals(Object obj) {
        //return super.equals(obj);   //instead, do....
        if(this == obj){   //do that to compare object against itself
            return true;
        }
        if(obj instanceof Dog){
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;

        //now for step 7 challenge create labrador class

    }
}
