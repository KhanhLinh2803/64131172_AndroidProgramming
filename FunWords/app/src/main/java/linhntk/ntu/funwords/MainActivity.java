package linhntk.ntu.funwords;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
    TextView KD;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        KD = findViewById(R.id.KD);

        KD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kd = new Intent(MainActivity.this, test.class);
                startActivity(kd);
            }
        });
    }
}