package org.generics.adso.java.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Store {
    private Object item;
}

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
class Customer {
    String name;
}

public class Main {
    public static void main(String[] args) {
        Store store = new Store(1);
        Integer item1 = (Integer) store.getItem();
        Store store2 = new Store(new Customer("Juan"));
    }

    
}
