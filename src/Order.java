
// Cheng Haoyang - ID 2015141244003

import java.util.Iterator;
import java.util.Vector;

public class Order {

    private Vector items;

    public Order() {items = new Vector();}

    public void addItem(OrderItem orderItem) {items.add(orderItem);}

    public void removeItem(OrderItem orderItem) {items.remove(orderItem);}

    public Iterator getItemsIterator() {return items.iterator();}

    public OrderItem getItem(Product product) {
        Iterator i = this.getItemsIterator();
        OrderItem nowItem;

        while (i.hasNext()) {
            nowItem = (OrderItem)i.next();
            if (nowItem.getProduct().equals(product)) {
                return nowItem;
            }
        }
        return null;
    }

    public int getNumberOfItems() {return items.size();}

    public double getTotalCost() {
        Iterator i = this.getItemsIterator();
        double totalCost = 0;

        while (i.hasNext()) {
            totalCost += ((OrderItem)i.next()).getValue();
        }
        return totalCost;
    }
}
