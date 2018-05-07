package com.me;

//step 7 challenge made this class
//step 8 challenge extends Dog
@SuppressWarnings("ALL")
public class Labrador extends Dog{

    //step 9 challenge constructor
    public Labrador(String name) {
        super(name);
    }

    //step 10 challenge copy the equals method from dog, change
    //references from dog to labrador
    //step 17 challenge comment out code
//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj){   //do that to compare object against itself
//            return true;
//        }
//        if(obj instanceof Labrador){
//            String objName = ((Labrador) obj).getName();
//            //return this.name.equals(objName); change to....
//            return this.getName().equals(objName);  //to get acces to line 10 when
//                                                    //the constructor was actualy called
//        }
//
//        return false;
//
//        //step 11 challenge create class DogMain
//
//    }

    //step 18 challenge back to dogmain to test results

}
