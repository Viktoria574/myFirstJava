package lab13;

public class ex5NumberOfTel {
        private String number;
        public ex5NumberOfTel(String number){
            this.number=number;
        }
        public String toString(){
            if (number.charAt(0) == '+'){
                return number.substring(0, 2)+"-"+number.substring(2, 5)+"-"+number.substring(5, 8)+"-"+number.substring(8, number.length());
            }
            return "+7"+"-"+number.substring(1, 4)+"-"+number.substring(4, 7)+"-"+number.substring(7, number.length());
        }
        public static void main(String[] args) {
            lab13.ex5NumberOfTel ob1= new lab13.ex5NumberOfTel("+79175655655");
            System.out.println(ob1.toString());
            lab13.ex5NumberOfTel ob2= new lab13.ex5NumberOfTel("+104289652211");
            System.out.println(ob2.toString());
            lab13.ex5NumberOfTel ob3= new lab13.ex5NumberOfTel("89175655655");
            System.out.println(ob3.toString());
        }
}
