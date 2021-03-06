package com.cg.pb.dao;

import com.cg.pb.bean.Transaction;

public class TransactionDAOImpl implements TransactionDAO {

	@Override
	public void addTransaction(long accNo, Transaction transaction) {
		for (long i : AccountDAOImpl.accListHash.keySet()) {
			if (i == accNo) {
				System.out.println(AccountDAOImpl.accListHash.get(i));
			}
		}
	}

	@Override
	public void creditUsingSlip(long accNo, double amount) {

		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if (x.getAccNo() == accNo) {
				if (amount >= 0) {
					x.setBalance(x.getBalance() + amount);
					System.out.println("Credited Successfully");
				} else {
					System.out.println("Amount should be less than 100");
				}
			} else {
				System.out.println("Account does not exist");
			}

		});

	}

	@Override
	public void debitUsingSlip(long accNo, double amount) {
		double minBalance = 1000;
		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if (x.getAccNo() == accNo) {
				if ((x.getBalance() >= minBalance && (x.getBalance() - amount) >= minBalance)) {
					x.setBalance(x.getBalance() - amount);
					System.out.println("Debited Successfully");
				} else {
					System.out.println("Transaction failed");
				}
			} else {
				System.out.println("Account does not exist");
			}
		});

	}

	@Override
	public void creditUsingCheque(long accNo, double amount) {
		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if (x.getAccNo() == accNo) {
				if (amount >= 0) {
					x.setBalance(x.getBalance() + amount);
					System.out.println("Credited Successfully");
				} else {
					System.out.println("Amount should be less than 100");
				}
			} else {
				System.out.println("Account does not exist");
			}

		});
	}

	@Override
	public void debitUsingCheque(long accNo, double amount) {
		double minBalance = 1000;
		AccountDAOImpl.accList.stream().filter(x -> x.getAccNo() == accNo).forEach(x -> {
			if (x.getAccNo() == accNo) {
				if ((x.getBalance() >= minBalance && (x.getBalance() - amount) >= minBalance)) {
					x.setBalance(x.getBalance() - amount);
					System.out.println("Debited Successfully");
				} else {
					System.out.println("Transaction failed");
				}
			} else {
				System.out.println("Account does not exist");
			}
		});


	}

}
