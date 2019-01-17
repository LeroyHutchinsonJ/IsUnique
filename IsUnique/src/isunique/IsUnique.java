/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isunique;

/**
 *
 * @author Gemgod
 */
public class IsUnique {

    /**
     * @param args the command line arguments
     */
    
    //Find out if a string has all unique values
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(theCharsAreUnique("sbd"));
    }
    //My version of the method
    public static String duplicateCheck(String check)
    {
        //Default answer is No Strings
        String answer = "No Repeats";
        
        //Check if the given string has a duplicate character in it
            
            //Split the string up into characters
            char[] checkArr = check.toCharArray();
            
            //Check each character to make sure that there is no dublicate value in the array
            //First selecting starter value
            for(int a = 0; a < checkArr.length; a++)
            {
                //Then selecting secondary values, making sure that the secondary is within the bounds of the array             
                    for(int b = a+1; b < checkArr.length; b++)
                    {            
                        if(checkArr[a] == checkArr[b])
                        {
                            answer = "Yes Repeats";
                        }
                    }
      
            }
        
        //Returns a Yes or No answer after checking if a string has duplicates
        return answer;
    }
    
    public static boolean isUniqueChars(String str)
    {
        //Only 128 characters in the character set we are using so if there are more than 128, there must be a repeat
        if(str.length() > 128) return false;
        
        //Creating a boolean array variable that can contain 128 characters
        boolean[] char_set = new boolean[128];
        
       //Int i starts at 0, for as long as int i is less than the inputed strings length, increase i's value by 1
        for(int i = 0; i < str.length();i++)
        {
             //Takes the current letter in the string, converts it to a number, she used upcasting
            int val = str.charAt(i);
            
           
            
            //If the boolean is equal to true, return false. I check a slot in the array for the converted number, if the slot is true then that means it was flipped already and the number is not unique
            if(char_set[val]==true)
            {
                return false;
            }
            
            //If the boolean is equal to false, turn it true. If the slot in the array is false then i flip it to true, that way i can keep track of numbers that are not unique.
            if(char_set[val]==false) 
            {         
            char_set[val] = true; 
            }
        }
        
        //Return true by default
        return true;
    }
    
    public static boolean theCharsAreUnique(String str)
    {
        
        //Only 128 unique chars I can pick, so if there are over 128 chars in the string we have a repeat
        if(str.length()>128) return false;
        
        //Create a grid, or a boolean array to check all the values
        boolean grid[] = new boolean[128];
        
        //I need a way to check each character into the grid
        for(int i = 0; i < str.length(); i++)
        {
        //Turn each character in the string into a coordinate for the array
            int val = str.charAt(i);
            
             
            
            
            //Put the coordinate into the array, if it has been changed to true, then return false, always check if something is there first
            if(grid[val] == true)
            {
                return false;
            }
            
                //Put the coordinate into the array, the default is false, if it is equal to false then turn it to true
            if(grid[val] == false)
            {
                grid[val] = true;
            }
        
        }
        return true;
    }
    
}
