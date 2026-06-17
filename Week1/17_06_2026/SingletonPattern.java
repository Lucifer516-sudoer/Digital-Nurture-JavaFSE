public class SingletonPattern {
    //
    // Referred: refactoring.guru
    //
    private static SingletonPattern instance;
    public String someValue; // I actually don't need this for this example, but i am including it

    // Constructor
    // I am really confused about access modifiers, and then need to learn about a
    // lot, to complete these 13 modules
    SingletonPattern(String value) {
        this.someValue = value;
    }

    public static SingletonPattern getInstance(String value) {
        if (instance == null) {
            // creating new instance and assiging to the instance variable
            instance = new SingletonPattern(value);
        }
        return instance;
    }

    public static void main(String[] args) {

    }
}