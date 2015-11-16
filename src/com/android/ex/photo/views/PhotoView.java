// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;

import abt;
import abu;
import abv;
import abw;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import g;
import ic;
import jr;

public class PhotoView extends View
    implements android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
{

    private static int d;
    private static boolean e;
    private static int f;
    private static Bitmap g;
    private static Bitmap h;
    private static Paint i;
    private static Paint j;
    private boolean A;
    private boolean B;
    private boolean C;
    private abu D;
    private float E;
    private float F;
    private abw G;
    private abv H;
    private RectF I;
    private RectF J;
    private RectF K;
    private float L[];
    private boolean M;
    private float N;
    private float O;
    private boolean P;
    public Matrix a;
    abt b;
    public float c;
    private Drawable k;
    private Matrix l;
    private Matrix m;
    private int n;
    private boolean o;
    private boolean p;
    private byte q[];
    private boolean r;
    private boolean s;
    private Rect t;
    private int u;
    private float v;
    private ic w;
    private ScaleGestureDetector x;
    private android.view.View.OnClickListener y;
    private boolean z;

    public PhotoView(Context context)
    {
        super(context);
        a = new Matrix();
        m = new Matrix();
        n = -1;
        t = new Rect();
        A = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Matrix();
        m = new Matrix();
        n = -1;
        t = new Rect();
        A = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    public PhotoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new Matrix();
        m = new Matrix();
        n = -1;
        t = new Rect();
        A = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag;
        if (A && z && M)
        {
            if (!B)
            {
                float f6 = j();
                float f1;
                float f2;
                float f3;
                if (f6 > E)
                {
                    f3 = E;
                    f1 = f3 / f6;
                    f2 = ((float)(getWidth() / 2) - K.centerX() * f1) / (1.0F - f1);
                    f1 = ((float)(getHeight() / 2) - K.centerY() * f1) / (1.0F - f1);
                } else
                {
                    f1 = Math.max(E, f6 * 2.0F);
                    f3 = Math.min(F, f1);
                    f2 = f3 / f6;
                    f1 = ((float)getWidth() - K.width()) / f2;
                    f2 = ((float)getHeight() - K.height()) / f2;
                    if (K.width() <= f1 * 2.0F)
                    {
                        f1 = K.centerX();
                    } else
                    {
                        f1 = Math.min(Math.max(K.left + f1, motionevent.getX()), K.right - f1);
                    }
                    if (K.height() <= f2 * 2.0F)
                    {
                        float f4 = K.centerY();
                        f2 = f1;
                        f1 = f4;
                    } else
                    {
                        float f5 = Math.min(Math.max(K.top + f2, motionevent.getY()), K.bottom - f2);
                        f2 = f1;
                        f1 = f5;
                    }
                }
                D.a(f6, f3, f2, f1);
                flag = true;
            } else
            {
                flag = false;
            }
            B = false;
        } else
        {
            flag = false;
        }
        M = false;
        return flag;
    }

    private void c(boolean flag)
    {
label0:
        {
            int j1;
            int k1;
            int j2;
            int k2;
label1:
            {
                int i2 = 0;
                if (k == null || !o)
                {
                    return;
                }
                j1 = k.getIntrinsicWidth();
                k1 = k.getIntrinsicHeight();
                int i1 = getWidth();
                int l1 = getHeight();
                boolean flag1;
                if ((j1 < 0 || i1 == j1) && (k1 < 0 || l1 == k1))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                k.setBounds(0, 0, j1, k1);
                if (!flag && (E != 0.0F || k == null || !o))
                {
                    break label0;
                }
                j2 = k.getIntrinsicWidth();
                k2 = k.getIntrinsicHeight();
                if (s)
                {
                    j1 = f;
                } else
                {
                    j1 = getWidth();
                }
                if (s)
                {
                    k1 = f;
                } else
                {
                    k1 = getHeight();
                }
                if (j2 >= 0)
                {
                    l1 = i2;
                    if (j1 != j2)
                    {
                        break label1;
                    }
                }
                if (k2 >= 0)
                {
                    l1 = i2;
                    if (k1 != k2)
                    {
                        break label1;
                    }
                }
                l1 = 1;
            }
            if (l1 && !s)
            {
                a.reset();
            } else
            {
                I.set(0.0F, 0.0F, j2, k2);
                RectF rectf;
                if (s)
                {
                    J.set(t);
                } else
                {
                    J.set(0.0F, 0.0F, j1, k1);
                }
                rectf = new RectF((float)(j1 / 2) - ((float)j2 * v) / 2.0F, (float)(k1 / 2) - ((float)k2 * v) / 2.0F, (float)(j1 / 2) + ((float)j2 * v) / 2.0F, (float)(k1 / 2) + ((float)k2 * v) / 2.0F);
                if (J.contains(rectf))
                {
                    a.setRectToRect(I, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
                } else
                {
                    a.setRectToRect(I, J, android.graphics.Matrix.ScaleToFit.CENTER);
                }
            }
            m.set(a);
            l1 = k.getIntrinsicWidth();
            i2 = k.getIntrinsicHeight();
            if (s)
            {
                j1 = i();
            } else
            {
                j1 = getWidth();
            }
            if (s)
            {
                k1 = i();
            } else
            {
                k1 = getHeight();
            }
            if (l1 < j1 && i2 < k1 && !s)
            {
                E = 1.0F;
            } else
            {
                E = j();
            }
            F = Math.max(E * 4F, 4F);
        }
        if (flag1 || a.isIdentity())
        {
            l = null;
            return;
        } else
        {
            l = a;
            return;
        }
    }

    private int i()
    {
        if (u > 0)
        {
            return u;
        } else
        {
            return f;
        }
    }

    private float j()
    {
        a.getValues(L);
        return L[0];
    }

    private void k()
    {
        Context context = getContext();
        if (!e)
        {
            e = true;
            Resources resources = context.getApplicationContext().getResources();
            f = resources.getDimensionPixelSize(g.bQ);
            Paint paint = new Paint();
            i = paint;
            paint.setAntiAlias(true);
            i.setColor(resources.getColor(g.bN));
            i.setStyle(android.graphics.Paint.Style.FILL);
            paint = new Paint();
            j = paint;
            paint.setAntiAlias(true);
            j.setColor(resources.getColor(g.bO));
            j.setStyle(android.graphics.Paint.Style.STROKE);
            j.setStrokeWidth(resources.getDimension(g.bP));
            int i1 = ViewConfiguration.get(context).getScaledTouchSlop();
            d = i1 * i1;
        }
        w = new ic(context, this);
        x = new ScaleGestureDetector(context, this);
        P = jr.a(x);
        D = new abu(this);
        G = new abw(this);
        H = new abv(this);
        b = new abt(this);
    }

    public int a(float f1, float f2)
    {
        float f5 = 0.0F;
        K.set(I);
        a.mapRect(K);
        float f3;
        float f4;
        float f6;
        float f7;
        boolean flag;
        boolean flag1;
        if (s)
        {
            f3 = t.left;
        } else
        {
            f3 = 0.0F;
        }
        if (s)
        {
            f4 = t.right;
        } else
        {
            f4 = getWidth();
        }
        f6 = K.left;
        f7 = K.right;
        if (s)
        {
            f3 = Math.max(f3 - K.right, Math.min(f4 - K.left, f1));
        } else
        if (f7 - f6 < f4 - f3)
        {
            f3 += (f4 - f3 - (f6 + f7)) / 2.0F;
        } else
        {
            f3 = Math.max(f4 - f7, Math.min(f3 - f6, f1));
        }
        f4 = f5;
        if (s)
        {
            f4 = t.top;
        }
        if (s)
        {
            f5 = t.bottom;
        } else
        {
            f5 = getHeight();
        }
        f6 = K.top;
        f7 = K.bottom;
        if (s)
        {
            f4 = Math.max(f4 - K.bottom, Math.min(f5 - K.top, f2));
        } else
        if (f7 - f6 < f5 - f4)
        {
            f4 += (f5 - f4 - (f6 + f7)) / 2.0F;
        } else
        {
            f4 = Math.max(f5 - f7, Math.min(f4 - f6, f2));
        }
        a.postTranslate(f3, f4);
        invalidate();
        if (f3 == f1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (f4 == f2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            return 3;
        }
        if (flag)
        {
            return 1;
        }
        return !flag1 ? 0 : 2;
    }

    public void a(float f1)
    {
        v = f1;
    }

    public void a(float f1, float f2, float f3)
    {
        a.postRotate(-c, getWidth() / 2, getHeight() / 2);
        f1 = Math.min(Math.max(f1, E), F * 1.5F) / j();
        a.postScale(f1, f1, f2, f3);
        a.postRotate(c, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    public void a(Drawable drawable)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (drawable != null)
        {
            flag = flag1;
            if (drawable != k)
            {
                if (k != null)
                {
                    k.setCallback(null);
                }
                k = drawable;
                E = 0.0F;
                k.setCallback(this);
                flag = true;
            }
        }
        c(flag);
        invalidate();
    }

    public void a(boolean flag)
    {
        if (flag != p)
        {
            p = flag;
            requestLayout();
            invalidate();
        }
    }

    public boolean a()
    {
        if (z)
        {
            if (G.a)
            {
                return true;
            }
            a.getValues(L);
            K.set(I);
            a.mapRect(K);
            float f1 = getWidth();
            float f2 = L[2];
            float f3 = K.right - K.left;
            if (z && f3 > f1 && f2 != 0.0F)
            {
                return f1 < f3 + f2 ? true : true;
            }
        }
        return false;
    }

    public void b(boolean flag)
    {
        z = flag;
        if (!z)
        {
            g();
        }
    }

    public boolean b()
    {
        if (z)
        {
            if (G.a)
            {
                return true;
            }
            a.getValues(L);
            K.set(I);
            a.mapRect(K);
            float f1 = getWidth();
            float f2 = L[2];
            float f3 = K.right - K.left;
            if (z && f3 > f1)
            {
                if (f2 == 0.0F)
                {
                    return true;
                }
                if (f1 < f2 + f3)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public void c()
    {
        w = null;
        x = null;
        k = null;
        D.a();
        D = null;
        G.a();
        G = null;
        H.a();
        H = null;
        b.a();
        b = null;
        setOnClickListener(null);
        y = null;
        M = false;
    }

    public void d()
    {
        boolean flag2 = k instanceof BitmapDrawable;
        boolean flag;
        boolean flag1;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (k != null)
        {
            flag1 = flag;
            if (flag2)
            {
                if (((BitmapDrawable)k).getBitmap() == null)
                {
                    return;
                }
                E = 0.0F;
                k = null;
                flag1 = false;
            }
        }
        c(flag1);
        invalidate();
    }

    public Drawable e()
    {
        return k;
    }

    public boolean f()
    {
        return k != null;
    }

    public void g()
    {
        a.set(m);
        invalidate();
    }

    public void h()
    {
        float f4 = 0.0F;
        K.set(I);
        a.mapRect(K);
        float f1;
        float f2;
        float f3;
        float f5;
        float f6;
        if (s)
        {
            f1 = t.left;
        } else
        {
            f1 = 0.0F;
        }
        if (s)
        {
            f2 = t.right;
        } else
        {
            f2 = getWidth();
        }
        f3 = K.left;
        f5 = K.right;
        if (f5 - f3 < f2 - f1)
        {
            f1 += (f2 - f1 - (f3 + f5)) / 2.0F;
        } else
        if (f3 > f1)
        {
            f1 -= f3;
        } else
        if (f5 < f2)
        {
            f1 = f2 - f5;
        } else
        {
            f1 = 0.0F;
        }
        if (s)
        {
            f2 = t.top;
        } else
        {
            f2 = 0.0F;
        }
        if (s)
        {
            f3 = t.bottom;
        } else
        {
            f3 = getHeight();
        }
        f6 = K.top;
        f5 = K.bottom;
        if (f5 - f6 < f3 - f2)
        {
            f2 = (f3 - f2 - (f5 + f6)) / 2.0F + f2;
        } else
        if (f6 > f2)
        {
            f2 -= f6;
        } else
        {
            f2 = f4;
            if (f5 < f3)
            {
                f2 = f3 - f5;
            }
        }
        if (Math.abs(f1) > 20F || Math.abs(f2) > 20F)
        {
            H.a(f1, f2);
            return;
        } else
        {
            a.postTranslate(f1, f2);
            invalidate();
            return;
        }
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (k == drawable)
        {
            invalidate();
            return;
        } else
        {
            super.invalidateDrawable(drawable);
            return;
        }
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        M = true;
        if (!P)
        {
            return a(motionevent);
        } else
        {
            return false;
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 32
    //                   0 34
    //                   1 59
    //                   2 72;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        if (P)
        {
            N = motionevent.getX();
            O = motionevent.getY();
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (P)
        {
            return a(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (P && M)
        {
            int i1 = (int)(motionevent.getX() - N);
            int j1 = (int)(motionevent.getY() - O);
            if (i1 * i1 + j1 * j1 > d)
            {
                M = false;
                return false;
            }
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean onDown(MotionEvent motionevent)
    {
        if (z)
        {
            G.a();
            H.a();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (k != null)
        {
            int i1 = canvas.getSaveCount();
            canvas.save();
            if (l != null)
            {
                canvas.concat(l);
            }
            k.draw(canvas);
            canvas.restoreToCount(i1);
            if (q != null)
            {
                Bitmap bitmap;
                int j1;
                int k1;
                if (r)
                {
                    bitmap = g;
                } else
                {
                    bitmap = h;
                }
                j1 = (getWidth() - bitmap.getWidth()) / 2;
                k1 = (getHeight() - bitmap.getHeight()) / 2;
                canvas.drawBitmap(bitmap, j1, k1, null);
            }
            K.set(k.getBounds());
            if (l != null)
            {
                l.mapRect(K);
            }
            if (s)
            {
                j1 = canvas.getSaveCount();
                canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), i);
                canvas.save();
                canvas.clipRect(t);
                if (l != null)
                {
                    canvas.concat(l);
                }
                k.draw(canvas);
                canvas.restoreToCount(j1);
                canvas.drawRect(t, j);
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (z && !D.a)
        {
            G.a(f1, f2);
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        o = true;
        i1 = getWidth();
        j1 = getHeight();
        if (s)
        {
            u = Math.min(f, Math.min(i1, j1));
            i1 = (i1 - u) / 2;
            j1 = (j1 - u) / 2;
            k1 = u;
            l1 = u;
            t.set(i1, j1, k1 + i1, l1 + j1);
        }
        c(flag);
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
        if (n != -1)
        {
            super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(n, 0x80000000));
            setMeasuredDimension(getMeasuredWidth(), n);
            return;
        } else
        {
            super.onMeasure(i1, j1);
            return;
        }
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (z)
        {
            C = false;
            a(j() * scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (z)
        {
            D.a();
            C = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        float f3 = j();
        if (f3 > F)
        {
            float f5 = 1.0F / (1.0F - F / f3);
            float f8 = 1.0F - f5;
            float f1 = getWidth() / 2;
            float f2 = getHeight() / 2;
            float f6 = K.left * f8;
            float f4 = K.top * f8;
            float f7 = (float)getWidth() * f5 + K.right * f8;
            f5 = f5 * (float)getHeight() + f8 * K.bottom;
            if (f7 > f6)
            {
                f1 = (f7 + f6) / 2.0F;
            } else
            {
                f1 = Math.min(Math.max(f7, f1), f6);
            }
            if (f5 > f4)
            {
                f2 = (f5 + f4) / 2.0F;
            } else
            {
                f2 = Math.min(Math.max(f5, f2), f4);
            }
            D.a(f3, F, f1, f2);
        }
        if (z && C)
        {
            B = true;
            g();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (z && !D.a)
        {
            a(-f1, -f2);
        }
        return true;
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (y != null && !C)
        {
            y.onClick(this);
        }
        C = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (x != null && w != null)
        {
            x.onTouchEvent(motionevent);
            w.a(motionevent);
            switch (motionevent.getAction())
            {
            case 2: // '\002'
            default:
                return true;

            case 1: // '\001'
            case 3: // '\003'
                break;
            }
            if (!G.a)
            {
                h();
                return true;
            }
        }
        return true;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        y = onclicklistener;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return k == drawable || super.verifyDrawable(drawable);
    }
}
