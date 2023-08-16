package dev.abibou.boot.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dev.abibou.boot.entity.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Serializable> {

}
