/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smsgateway;

import com.clockworksms.*;
import com.clockworksms.SMS;
import com.clockworksms.ClockWorkSmsService;
/**
 *
 * @author GIHANZ
 */
public class SendSMS {
    String smsAPI="";
    public void sendingRandenigala(){
        
         
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Randenigala Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingBowatenna(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Bowatenna  Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingKanthale(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Kanthale  Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingVictoria(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0713031904", "Victoria  Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingRantambe(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Rantambe  Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingKothmale(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Kothmale Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingMaduruoya(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Maduruoya Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
    public void sendingPolgolla(){
         try
      {
         ClockWorkSmsService clockWorkSmsService = new com.clockworksms.ClockWorkSmsService(smsAPI);
         SMS sms = new SMS("0715921541", "Polgolla Water Level Alert !");
         ClockworkSmsResult result = clockWorkSmsService.send(sms);

         if(result.isSuccess())
         {System.out.println("Sent with ID: " + result.getId());}
         else
         {System.out.println("Error: " + result.getErrorMessage());}
      }
      catch (ClockworkException e)
      {
         e.printStackTrace();
      }
    }
    
}
