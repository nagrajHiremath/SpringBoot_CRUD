package com.example.demo.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/items")
public class ItemController {

        int c = 0;
        public ItemService ItemService;
        @Autowired
        ItemController(ItemService ItemService){
            this.ItemService = ItemService;
        }
        @PostMapping
        public Item addItem(@RequestBody Item Item){
            return ItemService.save(Item);
        }
//        @PutMapping("/{itemId}")
//        public String updateItem(){
//            return ItemService.updateItem();
//        }
        @GetMapping("/{itemId}")
        public Item getItemDetails(@PathVariable String itemId){
            return   ItemService.getItemDetails(itemId);
        }
        @GetMapping
        public ArrayList<Item> getItemList(){
            if(c == 0)
            ItemService.add();
            ++c;
            return ItemService.itemList;
        }
        @DeleteMapping("/{itemId}")
        public String deleteItem(@PathVariable String itemId){
            return ItemService.deleteItem(itemId);
        }

}
