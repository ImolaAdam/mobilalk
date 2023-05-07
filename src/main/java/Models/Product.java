package Models;

import android.widget.Button;

import com.google.firebase.database.DatabaseReference;

public class Product {
    private String id;
    private String name;
    private String description;
    private String price;
    private float ratedInfo;
    private final int imageRsc;
    private int cartedCount;


    public Product(String name, String description, String price, float ratedInfo, int imageRsc) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.ratedInfo = ratedInfo;
        this.imageRsc = imageRsc;
    }
        public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public float getRatedInfo() {
        return ratedInfo;
    }

    public String getInfo() {
        return description;
    }
    public int getImageResource() {
        return imageRsc;
    }
    public int getCartedCount() {
        return cartedCount;
    }

    public String _getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
