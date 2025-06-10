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

public class TWO2_Number extends AppCompatActivity {

    Button btnYay3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_two2_number);
        btnYay3 = findViewById(R.id.btnYay3);

        btnYay3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnyay3 = new Intent(TWO2_Number.this, Number.class);
                startActivity(btnyay3);
            }
        });
    }
}