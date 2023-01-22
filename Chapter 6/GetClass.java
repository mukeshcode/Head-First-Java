public class GetClass{
	public static void main(String[] args){
		String name = "Hare Krishna";
		
		System.out.println(((Object)name.charAt(3)).getClass().getSimpleName());
	}
}