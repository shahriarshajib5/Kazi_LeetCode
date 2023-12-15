/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author S555438
 */
public class TimeComplexity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double now = System.currentTimeMillis();
     
        
        TimeComplexity demo = new TimeComplexity();
        
        demo.findsum(0);
        
        System.out.println("time taken: "+(System.currentTimeMillis()-now));
    }
    
    
   public int findsum(int n)
  {
      int sum = (n*((n+1)/2));
       return sum;
    }
   /* 
    public int findsum(int n)
    {
        int sum =0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
    } */
}
