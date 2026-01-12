import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class IphoneStocksObservable implements StocksObservable {
    public List<NotificationObserver> observers = new CopyOnWriteArrayList<>();
    public AtomicInteger countOfStock = new AtomicInteger(0);

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
        countOfStock.set(newStocksAdded);
        if (newStocksAdded != 0) {
            notifyUsers();
        }
    }
}
