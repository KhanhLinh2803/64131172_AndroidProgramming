package linhntk.ntu.lt_gk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau2_2 extends AppCompatActivity {
    TextView txtGK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau22);
        txtGK = findViewById(R.id.txtGK);
        String kkk = getIntent().getStringExtra("abc");
        txtGK.setText(kkk);
    }
}