package FilaCircular;

public class Main {
    public static void main(String[] args) {
        FilaCircular fila = new FilaCircular(5);

        fila.add(1);
        fila.add(2);
        fila.add(3);
        fila.printFila(); // Fila: 1 2 3

        fila.add(4);
        fila.add(5);
        fila.printFila(); // Fila: 1 2 3 4 5

        System.out.println(fila.remove()); // 1
        System.out.println(fila.remove()); // 2
        fila.printFila(); // Fila: 3 4 5

        fila.add(6);
        fila.add(7);
        fila.printFila(); // Fila: 3 4 5 6 7

        fila.clear();
        fila.printFila(); // Fila vazia
    }
}
