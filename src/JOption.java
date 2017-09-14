//byte,short,int,long,float,double,char, and boolean
/**//*Author Ovidio Castillo
**@JOption
*Purpose: To Display an echo message/window with user input
*License:@GNU
*Date: 09/13/2017
*contact: oc210@email.vccs.edu
*/

import javax.swing.*;
import java.util.Scanner;

public class JOption {              //class
    public static void main(String [] args){        //args
    final int MI= 90/3;  //constant

    byte x=100;             //variables
    short y=30000;
    int z=2000000;
    long u;
    u = 300000000000l;

                               //decimals
    float v=8.5f;
    double w=90.55;
    double first, second, sum;

    char letter='A';

    boolean status = false;

                                                //pop up message to be displayed
    String leftString =
            JOptionPane.showInputDialog("Enter how many fingers you have on left hand:");
            int leftCount = Integer.parseInt(leftString);

    String rightString =
            JOptionPane.showInputDialog("Enter how many fingers on your right hand:");
            int rightCount = Integer.parseInt(rightString);
        int totalFingers = leftCount + rightCount;
        JOptionPane.showMessageDialog(null,"you have " + totalFingers +" fingers on your hands!");
    }
}
