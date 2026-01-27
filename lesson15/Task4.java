package lesson15;

class Storage<T> {
    private T storage;

    public Storage() {
        this.storage = null;
    }
    public Storage(T storage) {
        this.storage = storage;
    }

    public T getStorage() {
        return storage;
    }

    public void setStorage(T storage) {
        this.storage = storage;
    }
}

public class Task4{
    public static void main(String[] args){
        Storage<String> box = new Storage<>();

        box.setStorage("JAVA");
        System.out.println("Первый объек: " + box.getStorage());

        box.setStorage("TWS");
        System.out.println("Второе объек: " + box.getStorage());

    }

}
