import java.net.MalformedURLException;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WorkoutSatu extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		try {
            Thread.sleep(10000); // Menunggu selama 10000 milidetik (10 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
			
		//Menolak pilihan untuk menyimpan data
		driver.findElementById("com.android.permissioncontroller:id/permission_deny_button").click();
		
		//Melihat menu mingguan
		driver.findElementByXPath("//android.widget.TextView[@text='Mingguan']").click();
		
		//Melihat menu bulanan
		driver.findElementByXPath("//android.widget.TextView[@text='Bulanan']").click();
		
		//Melihat menu tahunan
		driver.findElementByXPath("//android.widget.TextView[@text='Tahunan']").click();

	}

}