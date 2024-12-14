package com.ashokit.java9changes;

import java.io.IOException;
import java.util.Optional;

public class ProcessAPIChanges {
	
	public static void main(String[] args) throws IOException {
		
		Optional<ProcessHandle> pr= ProcessHandle.of(13924);
		if(pr.isPresent()) {
			ProcessHandle pr1=pr.get();
			System.out.println(pr1.pid());
			ProcessHandle.Info piInfo=pr1.info();
			System.out.println(piInfo.user().get());
			System.out.println(piInfo.command().get());
			System.out.println(piInfo.startInstant().get());
			System.out.println(piInfo.totalCpuDuration().get());

			System.out.println(pr);
			pr1.destroy();
		}
		ProcessHandle.allProcesses().forEach(p->System.out.println(p.info().user()+" process id is"+p.pid()));
		
		Process p=new ProcessBuilder("C:\\Users\\DELL\\eclipse\\jee-2021-12\\eclipse\\eclipse.exe").start();
		
		
	}

}
