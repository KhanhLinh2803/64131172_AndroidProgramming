package linhntk.ntu.kidcurious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FOX1_Animal extends AppCompatActivity {
    TextView txtG1;
    Button btnH1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fox1_animal);

        txtG1 = findViewById(R.id.txtG1);
        btnH1 = findViewById(R.id.btnH1);

        btnH1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnh1 = new Intent(FOX1_Animal.this, FOX_Animal.class);
                startActivity(btnh1);
            }
        });
    }
}