package actions.newappium;
import java.util.HashMap;
import io.appium.java_client.MobileElement;
import actions.selenium.utils.GetObjectRepository;
import utils.Elements;

class ClickElement {
	public void run(HashMap<String, String> params) throws Exception {
		//MobileElement element = Elements.find(params, Driver.driver);
        String ElementName = (String) params.get("Element Name");
        String PageName = (String) params.get("Page Name"); 
        MobileElement element = GetObjectRepository.find_Element(ElementName,PageName);
		element.click();
		return;
	}
}
