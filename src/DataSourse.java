import org.jetbrains.annotations.NotNull;

public abstract class DataSourse {


    public abstract MyData getData();

    public abstract void saveData(@NotNull MyData data);
}
