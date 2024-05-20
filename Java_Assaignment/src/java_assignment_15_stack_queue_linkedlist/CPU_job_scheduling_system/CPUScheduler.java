package java_assignment_15_stack_queue_linkedlist.CPU_job_scheduling_system;


//3. Simulate a CPU job scheduling system where arriving jobs (objects with processing time)
// are added to a queue. The CPU dequeues and processes jobs one at a time, tracking waiting and
// turnaround times. You can introduce priorities for fairer scheduling, if you want more challenge.
import java.util.PriorityQueue;
import java.util.Queue;

public class CPUScheduler {
    private Queue<Job> jobQueue = new PriorityQueue<>();
    private int currentTime = 0;

    public void addJob(Job job) {
        jobQueue.add(job);
    }

    public void processJobs() {
        while (!jobQueue.isEmpty()) {
            Job job = jobQueue.poll();
            job.setWaitingTime(currentTime);
            job.setTurnaroundTime(currentTime + job.getProcessingTime());
            currentTime += job.getProcessingTime();
            System.out.println("Processing " + job);
        }
    }

    public static void main(String[] args) {
        CPUScheduler scheduler = new CPUScheduler();
        scheduler.addJob(new Job(5, 2));
        scheduler.addJob(new Job(3, 1));
        scheduler.addJob(new Job(8, 3));
        scheduler.processJobs();
    }
}
