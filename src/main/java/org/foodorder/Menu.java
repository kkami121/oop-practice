package org.foodorder;

import java.util.List;

public class Menu {
    private final List<MenuItem> menuTtems;

    public Menu(List<MenuItem> menuItems) {
        this.menuTtems = menuItems;
    }

    public MenuItem choose(String name) {
        return  this.menuTtems.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴입니다."));
    }
}
