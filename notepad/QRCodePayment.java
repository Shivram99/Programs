package com.mahait.notepad;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class QRCodePayment {
    public static void main(String[] args) {
        String paymentInfo = "9767422141@ybl"; // Replace with your payment data

        // Define the QR code size and format
        int width = 300;
        int height = 300;
        String format = "png"; // QR code image format

        // Generate the QR code
        BitMatrix bitMatrix;
        try {
            bitMatrix = new MultiFormatWriter().encode(paymentInfo, BarcodeFormat.QR_CODE, width, height);
        } catch (WriterException e) {
            e.printStackTrace();
            return;
        }

        // Specify the file path to save the QR code image
        Path filePath = FileSystems.getDefault().getPath("payment_qr_code.png");
        try {
            // Save the QR code image to the specified file path
            MatrixToImageWriter.writeToPath(bitMatrix, format, filePath);
            System.out.println("QR code saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

