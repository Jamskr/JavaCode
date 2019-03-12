public class MyMath {
    int result = 0;

    public Student CreateNew(String id, String name) {
        Student tmp = new Student();
        tmp.id = id;
        tmp.name = name;
        return tmp;
    }

    public int[] find8(int[] arr) {
        int[] tmp = new int[arr.length];
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 8 == 0) {
                tmp[cnt++] = arr[i];
            }
        }
        int[] res_arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            res_arr[i] = tmp[i];
        }
        return res_arr;
    }

    public void getMax(int[] arr) {
        result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        System.out.println("Max: " + result);
    }

    public int getMax2(int[] arr) {
        result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public boolean check(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 100) {
                return true;
            }
        }
        return false;
    }
}