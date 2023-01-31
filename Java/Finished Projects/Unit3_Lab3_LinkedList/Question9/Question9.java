package Question9;

import java.util.*;

public class Question9 {
    public static void main(String[] args) {
      LinkedList<String> list1 = new LinkedList<>();
      list1.add("A");
      list1.add("B");
      list1.add("C");
      System.out.println("List 1: " + list1);
      System.out.print("printSkipper output: ");
      Lists.printSkipper(list1);
  
      LinkedList<String> list2 = new LinkedList<>();
      list2.add("A");
      list2.add("B");
      System.out.println("List 2: " + list2);
      System.out.print("printSkipper output: ");
      Lists.printSkipper(list2);
  
      LinkedList<String> list3 = new LinkedList<>();
      list3.add("A");
      list3.add("B");
      list3.add("C");
      list3.add("D");
      list3.add("E");
      System.out.println("List 3: " + list3);
      System.out.print("printSkipper output: ");
      Lists.printSkipper(list3);
    }
  }