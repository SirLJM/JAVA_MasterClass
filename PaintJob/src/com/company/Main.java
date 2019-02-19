package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double area = 0;
        double sparePaint = 0;
        double remaingArea = 0;
        int bucketsToBuy = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            area = width * height;
            sparePaint = areaPerBucket * extraBuckets;
            if (area >= sparePaint) {
                remaingArea = area - sparePaint;
            } else {
                remaingArea = sparePaint - area;
            }
            bucketsToBuy =(int) Math.ceil(remaingArea/areaPerBucket);
        }
        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        double area = 0;
        int bucketsToBuy = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            area = width * height;
            bucketsToBuy =(int) Math.ceil(area/areaPerBucket);
        }
        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        int bucketsToBuy = 0;
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        } else {
            bucketsToBuy =(int) Math.ceil(area/areaPerBucket);
        }
        return bucketsToBuy;
    }

}
