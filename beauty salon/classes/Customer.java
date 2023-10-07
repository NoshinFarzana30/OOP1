package  classes;
import java.lang.*;
import java.util.*;

public class Customer
{
   private String name;
   private int serialNumber;
   private String phoneNumber;
   private int[] choices;
   private double totalBill = 0;

   Scanner scanner = new Scanner(System.in);

	
        public void setName(String name)
        {
           this.name = name;
        }
        public String getName()
        {
           return name;
        }
        public void setSize(int n)
        {
           choices = new int[n];
        }

        
        public void setSerialNumber(int serialNumber)
        {
           this.serialNumber = serialNumber;
        }
        public int getSerialNumber()
        {
           return serialNumber;
        } 

        public void setPhoneNumber(String phoneNumber)
        {
           this.phoneNumber = phoneNumber;
        }
        public String getPhoneNumber()
        {
           return phoneNumber;
        }
        public double getTotalBill()
        {
           return totalBill;
        }

        public void getChoice(){
           for(int i=0; i<choices.length; i++){
            System.out.print("Enter The Serial Number Of Service "+(i+1)+": ");
            choices[i] = scanner.nextInt();
            if(choices[i]==1){
               totalBill += 500;
            }
            else if(choices[i]==2){
               totalBill += 1000;
            }
            else if(choices[i]==3){
               totalBill += 100;
            }
            else if(choices[i]==4){
               totalBill += 800;
            }
            else if(choices[i]==5){
               totalBill += 800;
            }
            else if(choices[i]==6){
               totalBill += 1200;
            }
           }
          
        }


	
}
