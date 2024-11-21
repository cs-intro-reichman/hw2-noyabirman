// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N= Integer.parseInt(args[0]);
		boolean reached1=true;
		String mode=args[1];
		
		for (int seed=1;seed<=N;seed++){
			int num=seed;
			int totalSteps=0;
			
			if (mode.equals("v")) {
				System.out.print((seed)+ " ");	
			}

			while (num!=1){
				if (num%2==0){
					num/=2;
				} else {
					num=num*3+1;
				}
				totalSteps++;
				
				if (mode.equals("v")) {
					System.out.print(num+ " ");
				}
			}
			if (mode.equals("v")) {
				System.out.println("(" + totalSteps + ")");	
			}
			if (num != 1){
				reached1=false;
			}
		}	
		if (reached1) {
			System.out.println("Every one of the first "+ N+ " hailstone sequences reached 1.");

		}
		
		}	
	}

	
	

	

