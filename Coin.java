public class Coin implements Lockable{
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face, key;
	private boolean locked;
	
	public Coin ()
	{
		flip();
	}
	public void flip ()
	{
		face = (int) (Math.random() * 2);
	}
	public boolean isHeads ()
	{
		return (face == HEADS);
	}
	public String toString()
	{
		String faceName;
		if (face == HEADS)
			faceName = "Heads";
		else
			faceName = "Tails";
		return faceName;
	}
	
	public void setKey(int key) {
		
		this.key = key;
		
	}
	
	public void lock(int key) {
		
		if(key == this.key) {
			
			locked = true;
			
		}
		else {
			System.out.println("Invalid key");
		}
	}
	
	public void unlock(int key) {
		
		if(key == this.key) {
			
			locked = false;
			
		}
		else {
			System.out.println("Invalid key");
		}
		
	}
	
	public boolean locked() {
		
		return locked;
		
	}
	
	
}
