package com.cg.pb.ui;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import com.cg.pb.bean.Account;
import com.cg.pb.bean.Address;
import com.cg.pb.bean.Customer;
import com.cg.pb.bean.Passbook;
import com.cg.pb.bean.Transaction;
import com.cg.pb.bean.User;
import com.cg.pb.dao.AccountDAOImpl;
import com.cg.pb.dao.UserDAOImpl;
import com.cg.pb.service.AccountServiceImpl;
import com.cg.pb.service.PassbookServiceImpl;
import com.cg.pb.service.TransactionServiceImpl;
import com.cg.pb.utilities.Utilities;

public class BankDemo {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		boolean login = false;
		String admin = null;

		AccountServiceImpl asi = new AccountServiceImpl();
		TransactionServiceImpl tsi = new TransactionServiceImpl();
		PassbookServiceImpl psi = new PassbookServiceImpl();

		asi.addAccount();

		UserDAOImpl udi = new UserDAOImpl();
		udi.addUser();

		System.out.println("Enter Username: ");
		String uname = scr.next();
		System.out.println("Enter Password: ");
		String pass = scr.next();

		for (User u : udi.getUserList()) {
			if (u.getUname().equals(uname) && u.getPswd().equals(pass)) {
				admin = u.getName();
				login = true;
				break;
			}
		}
		if (login == true) {

			System.out.println("Welcome " + admin);

			while (true) {
				Account account = new Account();
				Customer customer = new Customer();
				Address address = new Address();

				System.out.println("1. Account\n" + "2. Transaction\n" + "3. Passbook\n" + "4. Loan");
				int opt = scr.nextInt();
				switch (opt) {
				case 1:
					System.out.println("1. add Customer\n" + "2. View Customer\n" + "3. For Update\n"
							+ "4. Delete Customer Account");
					int opt1 = scr.nextInt();

					switch (opt1) {
					case 1:
						String name, accNo, contact, aadhar, dob, pan;
						while (true) {
							System.out.println("Enter Customer Name");
							name = scr.next();
							boolean flag = Utilities.nameValidate(name);
							if (!flag)
								System.out.println("Only 3-10 digit alphabet allowed");
							else
								break;

						}
//							while(true) {
//								System.out.println("Enter Customer Contact");
//									contact=scr.next();
//									boolean flag = Utilities.contactValidate(contact);
//									
//									if(!flag)
//										System.out.println("Only 10 digit number allowed");
//									else
//										break;
//									
//									
//								}
//								while(true) {
//									System.out.println("Enter Customer Aadhar");
//									aadhar=scr.next();
//									boolean flag = Utilities.aadharValidate(aadhar);
//									if(!flag)
//										System.out.println("Only 12 digit number allowed");
//									else
//										break;
//									
//									
//								}
//								while(true) {
//									System.out.println("Enter Customer DOB(DD/MM/YYYY)");
//									dob=scr.next();
//									boolean flag = Utilities.dateValidate(dob);
//									if(!flag)
//										System.out.println("Only valid date allowed");
//									else
//										break;
//									
//								}
//								while(true) {
//									System.out.println("Enter Customer PAN(for eg: abcde1234e)");
//									pan=scr.next();
//									boolean flag = Utilities.panValidate(pan);
//									if(!flag)
//										System.out.println("Wrong Pan Detail");
//									else
//										break;
//									
//									
//								}
//								
//								System.out.println("Enter Customer Gender");
//								String gender=scr.next();
//								System.out.println("Enter Customer Address line 1");
//								String addressline1=scr.next();
//								System.out.println("Enter Customer Address line 2");
//								String addressline2=scr.next();
//								System.out.println("Enter City");
//								String city=scr.next();
//								System.out.println("Enter State");
//								String state=scr.next();
//								System.out.println("Enter ZipCode");
//								String zipcode=scr.next();
						while (true) {
							System.out.println("Enter Account No");
							accNo = scr.next();
							boolean flag = Utilities.accNoValidate(accNo);
							if (!flag)
								System.out.println("Only 12 digit number allowed");
							else
								break;

						}
//							customer.setName(name);
//							customer.setAadhar(Long.parseLong(aadhar));
//							customer.setContact(Long.parseLong(contact));
//							customer.setDOB(dob);
//							customer.setPAN(pan);

						account.setAccNo(Long.parseLong(accNo));

						System.out.println("Enter Customer Balance");
						String balance = scr.next();

//								customer.setGender(gender);
//								address.setAddressline1(addressline1);
//								address.setAddressline2(addressline2);
//								address.setCity(city);
//								address.setState(state);
//								address.setZipcode(zipcode);

						customer.setAddress(address);
						account.setBalance(Integer.parseInt(balance));
						account.setCustomer(customer);
						account.setAddress(address);
						try {
							asi.addAccount(account, customer, address);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						System.out.println("Customer Account added successfully!!");
						break;

					case 2:
						System.out.println("Enter Account Number");
						long accNo1 = scr.nextLong();
						asi.fetchAccount(accNo1);
						break;
					case 3:
						System.out.println("Enter Account Number You want to make change:");
						String updAccNo = scr.next();
						account.setAccNo(Long.parseLong(updAccNo));
						System.out.println("Choose the following you want to change:\n" + "1. Name\n" + "2. Contact\n"
								+ "3. Address");
						int opt3 = scr.nextInt();
						switch (opt3) {
						case 1:
							System.out.println("Enter Name:");
							String name1 = scr.next();
							customer.setName(name1);
//								csi.updateCustomerName(account, customer);
							break;
						case 2:
							System.out.println("Enter Contact:");
							String contact1 = scr.next();
							customer.setContact(Long.parseLong(contact1));
//								csi.updateCustomerContact(account, customer);
							break;
						case 3:
							System.out.println("Enter Address Line 1:");
							String address1 = scr.next();
							System.out.println("Enter Address Line 2:");
							String address2 = scr.nextLine();
							System.out.println("Enter City:");
							String city1 = scr.nextLine();
							System.out.println("Enter State:");
							String state1 = scr.nextLine();
							System.out.println("Enter Zipcode:");
							String zipcode1 = scr.nextLine();
							address.setAddressline1(address1);
							address.setAddressline2(address2);
							address.setCity(city1);
							address.setState(state1);
							address.setZipcode(zipcode1);
//								csi.updateCustomerAddress(account, address);
							break;
						default:
							System.out.println("Choose appropiate value");
							break;
						}
						break;

					case 4:

						System.out.println("Enter Account Number");
						long delAccNo = scr.nextLong();
						asi.deleteAccount(delAccNo);
						break;
					}
					break;
				case 2:
					System.out.println("1.credit amount using slip\n" + "2.debit amount using slip \n"
							+ "3. credit amount using cheque\n" + "4.dedit amount using cheque\n" + "5.check balance");
					System.out.println("enter option");
					Transaction transaction = new Transaction();
					int opt2 = scr.nextInt();
					switch (opt2) {

					case 1:

						LocalDate date = LocalDate.now();

						System.out.println("enter account number..");
						long accNo = scr.nextLong();
						System.out.println("enter amount you want to deposite");
						int amount = scr.nextInt();

						transaction.setAccNo(accNo);
						transaction.setType("Credited");
						transaction.setBalance(transaction.getBalance());
						transaction.setDate(date);
						transaction.setAmount(amount);

						psi.storeTransaction(transaction);
						tsi.creditUsingSlip(accNo, amount);
						break;
					case 2:

						LocalDate date1 = LocalDate.now();

						System.out.println("enter account number..");
						long accNo2 = scr.nextLong();
						System.out.println("enter amount to Withdraw");
						Double amount2 = scr.nextDouble();

						transaction.setAccNo(accNo2);
						transaction.setType("Debited");
						transaction.setBalance(account.getBalance());
						transaction.setDate(date1);
						transaction.setAmount(amount2);

						psi.storeTransaction(transaction);
						tsi.debitUsingSlip(accNo2, amount2);
						break;
					case 3:

						System.out.println("enter benificiary account number");
						long benAccNo = scr.nextLong();
						System.out.println("enter check number");
						long checkNo = scr.nextLong();
						System.out.println("enter amount");
						double amount3 = scr.nextDouble();
						System.out.println("Enter ifsc code");
						long ifsc = scr.nextLong();

						break;

					case 4:
						System.out.println("enter account number..");
						long accNo4 = scr.nextLong();

						System.out.println("enter amount to deposite");
						double amount4 = scr.nextDouble();
						System.out.println("enter check number ");
						int checkNum2 = scr.nextInt();
						System.out.println("enter bank name");
						String bankname2 = scr.next();
						System.out.println("enter ifsc code");
						int ifsc2 = scr.nextInt();
						System.out.println("cheque issue date");
						String chequeIssuedate2 = scr.next();

						tsi.debitUsingCheque(accNo4, amount4);
						break;

					default:
						System.out.println("Thanks for using");
						break;
					}
					break;
				case 3:
					System.out.println("Enter Account Number");
					double accNo = scr.nextDouble();
					psi.accountSummary(accNo);
					break;

				}
				

			
			}
		}
		else

		{
			System.out.println("Enter correct User Name and Password..!");

		}
		}
	
}
