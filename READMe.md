# Drools

Drools is a Business Rules Management System (BRMS) solution.
* It Provides a core Business Rules Engine (BRE). It is an open source project that is backed by JBoss and Red Hat.

* It extends and Implements the `Rete Pattern matching Algorithm`.

* In Layman's terms, `Drools is a collection of tools that allow us to separate and reason over logic and data found within business process` . 

## What is a Rule?
* Rules are pieces of knowledge often expressed as, "When some conditions occur then do some tasks."

```drools
When
	<Condition is true>
Then
	<Take desired Action>
```

When - Left hand side (conditions)
Then - Right hand side (Actions)
* The most important part of rules is its when part. If the when part is satisfied, the then part is triggred.

```drools
rule <rule_name>
	<attribute> <value>
	When
		<Condition is true>
	Then
		<Take desired Action>
	end
```

<span style="text-decoration:underline">Conditions in Rules.</span>.

<span style="text-decoration:underline">Variables in Rules.</span>.




When - Left hand side (conditions)
Facts are the data to be processed
The rules Engine applies the rules to the facts
The Rules Engine takes the specified actions based on the rules that fired. Actions or outcomes
The fact model tells the rules engine how to interpret the facts

POJO
Fact Model
Fact types

Knowledge Jars
Technical Rules - DRL rules
The rules tell the Ruls engine what actions to taje when certain

RUle Engine -
The rule engine is the computer program that delivers KRR functionality to the developer.
Rule - A Rule is two-part structure.
rule "name"
	When - Left hand side (conditions)
	Then - Right hand side (Actions)
end

when all the conditions are met, a rule will fire i.e actions will execute.


Pattern

rule "Check Approval Required"
When		- Pattern Binding, Pattern	, Restriction
	cl: claims()
	cl1: Claims( clainAmount >= 10000)
then
	cl.setHrApprovalRequired(true);

end

JavaMethod
public void helloFederer(User user){
	if(user.getName().equalsIgnoreCase("Federe")
}

Traditional Approach
There is no standard template to define and code business logic
Mapping a requirement to code is difficult
Maintenance of the code is costly
Business Logic & Infrasturucture code is tightly coupled
Business Analusts has no way of verifying the implemented logic.

Declarative approch
Rules can be declared and it resembles very close to the requirements
RUle Engine can apply these rules on the data very efficiently
Easy to maintain
Business analysts can easily verify the declared rules
Requirements and Rules will be more likely mapped one-to-one.

Rules are easier to understand for both developers and business analysts
Rules are easily maintainable
Improved performace - Rule Engine uses PHREAK algorithm which states that the performance of the engine does not depend on the number 
of rules
Rules can be resused
Rules can be easily integrated with business processes
Rules can be modifed and deployed without having to bring down the application

Disadvantages
Developers need to learn this new way of Programming
Diff

When the rules are very minimal in an application
If the business logic is more stable and does not change often
If there need to be a control over the code execution - for instance a specific algorithm


Knowledge Session
Knowledge Session

KieSession to get stateful session. Stateful session are longer lived and allow iterative changes over time.

Drools Decision Table:



Stateful and Stateless Session - 
State Less Session - forms a simplest use case, not utilizing inference. It can be called like a function, passing it some data and then receiving some results back.

State Full Session - are longer lived and allow iterative changes over time.

|  		Item				| StateLess Session 		| StateFull Session					|
| ------------------------- | -------------------------:| ---------------------------------:|
| Any changes in the facts 	| Not madde aware to the	| Made aware to the rule Engine		|
| while executing rules		| Rules Engine.				|									|
|							|							|									|
|dispose() method			| is called automatically	| should be called to release  		|
|							| to release the session.	| the session to avoid memory leaks	|


##Forward & Backward chaining

Reference:
https://docs.jboss.org/drools/release/7.28.0.Final/drools-docs/html_single/index.html
https://en.wikipedia.org/wiki/Rete_algorithm
https://intellipaat.com/jbpm-drools-training/
http://www.masterspringboot.com/various/various/getting-started-with-drools-on-spring-boot-applications

https://www.youtube.com/watch?v=QtXGIu7hR8s
https://www.youtube.com/watch?v=5J_QT9i6WK8