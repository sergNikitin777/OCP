package ethuware.concurrency.test3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Student {
    private Map<String, Integer> marksObtained = new HashMap<String, Integer>();
    private ReadWriteLock lock = new ReentrantReadWriteLock();
    public void setMarksInSubject(String subject, Integer marks){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.writeLock().lock(); //1
        try{
            marksObtained.put(subject, marks);
            System.out.println("wtite to map");
        }finally{
            lock.writeLock().unlock(); //2
        }
    }
    public double getAverageMarks(){
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.readLock().lock(); //3
        double sum = 0.0;
        try{
            for(Integer mark : marksObtained.values()){
                sum = sum + mark;
            }
            //System.out.println("read from map");
            return sum/marksObtained.size();
        }finally{
            lock.readLock().unlock();//4
        }
    }
    public static void main(String[] args) {

        final Student s = new Student();

        //create one thread that keeps adding marks
        new Thread(){
            public void run(){
                int x = 0;
                while(true){
                    int m = (int)(Math.random()*100);
                    s.setMarksInSubject("Sub "+x, m);
                    x++;
                }
            }
        }.start();

        //create 5 threads that get average marks
        for(int i=0;i<5; i++){
            new Thread(){
                public void run(){
                    while(true){
                        double av = s.getAverageMarks();
                        System.out.println(av);
                    }
                }
            }.start();
        }
    }

}
