package javaCode.thread;

import java.util.ArrayList;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }
        for (Future<String> res :results) {
            try {
                System.out.println(res.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}

class TaskWithResult implements Callable<String>{

    public int id = 0;

    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() {
        return "here is :" + id;
    }
}