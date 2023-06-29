public class Array {
    public static void main(String[] args) {
        int num[] = {5,6,7}; //DEFINING NORMAL ARRAY
        int nums[] = new int[4];//DEFINING ARRAY WITH NO VALUES BUT FIXED SIZE
        //IN THE ABOVE ARRAY INITIALLY ALL THE 4 VALUE IS 0
        System.out.println(nums[2]);
        System.out.println(num[2]);
        //ASSIGNING OR CHANGING THE VALUES
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;

        //PRINTING ALL THE VALUES
        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
        }

        //MULTIDIMENSIONAL ARRAY
        int num1[][]= new int[3][4];//3 ROWS 4 COLUMNS
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                num1[i][j]= (int)(Math.random() * 10); //ADDING RANDOM VALUES
            }

        }

        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print(num1[i][j]+ " ");
            }
            System.out.println();

        }
        //JAGGED ARRAY-HERE THE NUMBER
        // OF COLUMNS IN EACH ROW OF MULTIDIMENSIONAL ARRAY MAY BE DIFFERENT
        int num2[][]=new int [3][];
        num2[0]= new int[3]; //FIRST ROW WILL HAVE 3 ROWS
        num2[1]= new int[4]; //SECOND ROW WILL HAVE 4 ROWS
        num2[2]= new int[2]; //THIRD ROW WILL HAVE 5 ROWS

        





    }
}
