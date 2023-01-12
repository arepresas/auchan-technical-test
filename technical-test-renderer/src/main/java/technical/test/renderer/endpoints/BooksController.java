package technical.test.renderer.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import technical.test.api.model.Book;
import technical.test.renderer.services.BooksService;

@Controller
@AllArgsConstructor
@RequestMapping(value = "/books")
public class BooksController {

  private final BooksService bookService;

  @GetMapping()
  public String showBooks(final Model model) {
    model.addAttribute("books", bookService.findAll());

    return "books";
  }

  @GetMapping("/save")
  public String addBook(Model model) {
    Book book = new Book();
    model.addAttribute("book", book);
    return "add-book";
  }

  @GetMapping("/delete/{id}")
  public String delete(@PathVariable final Integer id) {
    bookService.delete(id);

    return "redirect:/books";
  }

  @PostMapping()
  public String save(@ModelAttribute("book") Book book) {
    bookService.save(book);

    return "redirect:/books";
  }
}
