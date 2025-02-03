package edu.store.kh.GeneralStore.controller;

import edu.store.kh.GeneralStore.dto.Pizza;
import edu.store.kh.GeneralStore.service.PizzaService;
import edu.store.kh.GeneralStore.service.PizzaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/pizzas/{id}")
    public void updatePizza() {}

    @DeleteMapping("/pizzas/{id}")
    public void deletePizza(@PathVariable int id) {
        pizzaService.deletePizza(id);
    }
}

