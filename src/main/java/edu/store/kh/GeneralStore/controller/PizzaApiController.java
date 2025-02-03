package edu.store.kh.GeneralStore.controller;

import edu.store.kh.GeneralStore.dto.Pizza;
import edu.store.kh.GeneralStore.service.PizzaService;
import edu.store.kh.GeneralStore.service.PizzaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RequestMapping("/api")
@RestController
public class PizzaApiController {

    //ServiceImpl -> Autowired 호출
    @Autowired
    private PizzaServiceImpl pizzaService;

    @GetMapping("/pizzas")
    public List<Pizza> getAllPizzas() {
        return pizzaService.selectAll();
    }

    @PostMapping("/pizzas")
    public void createPizza() {
        return ;
    }
    
    @GetMapping("/pizzas/{id}")
    public Pizza getPizzaById(@PathVariable int id) {
        return pizzaService.selectById(id);
    }
    
    // @RequestBody -> @RequestParam 변경 @MultipartFile 추가
    @PutMapping("/pizzas/{id}")
    public void updatePizza(@PathVariable int id,
                            @RequestPart("name") String name,
                            @RequestPart("price") int price,
                            @RequestPart("description") String description,
                            @RequestPart("imagePath") MultipartFile file) {
        Pizza pizza = new Pizza();
        pizza.setId(id);
        pizza.setName(name);
        pizza.setPrice(price);
        pizza.setDescription(description);
        String filePath = file.
        pizza.setImagePath(file.get);
        pizzaService.updatePizza(pizza);
    }

    @DeleteMapping("/pizzas/{id}")
    public void deletePizza(@PathVariable int id) {
        pizzaService.deletePizza(id);
    }
}

