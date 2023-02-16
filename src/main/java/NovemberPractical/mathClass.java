/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NovemberPractical;

/**
 *
 * @author Aaminah1
 */
public class mathClass {
    public static void main(String[] args) {
        //ola muchachossss, this is part two of the tutoriallll (math.random)
        
        //okay so start of basic - we wanna get random number betweeeeeen 1 to 10 (both inclusive), right so first thing you do is:
        //first you get the range, 10 -1 = 9 BUT SINCE WE WANT 10 INCLUDED WE HAVE TO ADD 1 SO: 9+1 = 10
        //THEN you just take your range plus your minimum
        
        int num = (int) (Math.random()*10+1);
        System.out.println(num);
        
        //now lets go harder MWAHAH
        //find the random number between 19 and 36 :o (both inclusive)
        //1. get the range: 36 - 19 = 17 buttttt its inclusive so ADD 1 : 17 + 1 + 18
        //2. Just add the minimum value: 19
        //3. Math.random()*18+19;
        
        
        int num2 = (int) (Math.random()*18+19);
        System.out.println(num2);
        
        
    }
    
}
