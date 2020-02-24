package com.example.retrofitsimplegetrequest.Model;

public class Model {
    private int userId;
    private int id;
    private String title;
    private String body;

    // All name will be same.
    // If you want to use other name then use @SerializedName before.
    // Ex:@SerializedName("userId") private int userId or other;


    //Constructor

    public Model(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    //Getter Method

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
