package lab7.ex5line;

public class FuncLine implements liner {
    @Override
    public int CountSymbols(String str){
        return str.length();
    }
    @Override
    public String Transform(String str){
        String s="";
        for(int i=0; i<CountSymbols(str); i++){
            if(i%2==1){
                s+=str.charAt(i);
            }
        }
        return s;
    }
    @Override
    public String Invert(String str){
        String s="";
        for(int i=0; i<CountSymbols(str); i++){
            s+=str.charAt(CountSymbols(str)-i-1);
        }
        return s;
    }
    public static void main(String[] args) {
        FuncLine ob=new FuncLine();
        String str="efefefefefef";
        System.out.println("Количество символов в строке: "+ob.CountSymbols(str));
        System.out.println("Нечетные элементы строки: "+ob.Transform(str));
        System.out.println("Перевернутая строка: "+ob.Invert(str));
    }
}
