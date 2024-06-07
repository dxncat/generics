package org.generics.adso.java.hashtable;

import java.util.List;

//crear la clase hashtable
class HashItem<K, V> {
    K key;
    V value;
    public HashItem(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "HashItem{" + "key=" + key + ", value=" + value + '}';
    }
    
}

class Customer {
    String name;

    public Customer(String name) {
        this.name = name;
    }
    
}

class Medico {
    String nombre;

    public Medico(String nombre) {
        this.nombre = nombre;
    }
    
}

public class Main {
    public static void main(String[] args) {
        HashItem<String, Integer> item = new HashItem<String, Integer>("A", 10);
        HashItem<Long, Customer> item2 = new HashItem<Long, Customer>(3L, new Customer("Juan"));
        HashItem<Double, Medico> item3 = new HashItem<Double, Medico>(3.0, new Medico("Juan"));
        List hashTable = List.of(
            item,
            item2,
            item3
        );

        for (Object o : hashTable) {
            System.out.println(o);
        }

        
        
    }
}
