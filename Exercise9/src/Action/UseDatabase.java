package Action;
import java.util.ArrayList;
import java.util.List;
import DAO.CustomerDAO;
import DAO.CustomerDAOusage;
import DAO.InvoiceDAO;
import DAO.InvoiceDAOusage;
import DAO.ItemDAO;
import DAO.ItemDAOusage;
import DAO.TransactionDAO;
import DAO.TransactionDAOusage;
import DTO.CustomerDTO;
import DTO.InvoiceDTO;
import DTO.ItemDTO;
import DTO.TransactionDTO;

public class UseDatabase {
public static void main(String[] args) {
	CustomerDAO customer = new CustomerDAOusage();
	CustomerDTO democustomer  = new CustomerDTO();
	
	ItemDAO item = new 	ItemDAOusage();
	ItemDTO demoItem = new ItemDTO();
	
	InvoiceDAO invoice  = new InvoiceDAOusage();
	InvoiceDTO demoinvoice = new InvoiceDTO();
	
	TransactionDAO transaction = new TransactionDAOusage();
	TransactionDTO demoTransactions = new TransactionDTO();
	
	
	
	
	//Customer operations
//		democustomer=customer.findById(10001);
//		System.out.println(customer.findById(10001));
//		System.out.println(customer.findById(10001).getAddress());
//		democustomer.setName("naveenkarthik");
//		customer.updateCustomer(democustomer);
//		System.out.println(customer.findById(10001).getName());
		//System.out.println(customer.findByName("naveenkarthik"));
//System.out.println(customer.findAll());
//		demo.setId(10002);
//		demo.setName("Ranju");
//		demo.setAddress("bengaluru");
//		System.out.println(demo.getAddress());

	
	//Item operations
	//System.out.println(item.findById(101).getDescription());
//System.out.println(item.findByName("Mi drimmer").getDescription());
	//System.out.println(item.findAll());
	//demoItem = item.findByName("Mi drimmer");
	//System.out.println(demoItem.getPrice());
//		demoItem.setDescription("Mi drimmer is very powerful");
//		int r = item.updateItem(demoItem);
//		System.out.println(r);
		
		
	//Transaction Operation:
	//demoTransactions = transaction.findByInvoice(1001);
//System.out.println(demoTransactions.getItemQuantity());
		
//demoTransactions.setItemQuantity(80);
//	
//	System.out.println(transaction.updateTransaction(demoTransactions));
//	System.out.println(demoTransactions.getItemQuantity());
	
	//invoice operations
demoinvoice= invoice.findByCustomer(130);
	demoinvoice.setDate("05-03-2023");
	System.out.println(invoice.updateInvoice(demoinvoice));
	System.out.println(demoinvoice.getDate());
}






}
