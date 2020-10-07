import java.util.Arrays;
public class Program {
        public static void main (String[] args){
              int[] arr1 = new int[10];
              int[] arr2 = new int[10];
              int[] arr3 = new int[10];
              int[] arr4 = new int[10];
              int[] arr5 = new int[10];

              filling(arr1, arr2, arr3, arr4, arr5);

        }
        public static void filling(int[] arr1,int[] arr2,int[] arr3,int[] arr4,int[] arr5){
                for (int i = 0; i < 10; i++) {
                        arr1[i] += Math.random() * 10;
                        System.out.printf("%d ",arr1[i]);
                }
                System.out.println("\n");
                for (int i = 0; i < 10; i++) {
                        arr2[i] += Math.random() * 10;
                        System.out.printf("%d ", arr2[i]);
                }
                System.out.println("\n");
                for (int i = 0; i < 10; i++) {
                        arr3[i] += Math.random() * 10;
                        System.out.printf("%d ", arr3[i]);
                }
                System.out.println("\n");
                for (int i = 0; i < 10; i++) {
                        arr4[i] += Math.random() * 10;
                        System.out.printf("%d ", arr4[i]);
                }
                System.out.println("\n");
                for (int i = 0; i < 10; i++) {
                        arr5[i] += Math.random() * 10;
                        System.out.printf("%d ", arr5[i]);
                }
        }
}
