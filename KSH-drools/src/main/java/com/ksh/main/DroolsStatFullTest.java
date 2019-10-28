package com.ksh.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.ksh.pojo.Counter;

public class DroolsStatFullTest {
	public static void main(String[] args) {
		try {
			KieServices kieService = KieServices.Factory.get();
			KieContainer kieContainer = kieService.getKieClasspathContainer();
			KieSession kieSession = kieContainer.newKieSession("ksession-counter");
			
			Counter c1 = new Counter("cnt1", 1);
			Counter c2 = new Counter("cnt2", 2);
			
			System.out.println("fire rules after inserting counter1");
			kieSession.insert(c1);
			kieSession.fireAllRules();	// Fires rules with counter 1
			
			System.out.println("fire rules after inserting counter2");
			kieSession.insert(c2);
			kieSession.fireAllRules();	// Fires rules with already existing counter1 and newly inserted counter2.
			
			kieSession.dispose();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
