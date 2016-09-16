import java.util.*;
public class DeathStarToDoList {
    public static void main( String[] args ) {

        LinkedList<String> todo = new LinkedList<String>();

        todo.add("Fix the reactor core");
        todo.add("Take out the trash");
        todo.add("Calibrate the super laser aiming system");
        todo.add("Find that pesky Jedi");
        todo.add("Give a cookie to the wookie");

        System.out.println("8 AM");
        System.out.println("Here's the Death Star to-do list:");
        printList(todo);

        // Took out the trash!
        todo.remove("Take out the trash");

        System.out.println("9 AM");
        System.out.println("Here's the Death Star to-do list:");
        printList(todo);


        // Found Luke!
        todo.remove(2);

        System.out.println("10 AM");
        System.out.println("Here's the Death Star to-do list:");
        printList(todo);
    }

    public static void printList( LinkedList<String> todo ) {
        Iterator<String> iter = todo.iterator();
        while(iter.hasNext()) {
            System.out.println(" - " + iter.next() );
        }
        System.out.println();
    }
}

