package dev.abibou.pms;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dev.abibou.pms.dto.Product;
import dev.abibou.pms.services.ProductServices;


public class PMSLauncher 
{
	private static Scanner sc = new Scanner(System.in);
	
	
    public static void main( String[] args ) {
  //initialize spring container
  		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
  		
  		//get the Product Service bean reference
  		ProductServices service = (ProductServices)context.getBean("product-service");
  		
  		Product product;
  		int pid;
  		
  		while(true) {
  			System.out.println("1. New Product");
  			System.out.println("2. Search Product");
  			System.out.println("3. Update Product");
  			System.out.println("4. Delete Product");
  			System.out.println("5. All Products");
  			System.out.println("6. Exit");
  			
  			System.out.print("\nenter an option: ");
  			int opt = sc.nextInt();
  			
  			switch(opt) {
  			 case 1:
  				product = productEntry();
  				service.createProduct(product);;
  				break;
  			 case 2:
  				System.out.print("enter product id to search: ");
  				pid = sc.nextInt();
  				service.findProductByID(pid);
  				break;
  			 case 3:
  				break;
  			 case 4:
  				System.out.print("enter product id to delete: ");
  				pid = sc.nextInt();
  				service.deleteProductByID(pid);;
  				break;
  			 case 5:
  				 service.findAllProducts();
  				break;
  			 case 6:
  				System.out.println("---- application designed & developed by dev@abibou ----");
  				System.exit(0);
  				break;
  			 default:
  				System.err.println("INVALID OPTION-----TRY AGAIN"); 
  				break;				
  			}
  			System.out.println("================================================================================");
  		}//while
  		
  	}//main

  	private static Product productEntry() {
  		System.out.print("enter product id: ");
  		int pid=sc.nextInt();
  		sc.nextLine();
  		
  		System.out.print("enter product name: ");
  		String pname = sc.nextLine();
  		
  		System.out.print("enter product price: ");
  		float pprice = sc.nextFloat();
  		
  		Product prod = new Product();
  		prod.setProductID(pid);
  		prod.setProductName(pname);
  		prod.setProductPrice(pprice);
  		
  		
  		return prod;
  	}
  }
