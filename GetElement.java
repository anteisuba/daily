import java.util.Arrays;

public class GetElement {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
  
  public GetElement(){
	  
  }
    
  public String[] getTopics(){
    return topics;
  }
  
  public String getTopTopic(){
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args){
	GetElement sampleFeed = new GetElement();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);   //views[1] = 1 views=0,1,0,0
    sampleFeed.viewTopic(1);   //views[1] = 2 views=0,2,0,0
    sampleFeed.viewTopic(3);   //views[3] = 1 views=0,2,0,1
    sampleFeed.viewTopic(2);   //views[2] = 1 views=0,2,1,1
    sampleFeed.viewTopic(2);   //views[2] = 2 views=0,2,2,1
    sampleFeed.viewTopic(1);   //views[1] = 3 views=0,3,2,1
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
  }
}
