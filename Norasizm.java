import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Norasizm{
    public static void AddNum(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        AddNum("Nergov", 121153, bookPhone);
        AddNum("Petrovich", 9526, bookPhone);
        AddNum("Nergov", 546585, bookPhone);
        AddNum("Serega", 265235, bookPhone);
        AddNum("Petrovich", 8800555, bookPhone);
        AddNum("Serega", 8984566, bookPhone);
        printBook(bookPhone);
       }
}
