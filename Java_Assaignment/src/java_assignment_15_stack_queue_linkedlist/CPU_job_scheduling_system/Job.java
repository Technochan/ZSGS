package java_assignment_15_stack_queue_linkedlist.CPU_job_scheduling_system;

import java.util.concurrent.atomic.AtomicInteger;

public class Job implements Comparable<Job> {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private final int processingTime;
    private final int priority;
    private int waitingTime;
    private int turnaroundTime;

    public Job(int processingTime, int priority) {
        this.id = count.incrementAndGet();
        this.processingTime = processingTime;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getPriority() {
        return priority;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnaroundTime() {
        return turnaroundTime;
    }

    public void setTurnaroundTime(int turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    @Override
    public int compareTo(Job other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Job ID = "+id+" | Processing Time = "+ processingTime + " | Priority = "+ priority+" | WaitingTime = "+waitingTime+" | Turn Around Time = "+turnaroundTime;
    }
}
