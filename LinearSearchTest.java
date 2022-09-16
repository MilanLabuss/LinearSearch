import java.sql.Array;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;


//this class will use a linear search of 20 random numbers contained in an array range[1-100]
//to learn if it contains a number the user entered and will display its position in the array
//Author: Milan Labus
//Date: 10/Nov/2021

 class LinearSearchTest {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random generator = new Random();


         int[] intArray = new int[MAX_SIZE];             //creating an array with a fixed size in Java


         for(int i=0;i<MAX_SIZE;i++) {
             intArray[i] = generator.nextInt(100)+1; //looping 20 times and setting random numbers with bound 100
         }

         System.out.println(Arrays.toString(intArray)); //displaying the array


         //getting user input with -1 termination the program
         //after the input it will perform a Linear search by calling the method
         int number=0;
        do {
            System.out.println("Please enter a number between 0-100");
            number = input.nextInt();
            System.out.println( linearSearch(intArray, number));
        }
         while(number!=-1 ); {                                       //while the input isn't -1

         }
     }

//this method takes an array and a search key as its parameter
//and performs a Linear search
 private static int linearSearch(int[] data, int searchKey)
 {
            for(int i=0;i<data.length;i++){         //looping through the entire array
                if(data[i]==searchKey){         //if the search key is found in the array we return it
                    System.out.print("Found at index: ");
                    return i;                       //returning the position it was found at
                }

            }
return -1;


 }

     //the maximum size of the static array
     private static final int MAX_SIZE = 20; 
}
