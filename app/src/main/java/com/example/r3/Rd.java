package com.example.r3;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Rd extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rdetail);

        Recipe recipe = getIntent().getParcelableExtra("recipe");
        if (recipe != null) {
            ImageView imageView = findViewById(R.id.imageView);
            TextView nameTextView = findViewById(R.id.nameTextView);
            TextView processTextView = findViewById(R.id.processTextView);

            imageView.setImageResource(recipe.getImageResource());
            nameTextView.setText(recipe.getName());
            processTextView.setText(recipe.getProcess());
        }
    }
}

