package com.allandroidprojects.ecomsample.notification;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

import com.allandroidprojects.ecomsample.R;

/**
 * Created by priyankam on 4/13/2016.
 */
public class BadgeDrawable extends Drawable {

    private float mTextSize;
    private Paint mBadgePaint;
    private Paint mTextPaint;
    private Rect mTxtRect = new Rect();

    private String mCount = "";
    private boolean mWillDraw = false;

    public BadgeDrawable(Context context) {
        // mTextSize = 10dp;
        mTextSize = context.getResources().getDimension(R.dimen.text_size_small);

        mBadgePaint = new Paint();
        mBadgePaint.setColor(ContextCompat.getColor(context,R.color.colorAccent));
        mBadgePaint.setAntiAlias(true);
        mBadgePaint.setStyle(Paint.Style.FILL);

        mTextPaint = new Paint();
        mTextPaint.setColor(Color.WHITE);
        mTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        mTextPaint.setTextSize(mTextSize);
        mTextPaint.setAntiAlias(true);
        mTextPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override
    public void draw(Canvas canvas) {
        if (!mWillDraw) {
            return;
        }

        Rect bounds = getBounds();
        float width = bounds.right - bounds.left;
        float height = bounds.bottom - bounds.top;

        // Position the badge in the top-right quadrant of the icon.
        float radius = ((Math.min(width, height) / 2) - 1) / (float) 1.6;
        float centerX = width - radius - 1;
        float centerY = radius + 1;

        // Draw badge circle.
        canvas.drawCircle(centerX, centerY, radius, mBadgePaint);

        // Draw badge count text inside the circle.
        mTextPaint.getTextBounds(mCount, 0, mCount.length(), mTxtRect);
        float textHeight = mTxtRect.bottom - mTxtRect.top;
        float textY = centerY + (textHeight / 2f);
        canvas.drawText(mCount, centerX, textY, mTextPaint);
    }

    /*
    Sets the count (i.e notifications) to display.
     */
    public void setCount(int count) {
        mCount = Integer.toString(count);

        // Only draw a badge if there are notifications.
        mWillDraw = count > 0;
        invalidateSelf();
    }

    @Override
    public void setAlpha(int alpha) {
        // do nothing
    }

    @Override
    public int getOpacity() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void setColorFilter(ColorFilter cf) {
        // TODO Auto-generated method stub

    }
}


