# Builder Pattern
- This is a better way to handle how arguments get passed
- And how the Object is built.
- **Eg:**
```java
public class User {
    // required fields
    private final String firstName;
    private final String lastName;

    // optional fields
    private final int age;
    private final String email;
    private final String address;

    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.email = builder.email;
        this.address = builder.address;
    }

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String email;
        private String address;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
```