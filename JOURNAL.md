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

### 7:27 PM
- Interesting, I actually today alone saw there was an hands on for me to create a logger class that implemented the singleton, it was really useful.
- And co-incidentally the time is `7:27 PM`.

### 8:01 PM
- Got to hostel, food is very important, to any living being

---

# 19/06/2026
### 9:50 AM
- Got into learning by 9:50 AM
- Created the Factory Method Pattern
- Along with interface and abstraction

---

### 3:03 PM
- A Sr. Director Manager from XYZ company came and gave us a great talk to listen to.
- And now alone I committed the source code.

---

### 3:07 PM
- Next to the Builder Pattern, though it is not mandatory pattern

---

# 20/06/2026
### 9:30 AM
- Got on the system and started to flip thru what i did yesterday.

### 12:26 PM
- Understood about builder pattern
- Made mistake on how its build, method chaining was correct though.

### 12:29 PM
- I was already one week late to the party, and its gonna be the end of the second week, i am not sure, what i am going to do.
- But i will do it.
- Doesn't matter. I will do what i can.

---

# 22/06/2026

# 9:45 AM
- On `21/06/2026 ` I took rest. Because, all work and no play, makes Jack a dull boy ...
- Today I need to create the builder pattern successfully and then, create the Ecommerce search site stuff

# 10:18 AM
- Completed the programming of Computer class using Builder pattern, though I didnt create the director or anything now.
- Next step, to something cool mentioned in the docx `Exercise 2: E-commerce Platform Search Function`
- Others in my batch, have already moved to PL/SQL and stuffs, I want to start from the bottom, get to the top.

---

# 10:41 AM
- Created classes/enums for:
  - 1. Product
  - 2. Rating
  - 3. Review
  - 4. Category
- On the other hand, I suppose I will take too long to complete these I suppose.****

# 10:55 AM
- Got lil bit distracted and gone to surf w3schools regarding access/non-access modifiers and stuffs

# 12:11 PM
- Learning quite the amount of stuffs from w3 schools

# 12:16 PM
- Implementing the `EcommerceSerch.java`

---
# 23/06/2026

## 10:19 AM
- Felling ill, due to wheezing issues and low nutrition.
- Having drizziness

## 10:24 AM
- Just now saw that the Ecommerce Platform search I implemented was wrong
- They have instructed in the docx file, which i probly should have read before itself.
- let me correct the implementation first and then continue with the next system
## 4:59 PM
- After doing bit of duties in academics, done the dsa mandatory stuffs, moving on into the PL/SQL today, since, I am already behind the pace

## 5:45 PM
- Got a bit confused, so consulted ChatGPT 😜 and got some insights ...
- Let me learn about **JUnit5** instead of **PL/SQL**

## 6:12 PM
- Just now understand, the diff b/w Project and package in java and why the com usage?.. and stuffs

# 24/06/2026
## 9:50 AM
- started to lookinto maven 
## 11:20 AM
- Time went so fast
## 12:11 PM
- It's already noon
- And hey, i changed my vscode theme, !? why? my eyes where craving for something good
- I will be leaving the bug in the calculator for worthwhile...