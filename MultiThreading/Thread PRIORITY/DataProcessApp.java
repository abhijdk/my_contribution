/*
 * Develop a  data processing application that receives data from multiple sources and processes 
 * it in parallel using multiple threads. Use thread prioritization to ensure that high-priority 
 * data is processed first and low-priority data is processed later.
 */
import java.util.concurrent.*;

public class DataProcessApp {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        
        DS highPrioritySource = new DS("High Priority Source");
        DS mediumPrioritySource = new DS("Medium Priority Source");
        DS lowPrioritySource = new DS("Low Priority Source");
        
        executorService.submit(new DataProcessingTask(highPrioritySource, Thread.MAX_PRIORITY));
        executorService.submit(new DataProcessingTask(mediumPrioritySource, Thread.NORM_PRIORITY));
        executorService.submit(new DataProcessingTask(lowPrioritySource, Thread.MIN_PRIORITY));
        
        executorService.shutdown();
    }
}

class DS {
    private String name;	
    
    public DS(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void retrieveData() {
        System.out.println("Retrieving data from " + name);
    }
}

class DataProcessingTask implements Runnable {
    private DS dataSource;
    private int priority;
    
    public DataProcessingTask(DS dataSource, int priority) {
        this.dataSource = dataSource;
        this.priority = priority;
    }
    
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        
        dataSource.retrieveData();
        
        System.out.println("Processing data from " + dataSource.getName() + " with priority " + priority);
    }
}
