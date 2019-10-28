package com.ksh.main;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.ksh.pojo.Product;

public class DroolsKIETest {
	public static void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule"); // Get the specified session from
																				// kmodule.xml. Default the session returned is always stateful.

			Product product = new Product();
			product.setType("glod");

			FactHandle fact1;

			fact1 = kSession.insert(product);
			kSession.fireAllRules();

			System.out.println(
					"The discount for the jewellery product " + product.getType() + " is " + product.getDiscount());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
