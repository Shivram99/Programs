package com.mahait.otpandemailintegration;

import java.util.Random;
import java.util.Scanner;

public class OTPLoginExample {
    public static void main(String[] args) {
        // Simulate OTP generation (In practice, use a secure OTP service)
        String generatedOTP = generateOTP();

        // Simulate sending OTP to the user (e.g., via SMS, email, or mobile app)
        sendOTPToUser(generatedOTP);

        // Simulate user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter OTP: ");
        String userOTP = scanner.nextLine();

        // Verify the entered OTP
        boolean isOTPValid = verifyOTP(generatedOTP, userOTP);

        if (isOTPValid) {
            System.out.println("OTP verification successful. You are logged in.");
        } else {
            System.out.println("OTP verification failed. Login unsuccessful.");
        }
    }

    // Simulated OTP generation (Replace with secure OTP generation)
    private static String generateOTP() {
        Random random = new Random();
        int otp = 1000 + random.nextInt(9000); // Generate a random 4-digit OTP
        return Integer.toString(otp);
    }

    // Simulated OTP sending (Replace with actual delivery mechanism)
    private static void sendOTPToUser(String otp) {
        System.out.println("Sending OTP to the user: " + otp);
    }

    // Simulated OTP verification (Replace with secure verification logic)
    private static boolean verifyOTP(String generatedOTP, String userOTP) {
        return generatedOTP.equals(userOTP);
    }
}
