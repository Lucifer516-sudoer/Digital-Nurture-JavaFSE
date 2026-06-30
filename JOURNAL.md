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
- And Java doesn't have multiple inheritance due to diamond problem ...

### 7:24 PM
- Well, I wanted to rotate topic, so trying out the hands-on, creating the singleton class
- Its actually considered an anti-pattern for some reason, which i don't bother knowing now.
- Let me create that SingleTon pattern in java, well i have a small amount of experience regarding its creation with using in java, for creating a database wrapper class

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
- Today I need to create the builder pattern successfully and then, create the E-commerce search site stuff

# 10:18 AM
- Completed the programming of Computer class using Builder pattern, though I didn't create the director or anything now.
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
- Implementing the `E-commerceSearch.java`

---
# 23/06/2026

## 10:19 AM
- Felling ill, due to wheezing issues and low nutrition.
- Having dizziness

## 10:24 AM
- Just now saw that the E-commerce Platform search I implemented was wrong
- They have instructed in the docx file, which i probably should have read before itself.
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
- started to look into maven 
## 11:20 AM
- Time went so fast
## 12:11 PM
- It's already noon
- And hey, i changed my vscode theme, !? why? my eyes where craving for something good
- I will be leaving the bug in the calculator for worthwhile...
## 12:34 PM
- Hey its 1234 PM, okay let it be, now i am going to modify the test folder with Junit5 related Fixtures, BeforeEach, and AfterEach
- Well, asked Chat, and he said, its better supported now, and its good to stay on the latest and stable one.

## 2:21 PM
- Couldn't eat, because, spoke with a senior, for stuffs regarding, how was his intern etc ...
- Came by 2:05 PM and finished what was said in the handbook regarding `BeforeEach` and `AfterEach`
- Uploaded the snapshot, and going to push it to github

## 2:35 PM
- Little bit of me time, going to learn something on the internet.
- Work while you work, play while you play.

# 25/06/2026
## 10:02 AM
- I logged into my arch, unknowingly, and the windows machine's time got messed and said, it was 4:30 AM in the **morning**. Then I synced the time.
- I think I need to complete other stuffs regarding TDD.
- Yes, JUnit5 advanced exercises.

## 10:24 AM
- Not asked, but going to load from csv source

## 11:04 AM
- New info: Primitives can never be null
  - **For eg:**
    - if an method expects int object (or data, i aint sure though what u call it here), it cannot be supplied `null`
    - but, if that method expects `String` data/object then it can be supplied `null`.

## 2:22 PM
- Had lunch, and forgot to log for a while...
- Instead of using `ChatGPT` was surfing the web ... (yep just like the old school way ...)

# 27/06/2026
## ~ 10 AM
- yesterday It just went with learning, and day before yesterday, i spent on coding, but didnt attach and push output
  
## 3:05 PM
- Feeling tired and sleepy ...
- tryna complete the remaining hands on
- Next stop, i want to understand spring boot, well the total spring umbrella
- ANd also JPA, Hibernate
- Then prepare for MCQ in detail, while also improving my communication and PS, CP, APT.
- Need to learn DSA.
- What am I gonna do though ?>! `:)`

# Week 3
> Took a little break, coz i was working you know ... ¯\_(ツ)_/¯
> So I took a little break

## 10:01 AM
- Need to start a lot of things I kept in draft ...

## 11:07 AM
- Successfully done the mockito mock object creation
- Seems as if i can create a mocker myself in python just like this ...

# 11:56 AM
- I saw a dude's repo structure, it was future proof, so let me make mine too

---
> Switched to arch
> Why? I can type a lot in here ...
---
> Note: Starting from today
> The date and time and logging method will be changed
> Example format: ```# 30th June, 2026 - 12:02:59 PM```

# 30th June, 2026 - 12:02:59 PM
- Finally feels home to use Linux, with vim mode in vscode...
- Added few extensions to insert date and time, easily
- Its time for me to continue where I left ...

# 30th June, 2026 - 12:08:15 PM
- Ok, where should I start, I left right around, Mockito basics ...
- Need to install repomix too

# 30th June, 2026 - 2:30:08 PM
- Now I am feeling very tired and sleepy
- had curd rice and apple, and naturally feeling sleepy too
- Having trouble sleeping ...
  
# 30th June, 2026 - 3:03:09 PM
- Cannot bare sleeping, always running out of time
- Cannot sleep in here too, if it was home, i wouldnt worry i can sleep (nap)
- And recharge myself

# 30th June, 2026 - 3:07:13 PM
- Maybe i should do the handson
- ANd complete it and add it to the outputs folder

# 30th June, 2026 - 4:24:59 PM
- Feeling devastated, unable to even complete a GUIDE to structure my learning

# 30th June, 2026 - 4:36:05 PM
- Well 25 days, it is.
- Only 2 modules where done up and till now
- How, am I going to complete the topics from angular to Microservices, spring, jpa, jdbc, hibernate?
- Now it has become a very big ⁉️ mark...
- Hmmmm 😮‍💨.
- Its okay.
- ``¯\_(ツ)_/¯``