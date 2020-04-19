package com.cg.pb.ui;

import java.time.LocalDate;
import java.util.Scanner;
import com.cg.pb.bean.*;
import com.cg.pb.dao.UserDAOImpl;
import com.cg.pb.exception.*;
import com.cg.pb.service.*;
import com.cg.pb.validator.AccountValidator;
import com.cg.pb.validator.AddressValidator;
import com.cg.pb.validator.CustomerValidator;
import com.cg.pb.validator.LoanValidator;
import com.cg.pb.validator.TransactionValidator;
import com.cg.pb.validator.Utilities;

public class BankDemo {
	public static void main(String[] args) throws Exception {

		Scanner scr = new Scanner(System.in);
		boolean login = false;
		String admin = null;

		CustomerServiceImpl csi = new CustomerServiceImpl();
		AccountServiceImpl asi = new AccountServiceImpl();
		TransactionServiceImpl tsi = new TransactionServiceImpl();
		PassbookServiceImpl psi = new PassbookServiceImpl();
		LoanServiceImpl lsi = new LoanServiceImpl();

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
				scr.nextLine();

				switch (opt) {
				case 1:
					System.out.println("1. add Customer\n" + "2. View Customer\n" + "3. For Update\n"
							+ "4. Delete Customer Account");
					int opt1 = scr.nextInt();
					scr.nextLine();
					switch (opt1) {
					case 1:
						String name, accNo, contact, aadhar, dob, pan, gender, addressline1, addressline2, city, state,
								zipcode, branchId, accType, balance;
						while (true) {
							System.out.println("Enter Customer Name");
							name = scr.nextLine();
							try {
								CustomerValidator.isValidName(name);
								break;
							} catch (isValidNameException e) {
								System.out.println(e);
							}

						}
						while (true) {
							System.out.println("Enter Customer Contact");
							contact = scr.nextLine();
							try {
								CustomerValidator.isValidContact(contact);
								break;
							} catch (isValidContactException e) {
								System.out.println(e);
							}

						}
						while (true) {
							System.out.println("Enter Customer Aadhar");
							aadhar = scr.nextLine();
							try {
								CustomerValidator.isValidAadhar(aadhar);
								break;
							} catch (isValidAadharException e) {
								System.out.println(e);
							}

						}
						while (true) {
							System.out.println("Enter Customer DOB(DD/MM/YYYY)");
							dob = scr.nextLine();
							try {
								CustomerValidator.isValidDOB(dob);
								break;
							} catch (isValidDobException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Customer PAN(for eg: abcde1234e)");
							pan = scr.nextLine();
							try {
								CustomerValidator.isValidPAN(pan);
								break;
							} catch (isValidPanException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Customer Gender");
							gender = scr.nextLine();
							try {
								CustomerValidator.isValidGender(gender);
								break;
							} catch (isValidGenderException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Customer Address line 1");
							addressline1 = scr.nextLine();
							try {
								AddressValidator.isValidAddressline(addressline1);
								break;
							} catch (isValidAddresslineException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Customer Address line 2");
							addressline2 = scr.nextLine();
							try {
								AddressValidator.isValidAddressline(addressline2);
								break;
							} catch (isValidAddresslineException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter City");
							city = scr.nextLine();
							try {
								AddressValidator.isValidCity(city);
								break;
							} catch (isValidCityException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter State");
							state = scr.nextLine();
							try {
								AddressValidator.isValidState(state);
								break;
							} catch (isValidStateException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter ZipCode");
							zipcode = scr.nextLine();
							try {
								AddressValidator.isValidZipcode(zipcode);
								break;
							} catch (isValidZipcodeException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Account No");
							accNo = scr.nextLine();
							try {
								AccountValidator.isValidAccNo(accNo);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Branch Id");
							branchId = scr.nextLine();
							try {
								AccountValidator.isValidBranchId(branchId);
								break;
							} catch (isValidBranchIdException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Account Type");
							accType = scr.nextLine();
							try {
								AccountValidator.isValidAccType(accType);
								break;
							} catch (isValidAccTypeException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter Customer Balance");
							balance = scr.nextLine();
							try {
								AccountValidator.isValidBalance(Double.parseDouble(balance));
								break;
							} catch (isValidBalanceException e) {
								System.out.println(e);
							}
						}

						customer.setName(name);
						customer.setAadhar(Long.parseLong(aadhar));
						customer.setContact(Long.parseLong(contact));
						customer.setDOB(dob);
						customer.setPAN(pan);
						customer.setGender(gender);
						customer.setAddress(address);

						address.setAddressline1(addressline1);
						address.setAddressline2(addressline2);
						address.setCity(city);
						address.setState(state);
						address.setZipcode(zipcode);

						account.setAccNo(Long.parseLong(accNo));
						account.setAccType(accType);
						account.setBranchId(Integer.parseInt(branchId));
						account.setBalance(Integer.parseInt(balance));
						account.setCustomer(customer);
						account.setAddress(address);

						asi.addAccount(account, customer, address);

						System.out.println("Customer Account added successfully!!");
						break;

					case 2:
						while (true) {
							System.out.println("Enter Account Number");
							String accNo1 = scr.nextLine();
							try {
								AccountValidator.isValidAccNo(accNo1);
								asi.fetchAccount(Long.parseLong(accNo1));
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						break;
					case 3:

						System.out.println("Enter Account Number You want to make change:");
						String updAccNo = scr.nextLine();
						while (true) {
							try {
								AccountValidator.isValidAccNo(updAccNo);
								account.setAccNo(Long.parseLong(updAccNo));
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}

						System.out.println("Choose the following you want to change:\n" + "1. Name\n" + "2. Contact\n"
								+ "3. Address");
						int opt3 = scr.nextInt();
						scr.nextLine();
						switch (opt3) {
						case 1:
							String name1;
							while (true) {
								System.out.println("Enter Customer Name");
								name1 = scr.nextLine();
								try {
									CustomerValidator.isValidName(name1);
									break;
								} catch (isValidNameException e) {
									System.out.println(e);
								}

							}

							csi.updateCustomerName(Long.parseLong(updAccNo), name1);
							System.out.println("Name Updated successfully");
							break;
						case 2:
							String contact1;
							while (true) {
								System.out.println("Enter Customer Contact");
								contact1 = scr.nextLine();
								try {
									CustomerValidator.isValidContact(contact1);
									break;
								} catch (isValidContactException e) {
									System.out.println(e);
								}
							}
							csi.updateCustomerContact(Long.parseLong(updAccNo), Long.parseLong(contact1));
							break;
						case 3:
							String address1, address2, city1, state1, zipcode1;
							while (true) {

								System.out.println("Enter Customer Address line 1");
								address1 = scr.nextLine();
								try {
									AddressValidator.isValidAddressline(address1);
									break;
								} catch (isValidAddresslineException e) {
									System.out.println(e);
								}
							}
							while (true) {
								System.out.println("Enter Customer Address line 2");
								address2 = scr.nextLine();
								try {
									AddressValidator.isValidAddressline(address2);
									break;
								} catch (isValidAddresslineException e) {
									System.out.println(e);
								}
							}

							while (true) {
								System.out.println("Enter City");
								city1 = scr.nextLine();
								try {
									AddressValidator.isValidCity(city1);
									break;
								} catch (isValidCityException e) {
									System.out.println(e);
								}
							}
							while (true) {
								System.out.println("Enter State");
								state1 = scr.nextLine();
								try {
									AddressValidator.isValidState(state1);
									break;
								} catch (isValidStateException e) {
									System.out.println(e);
								}
							}
							while (true) {
								System.out.println("Enter ZipCode");
								zipcode1 = scr.nextLine();
								try {
									AddressValidator.isValidZipcode(zipcode1);
									break;
								} catch (isValidZipcodeException e) {
									System.out.println(e);
								}
							}
							address.setAddressline1(address1);
							address.setAddressline2(address2);
							address.setCity(city1);
							address.setState(state1);
							address.setZipcode(zipcode1);
							csi.updateCustomerAddress(Long.parseLong(updAccNo), address);
							break;
						default:
							System.out.println("Choose appropiate value");
							break;
						}
						break;

					case 4:
						String delAccNo;
						while (true) {
							System.out.println("Enter Account No");
							delAccNo = scr.nextLine();
							try {
								AccountValidator.isValidAccNo(delAccNo);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						asi.deleteAccount(Long.parseLong(delAccNo));
						break;
					default:
						System.out.println("Choose appropiate value");
						break;
					}
					break;
				case 2:
					System.out.println("1.credit amount using slip\n" + "2.debit amount using slip \n"
							+ "3. credit amount using cheque\n" + "4.dedit amount using cheque\n" + "5.check balance");
					System.out.println("enter option");
					Transaction transaction = new Transaction();
					int opt2 = scr.nextInt();
					scr.nextLine();
					switch (opt2) {

					case 1:
						String accNo;
						long amount;
						LocalDate date = LocalDate.now();
						while (true) {
							System.out.println("enter account number..");
							accNo = scr.nextLine();
							try {
								TransactionValidator.isValidAccNo(accNo);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter amount you want to deposite");
							amount = scr.nextInt();
							try {
								TransactionValidator.isValidAmount(amount);
								break;
							} catch (isValidAmountException e) {
								System.out.println(e);
							}
						}
						tsi.creditUsingSlip(Long.parseLong(accNo), amount);
						transaction.setAccNo(Long.parseLong(accNo));
						transaction.setType("Credited");
						transaction.setBalance(account.getBalance());
						transaction.setDate(date);
						transaction.setAmount(amount);

						psi.storeTransaction(transaction);

						break;
					case 2:

						String accNo1;
						long amount1;
						LocalDate date1 = LocalDate.now();
						while (true) {
							System.out.println("enter account number..");
							accNo1 = scr.nextLine();
							try {
								TransactionValidator.isValidAccNo(accNo1);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter amount you want to withdraw");
							amount1 = scr.nextInt();
							try {
								TransactionValidator.isValidAmount(amount1);
								break;
							} catch (isValidAmountException e) {
								System.out.println(e);
							}
						}

						transaction.setAccNo(Long.parseLong(accNo1));
						transaction.setType("Debited");
						transaction.setBalance(account.getBalance());
						transaction.setDate(date1);
						transaction.setAmount(amount1);

						psi.storeTransaction(transaction);
						tsi.debitUsingSlip(Long.parseLong(accNo1), amount1);
						break;

					case 3:
						String benAccNo, chequeNo, ifsc, payeeAccNo;
						long amount2;
						LocalDate date2 = LocalDate.now();
						while (true) {
							System.out.println("enter Payee account number");
							payeeAccNo = scr.nextLine();
							try {
								TransactionValidator.isValidAccNo(payeeAccNo);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter benificiary account number");
							benAccNo = scr.nextLine();
							try {
								TransactionValidator.isValidAccNo(benAccNo);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter amount you want to deposite");
							amount2 = scr.nextInt();
							try {
								TransactionValidator.isValidAmount(amount2);
								break;
							} catch (isValidAmountException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter check number");
							chequeNo = scr.nextLine();
							try {
								TransactionValidator.isValidChequeNo(chequeNo);
								break;
							} catch (isValidChequeNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter ifsc code");
							ifsc = scr.nextLine();
							try {
								TransactionValidator.isValidIfsc(ifsc);
								break;
							} catch (isValidIfscException e) {
								System.out.println(e);
							}
						}
						transaction.setAccNo(Long.parseLong(benAccNo));
						transaction.setType("CreditedCheque");
						transaction.setBalance(account.getBalance());
						transaction.setDate(date2);
						transaction.setAmount(amount2);

						psi.storeTransaction(transaction);
						tsi.creditUsingCheque(Long.parseLong(benAccNo), amount2);
						tsi.debitUsingCheque(Long.parseLong(payeeAccNo), amount2);
						break;
					case 4:
						String benAccNo1, chequeNo1, ifsc1;
						long amount3;
						LocalDate date3 = LocalDate.now();
						while (true) {
							System.out.println("enter benificiary account number");
							benAccNo1 = scr.nextLine();
							try {
								TransactionValidator.isValidAccNo(benAccNo1);
								break;
							} catch (isValidAccNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter amount you want to deposite");
							amount3 = scr.nextInt();
							try {
								TransactionValidator.isValidAmount(amount3);
								break;
							} catch (isValidAmountException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("enter check number");
							chequeNo1 = scr.nextLine();
							try {
								TransactionValidator.isValidChequeNo(chequeNo1);
								break;
							} catch (isValidChequeNoException e) {
								System.out.println(e);
							}
						}
						while (true) {
							System.out.println("Enter ifsc code");
							ifsc1 = scr.nextLine();
							try {
								TransactionValidator.isValidIfsc(ifsc1);
								break;
							} catch (isValidIfscException e) {
								System.out.println(e);
							}
						}

						transaction.setAccNo(Long.parseLong(benAccNo1));
						transaction.setType("DebitedCheque");
						transaction.setBalance(account.getBalance());
						transaction.setDate(date3);
						transaction.setAmount(amount3);
						psi.storeTransaction(transaction);
						tsi.creditUsingCheque(Long.parseLong(benAccNo1), amount3);
						break;

					default:
						System.out.println("Thanks for using");
						break;
					}
					break;
				case 3:
					String accNo;
					while (true) {
						System.out.println("Enter Account Number");
						accNo = scr.nextLine();
						try {
							AccountValidator.isValidAccNo(accNo);
							break;
						} catch (isValidAccNoException e) {
							System.out.println(e);
						}
					}

					psi.accountSummary(Long.parseLong(accNo));
					break;
				case 4:
					Loan loan = new Loan();
					String accNo1, loanType, loanStatus;
					long amount;
					int tenure, creditScore, roi;
					while (true) {
						System.out.println(
								"1. for create loan request\n" + "2. for loan disbursal\n" + "3. for loan details");
						int opt3 = scr.nextInt();
						scr.nextLine();
						switch (opt3) {
						case 1:
							while (true) {
								System.out.println("Enter the Account No.");
								accNo1 = scr.next();
								try {
									LoanValidator.isValidAccNo(accNo1);
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

							loan.setAccNo(Long.parseLong(accNo1));
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
							while (true) {
								System.out.println("Enter the Account Number");
								accNo1 = scr.nextLine();
								try {
									LoanValidator.isValidAccNo(accNo1);
									break;
								} catch (isValidAccNoException e) {
									System.out.println(e);
								}
							}

							lsi.loanDisburse(Long.parseLong(accNo1));
							break;
						case 3:
							while (true) {
								System.out.println("Enter the Account Number");
								accNo1 = scr.nextLine();
								try {
									LoanValidator.isValidAccNo(accNo1);
									break;
								} catch (isValidAccNoException e) {
									System.out.println(e);
								}
							}
							lsi.getLoanDetail(Long.parseLong(accNo1));
							break;
						default:
							System.out.println("Choose Appropriate Value");
							break;
						}
						break;
					}
					break;
				default:
					System.out.println("Choose appropiate value");
					break;

				}

			}
		} else
			System.out.println("Enter correct User Name and Password..!");
	}

}
