import org.jetbrains.annotations.Nullable;

public class CloudDataSource implements DataSourse<MyData> {


    @Override
    public MyData getData(){
        return new MyData(1, "description_1");
    }

//    @Override
//    public void saveData( MyData data){
//
//    }
}
