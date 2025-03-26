package com.example.slip20q1;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    boolean isImage1 = true;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        Button changeImageButton = findViewById(R.id.changeImageButton);
        changeImageButton.setOnClickListener(v -> {
            if (isImage1) {
                imageView.setImageResource(R.drawable.image2);
            } else {
                imageView.setImageResource(R.drawable.image1);
            }
            isImage1 = !isImage1;
        });
    }
}
