public interface Priority {
	public static final int MAX_PRIORITY = 10;
	public static final int MED_PRIORITY = 5;
	public static final int MIN_PRIORITY = 1;

	public void setPriority (int level);
	public int getPriority ();
	public void setTask (String taskName);
	public String getTask();
	
	
}