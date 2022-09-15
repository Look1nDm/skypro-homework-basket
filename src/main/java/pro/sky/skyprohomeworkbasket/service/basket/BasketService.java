package pro.sky.skyprohomeworkbasket.service.basket;

import org.springframework.stereotype.Service;
import pro.sky.skyprohomeworkbasket.component.Basket;
import pro.sky.skyprohomeworkbasket.model.Item;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BasketService {

    private final Basket basket;

    private final Map<Integer, Item> items;

    public BasketService(Basket basket) {
        this.basket = basket;
        this.items = Map.of(
                1, new Item(1, "Обои", 2500),
                2, new Item(2, "Клей", 800),
                3, new Item(3, "Валик", 350)
        );
    }

    public void add(List<Integer> id) {
        basket.addItems(id.stream().map(items::get).filter(Objects::nonNull).collect(Collectors.toList()));
    }

    public List<Item> get() {
        return basket.getItems();
    }
}
