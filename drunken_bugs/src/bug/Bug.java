package bug;

public class Bug{
		int cur_x, cur_y;
		int size;
		int count;
		int pub;
		int room_size;
			
		public Bug(int room_size, int start_pos)
		{
			this.size=room_size;
			this.count=0;
			this.pub=0;
			this.room_size=room_size;
			
			if(start_pos==0)
			{
			this.cur_x=0;
			this.cur_y=0;
			}
			
			else if(start_pos==1)
			{
			this.cur_x=0;
			this.cur_y=room_size-1;
			}
			
			else if(start_pos==2)
			{
			this.cur_x=room_size-1;
			this.cur_y=0;
			}
			
			else
			{
			this.cur_x=room_size-1;
			this.cur_y=room_size-1;
			}
		}
		
		public void move()
		{
		int pre_x=cur_x,pre_y=cur_y;
					
		int random=(int)(Math.random()*8);
					
		switch(random) 
			{
			case 0:
				pre_x--;
				pre_y++;
				break;
			case 1:
				pre_y++;
				break;	
			case 2:
				pre_x++;
				pre_y++;
				break;
			case 3:
				pre_x++;
				break;
			case 4:
				pre_x++;
				pre_y--;
				break;
			case 5:
				pre_y--;
				break;
			case 6:
				pre_x--;
				pre_y--;
				break;
			case 7:
				pre_x--;
				break;
			}
				
		if(pre_x>=0&&pre_x<size&&pre_y>=0&&pre_y<size) 
		{
			cur_x=pre_x;
			cur_y=pre_y;
			count++;
		}
		
		if(cur_x==room_size/2&&cur_y==room_size/2) {
			pub=5;
		}
	}
		
	public int get_cur_x() {
		return cur_x;
	}
		
	public void set_cur_x(int cur_x) {
		this.cur_x=cur_x;
	}
	
	public int get_cur_y() {
		return cur_y;
	}
		
	public void set_cur_y(int cur_y) {
		this.cur_y=cur_y;
	}
	
	public int get_count() {
		return count;
	}
		
	public void set_count(int count) {
		this.count=count;
	}
	
	public int get_pub() {
		return pub;
	}
		
	public void set_pub(int pub) {
		this.pub=pub;
	}
}