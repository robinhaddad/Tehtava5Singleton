public class BProductFactory extends AbstractFactory {
 private BProductFactory(){}

    private static AbstractSingleton<BProductFactory> mySingleton = new AbstractSingleton<>() {
        @Override
        protected BProductFactory newObj() {
            return new BProductFactory();
        }
    };
    @Override
    public BProduct makeProduct() {return new BProduct();}

    public static BProductFactory getInstance(){return mySingleton.getInstance();}

}