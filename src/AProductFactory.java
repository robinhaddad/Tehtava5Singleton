public class AProductFactory extends AbstractFactory{
    private AProductFactory(){}

    private static AbstractSingleton<AProductFactory> mySingleton = new AbstractSingleton<>() {
        @Override
        protected AProductFactory newObj() {
            return new AProductFactory();
        }
    };

    @Override
    public AProduct makeProduct() {return new AProduct();}

    public static AProductFactory getInstance(){return mySingleton.getInstance();}
}
