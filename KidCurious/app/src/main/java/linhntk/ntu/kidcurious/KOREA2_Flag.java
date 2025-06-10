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

public class KOREA2_Flag extends AppCompatActivity {

    Button btnYay2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_korea2_flag);

        btnYay2 = findViewById(R.id.btnYay2);

        btnYay2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnyay2 = new Intent(KOREA2_Flag.this, Flag.class);
                startActivity(btnyay2);
            }
        });
    }
}