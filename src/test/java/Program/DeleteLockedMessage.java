package Program;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import BaseClassUtility.BaseClass;
import BaseClassUtility.Random_No;
import PomUtility.PageElement;
@Listeners(ListenersCode.ListenersCodeForDeleteLockedMessage.class)

public class DeleteLockedMessage extends BaseClass
{
	@Test
	public void deleteLockedMessage() throws InterruptedException
	{
		PageElement el = new PageElement(driver);
		
		Thread.sleep(8000);
		
		el.lockedMessage.click();
		
		Thread.sleep(8000);
		
		el.createLockedMessage.click();
		
		int no = Random_No.random();
		
		String s = String.valueOf(no);
		
		el.amount.sendKeys(s);
		
		el.visibleMessage.sendKeys("Demo Delete BM");
		
		el.premiumContent.sendKeys("Demo Delete BM2");
		
		el.submit.click();
		
		Thread.sleep(5000);
		
		el.delete.click();
		
		Thread.sleep(2000);
		
		el.delete2.click();
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		
	}
}
