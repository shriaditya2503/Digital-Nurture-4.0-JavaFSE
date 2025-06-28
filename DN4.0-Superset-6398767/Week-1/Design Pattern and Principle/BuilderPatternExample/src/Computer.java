public class Computer {
    private String CPU;
    private String RAM;
    private String storage;

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
    }

    public static ComputerBuilder builder() {
        return new ComputerBuilder();
    }

    public static class ComputerBuilder {
        public String CPU;
        public String RAM;
        public String storage;

        public ComputerBuilder CPU(String cpu) {
            this.CPU = cpu;
            return this;
        }

        public ComputerBuilder RAM(String ram) {
            this.RAM = ram;
            return this;
        }

        public ComputerBuilder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public void showSpecs() {
        System.out.println("CPU : " + CPU);
        System.out.println("RAM : " + RAM);
        System.out.println("Storage : " + storage);
    }
}
