import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DataSourse {

    @Nullable
    public abstract MyData getData();

   public void saveData(@NotNull MyData data){

   }

}
