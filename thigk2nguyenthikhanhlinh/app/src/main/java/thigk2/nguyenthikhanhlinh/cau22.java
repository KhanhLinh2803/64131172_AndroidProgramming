package thigk2.nguyenthikhanhlinh;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class cau22 extends AppCompatActivity {
    TextView txtCM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau22);

        txtCM = findViewById(R.id.txtCM);
        String kkk = getIntent().getStringExtra("abc");
        txtCM.setText(kkk);
    }
}