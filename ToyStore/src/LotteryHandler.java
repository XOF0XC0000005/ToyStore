import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LotteryHandler {
    Queue<Toy> toyQueue = new PriorityQueue<Toy>(Comparator.comparing(Toy::getRate));

    public void addToys(String id, String name, int rate) {
        toyQueue.add(new Toy("1", "Конструктор", 7));
        toyQueue.add(new Toy("2", "Машина", 2));
        toyQueue.add(new Toy("3", "Кукла", 2));
    }
}
