import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import java.io.*;  
import java.net.*;  


public class ControlGpioExample {

    public static void main(String[] args) throws InterruptedException {

         final GpioController gpio = GpioFactory.getInstance();
       final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
   final GpioPinDigitalOutput pin2 = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_02, "MyLED2", PinState.HIGH);
    try{  

   pin.setShutdownOptions(true, PinState.LOW);
 pin2.setShutdownOptions(true, PinState.LOW);
String str="";
String str2="";
ServerSocket ss=new ServerSocket(6666);  

Socket s=ss.accept();  
DataInputStream dis=new DataInputStream(s.getInputStream());  
int i=0;
while(true)
{
s=ss.accept(); 
dis=new DataInputStream(s.getInputStream()); 
str=(String)dis.readUTF();
str2=(String)dis.readUTF();    

if(str.equals("0"))
{   if(str2.equals("1"))
{pin.low();}
else if(str2.equals("0"))
pin.high();
}
else if(str.equals("1"))
{
if(str2.equals("0"))
pin2.low();
else
pin2.high();
}

}

}catch(Exception e){e.printStackTrace();}  


     }
}