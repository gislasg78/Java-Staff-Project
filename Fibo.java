import java.util.Scanner;

public class Fibo
	{
		public static int fibo(int n, int x, int y)
			{
				return (n <= 1) ? x+y : fibo(n-1, y, x+y);
			}

		public static void main(String[] args)
			{
				int n=0, x=0, y=0;
				Scanner scanner = new Scanner(System.in);

				System.out.print("Number of series : ");
				n = scanner.nextInt();

				System.out.print("First number  : ");
				x = scanner.nextInt();

				System.out.print("Second number : ");
				y = scanner.nextInt();

				System.out.println();
				System.out.printf("Fibo for [%d] and [%d] is: [%d] with [%d] iterations.\n", x, y, fibo(n, x, y), n);
			}
	}
