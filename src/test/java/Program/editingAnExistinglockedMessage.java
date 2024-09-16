package Program;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BaseClassUtility.BaseClass;
import PomUtility.PageElement;
@Listeners(ListenersCode.ListenersCodeForEditingExistingLMessage.class)
public class editingAnExistinglockedMessage extends BaseClass
{
	@Test
	public void editingAnExistinglockedMessage() throws InterruptedException
	{
		PageElement el = new PageElement(driver);
		
		Thread.sleep(8000);
		
		el.lockedMessage.click();
		
		Thread.sleep(2000);
		
		el.edit.click();

		Thread.sleep(5000);
		
		el.visibleMessage.clear();
		
		Thread.sleep(5000);
		
		el.visibleMessage.sendKeys("Visible text edited");
		
		Thread.sleep(5000);
		
		el.premiumContent.clear();
		Thread.sleep(3000);
		
		el.premiumContent.sendKeys("Premium Message Updated");
		
		Thread.sleep(4000);
		
		el.submit.click();
		
	}
}
