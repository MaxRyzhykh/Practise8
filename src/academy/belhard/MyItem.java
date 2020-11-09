package academy.belhard;

public class MyItem<T> {
    private T item;

    public MyItem(T item) {
        this.item = item;
    }

    public MyItem(){
        this.item = (T) new Boolean(null);
    }

    boolean isPresent(){
        if(this.item != null){
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        if(item == null){
            return null;
        } else return item.toString();
    }

    public void getClassName(){
        System.out.println(item.getClass());
    }
}
