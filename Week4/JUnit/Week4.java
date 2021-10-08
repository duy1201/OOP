public class Week4 {
    /**
     * this is max2Int.
     * @param a so a
     * @param b so b
     * @return max of $a and $b
     */
    public static int max2Int(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }

    /**
     * this is minArray.
     * @param arr mang arr
     * @return min of array $arr
     */
    public static int minArray(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (res > arr[i]) {
                res = arr[i];
            }
        }
        return res;
    }

    /**
     * this is calculateBMI.
     * @param weight in kg
     * @param height in m
     * @return BMI index
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight/(height*height);
        if (bmi < 18.45) {
            return ("Thiếu cân");
        } else if (bmi >= 18.45 && bmi <= 22.94) {
            return ("Bình thường");
        } else if (bmi >= 22.95 && bmi <= 24.94) {
            return ("Thừa cân");
        } else {
            return ("Béo phì");
        }
    }
}
