package linhntk.ntu.kidcurious;

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

public class TWO_Number extends AppCompatActivity {

    Button btnX3, btnn1, btnn2, btnn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_two_number);

        btnX3 = findViewById(R.id.btnX3);
        btnn1 = findViewById(R.id.btnn1);
        btnn2 = findViewById(R.id.btnn2);
        btnn3 = findViewById(R.id.btnn3);

        btnX3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnd3 = new Intent(TWO_Number.this, Number.class);
                startActivity(btnd3);
            }
        });
        btnn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TWO_Number.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });
        btnn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TWO_Number.this, "GOOD JOB!", Toast.LENGTH_SHORT).show();

                Intent btnn22 = new Intent(TWO_Number.this, TWO2_Number.class);
                startActivity(btnn22);
            }
        });
        btnn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TWO_Number.this, "TRY AGAIN!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}