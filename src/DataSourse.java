import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface DataSourse {

    @Nullable
    MyData getData();

     void saveData(@NotNull MyData data);

}
