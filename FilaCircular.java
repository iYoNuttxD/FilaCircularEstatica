package FilaCircular;

public class FilaCircular {
    private int top = -1;
    private int base = 0;
    private int[] data;

    public FilaCircular(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return move(top) == base && top != -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    // Adiciona um elemento à fila
    public void add(int element) throws IllegalAccessException {
        if (isFull()) {
            throw new IllegalAccessException("Fila Cheia.");
        }
        top = move(top);
        data[top] = element;
        if (base == -1) {
            base = top;
        }
    }

    // Remove o elemento da fila
    public int remove() throws IllegalAccessException {
        if (isEmpty()) {
            throw new IllegalAccessException("Fila Vazia.");
        }
        int element = data[base];
        data[base] = 0;
        if (base == top) {
            clear();
        } else {
            base = move(base);
        }
        return element;
    }

    public void clear() {
        top = -1;
        base = 0;
        data = new int[data.length];
    }

    private int move(int position) {
        return (position + 1) % data.length;
    }

    // Imprime a fila
    public void printFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }
        System.out.print("Fila: ");
        for (int i = base; ; i = move(i)) {
            System.out.print(data[i] + " ");
            if (i == top) break;
        }
        System.out.println();
    }
}
