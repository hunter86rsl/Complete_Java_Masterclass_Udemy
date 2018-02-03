package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5;
	    //float myFloatValue = 5;
        //float myFloatValue2 = 5.2;  // error
	    //float myFloatValue3 = (float) 5.2;  //not recommended
	    float myFloatValue = 5f;  //recommended
        double myDoubleValue = 5d;


        myIntValue = 5;
        myFloatValue = 5f;
        myDoubleValue = 5d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //myIntValue = 5
        //myFloatValue = 5.0
        //myDoubleValue = 5.0
        //==================

        myIntValue = 5;
        myFloatValue = 5f/2;
        myDoubleValue = 5d/2;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //myIntValue = 5
        //myFloatValue = 2.5
        //myDoubleValue = 2.5
        //==================

        myIntValue = 5;
        myFloatValue = 5f/3;
        myDoubleValue = 5d/3;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //myIntValue = 5
        //myFloatValue = 1.6666666
        //myDoubleValue = 1.6666666666666667
        //==================

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);

        double pi = 3_000_000.141_592_7d;
    }
}
