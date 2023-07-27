package dev.abibou.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dev.abibou.boot.entity.Contact;
import dev.abibou.boot.repository.ContactRepository;

@SpringBootApplication
public class SbootCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbootCrudApplication.class, args);
		
		ContactRepository contactRepo = context.getBean("contactRepository", ContactRepository.class);

		
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact(2, "Jonh", "777-777-7777"));
		contacts.add(new Contact(3, "Jonh", "777-777-7777"));
		contacts.add(new Contact(4, "Jonh", "777-777-7777"));
		contacts.add(new Contact(4, "Jonh", "777-777-7777"));
		contactRepo.saveAll(contacts);
		
		
		Iterable<Contact> allContactList = contactRepo.findAll();
		
		allContactList.forEach(contact -> System.out.println(contact));
		
		context.close();
	}

}
