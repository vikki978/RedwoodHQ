package actions.newappium;

/**
 * Created by dinkark on 13-Oct-2016
 */
import java.util.HashMap;
import utils.Constants;
import io.appium.java_client.MobileElement;
import utils.Elements;
import actions.newappium.Driver;
import utils.SwipeElement;
import actions.selenium.utils.GetObjectRepository;

class SwipeUp {
	public void run(HashMap<String, String> params) throws Exception {
        System.out.println("Inside Swipe Up");
		//MobileElement element = Elements.find(params, Driver.driver);
          String ElementName = (String) params.get("Element Name");
          String PageName = (String) params.get("Page Name"); 
        
          MobileElement element = GetObjectRepository.find_Element(ElementName,PageName);
        System.out.println("Inside Swipe Up"+element);
        int noOfTimes = Integer.parseInt(params.get(Constants.NO_OF_TIMES));
        for (int i = 0; i < noOfTimes; i++) {
		SwipeElement.swipeUp(element, Driver.driver);
            System.out.println("Swipe Up Successful");
        }
	}
}
