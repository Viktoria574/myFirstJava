package lab1.ticket23;

class Factory {
    static Shape create(String name) {
        if(name=="Circle")
            return new Circle();
        else return new R();
    }
}
