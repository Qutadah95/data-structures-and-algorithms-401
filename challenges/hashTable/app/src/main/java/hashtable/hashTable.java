package hashtable;

public class hashTable<T> {
    Node <T> [] array;
    int size;

    public hashTable( int hashTableSize) {
        this.size = hashTableSize;
        this.array=new Node[ this.size];
        for (int i = 0; i < this.size ; i++) {
            array[i]=new Node<>();
        }
    }

    public int hashTableStringKey(String key){
        int x=0;
        for(char latter : key.toCharArray()){
            x += (int) latter;
        }
        return x % this.size;
    }

    public int hashTableIntegerKey(int key){
        return key % this.size;
    }

    public void add(T key ,T value) {
        int location = 0;
        if (key instanceof String) {
            location = hashTableStringKey((String) key);

        }else{
            location = hashTableIntegerKey((Integer) key);
        }
        Node<T> toAdd = new Node<>( key, value);
        if (array[location]==null){
            array[location]=toAdd;
        }else if(array[location].next==null){
            array[location].next=toAdd;

        }else{
            toAdd.next=array[location].next;
            array[location].next=toAdd;
        }
    }

    public  boolean contains (T key){
        int index = 0;
        boolean result =  false;
        if (key instanceof String) {
            index = hashTableStringKey((String) key);

        }else{
            index = hashTableIntegerKey((Integer) key);
        }

        if (array[index]!= null){
            Node current = array[index];
            while (current!= null){
                if (current.key==key){
                    result=true;
                    break;
                }else{
                    current=current.next;
                }
            }
        }
        return  result;
    }

    public  String get(T key){
        int index = 0;
        if (key instanceof String) {
            index = hashTableStringKey((String) key);

        }else{
            index = hashTableIntegerKey((Integer) key);
        }
        String result = "invalid key";
        if(array[index]!= null){
            Node current=array[index];
            while (current!= null){
                if (current.key==key){
                    result= (String) current.value;
                    break;
                }else {
                    current=current.next;
                }
            }
        }
        return  result;
    }

}
