package com.qtz.poc;

import java.util.LinkedList;

public class RoundRoubin {

	
	public static void main(String...strings){
		
		LinkedList<Job> jobs = new LinkedList<>();
		
		jobs.add(new Job(4000, "first"));
		jobs.add(new Job(3000, "first"));
		jobs.add(new Job(1000, "first"));
		jobs.add(new Job(1000, "first"));
		
		
		for(int i = 0;i<=jobs.size();i++){
			
			Job h = jobs.pop();
			 if(h.sec>1000){
				 jobs.addLast(h);
			 }
			
		}
		
		jobs.forEach(k->System.out.println(k.jobName+" "+k.sec));
		
	}
	
	
	
	static class Job{
		
		long sec;
		String jobName;
		
		public Job(long sec,String jobName){
			this.sec = sec;
			this.jobName = jobName;
			
		}
		
		
		
		
	}
	
	
}


