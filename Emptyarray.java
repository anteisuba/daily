import java.util.Arrays;

public class Emptyarray{
	String[] topics = {"Opinion", "Tech", "Science", "Health"};
	int[] views = {0,0,0,0};
	String[] favoriteArticles;
	
	public Emptyarray() {
		favoriteArticles = new String[10];
	}
	
	public void setFavoriteArticle(int favoriteIndex,String newArticle) {
		favoriteArticles[favoriteIndex] = newArticle;
	}
	
	public static void main(String[] args) {
		Emptyarray sampleFeed = new Emptyarray();
		sampleFeed.setFavoriteArticle(2, "Humans: Exterminate Or Not?");
	    sampleFeed.setFavoriteArticle(3, "Organic Eye Implants");
	    sampleFeed.setFavoriteArticle(0, "Oil News");
	    
	    System.out.println(Arrays.toString(sampleFeed.favoriteArticles));
	    
		
	}
	
	
	
}