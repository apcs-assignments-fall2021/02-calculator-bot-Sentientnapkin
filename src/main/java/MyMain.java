import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if (c>=b&&c>=a)
            return Math.max(a,b);
        if (b>=a&&b>=c)
            return Math.max(a,c);
        else return Math.max(b,c);
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        int mag = Math.max(Math.abs(a),Math.abs(b));
        if (mag==a||mag==((-1)*a))
            return a;
        else return b;
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        return Math.sqrt(Math.pow((double)a,2)+Math.pow((double)b,2));
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Median: What is your first number? ");
        int med1 = scan.nextInt();
        System.out.println("Median: What is your second number? ");
        int med2 = scan.nextInt();
        System.out.println("Median: What is your third number? ");
        int med3 = scan.nextInt();
        System.out.println("The Median is "+ median(med1,med2,med3)+".");
        System.out.println("Magnitude: What is your first number? ");
        int mag1 = scan.nextInt();
        System.out.println("Magnitude: What is your second number? ");
        int mag2 = scan.nextInt();
        System.out.println("The Magnitude is "+ magnitude(mag1,mag2)+".");
        System.out.println("Pythagorean Theorem: What is your first length? ");
        int py1 = scan.nextInt();
        System.out.println("Pythagorean Theorem: What is your second length? ");
        int py2 = scan.nextInt();
        System.out.println("The Hypotenuse Length is "+ pythagoras(py1,py2)+".");
    }
}
