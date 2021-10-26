import java.util.Scanner;

public class TestCoin {

	public static void main(String[] args) {
		int heads = 0, tails = 0;
		
		Scanner scan = new Scanner(System.in);
		
		Coin coin1 = new Coin();
		Coin coin2 = new Coin();
		
		System.out.println("Set a key for coin1: ");
		int key1 = scan.nextInt();
		coin1.setKey(key1);
		
		System.out.println("Set a key for coin2: ");
		int key2 = scan.nextInt();
		coin1.setKey(key2);
		
		System.out.println("Lock coin1? (Y/N): ");
		String coin1Ans = scan.nextLine();
		
		if(coin1Ans.equals("Y")) {
			System.out.println("Provide key: ");
			
			int coin1Guess = scan.nextInt();
			
			if(coin1Guess == key1)
				coin1.locked();
			else
				System.out.println("Wrong key, too bad loser :V");
		}
		
		System.out.println("Lock coin2? (Y/N): ");
		String coin2Ans = scan.nextLine();
		
		if(coin2Ans.equals("Y")) {
			System.out.println("Provide key: ");
			
			int coin2Guess = scan.nextInt();
			
			if(coin2Guess == key2)
				coin2.locked();
			else
				System.out.println("Wrong key, too bad loser :V");
		}
		
		for(int i = 0; i < 5; i++) {
			
			if(coin1.locked() && !coin2.locked()) {
				
				System.out.println("Coin1 is locked, would you like to unlock it? (Y/N): ");
				String coin1Unlock = scan.nextLine();
				
				if(coin1Unlock.equals("Y")) {
					System.out.println("Provide key: ");
					int coin1UnlockKey = scan.nextInt();
					
					if(coin1UnlockKey == key1) 
						coin1.unlock(key1);
					else {
						System.out.println("Wrong key, too bad loser :V");
						
						coin2.flip();
						if(coin2.isHeads()) 
							heads++;
						else
							tails++;
					}
							
				}
				else {
					System.out.println("Coin1 is locked, flipping coin2...");
					
					coin2.flip();
					if(coin2.isHeads()) 
						heads++;
					else
						tails++;
				}
				
				
				
			}
			else if(coin2.locked() && !coin1.locked()) {
				
				System.out.println("Coin2 is locked, would you like to unlock it? (Y/N): ");
				String coin2Unlock = scan.nextLine();
				
				if(coin2Unlock.equals("Y")) {
					System.out.println("Provide key: ");
					int coin2UnlockKey = scan.nextInt();
					
					if(coin2UnlockKey == key2) 
						coin2.unlock(key2);
					else {
						System.out.println("Wrong key, too bad loser :V");
						
						coin1.flip();
						if(coin1.isHeads()) 
							heads++;
						else
							tails++;
					}
							
				}
				else {
					System.out.println("Coin2 is locked, flipping coin1...");
					
					coin1.flip();
					if(coin1.isHeads()) 
						heads++;
					else
						tails++;
				}
			
			}
			else if(coin2.locked() && coin1.locked()) {
				
				System.out.println("Both coins are locked, cannot flip");
				break;
			}
			else {
				coin1.flip();
				coin2.flip();
				
				if(coin1.isHeads()) 				
					heads++;
				else
					tails++;
				
				if(coin2.isHeads()) 
					heads++;
				else
					tails++;
			}
			
		}
		
		System.out.println("Amount of heads " + heads);
		System.out.println("Amount of tails " + tails);
		
	}

}