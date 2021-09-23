import java.util.Scanner;
public class Conversion
{
	public static void main(String[] args) {
		System.out.println("Please enter kilometers:");
		double k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextDouble();
		double ans = k * 0.62;
		System.out.println(ans + " Miles");
	}
}
