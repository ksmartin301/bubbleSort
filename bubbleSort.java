//Khaleah Martin

import java.util.*;

public class bubbleSort {
    public static void main(String args[]) {

        Scanner input  = new Scanner(System.in);
        ArrayList<Integer> numberLine = new ArrayList<>(); //initialize array list
        int number;
    

        System.out.println("Add a list of numbers. Press -1 when done.");

        do{ // add as many numbers as the user would like
        
            number = input.nextInt();
            numberLine.add(number);
        
        } while ((number > 0));

        input.close();

        Integer[] line = numberLine.toArray(new Integer[0]); // convert arraylist to int array
        Integer[] descending = bubbleSorter(line); // call to bubblesort method

    for (Integer count : descending){ //print each integer in array
    System.out.println(count);
    }
 }

 public static Integer[] bubbleSorter( Integer[] maxLine){

    int i = maxLine.length; 
    for (int o = 0; o < i-1; o++){ //count indexes
        for(int k = 0; k < i-o-1; k++){ //sort values for each index
            if(maxLine[k] < maxLine[k+1]){ // if index value 1 is < index value 2
                int temp = maxLine[k]; //assign index value 1 to temp int
                maxLine[k] = maxLine[k+1]; // swap index values 2 and 1
                maxLine[k+1] = temp; // assign temp int to index value 2
            }
        }
  
    }

    return maxLine; //return descending values to main method
}
}
