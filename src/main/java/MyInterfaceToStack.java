public interface MyInterfaceToStack {
    void push(Object value);
    void remove(int index);
    void clear();
    int size();
    Object peek();
    Object pop();
}
