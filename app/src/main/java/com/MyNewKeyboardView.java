package com;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

import androidx.core.content.res.ResourcesCompat;

import com.example.customkeyboard.R;

import java.util.List;

public class MyNewKeyboardView extends KeyboardView{

    public MyNewKeyboardView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        Typeface font = ResourcesCompat.getFont(getContext(), R.font.chewy);
        paint.setTypeface(font);

        List<Keyboard.Key> keys = getKeyboard().getKeys();
        for(Keyboard.Key key: keys) {
            if(key.label != null)
                canvas.drawText(key.label.toString(), key.x, key.y, paint);
        }
    }
}
