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

public class Main {
    public static void main(String[] args) {
        Store store = new Store(1);
        System.out.println(store.getItem());
    }
}
