package Iterator.example;

public class ProductCatalog implements Iterable {

    private String[] productCatalog;

    public ProductCatalog(String[] productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < productCatalog.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return productCatalog[index++];
            }
            return null;
        }
    }

}
