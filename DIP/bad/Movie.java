package DIP.bad;

public class Movie {
    
    public String name;
    public DramaCategory category;

    public DramaCategory getCategory() {
        return this.category == null ? new DramaCategory() : this.category;
    }

    public void setCategory(DramaCategory category) {
        this.category = category;
    }
}
