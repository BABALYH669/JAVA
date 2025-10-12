public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //定义数组
        int copy[] = copyOfRange(arr, 3, 6);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }

    //int[]表示的是返回一个数组
    public static int[] copyOfRange(int[] arr, int from, int to) {
        //定义新数组
        int[] newArr = new int[to - from];
        //伪造索引思想
        int index = 0;
        //原数组拷贝到新数组上
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
