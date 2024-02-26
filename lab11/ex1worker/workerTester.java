package lab11.ex1worker;

import java.util.Date;
public class workerTester {
    public static void main(String[] args) {
        worker[] workers ={
                new worker("Иванов", new Date(120,5,2,21,59),new Date(123,9,2,23,00)),
                new worker("Степанов", new Date(122,3,5,23,50),new Date(123,9,3,23,00)),
                new worker("Сидоров", new Date(121,10,11,20,59),new Date(123,9,4,23,00)),
                new worker("Gtnhjd", new Date(123,1,20,2,05),new Date(123,9,5,23,00)),

        };
        for(worker works:workers)
            System.out.println(works.toString());
    }
}
