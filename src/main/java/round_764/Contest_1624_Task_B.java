package round_764;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Contest_1624_Task_B {

    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int count = sc.nextInt();

        for (int i = 0; i < count; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if ((b >= c && b + (b - c) > 0 && (b + (b - c)) % a == 0) ||
                    (c >= b && b - (c - b) > 0 && (b - (c - b)) % a == 0) ||
                    (b >= a && b + (b - a) > 0 && (b + (b - a)) % c == 0) ||
                    (a >= b && b - (a - b) > 0 && (b - (a - b)) % c == 0) ||
                    (c >= a && (c - a) % 2 == 0 && (a + (c - a) / 2) > 0 && (a + (c - a) / 2) % b == 0) ||
                    (a >= c && (a - c) % 2 == 0 && (a - (a - c) / 2) > 0 && (a - (a - c) / 2) % b == 0) ||
                    (a - b >= 0 && a - b == b - c) ||
                    (c - b >= 0 && c - b == b - a)) {
                out.println("YES");
            }
            else {
                out.println("NO");
            }
        }
        out.close();
    }

    public static PrintWriter out;
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}
