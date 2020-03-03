import java.util.Scanner;

public class sortarray {
    public static void main(String args[]) {
        int[] deger = new int[5];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < deger.length; i++) {
            System.out.print((i+1) + ". Tam sayıyı giriniz: ");
            deger[i] = keyboard.nextInt();
        }
        int temp = 0;
        for (int k = 0; k < deger.length; k++) {
            for (int j = 1; j < deger.length; j++) {
                if (deger[j - 1] > deger[j]) {
                    temp = deger[j];
                    deger[j] = deger[j - 1];
                    deger[j - 1] = temp;
                }
            }
        }
        for (int z = 0; z < deger.length; z++) {
            System.out.print(deger[z] + " | " );
        }
    }
}
