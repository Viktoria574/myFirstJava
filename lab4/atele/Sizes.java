package lab4.atele;

public enum  Sizes{
    XXS(32){
        @Override
        public  String getDiscrition(){
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);
    public  String getDiscrition(){
        return "Взрослый размер";
    }
    private final int euroSize;
    private Sizes(int euroSize){
        this.euroSize=euroSize;
    }
}
