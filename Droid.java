public class Droid{
  String name;
  int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public String toString(){
    return "Hello,I'm the droid:" + name;
  }

  public void performTask(String task){
    System.out.println(name + "is performing task: " + task);
    batteryLevel = batteryLevel - 10;

  }


  public static void main(String[] args){
    Droid myDroid = new Droid("Codey");
    System.out.println(myDroid.batteryLevel);
    myDroid.performTask("dancing");
    System.out.println(myDroid.toString()); 
  }
}