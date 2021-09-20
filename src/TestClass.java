public class TestClass {
    public static void main(String[] args) {
        State state = new State();

        new Binary(state);
        new Octal(state);

        System.out.println("1st state change: 15");
        state.setState(50);
        System.out.println();

        System.out.println("2nd state change: 10");
        state.setState(60);
    }
}