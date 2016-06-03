
// Cheng Haoyang - ID 2015141244003

import java.util.Iterator;
import java.util.Vector;

public class Catalog {

    private Vector products;

    public Catalog() {products = new Vector();}

    public void addProduct(Product product) {products.add(product);}

    public Iterator getProductsIterator() {return products.iterator();}

    public Product getProduct(String code) {
        Iterator i = this.getProductsIterator();
        Product nowProduct;
        while (i.hasNext()) {
            nowProduct = ((Product)i.next());
            if (nowProduct.getCode().equals(code)) {
                return nowProduct;
            }
        }
        return null;
    }

    public int getNumberOfProducts() {return products.size();}

}
