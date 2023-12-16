/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author S555438
 */
import java.util.Arrays;
public class RemoveElementArray {

    /**
     * 27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
     * 
     * 
     * 
     * Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
     */
    
   
    public void removeElement(int[] nums, int val) {


    int count = 0;
    
    for(int i=0; i<nums.length; i++)
    {
        if (nums[i]!=val)
        {
           count++;
           
        }
    }
    int[] myArray = new int[count];
    
    int index=0;
    for(int i=0; i<nums.length; i++)
    {
         if (nums[i]!=val)
        {
           myArray[index] = nums[i];
           index++;
        }
    }
    
     
        System.out.println(count);
        
        System.out.println(Arrays.toString(myArray));
    

    }

    
    
    public static void main(String[] args) {
        
       RemoveElementArray demo = new RemoveElementArray();
       
      int[] arr = {3,2,2,3};
      demo.removeElement(arr, 3);
      int[] arr1 = {0,1,2,2,3,0,4,2};
      demo.removeElement(arr1, 2);
    }
    
}
