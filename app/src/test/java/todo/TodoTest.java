package todo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TodoTest {
  @Test public void testInitialisesEmptyList() {
    ArrayList<String> todo = new ArrayList<String>();
    assertTrue(todo.isEmpty());
  }

  @Test public void testAddTask() {
    Todo todo = new Todo();
    todo.addTask("Wash car");
    todo.addTask("Paint fence");
    todo.addTask("Mow lawn");
    assertEquals("List of todos: Wash car, Paint fence, Mow lawn, ", todo.getTasks());
  }
}

// tests: 1) it is initialised with an empty list of tasks
// 2) it has an addTask method that takes a String argument and adds it to the list of tasks
// 3) it has a getTasks method that returns the list of tasks.