package bug;

public class Many_bugs {
	int map_size;
	int size;
	int[][] map=null;
	boolean check=true;
	
	public Many_bugs(int room_size)
	{
		this.map_size=room_size*room_size;
		this.map=new int[room_size][room_size];
		this.check=true;
		this.size=room_size;
	}
	
	public void init()
	{
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
				map[i][j]=0;
		}
	}
	
	public void check(int sum_p,int bug_num)
	{	
		if(sum_p!=0&&sum_p==bug_num*5) 
		{
			check=false;
		}
	}
	
	public boolean isRunning() {
		return check;
	}
}