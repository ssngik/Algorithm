package inflearn.sortingAndSerching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class section6_unit5 {
    public static void main(String[] args) throws IOException {
        // 해쉬맵 -> O(n)
        // 정렬 -> nlogn
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("D");
                return;
            }
        }
        System.out.println("U");
    }
}
