package store1;
import java.util.*;
import models.*;


public class DAOlist 
{
	
  
	public List<product> dataList()
	{
		product p = new product(001,"Cheese Margarita",300.0,"Pizza");
		product p1 = new product(002,"Chicken Wings",200.0,"Sides");
		product p2 = new product(003,"Mousse",100.0,"Dessert");
		ArrayList al = new ArrayList(); 
		al.add(p); 
		al.add(p1);
		al.add(p2);
		return al;
		
	}
}
