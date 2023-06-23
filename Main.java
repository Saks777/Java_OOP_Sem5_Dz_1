package Seminar_5_DZ_1;

import java.time.LocalDate;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    User User1 = new User("Saken", "Sakenov", "Sakenovich", LocalDate.now());
    User User2 = new User("Baur", "Baurov", "Baurovich", LocalDate.now());
    User User3 = new User("Aida", "Aidova", "Aidovich", LocalDate.now());

    TreeSet treeSet = new TreeSet(new UserComparator());
    treeSet.add(User1);
    treeSet.add(User2);
    treeSet.add(User3);


    System.out.println(treeSet);
  }

}
