public class SerieNumerica {
    public static void main(String[] args) {
        int num = 1600;
        do {
            System.out.print(num + " , ");
            num /= 2;
        } while (num >= 100);
        System.out.println(num);
    }
}
