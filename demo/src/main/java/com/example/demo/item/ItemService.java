package com.example.demo.item;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Service
public class ItemService {

    ArrayList<Item> itemList = new ArrayList<>();
    public void add(){
        for(int i=0; i<10; i++){
            Item item = new Item();
            item.setItemId("test"+i);
            item.setItemSource("BAY");
            item.setOrgId("fdsf");
            item.setUom("each");
            itemList.add(item);
        }
    }


//    public String addItem(){
//        return "Item added";
//    }

    public Item getItemDetails(String itemId){

        for(int i=0; i<itemList.size(); i++){
            Item it = itemList.get(i);
            if(it.getItemId().equals(itemId)){
                return it;
            }
        }
        return null;
    }

    public ArrayList<Item> getItemList(){
        return itemList;
    }
//    public String updateItem(){
//        return "Item updated";
//    }
    public String deleteItem(String itemId){
        for(int i=0; i<itemList.size(); i++){
            Item it = itemList.get(i);
            if(it.getItemId().equals(itemId)){
                itemList.remove(i);
                return itemId + " removed succesfully";
            }
        }
        return itemId + " not exist";
    }

    public Item save(Item Item){
        String itemId = Item.getItemId();
        String itemSource = Item.getItemSource();
        String orgId = Item.getOrgId();
        String uom = Item.getUom();
        itemList.add(Item);
        return Item;
    }
}
