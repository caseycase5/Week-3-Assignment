package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean 
@ViewScoped
public class Orders {
	List<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		orders.add(new Order("0001", "Product 1", (float)45.00, 2));
		orders.add(new Order("0002", "Product 2", (float)16.55, 5));
		orders.add(new Order("0003", "Product 3", (float)147.12, 1));
		orders.add(new Order("0004", "Product 4", (float)36.99, 6));	
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
