package lab6.ex10ComShop;

public class Processor {
    private int CPUCore, CPUThread;
    private float cacheSize;
    public Processor(int CPUCore, int CPUThread, float cacheSize) {
        this.CPUCore=CPUCore;
        this.CPUThread=CPUThread;
        this.cacheSize=cacheSize;
    }

    public int getCPUCore() {
        return CPUCore;
    }

    public int getCPUThread() {
        return CPUThread;
    }

    public float getCacheSize() {
        return cacheSize;
    }
}
