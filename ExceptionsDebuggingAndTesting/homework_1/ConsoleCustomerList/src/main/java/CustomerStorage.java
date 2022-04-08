import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Неверное кол-во символов");
        }
        if (!checkEmail(components[INDEX_EMAIL])) {
            throw new IllegalArgumentException("Неверный формат email");
        }
        if (!checkPhone(components[INDEX_PHONE])) {
            throw new IllegalArgumentException("Неверный номер телефона");
        }
        String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
        storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        if (!checkName(name)){
            throw new IllegalArgumentException("Такого имени нет в листе");
        }
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }

    public boolean checkEmail(String email) {
        String regex = "@";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public boolean checkPhone(String phone) {
        String regex = "(\\+7|8)\\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public boolean checkName(String name) {
        if (storage.containsKey(name)) {
            return true;
        }
        return false;
    }
}