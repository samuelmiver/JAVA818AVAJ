/*----------------------------------------------------------------
 *  Author:        Samuel Miravet-Verde
 *  Written:       09/28/2015
 *  Last updated:  09/28/2015
 *
 *  Compilation:  javac ex26_CartesianToPolar.java
 *  Execution:    java ex26_CartesianToPolar x y
 *  
 *  Read in Cartesian coordinates (x, y) and print out polar coordinates
 *  (r, theta).
 *
 *  %  java CartesianToPolar 3.0 4.0
 *  r     = 5.0
 *  theta = 0.9272952180016122
 *
 ******************************************************************************/

public class ex26_CartesianToPolar { 
    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        
        double r     = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);

        System.out.println("r     = " + r);
        System.out.println("theta = " + theta);
    }

}

