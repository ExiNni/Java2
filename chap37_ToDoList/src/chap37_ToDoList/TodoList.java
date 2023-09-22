package chap37_ToDoList;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	private ArrayList<String> tasks;
	public TodoList() {
		tasks = new ArrayList<>();
		
	}
	
	public void addTack(String task) {
		tasks.add(task);
	}
	
	public ArrayList<String> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<String> tasks) {
		this.tasks = tasks;
	}

	public void removetasks(int index) {
		if(index >= 0 && index < tasks.size()) {
			tasks.remove(index);
		} else {
			System.out.println("잘못된 인덱스 입니다.");
		}
	}
	
	public void displayTasks() {
		System.out.println("My TodoList");
		for(int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + " . " + tasks.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		TodoList todoList = new TodoList();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가 : add, 삭제 : remove, 할일보기 : list, 종료 : exit 입력하세요.");
			String choice = sc.nextLine();
			
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요");
				String task = sc.nextLine();
				todoList.addTack(task);
				
			} else if(choice.equals("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) -1;
					todoList.removetasks(index);
				} catch(Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if(choice.equals("list")) {
				todoList.displayTasks();
			} else if(choice.equals("exit")){
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");
		
	}
}
