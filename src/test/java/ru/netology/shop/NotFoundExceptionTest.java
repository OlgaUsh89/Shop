package ru.netology.shop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotFoundExceptionTest {
    @Test
    public void removeTest() {
        ShopRepository repo = new ShopRepository();

        Product item1 = new Product(1, "хлеб", 74);
        Product item2 = new Product(2, "масло", 13);
        Product item3 = new Product(3, "гречка", 25);
        Product item4 = new Product(4, "вода", 9);
        Product item5 = new Product(5, "салат", 36);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);

        repo.remove(5);

        Product[] expected = {item1, item2, item3, item4};
        Product[] actual = repo.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeByIdExceptionTest() {
        ShopRepository repo = new ShopRepository();

        Product item1 = new Product(1, "хлеб", 74);
        Product item2 = new Product(2, "масло", 13);
        Product item3 = new Product(3, "гречка", 25);
        Product item4 = new Product(4, "вода", 9);
        Product item5 = new Product(5, "салат", 36);

        repo.add(item1);
        repo.add(item2);
        repo.add(item3);
        repo.add(item4);
        repo.add(item5);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(21);
        });
    }
}

