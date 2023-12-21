/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author S555438
 */



public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public String reverseWords(String s) {

     String[] words = s.trim().split("\\s+");
     StringBuilder rs = new StringBuilder();
     for(int i=words.length-1; i>=0; i--)
     {
         rs.append(words[i]);
         if (i>0) {
            rs.append(" ");
         }
     }

     return rs.toString();

    }  
    
    
    
    
    public static void main(String[] args) {
        
        String sen = "Somebody runs after money";
        
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseWords(sen));
       
    }
    
}
