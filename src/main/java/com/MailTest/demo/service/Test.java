package com.MailTest.demo.service;

public class Test {

    public static void main(String[] args) {

        int arr[] = {1, 4, 20, 3, 10, 5};
        // sum = 33
        //Output: Sum found between indexes 2 and 4
int n =33;
        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i];
            int indexj=0;
            for(int j=i+1;j<arr.length-1;j++){
                if(i!=j) {
                    if(sum<n){
                        sum =sum + arr[j];
                    } else if (sum==n) {
                        System.out.println("index starting from "+i+"index end at"+j);
                        break;
                    }

                }
            }

            sum=0;
        }
    }
}
