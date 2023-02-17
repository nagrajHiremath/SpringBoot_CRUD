package com.example.demo.item;

public class Item {

            private String  itemId;
            private String itemSource;
            private String orgId;
            private String uom;

    public Item(String itemId, String itemSource, String orgId, String uom) {
        this.itemId = itemId;
        this.itemSource = itemSource;
        this.orgId = orgId;
        this.uom = uom;
    }

    public Item() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemSource() {
        return itemSource;
    }

    public void setItemSource(String itemSource) {
        this.itemSource = itemSource;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }
}
