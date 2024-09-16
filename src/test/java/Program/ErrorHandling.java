package Program;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import BaseClassUtility.Random_No;
import PomUtility.PageElement;
@Listeners(ListenersCode.ListenersCodeForErrorHandling.class)

public class ErrorHandling extends BaseClass 
{
	@Test
	public void errorHandling() throws InterruptedException
	{
		PageElement el = new PageElement(driver);
		
		Thread.sleep(8000);
		
		el.lockedMessage.click();
		
		Thread.sleep(8000);
		
		el.createLockedMessage.click();
		
		int no = Random_No.random();
		
		String s = String.valueOf(no);
		
		el.amount.sendKeys(s);
		
		el.visibleMessage.sendKeys("Demo");
		
		el.premiumContent.sendKeys("Demo2");
		
		el.submit.click();
		
		Thread.sleep(3000);
		
		assertTrue(el.productPrice.getText().contains(s), "Price Verify");
		
	}
}
