package Assignment_7;

public class Calculator {

	public class Calculation {
		int x;
		int y;
		int z;
		Calculation(int i,int j,int k)
		{
			x=i;
			y=j;
			z=k;
		}
		void calSum()
		{
			System.out.println(x+y+z);
		}

		public void main(String[] args) {
			Calculation c1=new Calculation(10,20,30);
			Calculation c2=new Calculation(43,62,87);
			Calculation c3=new Calculation(51,98,69);
			c1.calSum();
			c2.calSum();
			c3.calSum();
			


	}

}
}
