import java.util.ArrayList;

public class Playlist {
  
  public static void main(String[] args) {

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    
    desertIslandPlaylist.add("as");
    desertIslandPlaylist.add("scs");
    desertIslandPlaylist.add("css");
    desertIslandPlaylist.add("dss");
    desertIslandPlaylist.add("sasa");
    desertIslandPlaylist.add("ddddss");

    System.out.println(desertIslandPlaylist.size());

    desertIslandPlaylist.remove(1);
    int indexA = desertIslandPlaylist.indexOf("scs");
    int indexB = desertIslandPlaylist.indexOf("as");
    String tempA = "scs";
    desertIslandPlaylist.set(indexA,"as");
    desertIslandPlaylist.set(indexB,tempA);
    System.out.println(desertIslandPlaylist);


  }
  
}