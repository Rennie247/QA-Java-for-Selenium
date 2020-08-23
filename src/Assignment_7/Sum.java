package Assignment_7;

public class Sum {
	int a;
	int b;
	double c;
	double d;
	Sum(int i,int j)
	{
		a=i;
		b=j;
	}
	Sum(double x,double y)
	{
		c=x;
		d=y;
	}
	void sumNumbers()
	{
		System.out.println(a+b);
		System.out.println(c+d);
	}

	public static void main(String[] args) {
		Sum s1=new Sum(65,43);
		Sum s2=new Sum(72.8,93.7);
		Sum s3=new Sum(43,100);
		Sum s4=new Sum(1005.78,895.64);
		s1.sumNumbers();
		s2.sumNumbers();
		s3.sumNumbers();
        s4.sumNumbers();

	}

}
