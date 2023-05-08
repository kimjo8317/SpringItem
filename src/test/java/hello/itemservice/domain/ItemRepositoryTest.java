package hello.itemservice.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class ItemRepositoryTest {
    ItemRepositoryTest itemRepository = new ItemRepository();
    //동작이 끝날때마다 실행되는 어노테이션
    @AfterEach
    void afterEach(){
        itemRepository.clearStore();
    }
    @Test
    void save(){
        //given
        Item item = new Item("itemA", 10000,10)

        //when
        Item savedItem = itemRepository.save(item);

        //then
        itemRepository.findById(item.getId());

    }
    @Test
    void findAll(){
        //given

        //when

        //then
    }
    @Test
    void updateItem(){
        //given

        //when

        //then
    }
}
