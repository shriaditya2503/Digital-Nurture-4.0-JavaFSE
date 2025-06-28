public class Main {
    public static void main(String[] args) {
        Computer computer1 = Computer.builder()
                .CPU("Intel i5")
                .RAM("16 GB")
                .storage("512 GB")
                .build();

        computer1.showSpecs();

        System.out.println();

        Computer computer2 = Computer.builder()
                .CPU("Ryzen 5")
                .RAM("8 GB")
                .storage("256 GB")
                .build();

        computer2.showSpecs();
    }
}