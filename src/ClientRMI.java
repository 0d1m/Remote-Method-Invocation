import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import lab.metier.Account;
import lab.rmi.BankRemote;

public class ClientRMI {	
	public static void main(String[] args) {
		BankRemote stub;
		try {
			stub = (BankRemote) Naming.lookup("rmi://localhost:1099/BR");
			System.out.println("Conversion of the amount...");
			System.out.println("converted amount : " + stub.conversion(548));
			System.out.println("\nConsulting account...");
			Account account = stub.consultAccount(1);
			System.out.println("\tCode="+ account.getCode());
			System.out.println("\tBalance="+ account.getBalance());
			System.out.println("\tCreation Date="+account.getCreationDate());
		}
		catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
	
}