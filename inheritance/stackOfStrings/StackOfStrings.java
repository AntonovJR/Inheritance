package inheritance.stackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String pop() {
        if (!data.isEmpty()) {
            return this.data.remove(this.data.size() - 1);
        }
        return "null";
    }public String peek() {
        if (!data.isEmpty()) {
            return this.data.get(this.data.size() - 1);
        }
        return "null";
    }
    public boolean isEmpty(){
        return data.isEmpty();
    }

}

