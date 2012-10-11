package jobs;

import play.jobs.Job;

public class Job1 extends Job{
	
	private String status;
	private int id = 1;
	
	public Job1(String a){
		status = a;
		System.out.println("Current status of task "+ id +": " + status);
	}

	public void doJob(){
		System.out.println("Starting Job " + id);
		try {
			Thread.currentThread().sleep(100000);
			status = "completed";
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			status = "failed";
			e.printStackTrace();
		}
		int i = 0;
		while(i<1000000000){
			i++;
		}
		status = "success";
		System.out.println("Job " + id + " has " + status);
	}
}
