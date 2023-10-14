public class v_args {
    static void summ(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        summ(2, 4, 52, 34); // we can give as much as arguments we want
    }

}

// Now to if we have to overload a function for a large number of times would be
// so hectic that's why v args are introduced
