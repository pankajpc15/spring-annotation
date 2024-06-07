package spring.annotation.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import spring.annotation.beans.Book;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


//@Controller
@RestController
@RequestMapping("/api")
public class BookController {
	
	@RequestMapping("/hello")
//	@ResponseBody
	@GetMapping
	public String helloWorld() {
		return "Hello world";
	}
	
	
	@GetMapping("/book") 
//	@ResponseBody
	public Book getBook() {
		Book book=new Book(1,"core java","rest api");
		return book;
	}
	
	
	
	@PostMapping(value = "/books/create")
//	@ResponseStat us(value = HttpStatus.CREATED )
	
      public ResponseEntity<Book> createBook(@RequestBody Book book) {
		System.out.println(book.getId());
		System.out.println(book.getTitle());
		System.out.println(book.getDescription());
		return new ResponseEntity<>(book, HttpStatus.CREATED);
		
	}
	@PutMapping("/books/update/{id}")
	 public ResponseEntity<Book> updateBook(@PathVariable int  id,@RequestBody Book updateBook){
		 System.out.println(id);
		 System.out.println(updateBook.getTitle());
		 System.out.println(updateBook.getDescription());
		 updateBook.setId(id);
		 return  ResponseEntity.ok(updateBook);
	 }
	
	@DeleteMapping("/books/delete/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable int id){
		System.out.println(id);
		return ResponseEntity.ok("book deleted successfully!.");
	}
	
	@GetMapping("books/{id}")
	public ResponseEntity<Book> pathVariableDemo(@PathVariable int id){
		System.out.println(id);
		Book book= new Book();
		book.setId(id);
		return ResponseEntity.ok(book);
	}
	
	//http:localhost:8080/api/books/query?id=1&title=core java
	@GetMapping("/books/query")
   public ResponseEntity<Book> requestParamDemo(@RequestParam(name = "id" ) int id,@RequestParam(name = "title") String title){
	   
	   System.out.println(id);
	   System.out.println(title);
	   
	   Book book=new Book();
	   book.setId(id);
	   book.setTitle(title);
	   return ResponseEntity.ok(book);
   }
	 
}
