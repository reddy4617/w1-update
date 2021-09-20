public class Octal extends Observer {
    public State state;

    public Octal(State state){
        this.state = state;
        state.add(this);
    }

    @Override
    public void changeData() {
        System.out.println("Octal = "+Integer.toOctalString(state.getState()));
    }
}