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


###  7:47 PM
- I actually understood how, static is being used.
- Anything that is declared with the keyword `static` is actually made to be just with the `Class` other than the `Object` 

---

# 16/06/2026
> Was slightly ill, so didn't want to waste any time, so spent time on recovering ...

---

# 17/06/2026
### 6:30 PM
- Was understand the OOP concept in JAVA, well, I am bad at OOPs for this long ...
- And Java Doesnt have multiple inheritance due to diamond problem ...

### 7:24 PM
- Well, I wanted to rotate topic, so trying out the hands-on, creating the singleton class
- Its actually considered an anti-pattern for some reason, which i dont bother knowing now.
- Let me create that SingleTon pattern in java, well i have a small amount of experience regardin its creation with using in java, for creating a database wrapper class

---

# 18/06/2026
### 6:27 PM
- Well instead of completely creating all sorts of pattern, i am going to concentrate on the ones that where mentioned
