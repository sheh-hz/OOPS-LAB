import java.util.*;
import java.io.*;
  public class LinkedListRemove
   {
  public static void main(String[] args) {
    // create an empty linked list
     LinkedList<String> l_list = new LinkedList<String>();
   // use add() method to add values in the linked list
          l_list.add("cat");
          l_list.add("dog");
          l_list.add("cow");
          l_list.add("tiger");
          l_list.add("lion");

     // print the list
   System.out.println("The Original linked list: " + l_list);

  // Removing all the elements from the linked list
    l_list.clear();

    System.out.println("The New linked list: " + l_list);
  }
}
