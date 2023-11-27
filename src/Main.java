

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

    private static MyData getMyData() {
        return null;
    }
}