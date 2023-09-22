package chap37_ToDoList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TodoListHash {

	Set<String> toDo = new HashSet<>();

	public void addTasck(String task) {
		toDo.add(task);
		
	}

	public Set<String> getTasks() {
		return toDo;
	}

	public void setTasks(Set<String> toDo) {
		this.toDo = toDo;
	}

	public void removetasks(int index) {
		if (index >= 0 && index < toDo.size()) {
			toDo.remove(index);
		} else {
			System.out.println("잘못된 인덱스 입니다.");
		}
	}
	

	public void displayTasks() {
		System.out.println("My TodoList");
		for(String a : toDo) {
			int i = 1;
			System.out.println(i + ". " + a);
			i++;
		}
	}

	public static void main(String[] args) {

		TodoListHash todoList = new TodoListHash();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("할일 추가하기: add, 삭제하기 : remove, 할일보기 : list, 종료 : exit 입력하세요.");
			String choice = sc.nextLine();

			if (choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요");
				String task = sc.nextLine();
				todoList.addTasck(task);

			} else if (choice.equals("remove")) {
				System.out.println("삭제할 일 번호 입력하기");
				try {
					int index = Integer.parseInt(sc.nextLine()) - 1;
					todoList.removetasks(index);
				} catch (Exception e) {
					System.out.println("유효하지 않은 입력입니다.");
				}
			} else if (choice.equals("list")) {
				todoList.displayTasks();
			} else if (choice.equals("exit")) {
				break;
			} else {
				System.out.println("잘못된 명령입니다.");
			}
		}
		System.out.println("어플리케이션 종료");

	}
}
