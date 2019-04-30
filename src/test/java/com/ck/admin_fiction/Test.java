package com.ck.admin_fiction;

import com.ck.admin_fiction.demo.Cks;

import java.util.Timer;
import java.util.TimerTask;

@Cks(value = "hjh", type = {1, 2, 3})
public class Test {

    String id;

    public Test doSomthing() throws InterruptedException {
        for (int i = 0; i < 20; i++) {
            System.out.println("================================");
            System.out.println("startTime" + System.currentTimeMillis());
            System.out.println("这是第" + i + "次分享！");
            Thread.sleep(3000);
            System.out.println("endTime" + System.currentTimeMillis());

        }
        return null;
    }

    public Test timeMethod() {
        int count = 0;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("你好呀" );
//                count++;
            }
        }, 1);
        return null;
    }

    public static void main(String[] args) {
        try {
//            Test test = new Test().doSomthing();
            Test test = new Test().timeMethod();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}

