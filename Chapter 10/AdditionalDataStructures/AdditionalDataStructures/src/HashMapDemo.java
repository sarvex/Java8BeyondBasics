import java.util.HashMap;
import java.util.Map;

import Utilities.StringGenerator;

public class HashMapDemo {
  public void showOperations() {
    Map<Integer, String> hm = new HashMap<>();
    hm.put(Integer.valueOf(0), "White");
    hm.put(Integer.valueOf(1), "Red");
    hm.put(Integer.valueOf(2), "Orange");
    hm.put(Integer.valueOf(3), "Yellow");
    hm.put(Integer.valueOf(4), "Green");
    hm.put(Integer.valueOf(5), "Blue");
    hm.put(Integer.valueOf(6), "Indigo");
    hm.put(Integer.valueOf(7), "Violet");
    hm.put(Integer.valueOf(8), "Black");

    // loop on key set size
    for (int i = 0; i < hm.keySet().size(); i++) {
      // get by key
      System.out.println(hm.get(Integer.valueOf(i))); // where i matches Key
    }
    // loop on hm size:
    System.out.println(StringGenerator.stars());
    for (int i = 0; i < hm.size(); i++) {
      // get by key with default if not there:
      System.out.println(hm.getOrDefault(Integer.valueOf(i * 2), "Not Present"));
    }
    // loop on values collection
    System.out.println(StringGenerator.stars());
    for (String s : hm.values()) {
      // just print out value
      System.out.println("Next Value: " + s);
    }

    Map<String, Integer> hm2 = new HashMap<>();
    hm2.put("Red", Integer.valueOf(0));
    hm2.put("Yellow", Integer.valueOf(1));
    hm2.put("Green", Integer.valueOf(2));
    System.out.println(StringGenerator.stars());
    for (Integer i : hm2.values()) {
      System.out.println("Next Value: " + i);
    }

    // remove and replace (only replaces if exists)
    hm2.remove("Yellow");
    hm2.replace("Green", Integer.valueOf(3));
    hm2.replace("Golden", Integer.valueOf(-10));
    System.out.println(StringGenerator.stars());
    for (Integer i : hm2.values()) {
      System.out.println("Next Value: " + i);
    }

    System.out.println(StringGenerator.stars());
    System.out.println("Contains key 1: " + hm.containsKey(Integer.valueOf(1)));
    if (hm2.containsKey("Red")) {
      System.out.println("Red: " + hm2.get("Red"));
    }
    if (hm2.containsValue(Integer.valueOf(3))) {
      System.out.println("Value is present!");
    }
  }
}
