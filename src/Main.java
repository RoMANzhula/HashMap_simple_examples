import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        removeByValueFromHashMap(); //вызываем метод, который удалит из HashMap все элементы, у которых значение будет
        //меньше, чем введет пользователь
    }

    public static void removeByValueFromHashMap() { //метод, который удаляет из HashMap все элементы, у которых значение
        //меньше, чем введет пользователь
        System.out.println("Please input number for delete elements that are less than: \s"); //просим пользователя ввести число
        Scanner scanner = new Scanner(System.in); //с помощью класса Scanner
        int numberFromConsole = scanner.nextInt(); //создаем переменную, в которую читаем введенное пользователем число с клавиатуры

        HashMap<String, Integer> ages = new HashMap<String, Integer>(); //создаем коллекцию с типом и поведением HashMap с
        //параметрами(дженериками) <String, Integer>
        //заполняем нашу коллекцию данными
        ages.put("Mykola", 22);
        ages.put("Sergiy", 23);
        ages.put("Vasyl", 32);
        ages.put("Anna", 21);
        ages.put("Dmytro", 19);
        ages.put("Maria", 24);
        ages.put("Foontic", 28);

        String[] arrayKeys = new String[ages.size()]; //создаем строковый массив для Ключей(т.к. наш первый дженерик в Карте String),
        //который имеет длину равную размеру нашей Карты(коллекции)
        arrayKeys = ages.keySet().toArray(arrayKeys); //заполняем массив элементами - Ключами из карты

        for (String elementArrayKeys : arrayKeys) { //с помощью for-each проходим по каждому элементу из массива
            if (ages.get(elementArrayKeys) < numberFromConsole) { //и если элемент Карты по Ключу(элемент массива) имеет
                //Значение меньше, чем ввел пользователь на клавиатуре, то
                ages.remove(elementArrayKeys);//мы удаляем из Карты данный элемент
            }
        }

        System.out.println("Our collection after deleted by value: " + ages);
    }
}