import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class LotteryHandler {
    Queue<Toy> toyQueue = new PriorityQueue<>(Toy::compareTo);

    public void addToys() {
        toyQueue.add(new Toy("Конструктор", 2));
        toyQueue.add(new Toy("Машина", 7));
        toyQueue.add(new Toy( "Кукла", 2));
    }

    public void addToy(String name, int rate) {
        toyQueue.add(new Toy(name, rate));
    }

    public void showAllToys() {
        for (Toy toy :
                toyQueue) {
            System.out.println(toy);
        }
    }

    public List<Toy> getToys() {
        List<Toy> toys = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Toy toy = toyQueue.poll();
            toys.add(toy);
            toy.lowerRate();
            toyQueue.add(toy);
        }

        return toys;
    }
}
