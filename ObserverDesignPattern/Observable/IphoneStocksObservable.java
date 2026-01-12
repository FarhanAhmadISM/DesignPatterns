import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IphoneStocksObservable implements StocksObservable {
    public List<NotificationObserver> observers = new CopyOnWriteArrayList<>();
    public int countOfStock = 0;
    private final Lock lock = new ReentrantLock();

    @Override
    public void add(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUsers() {
        for (NotificationObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockQuantity(int newStocksAdded) {
        lock.lock();
        try {
            countOfStock = newStocksAdded;
            if (countOfStock != 0) {
                notifyUsers();
            }
        } finally {
            lock.unlock();
        }
    }
}
