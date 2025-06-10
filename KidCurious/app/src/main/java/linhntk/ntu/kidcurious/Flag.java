package linhntk.ntu.kidcurious;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Flag extends AppCompatActivity {

    Button flv1, flv2, flv3, flv4, flv5;
    ImageView imgext2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_flag);

        flv1 = findViewById(R.id.flv1);
        flv2 = findViewById(R.id.flv2);
        flv3 = findViewById(R.id.flv3);
        flv4 = findViewById(R.id.flv4);
        flv5 = findViewById(R.id.flv5);
        imgext2 = findViewById(R.id.imgext2);


        flv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent korea = new Intent(Flag.this, KOREA_Flag.class);
                startActivity(korea);
            }
        });
        imgext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imgexit2 = new Intent(Flag.this, Home.class);
                startActivity(imgexit2);
            }
        });
    }
}