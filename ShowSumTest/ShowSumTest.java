package ShowSumTest;

public class ShowSumTest {

    public static void main(String[] args) {
        showSum(5, 10);    // create showSum method
    }
    public static void showSum(double num1, double num2) {    // assigns 5 and 10 to num1 and num2 and converts both from int to double
	double sum;    // initializes double variable "sum"
	sum = num1 + num2;    // assigns the sum of num1 and num2 to variable sum
	System.out.println("The sum is " + sum);    // prints string that states sum
    }

}
