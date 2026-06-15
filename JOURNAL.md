# 15/06/2026
### What to do now?
- [ ]📖 Read: https://www.baeldung.com/solid-principles (full article, take notes)
- [ ]📖 Watch: Java Brains — "SOLID Principles Explained" (YouTube search)
- [ ]💻 Write Java code for each principle: One class per principle, written from scratch (not copied)
- [ ]🔁 Without looking at notes, write the full form of SOLID and one line on what each prevents


### Minutes:
```java
PhoneBook.java:24: error: class SingleResponsibility is public, should be declared in a file named SingleResponsibility.java
public class SingleResponsibility {
       ^
1 error
```
Got the above error for;
```java
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String, String> numbers;

    /**
     * I am not sure, on how to write java docs yet, but will learn it, in this
     * session, or in upcoming ones ...
     * 
     * @param number // Need to update this, but i am not going to get distracted
     *               now ...
     * @return boolean
     */
    public String setNumber(String userName, String number) {
        return numbers.putIfAbsent(userName, number);
    }

    public String getNumber(String userName) {
        return numbers.getOrDefault(userName, userName);
    }
}

public class SingleResponsibility {
    public static void main(String[] args) {
        PhoneBook ph = new PhoneBook();
        if (ph.setNumber("Harish", "+91 9042250698") != null) {
            if (ph.getNumber("Harish") != null ) System.out.println("Added " + );
        } else {
            System.out.println("Contact Saving Failed sadly ...");
        }
    }
}

```