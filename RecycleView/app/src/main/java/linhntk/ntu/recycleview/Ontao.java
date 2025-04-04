package linhntk.ntu.recycleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ontao extends AppCompatActivity {
    Button btncau1, btncau2, btncau3, btncau4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ontao);
        btncau1 = findViewById(R.id.btncau1);
        btncau2 = findViewById(R.id.btncau2);
        btncau3 = findViewById(R.id.btncau3);
        btncau4 = findViewById(R.id.btncau4);

        btncau1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau1 = new Intent(Ontao.this, OntapCau1.class);
                startActivity(cau1);
            }
        });
        btncau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cau1 = new Intent(Ontao.this, OntapCau2.class);
                startActivity(cau1);
            }
        });
    }
}