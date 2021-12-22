import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import lab.rmi.BankRMIService;

public class RMIServer {

	public static void main(String[] args) {
		 try {
			LocateRegistry.createRegistry(1099);
			BankRMIService BR = new BankRMIService();
			Naming.rebind("rmi://localhost:1099/BR" , BR);
			System.out.print("server has strated !\n"
							+ "waiting for client to connect...\n\n");
		}
		 catch (Exception e) {
			e.printStackTrace();
		}
	}

}
