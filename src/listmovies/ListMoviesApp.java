package listmovies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMoviesApp {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		List<ListMovies> movie = new ArrayList<>();
		movie.add(new ListMovies("Shutter", "drama"));
		movie.add(new ListMovies("Mr. Potato Heads Wild Adventure 2", "drama"));
		movie.add(new ListMovies("Madagascar", "animated"));
		movie.add(new ListMovies("The Matrix", "scifi"));
		movie.add(new ListMovies("Toy Story", "animated"));
		movie.add(new ListMovies("Barbarian", "horror"));
		movie.add(new ListMovies("Star Trek", "scifi"));
		movie.add(new ListMovies("My Little Pony", "animated"));
		movie.add(new ListMovies("The Piano", "drama"));
		movie.add(new ListMovies("The Conjuring", "horror"));
		
	  String yesOrNo;
	        do {
	            Scanner scan = new Scanner(System.in);
	            System.out.println("Welcome to the Movie List Application!");
	            System.out.println("There are 10 movies in this list. What category are you interested in?: (drama, scifi, animated, or horror)");
	            String whatGenre = scan.nextLine();
	            System.out.println(whatGenre);

	            for (int i = 0; i < movies.size(); i++) {
	                if (whatGenre.equals(movies.get(i).category)) {
	                    System.out.println(movies.get(i).title);

	                }
	            }
	            System.out.println("Continue? y/n");
	            yesOrNo = scan.nextLine();
	        } while (yesOrNo.equals("y"));	
		
	} 
		
	
}

