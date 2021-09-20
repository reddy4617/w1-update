public class Binary extends Observer {
    public State state;

    public Binary(State state){
        this.state = state;
        state.add(this);
    }

    @Override
    public void changeData() {
        System.out.println("Binary = "+Integer.toBinaryString(state.getState()));
    }
}