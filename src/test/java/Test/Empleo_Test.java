package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Empleo_Test {
	
	public static void main(String[] args) throws InterruptedException { 
	   		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Marce\\eclipse-workspace\\Prueba1\\Drivers\\chromedriver.exe");
		
		WebDriver driver;
			
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.choucairtesting.com/job/analista-de-pruebas-bogota/");
				
		
		Thread.sleep(5000);
			
		driver.findElement(By.xpath("//*[@id=\'post-7547\']/div/div[2]/div[3]/input")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\'nombre-completo\']")).sendKeys("Sonia Prueba ");
		
		driver.findElement(By.xpath("//*[@id=\'correo-electronico\']")).sendKeys("prueba11@prueba.com");
		
		driver.findElement(By.xpath("//*[@id=\'celular-o-telefono-de-contacto\']")).sendKeys("prueb12a");
		
		driver.findElement(By.xpath("//*[@id=\'que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente\']")).sendKeys("prueba de estudio ");
		
		driver.findElement(By.xpath("//*[@id=\'que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica\']")).sendKeys("4 años");
		
		driver.findElement(By.xpath("//*[@id=\'conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica\']")).sendKeys("No, pero estoy en proceso");
		
		driver.findElement(By.xpath("//*[@id=\'cual-es-tu-aspiracion-salarial\']")).sendKeys("aaaaaa");
		
		driver.findElement(By.xpath("//*[@id=\'si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias\']")).sendKeys("Inmediato.....");
		
		driver.findElement(By.xpath("//*[@id=\'mensaje-adicional\']")).sendKeys("Prueba técnica");
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//*[@id=\'post-7547\']/div/div[2]/div[3]/div/form/p/input[1]")).click();
		
		Thread.sleep(6000);
		
		driver.close();
		
	}
	
}


