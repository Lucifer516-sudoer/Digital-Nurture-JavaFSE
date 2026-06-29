
public class BuilderPattern {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel Core i5 11th Gen")
                .hdd("1TB")
                .ram("16GB")
                .ssd("512GB")
                .assemble();
        System.out.println(computer);
    }
}