package lab6.ex10ComShop;


public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Brands brand;
    public Computer(Processor processor, Memory memory, Monitor monitor, Brands brand) {
        this.processor=processor;
        this.memory=memory;
        this.monitor=monitor;
        this.brand=brand;
    }
    public Processor getProcessor() {
        return processor;
    }
    public Memory getMemory() {
        return memory;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    public Brands getBrand() {
        return brand;
    }
}
