enum Day{
	MON, TUE, WED, THU, FRI, SAT, SUN;
}

public class enum2{

	Day day;

	enum2(Day day){
		this.day = day;
	}

	public void dayIsLike(){
		switch(this.day){
			case MON : 
				System.out.println("MONDAY"); break;

			case TUE : 
				System.out.println("TUESDAY"); break;
			default : 	System.out.println("Invalid input ! ");
		}
	}

	public static void main(String[] args){
		String str = "TUE";
		enum2 t1 = new enum2(Day.valueOf(str));
		System.out.println("Class of : " + Day.valueOf(str));
		t1.dayIsLike();
	}
}