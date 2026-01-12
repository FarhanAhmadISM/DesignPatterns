import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IphoneStocksObservable implements StocksObservable {
    public List<NotificationObserver> observers = new CopyOnWriteArrayList<>();
    public volatile int countOfStock = 0;
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
    public synchronized void setStockQuantity(int newStocksAdded) {
        this.countOfStock = newStocksAdded;
        if(this.countOfStock == 0) {
            return;
        }
        notifyUsers();
    }
}
