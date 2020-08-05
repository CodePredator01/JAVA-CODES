// Ternary Operator Use

public class TernaryOperator {
    public static void main(String[] args) {
        int height = 200;   // centimeter
        int minHeight = 121;
        String result;
        result = (height > minHeight) ? "You are allowed on the ride !"
                : "Sorry, You do not meet the height requirements !";
        System.out.println(result);
    }
}
