public class Main {
    public static void main(String[] args) {
        MessagePrinter basicPrinter = new MessagePrinter();
        basicPrinter.printMessage();

        DetailedMessagePrinter detailedPrinter = new DetailedMessagePrinter();
        detailedPrinter.printMessage();
        detailedPrinter.printDetailedMessage();
    }
}
