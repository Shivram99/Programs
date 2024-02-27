package com.mahait.notepad;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SmsController {

	public static void main(String[] args) {

		String mobileNo = "9028422141";
		String AuthKey = "1ab8cccd755ca6fa71e27c2e313284a";

		String generatedOTP = generateOTP();
		String message = "<#>Your Verification Code is: " + generatedOTP
				+ ". Never share your OTP with anyone. os+B3hVT5UA #" + generatedOTP + " - FlairTune Pvt Ltd";

		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("http://Loginsms.ewyde.com/rest/services/sendSMS/sendGroupSms?AUTH_KEY=" + AuthKey + "&message="
						+ message + "&senderId=FLAIRT&routeId=1&mobileNos=" + mobileNo + "&smsContentType=english")
				.get().addHeader("Cache-Control", "no-cache").build();

		Response response=null;
		try {
			response = client.newCall(request).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(response.toString());

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
		int otp = 100000 + random.nextInt(999000); // Generate a random 4-digit OTP
		return Integer.toString(otp);
	}

	// Simulated OTP verification (Replace with secure verification logic)
	private static boolean verifyOTP(String generatedOTP, String userOTP) {
		return generatedOTP.equals(userOTP);
	}
}
