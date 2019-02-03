/**************************************************** 
Program Name: CIS355A_Wk1_P1.java
Programmer's Name: Payden Boughton
Program Description:  convert given kilometers to miles
***********************************************************/

package cis355a_wk1_p1;

import java.util.Scanner;

public class CIS355A_Wk1_P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kilo;
        double mile;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a distance(In Kilometers): ");
        kilo = input.nextDouble();
        mile = calcMiles(kilo);
        System.out.println(kilo + " Kilometers "  + " in Miles is: " + mile + " Miles");
        
        
        
    }
    
    
    public static double calcMiles(double x)
    {
        double answer;
        answer = x * 0.6214;
        return answer;
    }
    
}
