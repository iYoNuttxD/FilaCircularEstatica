package FilaCircular;

public class FilaCircular {
    private int top = -1;
    private int base = 0;
    private int[] data;

    public FilaCircular(int size) {
        data = new int[size];
    }

    public boolean isFull() {
        return move(top) == base && data[top] != 0;
    }

    public boolean isEmpty() {
        return top == -1 || base == (top + 1) % data.length;
    }

    public void add(int element) {
        if (isFull()) {
            System.out.println("Fila cheia");
        }
        top = move(top);
        data[top] = element;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        }
        int element = data[base];
        data[base] = 0;
        base = move(base);
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

    public void printFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            System.out.print("Fila: ");
            for (int i = base; ; i = move(i)) {
                System.out.print(data[i] + " ");
                if (i == top) break;
            }
            System.out.println();
        }
    }
}
