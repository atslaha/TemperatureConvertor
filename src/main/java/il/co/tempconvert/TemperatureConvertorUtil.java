package il.co.tempconvert;

import java.util.Scanner;

public class TemperatureConvertorUtil {
	
	private float f =0 ,k = 0, c = 0;
	
	public String inputMethod() {
		String input="";
		Scanner scan = new Scanner (System.in);
		input = scan.nextLine();
		scan.close();
		return input;
	}
	
	public void convertCelsius(float floInput) {
		f = floInput*(9/5)+32;
	    k = (floInput + (float)273.15);
	    System.out.printf("{\"K\": \"%.0f\", \"F\": \"%.0f\"}\n",k ,f);
	}
	
	public void convertKelvin(float floInput) {
		c = (floInput-(float)273.15);
		f = (((floInput * 9/5)) - (float)(459.67)) ;
		System.out.printf("{\"C\": \"%.0f\", \"F\": \"%.0f\"}\n",c ,f);
	}
	
	public void convertFahrenheit(float floInput) {
		c = (floInput - 32)*5/9;
		k = (floInput + (float)(459.67))*5/9;
		System.out.printf("{\"C\": \"%.0f\", \"K\": \"%.0f\"}\n",c ,k);
	}
	
	public void convertInput(float floInput, String str) {
		if(str.equals("C")) {
			convertCelsius(floInput);
		}else
		if(str.equals("K")) {
			convertKelvin(floInput);
        }else
		if(str.equals("F")) {
			convertFahrenheit(floInput);
        }
	}

}
