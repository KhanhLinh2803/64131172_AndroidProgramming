package linhntk.ntu.kidcurious;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Home extends AppCompatActivity {
    Button btnA, btnN, btnF;
    TextView txtHello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        btnA = findViewById(R.id.btnA);
        btnF = findViewById(R.id.btnF);
        btnN = findViewById(R.id.btnN);
        txtHello = findViewById(R.id.txtHello);

        txtHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent txtHL = new Intent(Home.this, MainActivity.class);
                startActivity(txtHL);
            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "START!", Toast.LENGTH_SHORT).show();
                Intent btna = new Intent(Home.this, Animal.class);
                startActivity(btna);
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "START!", Toast.LENGTH_SHORT).show();
                Intent btnf = new Intent(Home.this, Flag.class);
                startActivity(btnf);
            }
        });
        btnN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "START!", Toast.LENGTH_SHORT).show();
                Intent btnn = new Intent(Home.this, Number.class);
                startActivity(btnn);
            }
        });
    }
}