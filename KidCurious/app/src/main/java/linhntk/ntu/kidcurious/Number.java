package linhntk.ntu.kidcurious;

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

public class Number extends AppCompatActivity {

    Button nlv1, nlv2, nlv3, nlv4, nlv5;
    ImageView imgext3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_number);

        nlv1 = findViewById(R.id.nlv1);
        nlv2 = findViewById(R.id.nlv2);
        nlv3 = findViewById(R.id.nlv3);
        nlv4 = findViewById(R.id.nlv4);
        nlv5 = findViewById(R.id.nlv5);
        imgext3 = findViewById(R.id.imgext3);

        nlv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two = new Intent(Number.this, TWO_Number.class);
                startActivity(two);
            }
        });
        imgext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent imgexit3 = new Intent(Number.this, Home.class);
                startActivity(imgexit3);
            }
        });
    }
}