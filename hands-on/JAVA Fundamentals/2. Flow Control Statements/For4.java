public class For4{

    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
        while (a < b) {
            boolean flag = false;

            for(int i = 2; i <= a/2; ++i) {
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(a + " ");

            ++a;
        }
    }
}