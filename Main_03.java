package advance;

import java.util.HashMap;
import java.util.Scanner;

public class Main_03 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        Integer n = 0;
        String city = new String();
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        while (in.hasNext()) {
            city = in.next();
            if (city.equals("###"))
                break;
            hm.put(city, n);
            n += 1;
        }
        Integer[][] table = new Integer[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                table[i][j] = in.nextInt();
        Integer x = hm.get(in.next());
        Integer y = hm.get(in.next());
        System.out.println(table[x][y]);
        in.close();
	}

}
