class Movie{
	int rating;
	String title;
	String genre;
	
	void playMovie(){
		System.out.println("Playing the movie : " + title);
	}
}

public class MovieTestDrive{
	public static void main(String[] args){
		Movie one = new Movie();
		one.rating = 3;
		one.title = "Gone with the wind";
		one.genre = "Tragic";
		one.playMovie();

		Movie two = new Movie();
		two.rating = 5;
		two.title = "Beating turned me to Gold";
		two.genre = "Action";
		two.playMovie();

		Movie three = new Movie();
		three.rating = 10;
		three.title = "Ultimate God speaks!";
		three.genre = "Truth";
		three.playMovie();
		
	}
}