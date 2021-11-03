public class AnimalShelter {
private Queue<cats>cat;
private Queue<dogs>dog;

    public AnimalShelter(Queue<cats> cat, Queue<dogs> dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public AnimalShelter() {
        dog = new Queue<dogs>();
        cat = new Queue<cats>();
    }
    public void enqueue(dogs dogs) {
        dog.enqueue(dogs);
    }
    public void enqueue(cats cats) {
        cat.enqueue(cats);
    }
    public Animal dequeue(String animal) {
        if (animal.toLowerCase().equals("dog")) {
            return dog.dequeue();
        } else if (animal.toLowerCase().equals("cat")) {
            return cat.dequeue();
        } else {
            return null;
        }
    }
}
