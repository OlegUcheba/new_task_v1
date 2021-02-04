import java.util.*;


public class new_task_v1 {
    public static void main(String arg[]) {
    }

    public static String hiddenAnagram(String s1, String s2){
        s1 = s1.strip().toLowerCase().replaceAll("[^a-z]", "");
        s2 = s2.strip().toLowerCase();
        String res = "";
        List<String> s2List = new ArrayList<>(Arrays.asList(s2.split("")));

        int i = 0;
        while (s2List.size() > 0 && i<s1.length()){
            if(s2List.contains(Character.toString(s1.charAt(i)))){
                res+=s1.charAt(i);
                s2List.remove(s2List.indexOf(Character.toString(s1.charAt(i))));
            }
            i++;
        }
        return res;
    }
    public static String [] collect(String s, int n){
        int size = s.length()/n;
        String [] mas = new String[size];
        List<String> stringList = new ArrayList<>();
        for(int i = n; i<s.length();i+=n){
            stringList.add(s.substring((i-n), i));
        }
        int j = 0;
        for(String s1: stringList){
            mas[j] = s1;
            j++;
        }
        Arrays.sort(mas);
        return mas;
    }

    public static String nicoCipher(String x, String y){
        int len = x.length();
        int ylen = y.length();
        int r = (len-len%ylen)/ylen;
        if (len%ylen != 0) {
            r++;
        }
        for (int i = len; i < r*ylen; i++) {
            x += " ";
        }
        char[][][] v = new char[r][ylen][2];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                v[i][j][0] = x.charAt(i*ylen+j);
                v[i][j][1] = y.charAt(j);
            }
            Arrays.sort(v[i], (a,b) ->(int) a[1] - (int) b[1]);
        }
        String s = "";
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < ylen; j++) {
                s += v[i][j][0];
            }
        }
        return s;
    }

    public static int[] twoProduct(int[] x2, int y2) {
        int[] res = new int[2];
        for (int i = 1; i < x2.length; i++) {
            for (int j = 0; i < i; i++) {
                if (x2[i] * x2[j] == y2) {
                    res[0] = x2[i];
                    res[1] = x2[i];
                    return res;
                }
            }
        }
        return res;
    }
    public static int[] isExact(int x1){
        int i = 0;
        int res = calculateFactorial (i);
        int[] resses = new int[2];
        while (x1 > res) {
            i++;
            res = calculateFactorial(i);
            if(x1 == res){
                resses [0] = res;
                resses[1] = i;
                return resses;
            }
        }
        return resses;
    }
    static int calculateFactorial(int i){
        int result = 1;
        for (int n = 1; n <=i; n ++){
            result = result*n;
        }
        return result;
    }

}
