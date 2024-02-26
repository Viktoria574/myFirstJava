package lab6.ex10ComShop;

import java.util.Scanner;
public class Shop implements InputInfo{
    Computer[] computerArray;
    public Processor inputProcessor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество ядер процессора: ");
        int CPUCore = sc.nextInt();
        System.out.println("Введите количество потоков процессора: ");
        int CPUThread = sc.nextInt();
        System.out.println("Введите размер кэша процессора: ");
        float cacheSize = sc.nextFloat();
        return new Processor(CPUCore,CPUThread, cacheSize);
    }

    public Memory inputMemory() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тип памяти: ");
        String memoryType = sc.next();
        System.out.println("Введите форм-фактор памяти: ");
        String formFactor = sc.next();
        System.out.println("Введите размер памяти: ");
        int memorySize = sc.nextInt();
        return new Memory(memoryType,formFactor, memorySize);
    }

    public Monitor inputMonitor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину диагонали монитора: ");
        float diagonal = sc.nextFloat();
        System.out.println("Введите разрешение монитора: ");
        String resolution = sc.next();
        System.out.println("Введите герцовку монитора: ");
        int Hz = sc.nextInt();
        return new Monitor(diagonal,resolution, Hz);
    }

    public Brands inputBrand() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите брэнд компьютера: ");
        String brand = sc.next();
        if(brand.equals("ASUS"))
            return Brands.ASUS;
        else if(brand.equals("HP"))
            return Brands.HP;
        else if(brand.equals("LENOVO"))
            return Brands.LENOVO;
        else return Brands.DELL;
    }
    public Computer[] inputComputer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество вводимых компьютеров");
        int n=sc.nextInt();
        Computer[] computerArray = new Computer[n];
        for (int i=0;i<n;i++) {
            computerArray[i] = new Computer(this.inputProcessor(), this.inputMemory(), this.inputMonitor(), this.inputBrand());
        }
        return computerArray;
    }
    public void deleteComputer(Computer[] computerArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество количество удаляемых компьютеров:");
        int cnt = scanner.nextInt();
        for(int i = 0; i<cnt;i++) {
            boolean flag=false;
            System.out.println("Введите брэнд удаляемого удаляемого компьютера");
            String name = scanner.next();
            for(int j=0;j<computerArray.length;j++) {
                if(computerArray[j]!=null && computerArray[j].getBrand().toString()==name) {
                    computerArray[j] = null;
                    System.out.println("Компьютер удален");
                    flag=true;
                }
            }
            if(!flag)
                System.out.println("Компьютер не найден");
        }
    }

    public void searchComputer(Computer[] computerArray) {
        boolean flag=false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите брэнд искомого компьютера");
        String name = scanner.next();
        for(int i=0;i<computerArray.length;i++) {
            if(name.equals(computerArray[i].getBrand().toString())) {
                System.out.println("Количество ядер: " + computerArray[i].getProcessor().getCPUCore() +
                        " Количество потоков: " + computerArray[i].getProcessor().getCPUThread() +
                        " Размер кэша: " + computerArray[i].getProcessor().getCacheSize() + "\n" +
                        "Тип памяти: " + computerArray[i].getMemory().getMemoryType() +
                        " Объем памяти: " + computerArray[i].getMemory().getMemorySize()+
                        " Форм-фактор памяти: " + computerArray[i].getMemory().getFormFactor()+ "\n" +
                        "Разрешение экрана: " + computerArray[i].getMonitor().getResolution()+
                        " Длина диагонали: " + computerArray[i].getMonitor().getDiagonal()+
                        " Герцовка монитора: " + computerArray[i].getMonitor().getHz());
                flag=true;
            }
        }
        if(!flag)
            System.out.println("Компьютер не найден");
    }
}
