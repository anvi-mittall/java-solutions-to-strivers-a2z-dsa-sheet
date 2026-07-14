package step1_learn_the_basics.lec_2;

public class Patterns {
    //Pattern 1
    public void pattern1(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 2
    public void pattern2(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 3
    public void pattern3(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 4
    public void pattern4(int n) {
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num);
            }
            num++;
            System.out.println();
        }
    }

    //Pattern 5
    public void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 6
    public void pattern6(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 7
    public void pattern7(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 8
    public void pattern8(int n) {
        int nsp = 0;
        int nst = 2*n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("*");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }

    //Pattern 9
    public void pattern9(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int nsp = 0;
        int nst = 2*n-1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=nst; k++){
                System.out.print("*");
            }
            nsp++;
            nst-=2;
            System.out.println();
        }
    }

    //Pattern 10
    public void pattern10(int n) {
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1; j<=stars; j++){
                System.out.print("*"); 
            }
            System.out.println();
        }
    }

    //Pattern 11
    public void pattern11(int n) {
        int a;
        for(int i=1; i<=n; i++){
            if(i%2!=0) a=1;
            else a=0;
            for(int j=1; j<=i; j++){
                System.out.print(a + " ");
                if(a==0) a=1;
                else a=0;
            }
            System.out.println();
        }
    }

    //Pattern 12
    public void pattern12(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }

            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //Pattern 13
    public void pattern13(int n) {
        int num = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+ " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    //Pattern 14
    public void pattern14(int n) {
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=1; j<=i; j++){
                int d = a + 64;
                char ch = (char) d;
                System.out.print(ch);
                a++;
            }
            System.out.println();
        }
    }

    //Pattern 15
    public void pattern15(int n) {
        for(int i=1; i<=n; i++){
            int a=1;
            for(int j=1; j<=n+1-i; j++){
                int d = a+64;
                char ch = (char) d;
                System.out.print(ch);
                a++;
            }
            System.out.println();
        }
    }

    //Pattern 16
    public void pattern16(int n) {
        int a = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int d = a+64;
                char ch = (char) d;
                System.out.print(ch);
            }
            a++;
            System.out.println();
        }
    }

    //Pattern 17
    public void pattern17(int n) {
        for(int i=1; i<=n; i++){
            int a = 1;
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                int d = a + 64;
                char ch = (char) d;
                System.out.print(ch);
                a++;
            }
            int p = i-1;
            for(int k=1; k<=i-1; k++){
                int d = p + 64;
                char ch = (char) d;
                System.out.print(ch);
                p--;
            }
            System.out.println();
        }
    }

    //Pattern 18
    public void pattern18(int n) {
        for(int i=1; i<=n; i++){
            int a = n-i+1;
            for(int j=1; j<=i; j++){
                int d = a + 64;
                char ch = (char) d;
                System.out.print(ch+ " ");
                a++;
            }
            System.out.println();
        }
    }

    //Pattern 19
    public void pattern19(int n) {
        int nsp = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            nsp+=2;
            System.out.println();
        }
        int isp = 2*n-2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=isp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            isp -= 2;
            System.out.println();
        }
    }

    //Pattern 20
    public void pattern20(int n) {
        int nsp = 2*n-2;
        for(int i=1; i<=2*n-1; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            for(int j=1; j<=nsp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) nsp-=2;
            else nsp += 2;
        }
    }

    //Pattern 21
    public void pattern21(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //Pattern 22
    public void pattern22(int n) {
        for(int i=1; i<=2*n-1; i++){
            for(int j=1; j<=2*n-1; j++){
                int top = i;
                int left = j;
                int down = (2*n-1)-i;
                int right = (2*n-1)-j;
                int min = Math.min(Math.min(top,down), Math.min(left,right));
                System.out.print(n-min + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Patterns p = new Patterns();

        System.out.println("1.==========");
//       1.
//       *****
//       *****
//       *****
//       *****
//       *****
        p.pattern1(5);

        System.out.println("2.==========");
//        2.
//        *
//        **
//        ***
//        ****
//        *****
        p.pattern2(5);

        System.out.println("3.============"); 
//        3.
//        1
//        12
//        123
//        1234
//        12345
        p.pattern3(5);

        System.out.println("4.============="); 
//        4.
//        1
//        22
//        333
//        4444
//        55555
        p.pattern4(5);
        
        System.out.println("5.==============="); 
//        5.
//        *****
//        ****
//        ***
//        **
//        *
        p.pattern5(5);
        
        System.out.println("6.==============="); 
//        6.
//        12345
//        1234
//        123
//        12
//        1
        p.pattern6(5);
        
        System.out.println("7.================="); 
//         7.
//         *
//        ***
//       *****
//      *******
//     *********
        p.pattern7(5);
        
        System.out.println("8.=================="); 
//         8.
//     *********
//      *******
//       *****
//        ***
//         *
        
        p.pattern8(5);

        System.out.println("9.============="); 
//         9.
//         *
//        ***
//       *****
//      *******
//     *********
//     *********
//      *******
//       *****
//        ***
//         *
        p.pattern9(5);
        
        System.out.println("10.============="); 
//         10.
//         *
//        **
//       ***
//      ****
//     *****
//     *****
//      ****
//       ***
//        **
//         *
        p.pattern10(5);

        System.out.println("11.==============");
//         11.
//         1
//         01
//         101
//         0101
//         10101

        p.pattern11(5);

        System.out.println("12.=============");
//         12.
//         1      1
//         12    21
//         123  321
//         12344321

        p.pattern12(4);

        System.out.println("13.==============");
//         13.
//         1
//         2 3
//         4 5 6
//         7 8 9 10
//         11 12 13 14 15
        p.pattern13(5); //number of rows

        System.out.println("14.==============");
//         14.
//         A
//         AB
//         ABC
//         ABCD
//         ABCDE
        p.pattern14(5); //number of rows

        System.out.println("15.===============");
//         15.
//         ABCDE
//         ABCD
//         ABC
//         AB
//         A
        p.pattern15(5); //number of rows

        System.out.println("16.===============");
//         16.
//         A
//         BB
//         CCC
//         DDDD
//         EEEEE
        p.pattern16(5); //number of rows

        System.out.println("17.================");
//         17.
//         A
//        ABA
//       ABCBA
//      ABCDCBA
        p.pattern17(4); //number of rows

        System.out.println("18.==============");
//         18.
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE

        p.pattern18(5); //number of rows


        System.out.println("19.===============");
//         19.
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********

        p.pattern19(10); //number of rows

        System.out.println("20.===============");
//         20.
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *

        p.pattern20(10); //number of max stars in a row

        System.out.println("21.==============");
//         21.
//        *****
//        *   *
//        *   *
//        *   *
//        *****

        p.pattern21(5); // edge of the square


        System.out.println("22.==============");
//         22.
//        4444444
//        4333334
//        4322234
//        4321234
//        4322234
//        4333334
//        4444444

        p.pattern22(4); // edge of the square

    }
}
