package inflearn.string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class section1_unit6 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for(int i=0; i<input.length(); i++){
            if(i==input.indexOf(input.charAt(i))) System.out.print(input.charAt(i));
        }


    }
}
