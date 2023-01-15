class Books{
	String title;
	String author;
}

class BooksTestDrive{
	public static void main(String[] args){
		Books [] myBooks = new Books[3];
		
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();


		int x = 0;
		myBooks[0].title = "Ramayana";
		myBooks[0].author = "Valmiki";
		myBooks[1].title = "Ramacharitmanas";
		myBooks[1].author = "Tulsidas";
		myBooks[2].title = "Mahabharata";
		myBooks[2].author = "VedVyasa";

	
		while(x<3){
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x += 1;
		}
	}
}