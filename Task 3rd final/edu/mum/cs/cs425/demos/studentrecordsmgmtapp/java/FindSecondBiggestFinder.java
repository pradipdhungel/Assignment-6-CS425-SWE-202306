public class FindSecondBiggestFinder {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {19, 9, 11, 0, 12};

        int secondBiggest1 = findSecondBiggest(array1);
        int secondBiggest2 = findSecondBiggest(array2);

        System.out.println("Second Biggest in array1: " + secondBiggest1);
        System.out.println("Second Biggest in array2: " + secondBiggest2);
    }

    public static int findSecondBiggest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}
