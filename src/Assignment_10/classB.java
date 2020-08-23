package Assignment_10;

public class classB extends classA{		//subclass(child)
	int c;
	int d;
	int a;
	
	 public classB (int car, int dog){
		c = car;
		d = dog;	
	}
	 
	public void run() {
		super.run();
		System.out.println("This is class B "+a+b+c+d);
		}

	}


