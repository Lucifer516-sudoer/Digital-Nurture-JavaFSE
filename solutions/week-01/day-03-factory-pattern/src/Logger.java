/*
- Create a New Java Project:
- Create a new Java project named SingletonPatternExample.
- Define a Singleton Class:
- Create a class named Logger that has a private static instance of itself.
- Ensure the constructor of Logger is private.
- Provide a public static method to get the instance of the Logger class.
- Implement the Singleton Pattern:
- Write code to ensure that the Logger class follows the Singleton design pattern.
- Test the Singleton Implementation:
- Create a test class to verify that only one instance of Logger is created and used across the application.
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger instance = null;

    private String name;
    private String level;

    /**
     * @return Name of the logger
     */
    public String getName() {

        return name;
    }

    /**
     * @return Logger's level - Which is of no use now !.
     */
    public String getLevel() {
        return level;
    }

    // Not mentioned but i wish to imitate python in here, as i am learning
    private Logger(String name, String level) {
        this.name = name;
        this.level = level;
        // System.out.println("===================== LOGGER INITIALIZED
        // =====================");
        // System.out.println("===================== Name: " + this.name +
        // "=====================");
        // System.out.println("===================== Level: " + this.level +
        // "=====================");
        // Doesnt feel necessary now, after a very long day, i neeed to give my brain a
        // rest
    }

    public String centerWith(String text, int width, char fillChar) {
        ///
        /// Referred Gemini
        ///
        if (text == null || text.length() >= width)
            return (fillChar + text + fillChar);
        int padding = (width - text.length()) / 2 + text.length();

        return String.format("%-" + width + "s", String.format("%" + padding + "s", text)).replaceAll(" ",
                String.valueOf(fillChar));
    }

    public String centerWith(String text, int width) {
        return centerWith(text, width, ' ');
    }

    public static Logger getLogger(String name, String level) {
        if (instance == null) {
            instance = new Logger(name, level);
        }
        return instance;
    }

    public static String getTimeStamp() {
        try {
            return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")).toString();
        } catch (Exception e) {
            // TODO: handle exception
            // Right Now I don't know to handle the exceptions correctly
            return ("Couldn't generate the TimeStamp: " + e);
        }
    }

    // public void debug(String message) {
    // }
    // actually i
    // dont need this
    public void log(String level, String message) {
        System.out.println("[" + centerWith(level.toUpperCase(), 10) + "] [" + getTimeStamp() + "] " + message);
    }
}
