package linhntk.ntu.lt_gk;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cau1_1 extends AppCompatActivity {
    EditText edtA2, edtA3, edtA4, edtKQ;
    Button btnKQ;

    public EditText getEdtA2() {
        return edtA2;
    }

    public void setEdtA2(EditText edtA2) {
        this.edtA2 = edtA2;
    }

    public EditText getEdtA3() {
        return edtA3;
    }

    public void setEdtA3(EditText edtA3) {
        this.edtA3 = edtA3;
    }

    public EditText getEdtA4() {
        return edtA4;
    }

    public void setEdtA4(EditText edtA4) {
        this.edtA4 = edtA4;
    }

    public EditText getEdtKQ() {
        return edtKQ;
    }

    public void setEdtKQ(EditText edtKQ) {
        this.edtKQ = edtKQ;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau11);
        edtA2 = findViewById(R.id.edtA2);
        edtA3 = findViewById(R.id.edtA3);
        edtA4 = findViewById(R.id.edtA4);
        edtKQ = findViewById(R.id.edtKQ);
        btnKQ = findViewById(R.id.btnKQ);


        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a = Integer.parseInt(getEdtA2().getText().toString());
                double b = Integer.parseInt(getEdtA3().getText().toString());
                double c = Integer.parseInt(getEdtA4().getText().toString());
                double d = 0.2*a + 0.3*b + 0.5*c;
                edtKQ.setText(String.valueOf(d));
            }
        });


    }
}