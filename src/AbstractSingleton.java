import java.util.concurrent.atomic.AtomicReference;

public abstract class AbstractSingleton<T> {

    private final AtomicReference<T> ar = new AtomicReference<T>();

    public T getInstance(){
        T ret = ar.get();
        if (ret == null){
            synchronized (this){
                if (ret == null){
                    ret = newObj();
                    ar.set(ret);
                }else {
                    ret = ar.get();
                }
            }
        }
        return ret;
    }
    protected abstract T newObj();
}