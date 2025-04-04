package linhntk.ntu.lt_gk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btncau4, btncau1, btncau2, btncau3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btncau4 = findViewById(R.id.btncau4);
        btncau3 = findViewById(R.id.btncau3);
        btncau2 = findViewById(R.id.btncau2);
        btncau1 = findViewById(R.id.btncau1);

        btncau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cau1_1.class);
                startActivity(intent);
            }
        });
        btncau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Cau2.class);
                startActivity(intent2);
            }
        });
        btncau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, Cau3.class);
                startActivity(intent3);
            }
        });
        btncau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, Cau4.class);
                startActivity(intent4);
                Toast.makeText(MainActivity.this, "Xin chào!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}