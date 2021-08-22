package com.greatlearning.service;

public class OTPService {

	static public int generateOTP() {
		int randomPin = (int) (Math.random() * 9000) + 1000;
		return randomPin;

	}
}