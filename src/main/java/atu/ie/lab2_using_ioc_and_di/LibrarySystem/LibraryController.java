package atu.ie.lab2_using_ioc_and_di.LibrarySystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class LibraryController {
    @RestController
    @RequestMapping("/library")
    public class LibraryController {

        private LibraryService libraryService;

        @Autowired
        public void setLibraryService(LibraryService libraryService) {
            this.libraryService = libraryService;
        }

        @PostMapping("/addBook")
        public ResponseEntity<String> addBook(@RequestBody Book book) {
            libraryService.addBook(book);
            return ResponseEntity.ok("Book added to the library");
        }
    }
}
