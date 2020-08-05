/*
An online retail store provides free delivery only if the destination is within a
10-kilometer (km) radius of the store. Using comparison operators, we can code this
business logic, given the distance between the nearest store location and home:
*/

public class DeliveeryEligibilty {

    public static void main(String[] args) {
        int maxDistance = 10; // km
        int distanceToHome = 10;
        if (distanceToHome > maxDistance){
            System.out.println("Delivery not possible in your area !");
        }
        if (distanceToHome <= maxDistance){
            System.out.println("Congratulation, You get Free delivery !");
        }
    }
}
