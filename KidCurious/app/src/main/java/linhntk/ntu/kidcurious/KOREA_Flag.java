package linhntk.ntu.kidcurious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class KOREA_Flag extends AppCompatActivity {

    Button btnX2, btnf2, btnf3, btnf4, btnf5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_korea_flag);

        btnX2 = findViewById(R.id.btnX2);
        btnf2 = findViewById(R.id.btnf2);
        btnf3 = findViewById(R.id.btnf3);
        btnf4 = findViewById(R.id.btnf4);
        btnf5 = findViewById(R.id.btnf5);

        btnX2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnd2 = new Intent(KOREA_Flag.this, Flag.class);
                startActivity(btnd2);
            }
        });

        btnf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KOREA_Flag.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });
        btnf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KOREA_Flag.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });
        btnf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KOREA_Flag.this, "GOOD JOB!", Toast.LENGTH_SHORT).show();

                Intent korea2 = new Intent(KOREA_Flag.this, KOREA2_Flag.class);
                startActivity(korea2);
            }
        });
        btnf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(KOREA_Flag.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}