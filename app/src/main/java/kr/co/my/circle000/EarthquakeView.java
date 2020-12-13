package kr.co.my.circle000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

//View 상속
public class EarthquakeView extends View {
    //new로 생성할 때
    public EarthquakeView(Context context){
        super(context);
    }
    //findViewById로 생성할 때
    public EarthquakeView(Context context, AttributeSet attrs){
        super(context,attrs);
    }
    public EarthquakeView(Context context, AttributeSet attrs, int defStyleAttr){
        super(context, attrs, defStyleAttr);
    }
    public EarthquakeView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes){
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    //지진세기 저장
    private double magnitude=0.0;
    //외부에서 지진세기를 입력받는다.
    public void setMagnitude(double magnitude){
        this.magnitude=magnitude;
        invalidate(); // View에 반영, OnDraw 자동호출

    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        float width = getWidth();
        float height = getHeight();

        setBackgroundColor(Color.BLACK);
        Paint circleOut = new Paint(Paint.ANTI_ALIAS_FLAG); //매끄럽게 그리기
        circleOut.setColor(Color.RED);
        canvas.drawCircle(width/2,height/2,(float) (magnitude * 50), circleOut);
    }
}
