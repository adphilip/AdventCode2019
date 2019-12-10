import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue; 
import Person.*;
import Toys.*;
import java.io.IOException;

class AdventCode2019{

    class Problem extends Exception{}
    interface intDanger{
        default void x(){
            System.out.println("Abcdef");
        }
    }
    abstract class Danger1{}
    class Danger2{}
    abstract class Danger extends Danger1{
        protected abstract void isDanger() throws Problem;
    }

    public class SeriousDanger extends Danger {
        protected void isDanger() throws Problem {//!!! could not throws Exception
            System.out.println ("Serious Danger!!!");
        }
    }

    //functional test
    BinaryOperator<Integer> sum = (a,b) -> a + b;
    // Function<String,Integer> atoi = s -> Integer.valueOf(s);

    //static nested class
    static class Tree{}

    public enum Snow 
    {Blizzard, Squall, Flurry};

    public static void main(String args[]){
        //-----------------Advent start--------------
      //  AdventToCode1 adventOne = new AdventToCode1();
      //  adventOne.fuelConsumtion();
     // AdventToCode2 adventTwo = new AdventToCode2();
      //adventTwo.findNounVerb();
      //adventTwo.resolvePuzzleInput();
    // AdventToCode3 adventThree = new AdventToCode3();
    // adventThree.fullFillData();
    // adventThree.findMinimumCommon();
    // adventThree.sumOfData();
   
    try {
    AdventToCode8 adventCode8 = new AdventToCode8();
    adventCode8.whenWriteStringUsingBufferedWritter_thenCorrect();
    adventCode8.functionPartTwo();
    }
    catch(IOException e){
        System.out.println ("IOException!!!");
    }

    

      System.out.println("-----------------Advent finish--------------\n");
    
        //--------------------OCP------------------
    //     int water = 10 + 5; // water must be final or efectively final (nu se mai modica dupa)
    //     final class Oak extends Tree {
    //         public int getWater(){
    //             return water;
    //         }
    //     }
    //     //water = 30;

    //     OCPTest ocptest = new OCPTest();

    //     Person person1 = new Person("Vasile", 45);
    //     Person person2 = new Person("Ghita", 23);
        
    //     //List
    //     List<Person> listPerson = new ArrayList<Person>();
    //     listPerson.add(person1);
    //     listPerson.add(new Person("Gina", 3));

    //     //PrintList
    //     System.out.println(listPerson);
    //     for(int i=0 ; i<listPerson.size();i++){
    //         System.out.println("age = " + listPerson.get(i).getAge());
    //     }

    //     listPerson.add(person2);
    

    //     //Set - unique
    //     Set<Person> setPerson = new HashSet<>();
    //     setPerson.add(person1);
    //     setPerson.add(person2);
    //     setPerson.add(new Person("Vasile", 45));
    //     setPerson.add(person1);

    //     for(Person k :setPerson){
    //         System.out.println("name set = " + k.getName());
    //     }

    //     System.out.println("Contains : " + setPerson.contains(person1));

    //     // --- set sort

    //     //map
    //     Map<String, Person> mapPerson = new HashMap<>();
    //    // mapPerson.add(person1);
    //    mapPerson.put("one", person1);
    //    System.out.println("value map = " + mapPerson.get("one"));
     
    //     String str = "how to do in java provides java tutorials \n\r dfasf \n\r doar n \n doar r \r and";
    //     String newStr = str.replaceAll("\n|\r", "");
    //     System.out.println("TOP: " + newStr);

    //     //end
    //     System.out.println("getAge: "  + person1.getAge());
    //     System.out.println("Static nested class: " + new Oak().getWater());
    //     System.out.println("Enum : "  + Snow.Blizzard.ordinal());

    //     //stream
    //     List<Toys> toys = new ArrayList<>();
    //     toys.add(new Toys("red", 10));
    //     toys.add(new Toys("yellow", 10));
    //     toys.add(new Toys("red", 10));

    //     double totalPrice = toys.stream()
    //                             .filter(e -> e.getColor() == "red")
    //                             .mapToDouble(e -> e.getPrice())
    //                             .sum();
    //     System.out.println("Total Price of Red Toys: " + totalPrice);

    //     //queue
    //     Queue<String> products = new ArrayDeque<String>();
    //     products.add("p1");
    //     products.add("p2");
    //     products.add("p3");
    //   //  System.out.print(products.poll());
    //     System.out.print(products.peek()); //returneaza elementul dar ramane la inceputul coadei
    //     //System.out.print(products.poll());// returneaza elementul si il sterge din coada
    //     System.out.println("\n----- queue ----\n");
    //     products.forEach(s -> System.out.print(s));

    //     //Functional programming

    //    // Ex.1
    //     System.out.println("\n 1. Sum functional: " + ocptest.sum.apply(34, 66));

    //     //Ex. 2
    //     // Functional interface - single abstract method
    //     Map<String, Integer> nameMap = new HashMap<>();
    //     nameMap.put("John", 55);
    //     System.out.println(" 2. Map :" +  nameMap.computeIfAbsent("John", s -> s.length()));
    //     System.out.println(" 2.1 Map :" +  nameMap.computeIfAbsent("John", String::length));

    //     //Ex. 3
        
    //     Map<String, Integer> salaries = new HashMap<>();
    //     salaries.put("John", 40000);
    //     salaries.put("Freddy", 30000);
    //     salaries.put("Samuel", 50000);

    //     salaries.replaceAll((name, oldValue) -> name.equals("Freddy") ? oldValue : oldValue + 1000);
    //     salaries.replaceAll((name, oldValue) -> oldValue + 2000);
    //     for (String k : salaries.keySet())
    //         System.out.println("3. Print key " + k);
     
    //     salaries.forEach((k,v) -> System.out.println("3.1 k, v = " + k + v));
    //    // salaries.forEach(System.out::println, System.out::println);


        System.out.println ("\nEnd!!!");
    }

}

