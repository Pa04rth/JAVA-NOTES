import java.util.Scanner;
public class Parth {
    public static void buildArray() {
        int[] nums = new int[10];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] ans = new int[10];
        int i = 0;
        for (;i < nums.length;i++) {
            ans[i] = nums[nums[i]];
        }
        for (int an : ans) {
            System.out.print(an + " ");
        }
    }
    public static void  main(String[] args){
        buildArray();


    }

}




