import java.util.LinkedList;

class HashCode {
    private int size = 10;
    private LinkedList<Integer>[] table;

    @SuppressWarnings("unchecked")
    HashCode() {
        table = (LinkedList<Integer>[]) new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    public int hash(int data) {
        return data % 10;
    }

    public void insert(int data) {
        int index = hash(data);
        table[index].add(data);
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println("Index " + i + ": " + table[i]);
        }
    }

    public String search(int key){
        int index = hash(key);
        return "Data " + key + " found: " + table[index].contains(key);
    }

    public void delete(int data){
        int index = hash(data);
        if(table[index].contains(data)){
            table[index].remove((Integer)data);
            System.out.println(data + " deleted from index " + index);
        } else {
            System.out.println(data + " not found in the hash table");
        }
    }
}

public class HashTable {
    public static void main(String[] args) {
        HashCode ht = new HashCode();
        ht.insert(15);
        ht.insert(25);
        ht.insert(35);
        ht.insert(5);
        ht.insert(20);
        ht.insert(30);
        ht.insert(35);
        ht.insert(65);

        ht.display();

        System.out.println(ht.search(35)); // search example

        ht.delete(35); // delete example
        ht.display();
    }
}
