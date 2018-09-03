package com.course;

public class MegaBytesConverter {

    public static void printMegaBytesAndKilobytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int kb = kiloBytes;
            int mb = kiloBytes / 1024;
            int rest = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kb, mb, rest);
        }
    }
}
