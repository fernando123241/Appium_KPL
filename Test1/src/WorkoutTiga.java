import java.net.MalformedURLException;



import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class WorkoutTiga	 extends Base {

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
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
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
		
		//Membuka menu pemasukan
		driver.findElementById("com.chad.financialrecord:id/btnIncome").click();
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		//Memberikan nilai jumlah 500.000
		driver.findElementById("com.chad.financialrecord:id/etAmount").sendKeys("500000");
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Memberikan keterangan sebagai uang gaji
		driver.findElementById("com.chad.financialrecord:id/etNote").sendKeys("Uang gaji");
		
		try {
            Thread.sleep(5000); // Menunggu selama 5000 milidetik (5 detik)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		//Simpan
		driver.findElementById("com.chad.financialrecord:id/btSave").click();
	}

}