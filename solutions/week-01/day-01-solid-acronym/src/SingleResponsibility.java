import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private Map<String, String> numbers = new HashMap<>();

    public void setNumber(String userName, String number) {
        numbers.put(userName, number);
    }

    public String getNumber(String userName) {
        return numbers.getOrDefault(userName, userName);
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        PhoneBook ph = new PhoneBook();
        ph.setNumber("Harish", "+91 9042250698");
        System.out.println(ph.getNumber("Harish"));
    }
}
