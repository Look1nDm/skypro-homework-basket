package pro.sky.skyprohomeworkbasket.basketController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprohomeworkbasket.basketService.BasketService;
import pro.sky.skyprohomeworkbasket.model.Item;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
public class BasketController {
    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping(path = "/add")
    public void add(@RequestParam("id") List<Integer> id) {
        basketService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Item> list() {
        return basketService.get();
    }
}
