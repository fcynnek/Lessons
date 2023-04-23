package com.coderscampus.Unit18.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.coderscampus.Unit18.domain.User;

// to leverage the JPA code to manipulate the repository, we change the class to interface and extends JpaRepository
// this extends requires a T, and ID -> Type is going to reference the domain. ID is the data type for the primary key
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	// no need to declare public because it is built in an interface 

	List<User> findByUsername(String username);
	// equivalent code in SQL = select * from users where username = :username
	
	List<User> findByName(String name);
	// select * from users where name = :name
	
	List<User> findByUsernameAndName(String name, String username);
	// select * from users where name = :name and username = :username
	
	/*
	 *  assuming there is an object in the User domain:
	 *  private LocalDate createdDate;
	 */
	List<User> findByCreatedDateBetween(LocalDate date1, LocalDate date2);
	
	// creating a custom query:
	// the below query uses SQL language. However, we need JQPA
//	@Query("select * from User where username = :username limit 1")
	@Query("select u from User u where username = :username")
	User findExactlyOneUserByUsername(String username);
	
	// addressing performance problems with editing the findAll embedded functionality because of the join tables
	// the fetch would populate the date in the individual objects in one single fetch
	@Query("select u from User u" 
			+ " left join fetch u.accounts"
			+ " left join fetch u.address")
	Set<User> findAllUsersWithAccountsAndAddresses();
}
