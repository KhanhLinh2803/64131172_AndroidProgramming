package linhntk.ntu.funwords;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class StrokeTextView extends AppCompatTextView {

    private Paint strokePaint;

    public StrokeTextView(Context context) {
        super(context);
        init();
    }

    public StrokeTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public StrokeTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        strokePaint = new Paint();
        setLayerType(LAYER_TYPE_SOFTWARE, null); // cần thiết để vẽ stroke
    }

    @Override
    protected void onDraw(Canvas canvas) {
        String textStr = getText().toString();

        // Vẽ viền
        strokePaint.set(getPaint());
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setStrokeWidth(10f); // Độ dày viền
        strokePaint.setColor(Color.WHITE); // Màu viền
        strokePaint.setAntiAlias(true);

        float x = (getWidth() - strokePaint.measureText(textStr)) / 2f;
        float y = getBaseline();
        canvas.drawText(textStr, x, y, strokePaint);

        // Vẽ chữ chính
        super.onDraw(canvas);
    }
}
