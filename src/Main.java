import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Main {

    public static void main(String[] args) {
        MyData data = getMyData();
        if (data == null){
            System.out.println("Object was null");
        } else {
            System.out.println(data.toString());
        }
    }

//    private static void print(String toString) {
//    }


    @NotNull
    private static MyData getMyData() {
        return new MyData(1,"1");
    }
}