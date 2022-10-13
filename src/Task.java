public class Task {
    public static void main(String[] args) {
    /*    int n=1;
        for (int i=0; i<8; i++) {
            String left=String.format("%d*%d=% ", n,n);
            System.out.printf("%20s*%d%n", left, (long)n*n);
            n=n*10+1;
*/
        char c='5';
        for (int i=0; i<8; i++) {
            String s="";
           s+=c;
           // System.out.println(s);
            String left = String.format("%s*%s= ", c,s);
            System.out.printf("%c*%s=%d%n", c,s, (long)Integer.parseInt(s)*5);

    }

    }
}
