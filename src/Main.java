public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        intBox.printBox();

        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics!");
        strBox.printBox();

        NumberBox<Integer> numberBox = new NumberBox<>();
        numberBox.set(100);
        System.out.println("NumberBox contains: " + numberBox.get());

        StringProcessor processor = new StringProcessor();
        System.out.println("Reversed String: " + processor.process("Generics"));

        Library<String> library = new Library<>();
        library.addItem("The Great Gatsby");
        library.addItem("1984");
        library.listItems();
        System.out.println("Find by name: " + library.findItemByName("1984"));
    }
}
