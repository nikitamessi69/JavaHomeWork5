package homework5;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = phoneBook.get(name);
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<>();
            phoneBook.put(name, phoneNumbers);
        }
        phoneNumbers.add(phoneNumber);
    }
//сортируем по убыванию
    public void printPhoneBook() {
        List<Map.Entry<String, List<String>>> sortedList = new ArrayList<>(phoneBook.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
//вывод отсортированного списка
        for (Map.Entry<String, List<String>> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
