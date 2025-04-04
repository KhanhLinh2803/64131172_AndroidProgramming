package thigk2.nguyenthikhanhlinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btncau, btncau1, btncau2, btncau3, btncau4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btncau = findViewById(R.id.btncau);
        btncau1 = findViewById(R.id.btncau1);
        btncau2 = findViewById(R.id.btncau2);
        btncau3 = findViewById(R.id.btncau3);
        btncau4 = findViewById(R.id.btncau4);

        btncau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau5 = new Intent(MainActivity.this, thigk2.nguyenthikhanhlinh.cau5.class);
                startActivity(cau5);
            }
        });
        btncau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau1 = new Intent(MainActivity.this, thigk2.nguyenthikhanhlinh.cau1.class);
                startActivity(cau1);
            }
        });
        btncau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau2 = new Intent(MainActivity.this, thigk2.nguyenthikhanhlinh.cau2.class);
                startActivity(cau2);
            }
        });
        btncau3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau3 = new Intent(MainActivity.this, thigk2.nguyenthikhanhlinh.cau3.class);
                startActivity(cau3);
            }
        });
        btncau4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau4 = new Intent(MainActivity.this, thigk2.nguyenthikhanhlinh.cau4.class);
                startActivity(cau4);
            }
        });
    }
}