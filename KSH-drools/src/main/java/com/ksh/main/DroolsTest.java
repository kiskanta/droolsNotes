/*package com.ksh.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;
import org.drools.core.rule.Package;

import com.ksh.pojo.Product;

public class DroolsTest {
	public static void main(String[] args) throws DroolsParserException, IOException {
		DroolsTest dt = new DroolsTest();
		dt.executeDrools();
	}
	public void executeDrools() throws DroolsParserException, IOException {
		PackageBuilder packageBuilder = new PackageBuilder();	//- 
		
		String ruleFile = "/com/rules/product.drl";
		InputStream is = this.getClass().getResourceAsStream(ruleFile);
		
		Reader reader = new InputStreamReader(is);
		packageBuilder.addPackageFromDrl(reader);
		
		Package rulePackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulePackage);
		
		WorkingMemory workingMemory = ruleBase.newStatefulSession();
		
		Product prod= new Product();
		prod.setType("glod");
		
		workingMemory.insert(prod);
		workingMemory.fireAllRules();
		
		System.out.println("The discount for the product "+prod.getType()+" is "+prod.getDiscount());
		
	}
}
*/