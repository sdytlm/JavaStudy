public class HW3 {
    public static void main( String argvs[]) {
        int range = 200;
        boolean result[] = new boolean[range];
        int i=0,j=0;
        for (i=0;i<range;i++) {
            result[i] = true;
        }
        for (i=2;i<200;i++) {
            for (j=2; j<i; j++) {
                if(i%j == 0){
                    result[i] = false;
                    break;
                }   
            }
        }
        for (i=2;i<200;i++) {
            if (result[i] == true)
                System.out.print(i+",");
        }
    }
}
