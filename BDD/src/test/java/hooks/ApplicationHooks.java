package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class ApplicationHooks {
	@Before(order =1)
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
	@After(order =1)
	public void afterHook()
	{
		System.out.println("After hook is executing");
	}

	@BeforeStep(order =1)
	public void BeforeSteps()
	{
		System.out.println("Before steps1 Executing");
	}
	@AfterStep(order =1)
	public void AfterSteps()
	{
		System.out.println("After steps1 executing");
	}
	@BeforeStep(order =2)
	public void BeforeSteps2()
	{
		System.out.println("Before steps2 Executing");
	}
	@AfterStep(order =2)
	public void AfterSteps2()
	{
		System.out.println("After steps2 executing");
	}

@Before (order =2)
public void beforeHook2()
{
	System.out.println("Before hook2 is executing");
}
@After(order =2)
public void afterHook2()
{
	System.out.println("After hook2 is executing");
}

@Before (order =3)
public void beforeHook3()
{
	System.out.println("Before hook3 is executing");
}
@After(order =3)
public void afterHook3()
{
	System.out.println("After hook3 is executing");
}
}
