import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CachedDataSource extends DataSourse{

    private MyData myData;

    @Nullable
    @Override
    public MyData getData(){
        return null;
    }

    @Override
    public void saveData(@NotNull MyData data){
        myData = data;
    }
}
