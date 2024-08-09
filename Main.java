import java.util.Scanner;

class array
{
    public static void main(String[] args) {
        //int[] myArr = new int[5];
//        myArr[0]=10;
//        myArr[1]=12;
//        myArr[2]=14;
//        myArr[3]=14;
//        myArr[4]=16;
//        int[] myArr = new int[]{10, 12, 14, 14, 16};
//        int index =0;

//        System.out.println(myArr[index]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[0]);
//        while (index < myArr.length) {
//            System.out.println(myArr[index]);
//            index++;
//        }
//       int[] marks= new int[10];
//         int marks[]= new int[10];
//       marks[0]=12;
//       marks[1]=23;
//       marks[2]=32;
//       marks[3]=32;
//       for (int i=0;i<4;i++)
//        System.out.println(marks[i]);
        Scanner S=new Scanner(System.in);
        System.out.println("Enter size of array memory=");
        int size =S.nextInt();

        int number[] =new int[size];

        for (int i=0; i<size;i++)
        {
            System.out.println("Enter values=");
            number[i] =S.nextInt();
        }
        int x=S.nextInt();
        for (int i=0;i<number.length ;i++)
        {
            if (number[i]==x)
            {
                System.out.println("X found at index=" +i);

            }
        }
    }
}