package DIP.good;

public class Movie implements ICategory {
    
    public String name;
    public ICategory category;

    public Movie(String name, ICategory category) {
        this.name = name;
        this.category = category;
    }
}
