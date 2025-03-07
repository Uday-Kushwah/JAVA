package ArraysList;

public class static_var {

    static int var = 100;

    public static int Add(int a, int b){
        int var = 200;
        var = var + 5;
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(var);
        System.out.println(Add(2,7));
        System.out.println(var);
    }
}
