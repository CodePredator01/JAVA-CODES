/*
Solve the hypotenuse of a right triangle, given the lengths of the other two sides.
Note : that the formula for calculating the hypotenuse of aright-angled triangle is
        as follows: h^2 = a^2 + b^2
*/

public class TrignometryProblem {

    public static void main(String[] args) {
       double len = 12;
       double width = 12;
       double hypo;
      // hypo = Math.sqrt(len*len + width*width);
       hypo = Math.sqrt(Math.pow(len,2) + Math.pow(width,2));
       System.out.println(" Hypotenuse of aright-angled triangle is " + hypo);
    }

}

