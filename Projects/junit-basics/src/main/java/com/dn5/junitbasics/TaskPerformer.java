package com.dn5.junitbasics;

import java.util.concurrent.TimeUnit;

public class TaskPerformer {
    public void performTask(long durationInSeconds) throws InterruptedException {
        System.out.println("Sleeping for " + durationInSeconds + " ...");
        TimeUnit.SECONDS.sleep(durationInSeconds);
        System.out.println("Slept for " + durationInSeconds + " ...");
        System.out.println("---------------------------------");
    }
}
