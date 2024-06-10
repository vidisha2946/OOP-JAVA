public class Ch1PyramidStar {
    public static void main(String[] args) 
            {
                String str = "*";
                for (int i = 0; i < str.length()+1; i++) 
                {
                    System.out.println(str.substring(0, i));
                }
            }
        }
        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        // for (int i = 5; i>3; i--) {
        //     for (int j = 3; j < i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

