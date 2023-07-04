package com.example.r3;
import android.os.Parcel;
import android.os.Parcelable;

public class Recipe implements Parcelable {
    private String name;
    private int imageResource;
    private String process;

    public Recipe(String name, int imageResource, String process) {
        this.name = name;
        this.imageResource = imageResource;
        this.process = process;
    }

    protected Recipe(Parcel in) {
        name = in.readString();
        imageResource = in.readInt();
        process = in.readString();
    }

    public static final Creator<Recipe> CREATOR = new Creator<Recipe>() {
        @Override
        public Recipe createFromParcel(Parcel in) {
            return new Recipe(in);
        }

        @Override
        public Recipe[] newArray(int size) {
            return new Recipe[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getProcess() {
        return process;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(imageResource);
        dest.writeString(process);
    }
}

