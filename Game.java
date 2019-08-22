import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Roll the die or die! If you guess our number from the die you will get a prize.");
		int die = (int)(Math.random()*6)+1;
		int die2 = scan.nextInt();
		if (die2==die){
			System.out.println("You win!");
		} else {

			if (die2 !=die) {
				System.out.println("You lose.");

			}
			

		}
	}
}