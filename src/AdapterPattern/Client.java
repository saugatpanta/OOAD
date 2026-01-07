package AdapterPattern;

public class Client {
    public static void clientCode(Printer printer) {
        printer.print();
    }
    public static void main(String[] args) {
        PrinterAdapter printer = new PrinterAdapter();
        clientCode(printer);
    }
}
