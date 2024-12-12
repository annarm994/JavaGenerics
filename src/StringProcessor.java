public class StringProcessor implements Processor<String> {
    @Override
    public String process(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
