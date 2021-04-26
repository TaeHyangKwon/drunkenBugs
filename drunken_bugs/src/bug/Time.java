package bug;

import java.util.Vector;

public class Time {
	
	Bug[] bug=null;
	Many_bugs bugs;
	
	Vector<Integer>v_c=new Vector<Integer>();
	Vector<Long>v_t=new Vector<Long>();
	
	int sum;
	int sum_num;
	double avg;
	long sum_t;
	double avg_t;
	
	public void Run()
	{	
		int room_size=10;
		int bug_num=3;
		int num=5;
		
		for(int n=0;n<num;n++)
		{
			sum_num=0;
			
			System.out.println((n+1)+"È¸ ¹Ýº¹");
			
			int start_pos=0;
			int sum_p=0;
			
			bugs=new Many_bugs(room_size);
		
			bug=new Bug[bug_num];	//¹ú·¹¼ö
			bugs.init();
			
			for(int i=0;i<bug_num;i++) 
			{	
				bug[i]=new Bug(room_size,start_pos);
				start_pos++;
				
				if(start_pos>=4) 
				{
					start_pos=start_pos%4;
				}
			}
			
			long start_time=System.nanoTime();
			
			while(bugs.isRunning())
			{
				for(int i=0;i<bug_num;i++)
				{
					bug[i].move();
					
					for(int j=i+1;j<bug_num;j++)
					{
						if(bug[i].get_cur_x()==bug[j].get_cur_x()&&bug[i].get_cur_y()==bug[j].get_cur_y()) 
						{
							if(bug[i].get_pub()==5)
							{
								bug[j].set_pub(5);
							}
						}
					}
					
					sum_p+=bug[i].get_pub();
					
					//System.out.println(i+" "+bug[i].get_pub());
					bugs.check(sum_p,bug_num);
				}
			}
			
			long end_time=System.nanoTime();
		
			long time_gap=end_time-start_time;
		
			v_t.add(time_gap);
			
			for(int i=0;i<bug_num;i++)
			{
				//v_c.add(bug[i].get_count());
				System.out.println("¹ú·¹"+(i+1)+" ÀÌµ¿È½¼ö : "+bug[i].get_count());	//¹üÀ§ ¾È¿¡¼­¸¸ ÀÌµ¿
				sum_num+=bug[i].get_count();
			}
		
			v_c.add(sum_num);
			System.out.println("ÃÑ ÀÌµ¿ È½¼ö : "+sum_num);
			
			System.out.println("½Ã°£(ns) : "+time_gap);
			System.out.println();
		}
		
		for(int i=0;i<v_c.size();i++)
		{
			sum+=v_c.elementAt(i);
		}
		
		avg=(double)sum/v_c.size();
		
		for(int i=0;i<v_t.size();i++)
		{
			sum_t+=v_t.elementAt(i);
		}
		
		avg_t=(double)sum_t/v_t.size();
		
		System.out.println("Æò±Õ ÀÌµ¿ È½¼ö : "+avg);
		System.out.println("Æò±Õ ÀÌµ¿ ½Ã°£ : "+avg_t);
	}
}