package com.snapdeal.payment.Server;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting server");
        ExecutorService e= Executors.newFixedThreadPool(5);
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("starting the server");
            String data=sc.nextLine();
            e.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("waiting for data");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Processing the data"+data+"current Thread"+Thread.currentThread());;

                }
            });
        }

    }
}
