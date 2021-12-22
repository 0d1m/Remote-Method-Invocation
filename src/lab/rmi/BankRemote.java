package lab.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import lab.metier.Account;

public interface BankRemote extends Remote {
	
	public double conversion(double montant) throws RemoteException ;
	public Account consultAccount(int code) throws RemoteException ;
	public List<Account> listComptes() throws RemoteException ;
}
