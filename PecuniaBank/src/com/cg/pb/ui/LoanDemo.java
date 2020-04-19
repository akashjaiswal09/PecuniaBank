package com.cg.pb.ui;

import java.util.Scanner;

import com.cg.pb.bean.Loan;
import com.cg.pb.exception.*;
import com.cg.pb.service.LoanServiceImpl;
import com.cg.pb.validator.*;

public class LoanDemo {
	public static void main(String[] args) {
		Loan loan = new Loan();
		LoanServiceImpl lsi = new LoanServiceImpl();
		String accNo, loanType, loanStatus;
		long amount;
		int tenure, creditScore, roi;
		Scanner scr = new Scanner(System.in);
		while (true) {
			System.out.println("1. for create loan request\n" + "2. for loan disbursal\n" + "3. for loan details");
			int opt = scr.nextInt();
			scr.nextLine();
			switch (opt) {
			case 1:
				while (true) {
					System.out.println("Enter the Account No.");
					accNo = scr.next();
					try {
						LoanValidator.isValidAccNo(accNo);
						break;
					} catch (isValidAccNoException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Enter Loan Amount");
					amount = scr.nextLong();
					try {
						LoanValidator.isValidAmount(amount);
						break;
					} catch (isValidAmountException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Enter the Tenure");
					tenure = scr.nextInt();
					try {
						LoanValidator.isValidTenure(tenure);
						break;
					} catch (isValidTenureException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Enter Credit scrore");
					creditScore = scr.nextInt();
					try {
						LoanValidator.isValidCreditScore(creditScore);
						break;
					} catch (isValidCreditScoreException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Ente rate of interest");
					roi = scr.nextInt();
					try {
						LoanValidator.isValidRoi(roi);
						break;
					} catch (isValidRoiException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Enter the loan type");
					loanType = scr.next();
					try {
						LoanValidator.isValidLoanType(loanType);
						break;
					} catch (isValidLoanTypeException e) {
						System.out.println(e);
					}
				}
				while (true) {
					System.out.println("Enter the loan status");
					loanStatus = scr.next();
					try {
						LoanValidator.isValidLoanStatus(loanStatus);
						break;
					} catch (isValidLoanStatusException e) {
						System.out.println(e);
					}
				}

				loan.setAccNo(Long.parseLong(accNo));
				loan.setAmount(amount);
				loan.setTenure(tenure);
				loan.setCreditScore(creditScore);
				loan.setRoi(roi);
				loan.setLoanType(loanType);
				loan.setLoanStatus(loanStatus);
				lsi.createLoanRequest(loan);
				System.out.println("Loan Request Created Successfully");
				break;
			case 2:
				System.out.println("Enter the Account Number");
				accNo = scr.nextLine();
				lsi.loanDisburse(Long.parseLong(accNo));
				break;
			case 3:
				System.out.println("Enter the Account Number");
				accNo = scr.nextLine();
				lsi.getLoanDetail(Long.parseLong(accNo));
				break;
			default:
				System.out.println("Choose Appropriate Value");
				break;
			}

		}

	}

}
