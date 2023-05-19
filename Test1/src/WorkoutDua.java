import java.net.MalformedURLException;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WorkoutDua	 extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		try {
            Thread.sleep(9000); // Menunggu selama 9000 milidetik (9 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Menolak pilihan untuk menyimpan data
		driver.findElementById("com.android.permissioncontroller:id/permission_deny_button").click();
		
		try {
            Thread.sleep(7000); // Menunggu selama 7000 milidetik (7 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Membuka menu +
		driver.findElementById("com.chad.financialrecord:id/fabMenu").click();
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Memberikan nilai jumlah 200.000
		driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("200000");
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Memberikan keterangan sebagai uang air
		driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Uang air");
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Simpan
		driver.findElementById("com.chad.financialrecord:id/btSave").click();
	}

}