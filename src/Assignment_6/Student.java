package Assignment_6;

public class Student {
			int SID;
			String Sname;
			int sub1;
			int sub2;
			int sub3;
	void getStuData(int i, String s){
			SID=i;
			Sname=s;
	}
	void getStuMarks(int j, int k, int t){ 
			sub1=j;
			sub2=k;
			sub3=t;
	}
	void calTotalMarks(){
			System.out.println(sub1+sub2+sub3);
	}
}


