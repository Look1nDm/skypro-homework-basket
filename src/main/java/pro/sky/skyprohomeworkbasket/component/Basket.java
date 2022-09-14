package pro.sky.skyprohomeworkbasket.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprohomeworkbasket.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Item> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public void addItems(List<Item> list) {
        this.items.addAll(list);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }
}
