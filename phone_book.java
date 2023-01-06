package lesson5;
import java.util.ArrayList;
import java.util.HashMap;

public class phone_book {
    private static int num = 0;
    HashMap<String, ArrayList<String>> phoneMap = new HashMap<>();
    public static void main(String[] args) {
        phone_book pb = new phone_book();
        pb.add("Королев", "8(800)576-35-36");
        pb.add("Захаров", "8(495)482-52-76");
        pb.add("Малыгин", "8(800)776-25-20");
        pb.add("Костин", "8(800)474-58-58");
        pb.add("Ярлыкова", "8(654)265-76-89");
        pb.add("Савинов", "8(925)316-65-82");
        pb.add("Зубова", "8(903)155-20-90");
        pb.add("Иванов", "8(903)675-75-10");
        pb.add("Шквалов", "8(495)613-43-04");
        pb.add("Парпов", "8(800)575-33-33");

    for (String x : pb.get("Королев")) {
        num++;
        System.out.println("Королев " + num + " телефон: " + x);
    }
}
    public void add(String surname, String phone) {
        ArrayList<String> strings = phoneMap.get(surname);
        System.out.println("String = " + strings);
        if (strings == null) {
            ArrayList<String> listOfPhones = new ArrayList<>();
            listOfPhones.add(phone);
            phoneMap.put(surname, listOfPhones);
        } else {
            strings.add(phone);
            phoneMap.put(surname, strings);
        }
    }
    public ArrayList<String> get(String surname) {
        return phoneMap.get(surname);
    }

}



