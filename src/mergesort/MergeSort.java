/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesort;

import java.util.*;
/**
 *
 * @author David
 */
public class MergeSort {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             // TODO code application logic here        
        int[] input = {1,5,4,8,10,2,6,9,3,7};
        System.out.println("Unsorted: " + Arrays.toString(input));        
        mergeSort(input);        
        System.out.println("Sorted: " + Arrays.toString(input));  
    }//end of main
    
        public static void mergeSort(int[] input){        
        //Prevents Infinite Loop.
        if(input.length < 2){
            return;
        }//End of IF Statemnt        
        int leftSize = input.length / 2;
        int rightSize = input.length;
        //Creating and Populating Left
        int [] left = Arrays.copyOfRange(input, 0, leftSize);
        //Creating and Populating Right
        int [] right = Arrays.copyOfRange(input, leftSize, rightSize);  
    
        mergeSort(left);
        mergeSort(right);        
        merge(left,right,input);        
    }//End of mergeSort()
    
      public static void merge(int [] left, int [] right, int [] input){       
        //Iteration Vairables.
        int i = 0, j = 0, k = 0;             
        //Loop through left and right.
        while(i < left.length && j < right.length){            
            //Comparing elements.
            if(left[i] > right[j]){
                input[k++] = right[j++];             
            }//End of IF Statement.
            else {
                input[k++] = left[i++];
            }//End of Else If Statement.            
        }//End of While Loop.
        
        //Merging the Array:
       while(i < left.length){
            input[k++] = left[i++];
        }//End of While Loop.
        while(j < right.length){
            input[k++] = right[j++];
        }//End of While Loop.    
    }//End of merge().    
}