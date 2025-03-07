package BackTracking;

public class MainPath {

    public static void Path(String ans,int hor,int ver,int m,int n) {

        if(m == hor &&  n == ver) {
            System.out.println(ans);
            return;
        }
        if( hor > m|| n < ver) {
            return;
        }
        Path( ans+"H", hor+1, ver, m, n);
        Path(ans+"V", hor, ver+1, m, n);
    }
    public static void main(String[] args) {

        int m = 3;
        int n = 3;
        Path("", 0, 0, m-1, n-1);
    }
}
