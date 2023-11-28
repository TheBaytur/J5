import org.jetbrains.annotations.Nullable;

public class CloudDataSource extends DataSourse{

    @Nullable
    @Override
    public MyData getData(){
        return new MyData(1, "description_1");
    }
}
