// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

public class PointCloud
{

    private static final int INNER_POINTS = 8;
    private static final float MAX_POINT_SIZE = 4F;
    private static final float MIN_POINT_SIZE = 2F;
    private static final float PI = 3.141593F;
    private static final String TAG = "PointCloud";
    GlowManager glowManager;
    private float mCenterX;
    private float mCenterY;
    private Drawable mDrawable;
    private float mOuterRadius;
    private Paint mPaint;
    private ArrayList mPointCloud;
    private float mScale;
    WaveManager waveManager;

    public PointCloud(Drawable drawable)
    {
        mPointCloud = new ArrayList();
        mScale = 1.0F;
        waveManager = new WaveManager();
        glowManager = new GlowManager();
        mPaint = new Paint();
        mPaint.setFilterBitmap(true);
        mPaint.setColor(Color.rgb(255, 255, 255));
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mDrawable = drawable;
        if (mDrawable != null)
        {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private static float hypot(float f, float f1)
    {
        return (float)Math.sqrt(f * f + f1 * f1);
    }

    private float interp(float f, float f1, float f2)
    {
        return (f1 - f) * f2 + f;
    }

    private static float max(float f, float f1)
    {
        if (f > f1)
        {
            return f;
        } else
        {
            return f1;
        }
    }

    public void draw(Canvas canvas)
    {
        ArrayList arraylist = mPointCloud;
        canvas.save(1);
        canvas.scale(mScale, mScale, mCenterX, mCenterY);
        int i = 0;
        while (i < arraylist.size()) 
        {
            Point point = (Point)arraylist.get(i);
            float f4 = interp(4F, 2.0F, point.radius / mOuterRadius);
            float f = point.x + mCenterX;
            float f1 = point.y + mCenterY;
            int j = getAlphaForPoint(point);
            if (j != 0)
            {
                if (mDrawable != null)
                {
                    canvas.save(1);
                    float f2 = mDrawable.getIntrinsicWidth();
                    float f3 = mDrawable.getIntrinsicHeight();
                    f4 /= 4F;
                    canvas.scale(f4, f4, f, f1);
                    canvas.translate(f - f2 * 0.5F, f1 - f3 * 0.5F);
                    mDrawable.setAlpha(j);
                    mDrawable.draw(canvas);
                    canvas.restore();
                } else
                {
                    mPaint.setAlpha(j);
                    canvas.drawCircle(f, f1, f4, mPaint);
                }
            }
            i++;
        }
        canvas.restore();
    }

    public int getAlphaForPoint(Point point)
    {
        float f3 = 0.0F;
        float f = hypot(glowManager.x - point.x, glowManager.y - point.y);
        float f2;
        float f5;
        if (f < glowManager.radius)
        {
            f = (float)Math.cos((f * 0.7853982F) / glowManager.radius);
            float f1 = glowManager.alpha;
            f = max(0.0F, (float)Math.pow(f, 10D)) * f1;
        } else
        {
            f = 0.0F;
        }
        f5 = hypot(point.x, point.y) - waveManager.radius;
        f2 = f3;
        if (f5 < waveManager.width * 0.5F)
        {
            f2 = f3;
            if (f5 < 0.0F)
            {
                f2 = (float)Math.cos((f5 * 0.7853982F) / waveManager.width);
                float f4 = waveManager.alpha;
                f2 = max(0.0F, (float)Math.pow(f2, 20D)) * f4;
            }
        }
        return (int)(max(f, f2) * 255F);
    }

    public float getScale()
    {
        return mScale;
    }

    public void makePointCloud(float f, float f1)
    {
        if (f != 0.0F)
        {
            mOuterRadius = f1;
            mPointCloud.clear();
            f1 -= f;
            float f2 = (6.283185F * f) / 8F;
            int k = Math.round(f1 / f2);
            float f3 = f1 / (float)k;
            int i = 0;
            while (i <= k) 
            {
                int l = (int)((6.283185F * f) / f2);
                f1 = 1.570796F;
                float f4 = 6.283185F / (float)l;
                for (int j = 0; j < l; j++)
                {
                    float f5 = (float)Math.cos(f1);
                    float f6 = (float)Math.sin(f1);
                    f1 += f4;
                    mPointCloud.add(new Point(f5 * f, f6 * f, f));
                }

                f += f3;
                i++;
            }
        }
    }

    public void setCenter(float f, float f1)
    {
        mCenterX = f;
        mCenterY = f1;
    }

    public void setScale(float f)
    {
        mScale = f;
    }

    private class WaveManager
    {

        private float alpha;
        private float radius;
        final PointCloud this$0;
        private float width;

        public float getAlpha()
        {
            return alpha;
        }

        public float getRadius()
        {
            return radius;
        }

        public void setAlpha(float f)
        {
            alpha = f;
        }

        public void setRadius(float f)
        {
            radius = f;
        }




        public WaveManager()
        {
            this$0 = PointCloud.this;
            super();
            radius = 50F;
            width = 200F;
            alpha = 0.0F;
        }
    }


    private class GlowManager
    {

        private float alpha;
        private float radius;
        final PointCloud this$0;
        private float x;
        private float y;

        public float getAlpha()
        {
            return alpha;
        }

        public float getRadius()
        {
            return radius;
        }

        public float getX()
        {
            return x;
        }

        public float getY()
        {
            return y;
        }

        public void setAlpha(float f)
        {
            alpha = f;
        }

        public void setRadius(float f)
        {
            radius = f;
        }

        public void setX(float f)
        {
            x = f;
        }

        public void setY(float f)
        {
            y = f;
        }





        public GlowManager()
        {
            this$0 = PointCloud.this;
            super();
            radius = 0.0F;
            alpha = 0.0F;
        }
    }


    private class Point
    {

        float radius;
        final PointCloud this$0;
        float x;
        float y;

        public Point(float f, float f1, float f2)
        {
            this$0 = PointCloud.this;
            super();
            x = f;
            y = f1;
            radius = f2;
        }
    }

}
