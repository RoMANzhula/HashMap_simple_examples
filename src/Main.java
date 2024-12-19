import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        removeByValueFromHashMap();
    }

    public static void removeByValueFromHashMap() { 
        System.out.println("Please input number for delete elements that are less than: \s");
        Scanner scanner = new Scanner(System.in);
        int numberFromConsole = scanner.nextInt();

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        
        ages.put("Mykola", 22);
        ages.put("Sergiy", 23);
        ages.put("Vasyl", 32);
        ages.put("Anna", 21);
        ages.put("Dmytro", 19);
        ages.put("Maria", 24);
        ages.put("Foontic", 28);

        String[] arrayKeys = new String[ages.size()];
        arrayKeys = ages.keySet().toArray(arrayKeys);

        for (String elementArrayKeys : arrayKeys) {
            if (ages.get(elementArrayKeys) < numberFromConsole) {
                ages.remove(elementArrayKeys);
            }
        }

        System.out.println("Our collection after deleted by value: " + ages);

        scanner.close();
    }
}
