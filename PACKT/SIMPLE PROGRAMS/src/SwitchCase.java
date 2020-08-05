// Use Of Switch case

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number range : ");
        int season = sc.nextInt();
        switch(season) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Fall");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("That's not a season");
                break;
        }
    }
}
