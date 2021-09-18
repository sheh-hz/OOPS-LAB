import java.util.*;
import java.io.*;
class ArrayListDemo
{
   public static void main(String args[]){
      //create an ArrayList
      ArrayList<String> colour_List=new ArrayList<String>();
      //add elements to the ArrayList using add method
      colour_List.add("black");
      colour_List.add("white");
      colour_List.add("blue");
      colour_List.add("pink");
      //print the list
      System.out.println("Initial ArrayList:" + colour_List);
      //add an element at index 1 using add method overload
      colour_List.add(1, "green");
      //print the list
      System.out.println("\nArrayList after adding an element'green' at index 1:" + colour_List);
      //define a second list
      ArrayList<String> more_colour = new ArrayList<String>(Arrays.asList("yellow", "red","violet","gray"));
      //use addAll method to add the list to ArrayList at index 4
      colour_List.addAll(4,more_colour);
      //print the list
      System.out.println("\nArrayList after adding all list at index 4:" + colour_List);
      colour_List.remove(2);

      System.out.println("\nArrayList after removing element at index 2:" + colour_List);
 
      colour_List.remove("pink");

      System.out.println("\nArrayList after removing element 'pink':" + colour_List);
      colour_List.removeAll(more_colour);

     System.out.println("\nArrayList after call to removeAll from array 'more_colour':" + colour_List);
     //print the size of ArrayList

       System.out.println("ArrayList Size: "+colour_List.size());
       colour_List.add("pink");
         colour_List.add("black");
       colour_List.add("gray");
         colour_List.add("black");
           System.out.println("\nArrayList after adding some elements:" + colour_List);

colour_List.trimToSize();
        //print the size of ArrayList
        System.out.println("ArrayList Size after trimToSize() operation: "+colour_List.size());
        //call indexOf() and lastIndexOf() methods to check the indices of specified elements
     System.out.println("indexOf(black) : " + colour_List.indexOf("black"));
     System.out.println("lastIndexOf(black) : " + colour_List.lastIndexOf("black"));
     colour_List.clear();
     System.out.println("ArrayList after clearing all elements: "+colour_List);


   }
}
