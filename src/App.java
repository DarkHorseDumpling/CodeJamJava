public class App {
    public static void main(String[] args) throws Exception {
        int[] areSame = { 121, 144, 19, 161, 19, 144, 19, 11 };

        int[] areSame2 = { 121, 14641, 20736, 361, 25921, 361, 20736, 361 };

        System.out.print(AreSame.comp(areSame, areSame2));
    }
}
