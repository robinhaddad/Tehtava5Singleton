public class Main {
    public static void main(String[] args) {
        AProductFactory aproductfactory = AProductFactory.getInstance();
        AProduct aProduct = aproductfactory.makeProduct();
        aProduct.makeSerivice();

        BProductFactory bproductfactory = BProductFactory.getInstance();
        BProduct bProduct = bproductfactory.makeProduct();
        bProduct.makeSerivice();
    }
}