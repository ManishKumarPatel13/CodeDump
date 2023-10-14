public class break_continue_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue; // This will skip the code if i == 7
            } else if (i == 9) {
                break; // this will stop the loop if i == 9
            } else {
                System.out.println(i);
            }
        }
    }
}
