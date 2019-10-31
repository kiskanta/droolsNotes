package com.ksh.configration;

import java.util.Arrays;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.ReleaseId;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;

public class DroolsConfigration {
	private static final String RULES_PATH = "rules/";
	private KieServices kieServices = KieServices.Factory.get();
	
	private KieFileSystem getKieFileSystem() throws Exception{
		KieFileSystem kfs = kieServices.newKieFileSystem();
		List<String> rules = Arrays.asList("rules.xls");
		
		for(String rule : rules) {
			kfs.write(ResourceFactory.newClassPathResource(rule));
		}
		return kfs;
	}
	
	private KieContainer getKieContiner()throws Exception{
		getKieRepository();
		
		KieBuilder kieBuilder = kieServices.newKieBuilder(getKieFileSystem());
		kieBuilder.buildAll();
		
		KieModule kieModule = kieBuilder.getKieModule();
		KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
		return kieContainer;
	}
	
	private void getKieRepository() {
		final KieRepository kieRepository = kieServices.getRepository();
		kieRepository.addKieModule(new KieModule() {

			@Override
			public ReleaseId getReleaseId() {
				return kieRepository.getDefaultReleaseId();
			}
		});
	}
	
	
}
