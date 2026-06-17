# OOP
> **O**bject **O**riented **P**rogramming

# OOP in Java
- Java is an 1st class OOP language
- Everything is an object in Java
- ### 4 Pillars in Java OOP
  - 1. Encapsulation
    - Restricting access to the data, that should not be given permission to access
    - For **eg**; 
      - An account's balance
      - A person's SSN
      - Email Address
      - Etc,.
  - 2. Inheritance
    - Just like inheriting certain characters from parents, this too works.
    - We use `extends` to inherit from a Base/Parent Class to create a sub-class or child class.
      - Multi-level inheritance is allowed, but not the multiple inheritance.
      - single, hierarchical are allowed
  - 3. Polymorphism
    - It is the ability of a class to allow to act and respond to another type of class, idk the exact term, but i can understand it.
      - **Code example:**
        ```java
        class AdHoc {
            public String add(int n1, int n2) {
                // ...
            }
            public String add(String word1, String word2) {
                // ...
            }
        }
        public class Calculator {
            public static void main(String[] a) {
                // And I call it in here, with the arguments of the types specified in the signature
                // ...
            }
        }
        ```
      - In `Python` we use, something called `DuckTyping`
  - 4. Abstraction
    - Hiding unnecessary details
    - SImple that is it, you dont have to know the physics to turn on a fan's switch isnt it?