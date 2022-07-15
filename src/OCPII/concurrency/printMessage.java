package OCPII.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class printMessage {
    public static void printMessage (Lock lock){
        try{
           lock.lock();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(()->printMessage(lock)).start();
        if(lock.tryLock()){
            try{
                System.out.println("lock te pakken gehad");
            }finally {
                lock.unlock();
            }
        }else {
            System.out.println("bezig met iets anders");
        }
    }
}
