package lab6.ex10ComShop;

public class Memory {
    private String memoryType, formFactor;
    private int memorySize;
    public Memory(String memoryType, String formFactor, int memorySize) {
        this.memoryType=memoryType;
        this.formFactor=formFactor;
        this.memorySize= memorySize;
    }
    public String getMemoryType() {
        return memoryType;
    }
    public String getFormFactor() {
        return formFactor;
    }
    public int getMemorySize() {
        return memorySize;
    }
}
