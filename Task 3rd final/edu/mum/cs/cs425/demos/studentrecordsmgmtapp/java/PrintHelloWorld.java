

public class PrintHelloWorld {
    //3.5.1.	Write a function (or method) named, printHelloWorld, that takes as input, an array of integers and iterates through
// them, and it prints the text, "Hello", if the integer is a multiple of 5. It prints the text, "World",
// if the integer is a multiple of 7. And when it encounters an integer that is a multiple of both 5 and 7, it prints the text, "HelloWorld".
    public static void printHelloWorld(Integer[] arrs) {


        for (Integer arr : arrs) {
            String msg = (arr % 5 == 0 && arr % 7 == 0) ? "HelloWorld"
                    : (arr % 5 == 0) ? "Hello"
                    : (arr % 7 == 0) ? "World"
                    : "";
            if (msg != "") {
                System.out.println(msg);
            }

//
        }

    }

    public static void main(String[] args) {
        Integer[] num = {10, 20, 1, 35, 49};
        printHelloWorld(num);
    }


}
