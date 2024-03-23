import java.util.Scanner;

public class Main
	{
		public static void main(String[] args)
			{
				Scanner scanner = new Scanner(System.in);

				int items = 0;
				int rows = 0;
				int cols = 0;

				System.out.println("Generation of a matrix of variable rows and columns.");
				System.out.print("Enter the number of rows: ");
				rows = scanner.nextInt();

				System.out.print("Enter the number of columns: ");
				cols = scanner.nextInt();

				int matrix[][] = new int[rows][cols];

				System.out.println();
				System.out.println("Manual capture of matrix elements...");
				for (int r = 0; r < rows; r++)
					{
						for (int c = 0; c < cols; c++)
							{
								System.out.print("Value for item #" + items++ + " (Row: [" + (r+1) + "] of [" + rows + "], Column: [" + (c+1) + "] of [" + cols + "]): ");
								matrix[r][c] = scanner.nextInt();
							}
					}

				items = 0;
				System.out.println();
				System.out.println("Content of the captured array...");
				for (int r = 0; r < rows; r++)
					{
						for (int c = 0; c < cols; c++)
							{
								System.out.println("Item #" + items++ + " (Row: [" + (r+1) + "] of ["+ rows + "], Column [" + (c+1) + "] of [" + cols + "]) = [" + matrix[r][c] + "].");
							}

						System.out.println();
					}

				System.out.println();
				System.out.println("Normal Matrix Display...");
				for (int r = 0; r < rows; r++)
					{
						for (int c = 0; c < cols; c++)
							{
								System.out.print("[" + matrix[r][c] + "]\t");
							}

						System.out.println();
					}

				System.out.println();
				System.out.println("Transposed Matrix Display...");
				for (int c = 0; c < cols; c++)
					{
						for (int r = 0; r < rows; r++)
							{
								System.out.print("[" + matrix[r][c] + "]\t");
							}

						System.out.println();
					}
			}
	}
