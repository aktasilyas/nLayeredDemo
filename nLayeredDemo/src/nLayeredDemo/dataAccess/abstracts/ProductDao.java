package nLayeredDemo.dataAccess.abstracts;



import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void Add(Product product);
	void Delte(Product product);
	void Update(Product product);
	Product get(int id);
	List<Product> getAll();

}
