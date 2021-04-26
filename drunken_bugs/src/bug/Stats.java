package bug;

public class Stats extends Time{
	int sum=0;	//È½¼ö ÇÕ
	double avg=0;	//È½¼ö Æò±Õ
	
	long sum_t=0;
	double avg_t=0;
	
	public Stats()
	{
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
	}
	
	public double get_avg() {
		return avg;
	}
	
	public void set_avg (double avg) {
		this.avg=avg;
	}
	
	public double get_avg_t() {
		return avg_t;
	}
	
	public void set_avg_t (double avg_t) {
		this.avg_t=avg_t;
	}
}