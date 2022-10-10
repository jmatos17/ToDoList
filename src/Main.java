import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();

        toDoList.add(Importance.HIGH, 1, "Aprender priority queue");
        toDoList.add(Importance.HIGH, 2, "fazer o meu jogo");
        toDoList.add(Importance.MEDIUM, 2, "xixi");
        toDoList.add(Importance.MEDIUM, 3, "apanhar pokemons");
        toDoList.add(Importance.LOW, 1, "arrumar a casa");

        while (!toDoList.isEmpty()) {
            System.out.println(toDoList.remove());
        }
    }
}