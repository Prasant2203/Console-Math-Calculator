import java.util.Scanner;

public class Calculator{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("\nWelcome to Calculator !!\n");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("5. Modulus (%)");
		System.out.println("6. Factorial (!)");
		System.out.println("7. Square Root (√)");
		System.out.println("8. Power (^)");
		System.out.println("0. Exit");

		while(true){

			System.out.print("\nEnter your choice(0-8): ");
			int choice = sc.nextInt();
			System.out.println();
		
		
			float num1 = 0, num2 = 0;
			if(choice == 0){
				System.out.println("Exiting Calculator. Goodbye!\n");
				System.exit(0);

			}else if(choice < 0 || choice > 8){
				System.out.println("Invalid choice");
				continue;

			}else if(choice==6 || choice==7){
				System.out.print("Enter any number: ");
				num1 = sc.nextInt();

			}else{
				System.out.print("Enter first number: ");
				num1 = sc.nextFloat();
				System.out.print("Enter Second number: ");
				num2 = sc.nextFloat();
			}
			

			switch(choice){
				case 1:
					System.out.println(num1 + num2);
					break;
				case 2: 
					System.out.println(num1 - num2);
					break;
				case 3: 
					System.out.println(num1 * num2);
					break;
				case 4: 
					System.out.println(num1 / num2);
					break;
				case 5: 
					System.out.println(num1 % num2);
					break;
				case 6:
					float fact = 1;
					for(int i=1; i<=num1; i++){
						fact = fact * i;
					}
					System.out.println(fact);
					break;
				case 7:
					System.out.println(Math.sqrt(num1));
					break;
				case 8:
					float p=1;
					for(int i=1; i<num2+1; i++)
						p*=num1;
					System.out.println(p);
					break;
			}
			
		}
	}
}
