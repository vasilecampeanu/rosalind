public class RS01DNA {
    public static void main(String[] args) {
        String DNA = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"; 
        int CNT_A = 0, CNT_C = 0, CNT_G = 0, CNT_T = 0;
        char temp;
        for (int i = 0; i < DNA.length(); i++) {
            temp = DNA.charAt(i);
            if (temp == 'A') {
                CNT_A++;
            } else if(temp == 'C') {
                CNT_C++;
            } else if(temp == 'G') {
                CNT_G++;
            } else if(temp == 'T') {
                CNT_T++;
            }
        }

        System.out.print("A: " + CNT_A + "\nC: " + CNT_C + "\nG: " + CNT_G + "\nT: " + CNT_T + "\n");
    }
}