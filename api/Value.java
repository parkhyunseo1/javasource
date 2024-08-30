package api;

public class Value {
    int value;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        return result;
    }

    public Value(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Value [value=" + value + "]";
    }

}
