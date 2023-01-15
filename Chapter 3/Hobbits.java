class Hobbits{
	String name;
	
	public static void main(String[] args){
		Hobbits[] h = new Hobbits[3];

		int x = 0;
		while(x < 4){
			x += 1;
			h[x] = new Hobbits();
			h[x].name = "Bilbo";
			
			if(x == 1)
				h[x].name = "Frodo";
			if(x == 2)
				h[x].name = "Sam";

			System.out.print(h[x].name);
			System.out.println(" is a good hobbit name");
		}
	}
}