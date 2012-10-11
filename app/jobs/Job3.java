package jobs;

import play.jobs.Job;

public class Job3 extends Job{
	
	private String status;
	private int id = 3;
	
	public Job3(String a){
		status = a;
		System.out.println("Current status of task "+ id +": " + status);
	}

	public void doJob(){
		System.out.println("Starting Job " + id);
		try {
			Thread.currentThread().sleep(1000000);
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
