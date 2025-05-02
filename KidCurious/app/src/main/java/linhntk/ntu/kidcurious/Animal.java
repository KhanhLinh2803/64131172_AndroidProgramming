package linhntk.ntu.kidcurious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animal extends AppCompatActivity {
    Button ahome, alv1, alv2, alv3,alv4,alv5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_animal);

        ahome = findViewById(R.id.ahome);
        alv1 = findViewById(R.id.alv1);
        alv2 = findViewById(R.id.alv2);
        alv3 = findViewById(R.id.alv3);
        alv4 = findViewById(R.id.alv4);
        alv5 = findViewById(R.id.alv5);

        ahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent animalhome = new Intent(Animal.this, Home.class);
                startActivity(animalhome);
            }
        });
        alv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fox = new Intent(Animal.this, FOX_Animal.class);
                startActivity(fox);
            }
        });
    }
}