import org.jetbrains.annotations.NotNull;

import static java.awt.SystemColor.text;

public class Repository extends DataSourse {

    private final DataSourse cloudDataSource;
    private final DataSourse cachedDataSource;

    public Repository(DataSourse cloudDataSource, DataSourse cachedDataSource){
        this.cloudDataSource = cloudDataSource;
        this.cachedDataSource = cachedDataSource;
    }

    @Override
    public MyData getData() {
        MyData result = cachedDataSource.getData();
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
