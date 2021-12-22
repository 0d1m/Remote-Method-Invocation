package lab.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.List;

import lab.metier.Account;


public class BankRMIService extends UnicastRemoteObject implements BankRemote{


	public BankRMIService() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double conversion(double amount) throws RemoteException {
		System.out.println("Conversion of the amount "+amount+ " ...");
		amount = amount * 2;
		return amount;
	}

	public Account consultAccount(int code) throws RemoteException {
		System.out.println("Consulting the account "+code);
		return new Account (code, Math.random()*100, new Date());
	}

	@Override
	public List<Account> listComptes() throws RemoteException {
		
		return null;
	}

}
