package com.me;

//step 11 challenge create class DogMain
public class DogMain {

    //step 12 challenge create main method so we can run it;
    public static void main(String[] args) {

        //step 13 challenge instance for new labrador
        // for object rover
        Labrador rover = new Labrador("Rover"); //is the labrador

        //step 14 challenge instance for new dog
        // for object rover2
        Dog rover2 = new Dog("Rover");   //is the dog

        //step 15 challenge, next step comparison
        System.out.println(rover2.equals(rover));//does rover2 = rover
        System.out.println(rover.equals(rover2));//does rover = rover2

        //step 16 challenge run...
        //result;
        //true
        //false
        //meaning;
        //it is true that rover2 = rover
        //it is false that rover = rover2
        //so what is happening here is that labrador is an instance of dog
        //dog is not an instance of labrador, so the second test returns false

        //so the best way to fix this is to not override the equals method
        //in labrador, step 17 challenge to labrador

    }

    //step 18 challenge run to test...
    //results;
    //true
    //true
    //because we are not overriding that equals it is now set to true in both
    //cases how ever the question is phrased


    //now to ensure that equals can't be overwritten in sub-classes of dog
    //go back to dogclass and make the override equals method final
    //step 19 challenge in dogclass

}

//step 20 challenge run again to make sure we are good....true true!
