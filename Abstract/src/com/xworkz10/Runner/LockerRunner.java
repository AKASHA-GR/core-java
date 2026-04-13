package com.xworkz10.Runner;

import com.xworkz10.lokker.Locker;
import com.xworkz10.lokker.ScreenLock;

public class LockerRunner {
    public static void main(String[] args) {
        Locker ref = new ScreenLock();
        ref.key();
        ref.lock();
        ref.unlock();
    }
}
