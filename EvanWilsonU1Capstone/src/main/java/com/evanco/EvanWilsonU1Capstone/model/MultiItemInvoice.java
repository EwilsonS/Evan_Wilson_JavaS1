package com.evanco.EvanWilsonU1Capstone.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MultiItemInvoice extends Invoice{

    private List<String> item_types;

    // id: qty
    private Map<Integer, Integer> item_ids;

    // list of map type: [id: price]
    private List<Map<String,Map<Integer,BigDecimal>>> unit_Prices;

    private int totalQty;

    public List<String> getItem_types() {
        return item_types;
    }

    public void setItem_types(List<String> item_types) {
        this.item_types = item_types;
    }

    public Map<Integer, Integer> getItem_ids() {
        return item_ids;
    }

    public void setItem_ids(Map<Integer, Integer> item_ids) {
        this.item_ids = item_ids;
    }

    public List<Map<String, Map<Integer, BigDecimal>>> getUnit_Prices() {
        return unit_Prices;
    }

    public void setUnit_Prices(List<Map<String, Map<Integer, BigDecimal>>> unit_Prices) {
        this.unit_Prices = unit_Prices;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MultiItemInvoice that = (MultiItemInvoice) o;
        return getTotalQty() == that.getTotalQty() &&
                getItem_types().equals(that.getItem_types()) &&
                getItem_ids().equals(that.getItem_ids()) &&
                getUnit_Prices().equals(that.getUnit_Prices());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getItem_types(), getItem_ids(), getUnit_Prices(), getTotalQty());
    }
}
