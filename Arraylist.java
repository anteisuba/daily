import java.util.ArrayList;

public class Arraylist {
	
	public static void main(String[] args) {
		ArrayList<String> toDoList = new ArrayList<String>();
		String toDo1 = "water plants";
		String toDo2 = "game";
		String toDo3 = "start";
		
		toDoList.add(toDo1);
		toDoList.add(toDo2);
		toDoList.add(toDo3);
		
		System.out.println(toDoList);          //打印数组
		System.out.println(toDoList.size());   //数组长度
		System.out.println(toDoList.get(1));   //数组索引
		
	}
}