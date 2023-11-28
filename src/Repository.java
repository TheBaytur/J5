public class Repository extends DataSourse{

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
            result = cloudDataSource.getData();
        }
        return result;
    }
}
