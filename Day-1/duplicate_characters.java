Enhanced For-Loop with entrySet():  Useful for both keys and values.
Enhanced For-Loop with keySet():  Useful if you need to retrieve values using keys.
Enhanced For-Loop with values():  Useful if only values are needed.
Java 8 Stream API:  Provides a functional and expressive way to process entries.
Iterator with entrySet():  Allows for more control over iteration, such as removing entries.
Iterator with keySet():  Provides a way to access keys and values with more control.



import java.io.*;
import java.util.*;

class GFG 
{
  
  // Java program to count all duplicates
  // from string using maps
  static void printDups(String str)
  {
    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      if(count.containsKey(str.charAt(i)))
        count.put(str.charAt(i) , count.get(str.charAt(i))+1); 
      else count.put(str.charAt(i),1);
      //increase the count of characters by 1 
    }

    for (Map.Entry<Character,Integer> mapElement : count.entrySet()) {   //iterating through the unordered map 
      if (mapElement.getValue() > 1)   //if the count of characters is greater than 1 then duplicate found
        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
    }
  }


