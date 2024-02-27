package com.mahait.otpandemailintegration;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SMSExample {
    // Your Twilio Account SID and Auth Token
    private static final String ACCOUNT_SID = "your_account_sid";
    private static final String AUTH_TOKEN = "your_auth_token";

    // Your Twilio phone number (must be purchased from Twilio)
    private static final String TWILIO_PHONE_NUMBER = "your_twilio_phone_number";

    public static void main(String[] args) {
        // Initialize Twilio with your credentials
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        // Recipient's phone number (format: "+1234567890")
        String toPhoneNumber = "+1234567890";

        // Message to send
        String messageBody = "Hello from Twilio!";

        try {
            // Send the SMS message
            Message message = Message.creator(
                    new PhoneNumber(toPhoneNumber),
                    new PhoneNumber(TWILIO_PHONE_NUMBER),
                    messageBody
            ).create();

            // Check the message status (optional)
            System.out.println("Message SID: " + message.getSid());
            System.out.println("Message Status: " + message.getStatus());
        } catch (Exception e) {
            System.err.println("Error sending SMS: " + e.getMessage());
        }
    }
}
