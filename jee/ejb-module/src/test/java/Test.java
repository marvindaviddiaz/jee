import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.sample.inventory.bs.service.InventoryServiceRemote;
import com.sample.inventory.eis.bo.Product;

public class Test {

	public static void main(String[] args) throws NamingException {
//		System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
//		System.setProperty(InitialContext.PROVIDER_URL, "remote://localhost:3700");
//		Context initialContext = new InitialContext();
		
		// OR:

		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.SerialInitContextFactory");
		props.put(InitialContext.PROVIDER_URL, "remote://localhost:3700");
		Context initialContext = new InitialContext(props);

		InventoryServiceRemote ejbHome = (InventoryServiceRemote) initialContext.lookup("java:global/ejb-module/InventoryService!com.sample.inventory.bs.service.InventoryServiceRemote");

		List<Product> lista = ejbHome.getProducts();
		for (Product p : lista) {
			System.out.println(p.getName() + " \t " + p.getPrice());
		}
	}

}
