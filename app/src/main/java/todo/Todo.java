package todo;

import java.util.ArrayList;

public class Todo {
  ArrayList<String> todo = new ArrayList<String>();
  public static void main(String[] args) {
  }

  public void addTask(String task) {
    todo.add(task);
  }

  public String getTasks() {
    String result = "List of todos: ";
    for (String currentTodo : todo) {
        String line = String.format("%s, ", currentTodo);
        result = result + line;
    }
    return result;
  }
}