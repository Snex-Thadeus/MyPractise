public class ArrayDemo {
    public static void main(String[] args) {
        //1D array
        int nums[] = new int[4];
        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 20;
        nums[3] = 76;

        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
        //2D array
        int a[] = {3, 5, 6, 5};
        int b[] = {2, 8, 4, 7};
        int c[] = {9, 5, 8, 3};

        int d[][] = {
                {3, 5, 6, 5},
                {2, 8,  7},     //jagged arrays
                {9, 5, 8, 3,9}
        };
        for (int i = 0; i < d.length; i++) //row
        {
            for (int j = 0; j < d[i].length; j++) //column
            {
                System.out.print(""+ d[i][j]);
            }
            System.out.println();
        }
    }
}
/* Enhanced loop
int a[] = {3, 5, 6, 5};
 for(int k : a)
 {
 System.out.println(k);
 }
 in 2D
 int a[] = {3, 5, 6, 5};
        int b[] = {2, 8, 4, 7};
        int c[] = {9, 5, 8, 3};

        int d[][] = {
                {3, 5, 6, 5},
                {2, 8,  7},     //jagged arrays
                {9, 5, 8, 3,9}
        };
        for (int i = 0; i < d.length; i++) //row
        {
            for (int j = 0; j < d[i].length; j++) //column
            {
                System.out.print(""+ d[i][j]);
            }
            System.out.println();
        }
        for(int k[] :d)
        {
        for(int l : k)
        {
        System.out.print(""+ l);
        }
        System.out.println();
        }
* */
