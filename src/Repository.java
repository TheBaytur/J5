import org.jetbrains.annotations.NotNull;

import static java.awt.SystemColor.text;

public class Repository<T> implements DataSourse<T> {

    private final DataSourse<T> cloudDataSource;
    private final MutableDataSource<T> cachedDataSource;

    public Repository(DataSourse<T> cloudDataSource, MutableDataSource<T> cachedDataSource){
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public T getData() {
        T result = cachedDataSource.getData();
        if (result == null){
            print("no data in cache");
            result = cloudDataSource.getData();
            cachedDataSource.saveData(result);
        } else {
            print("getting from cache");
        }
        return result;

    }

    private void print(String text) {
        System.out.println(text);
    }

//    @Override
//    public void saveData(@NotNull MyData data){
//
//    }
}
