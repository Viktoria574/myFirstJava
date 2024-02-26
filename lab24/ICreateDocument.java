package lab24;

public interface ICreateDocument {//фабричный интерфейс
    IDocument createNew();
    IDocument createOpen();
}
