import com.moducommerce.customer.customer
import com.moducommerce.order.order

public class moducommerceMain {
    public static void main (String[] args)
    Customer customer = new Customer("Mutthappa Rai","mutthapparai@gmail.com");
    Order order = new Order (ORD123,"500");
    
    System.out.println("Customer Details");
    customer.displayinfo();

    System.out.println("Order Details");
    order.displayOrder();
}
