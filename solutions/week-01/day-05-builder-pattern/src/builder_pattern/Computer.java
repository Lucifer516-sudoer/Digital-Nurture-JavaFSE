// Create a New Java Project:
// Create a new Java project named BuilderPatternExample.
// Define a Product Class:
// Create a class Computer with attributes like CPU, RAM, Storage, etc.
// Implement the Builder Class:
// Create a static nested Builder class inside Computer with methods to set each attribute.
// Provide a build() method in the Builder class that returns an instance of Computer.
// Implement the Builder Pattern:
// Ensure that the Computer class has a private constructor that takes the Builder as a parameter.
// Test the Builder Implementation:
// Create a test class to demonstrate the creation of different configurations of Computer using the Builder pattern.

public class Computer {
    private final String cpu;
    private final String ram;
    private final String hdd;
    private final String ssd;

    private Computer(Builder builder) {
        this.cpu = builder.cpu_;
        this.ram = builder.ram_;
        this.hdd = builder.hdd_;
        this.ssd = builder.ssd_;
    }

    public static class Builder {
        private String cpu_;
        private String ram_;
        private String hdd_;
        private String ssd_;

        public Builder cpu(String cpu) {
            this.cpu_ = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram_ = ram;
            return this;
        }

        public Builder hdd(String hdd) {
            this.hdd_ = hdd;
            return this;
        }

        public Builder ssd(String ssd) {
            this.ssd_ = ssd;
            return this;
        }

        public Computer assemble() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer [cpu=" + cpu + ", ram=" + ram + ", hdd=" + hdd + ", ssd=" + ssd + "]";
    }

}
