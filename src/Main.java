import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Main {

    public static void main(String[] args) {
        DataSourse repository = new Repository(
                new CloudDataSource(),
                new CachedDataSource()
        );

        MyData data = repository.getData();
        print(data.toString());
    }

    private static void print(Object text){
        System.out.println(text);
    }


}