
public class Task implements Priority{
	
	private int priority;
	private String task;
	
	public Task (String userTask, int userPriority) {
		task = userTask;
		priority = userPriority;
	}
	
	public void setPriority (int level)
	{
		this.priority = level;
	}
	public int getPriority ()
	{
		return priority;
	}
	public void setTask (String taskName)
	{
		task = taskName;
	}
	public String getTask()
	{
		return task;
	}
}
