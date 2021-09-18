import java.util.*;
import java.util.LinkedHashSet;
import java.io.*;
class LinkedHashSetDemo
{
 public static void main(String args[]){
 //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet<String>();
               set.add("predeep");
               set.add("Syama");
               set.add("gowri");
               set.add("Adarsh");
               set.add("Devika");
               Iterator<String> i=set.iterator();
               while(i.hasNext())
               {
               System.out.println(i.next());
               }
               System.out.println("Size of LinkedHashSet = " +set.size());
 }
}
