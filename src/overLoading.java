public class overLoading {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static String sum(String x, String y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(5,5, 2));
        System.out.println(sum("Alok"," kumar"));
    }
}
