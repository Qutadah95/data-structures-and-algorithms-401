public class AnimalShelter {
private Queue<cats>cat;
private Queue<dogs>dog;

    public AnimalShelter(Queue<cats> cat, Queue<dogs> dog) {
        this.cat = cat;
        this.dog = dog;
    }

    public Queue<cats> getCat() {
        return cat;
    }

    public void setCat(Queue<cats> cat) {
        this.cat = cat;
    }

    public Queue<dogs> getDog() {
        return dog;
    }

    public void setDog(Queue<dogs> dog) {
        this.dog = dog;
    }
}
