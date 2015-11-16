// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.views;

import abr;
import abs;
import abt;
import abu;
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

    private static int a;
    private static boolean b;
    private static int c;
    private static Bitmap d;
    private static Bitmap e;
    private static Paint f;
    private static Paint g;
    private boolean A;
    private abs B;
    private float C;
    private float D;
    private abu E;
    private abt F;
    private abr G;
    private float H;
    private RectF I;
    private RectF J;
    private RectF K;
    private float L[];
    private boolean M;
    private float N;
    private float O;
    private boolean P;
    private Drawable h;
    private Matrix i;
    private Matrix j;
    private Matrix k;
    private int l;
    private boolean m;
    private boolean n;
    private byte o[];
    private boolean p;
    private boolean q;
    private Rect r;
    private int s;
    private float t;
    private ic u;
    private ScaleGestureDetector v;
    private android.view.View.OnClickListener w;
    private boolean x;
    private boolean y;
    private boolean z;

    public PhotoView(Context context)
    {
        super(context);
        j = new Matrix();
        k = new Matrix();
        l = -1;
        r = new Rect();
        y = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new Matrix();
        k = new Matrix();
        l = -1;
        r = new Rect();
        y = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    public PhotoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        j = new Matrix();
        k = new Matrix();
        l = -1;
        r = new Rect();
        y = true;
        I = new RectF();
        J = new RectF();
        K = new RectF();
        L = new float[9];
        k();
    }

    private int a(float f1, float f2)
    {
        float f5 = 0.0F;
        K.set(I);
        j.mapRect(K);
        float f3;
        float f4;
        float f6;
        float f7;
        boolean flag;
        boolean flag1;
        if (q)
        {
            f3 = r.left;
        } else
        {
            f3 = 0.0F;
        }
        if (q)
        {
            f4 = r.right;
        } else
        {
            f4 = getWidth();
        }
        f6 = K.left;
        f7 = K.right;
        if (q)
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
        if (q)
        {
            f4 = r.top;
        }
        if (q)
        {
            f5 = r.bottom;
        } else
        {
            f5 = getHeight();
        }
        f6 = K.top;
        f7 = K.bottom;
        if (q)
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
        j.postTranslate(f3, f4);
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

    public static int a(PhotoView photoview, float f1, float f2)
    {
        return photoview.a(f1, f2);
    }

    private void a(float f1, float f2, float f3)
    {
        j.postRotate(-H, getWidth() / 2, getHeight() / 2);
        f1 = Math.min(Math.max(f1, C), D * 1.5F) / i();
        j.postScale(f1, f1, f2, f3);
        j.postRotate(H, getWidth() / 2, getHeight() / 2);
        invalidate();
    }

    public static void a(PhotoView photoview)
    {
        photoview.j();
    }

    public static void a(PhotoView photoview, float f1)
    {
        photoview.H = photoview.H + f1;
        photoview.j.postRotate(f1, photoview.getWidth() / 2, photoview.getHeight() / 2);
        photoview.invalidate();
    }

    public static void a(PhotoView photoview, float f1, float f2, float f3)
    {
        photoview.a(f1, f2, f3);
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag;
        if (y && x && M)
        {
            if (!z)
            {
                float f6 = i();
                float f1;
                float f2;
                float f3;
                if (f6 > C)
                {
                    f3 = C;
                    f1 = f3 / f6;
                    f2 = ((float)(getWidth() / 2) - K.centerX() * f1) / (1.0F - f1);
                    f1 = ((float)(getHeight() / 2) - K.centerY() * f1) / (1.0F - f1);
                } else
                {
                    f1 = Math.max(C, f6 * 2.0F);
                    f3 = Math.min(D, f1);
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
                B.a(f6, f3, f2, f1);
                flag = true;
            } else
            {
                flag = false;
            }
            z = false;
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
                if (h == null || !m)
                {
                    return;
                }
                j1 = h.getIntrinsicWidth();
                k1 = h.getIntrinsicHeight();
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
                h.setBounds(0, 0, j1, k1);
                if (!flag && (C != 0.0F || h == null || !m))
                {
                    break label0;
                }
                j2 = h.getIntrinsicWidth();
                k2 = h.getIntrinsicHeight();
                if (q)
                {
                    j1 = c;
                } else
                {
                    j1 = getWidth();
                }
                if (q)
                {
                    k1 = c;
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
            if (l1 && !q)
            {
                j.reset();
            } else
            {
                I.set(0.0F, 0.0F, j2, k2);
                RectF rectf;
                if (q)
                {
                    J.set(r);
                } else
                {
                    J.set(0.0F, 0.0F, j1, k1);
                }
                rectf = new RectF((float)(j1 / 2) - ((float)j2 * t) / 2.0F, (float)(k1 / 2) - ((float)k2 * t) / 2.0F, (float)(j1 / 2) + ((float)j2 * t) / 2.0F, (float)(k1 / 2) + ((float)k2 * t) / 2.0F);
                if (J.contains(rectf))
                {
                    j.setRectToRect(I, rectf, android.graphics.Matrix.ScaleToFit.CENTER);
                } else
                {
                    j.setRectToRect(I, J, android.graphics.Matrix.ScaleToFit.CENTER);
                }
            }
            k.set(j);
            l1 = h.getIntrinsicWidth();
            i2 = h.getIntrinsicHeight();
            if (q)
            {
                j1 = h();
            } else
            {
                j1 = getWidth();
            }
            if (q)
            {
                k1 = h();
            } else
            {
                k1 = getHeight();
            }
            if (l1 < j1 && i2 < k1 && !q)
            {
                C = 1.0F;
            } else
            {
                C = i();
            }
            D = Math.max(C * 4F, 4F);
        }
        if (flag1 || j.isIdentity())
        {
            i = null;
            return;
        } else
        {
            i = j;
            return;
        }
    }

    private int h()
    {
        if (s > 0)
        {
            return s;
        } else
        {
            return c;
        }
    }

    private float i()
    {
        j.getValues(L);
        return L[0];
    }

    private void j()
    {
        float f4 = 0.0F;
        K.set(I);
        j.mapRect(K);
        float f1;
        float f2;
        float f3;
        float f5;
        float f6;
        if (q)
        {
            f1 = r.left;
        } else
        {
            f1 = 0.0F;
        }
        if (q)
        {
            f2 = r.right;
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
        if (q)
        {
            f2 = r.top;
        } else
        {
            f2 = 0.0F;
        }
        if (q)
        {
            f3 = r.bottom;
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
            F.a(f1, f2);
            return;
        } else
        {
            j.postTranslate(f1, f2);
            invalidate();
            return;
        }
    }

    private void k()
    {
        Context context = getContext();
        if (!b)
        {
            b = true;
            Resources resources = context.getApplicationContext().getResources();
            c = resources.getDimensionPixelSize(g.bQ);
            Paint paint = new Paint();
            f = paint;
            paint.setAntiAlias(true);
            f.setColor(resources.getColor(g.bN));
            f.setStyle(android.graphics.Paint.Style.FILL);
            paint = new Paint();
            g = paint;
            paint.setAntiAlias(true);
            g.setColor(resources.getColor(g.bO));
            g.setStyle(android.graphics.Paint.Style.STROKE);
            g.setStrokeWidth(resources.getDimension(g.bP));
            int i1 = ViewConfiguration.get(context).getScaledTouchSlop();
            a = i1 * i1;
        }
        u = new ic(context, this);
        v = new ScaleGestureDetector(context, this);
        P = jr.a(v);
        B = new abs(this);
        E = new abu(this);
        F = new abt(this);
        G = new abr(this);
    }

    public void a(float f1)
    {
        t = f1;
    }

    public void a(Drawable drawable)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (drawable != null)
        {
            flag = flag1;
            if (drawable != h)
            {
                if (h != null)
                {
                    h.setCallback(null);
                }
                h = drawable;
                C = 0.0F;
                h.setCallback(this);
                flag = true;
            }
        }
        c(flag);
        invalidate();
    }

    public void a(boolean flag)
    {
        if (flag != n)
        {
            n = flag;
            requestLayout();
            invalidate();
        }
    }

    public boolean a()
    {
        if (x)
        {
            if (abu.a(E))
            {
                return true;
            }
            j.getValues(L);
            K.set(I);
            j.mapRect(K);
            float f1 = getWidth();
            float f2 = L[2];
            float f3 = K.right - K.left;
            if (x && f3 > f1 && f2 != 0.0F)
            {
                return f1 < f3 + f2 ? true : true;
            }
        }
        return false;
    }

    public void b(boolean flag)
    {
        x = flag;
        if (!x)
        {
            g();
        }
    }

    public boolean b()
    {
        if (x)
        {
            if (abu.a(E))
            {
                return true;
            }
            j.getValues(L);
            K.set(I);
            j.mapRect(K);
            float f1 = getWidth();
            float f2 = L[2];
            float f3 = K.right - K.left;
            if (x && f3 > f1)
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
        u = null;
        v = null;
        h = null;
        B.a();
        B = null;
        E.a();
        E = null;
        F.a();
        F = null;
        G.a();
        G = null;
        setOnClickListener(null);
        w = null;
        M = false;
    }

    public void d()
    {
        boolean flag2 = h instanceof BitmapDrawable;
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
        if (h != null)
        {
            flag1 = flag;
            if (flag2)
            {
                if (((BitmapDrawable)h).getBitmap() == null)
                {
                    return;
                }
                C = 0.0F;
                h = null;
                flag1 = false;
            }
        }
        c(flag1);
        invalidate();
    }

    public Drawable e()
    {
        return h;
    }

    public boolean f()
    {
        return h != null;
    }

    public void g()
    {
        j.set(k);
        invalidate();
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (h == drawable)
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
            if (i1 * i1 + j1 * j1 > a)
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
        if (x)
        {
            E.a();
            F.a();
        }
        return true;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (h != null)
        {
            int i1 = canvas.getSaveCount();
            canvas.save();
            if (i != null)
            {
                canvas.concat(i);
            }
            h.draw(canvas);
            canvas.restoreToCount(i1);
            if (o != null)
            {
                Bitmap bitmap;
                int j1;
                int k1;
                if (p)
                {
                    bitmap = d;
                } else
                {
                    bitmap = e;
                }
                j1 = (getWidth() - bitmap.getWidth()) / 2;
                k1 = (getHeight() - bitmap.getHeight()) / 2;
                canvas.drawBitmap(bitmap, j1, k1, null);
            }
            K.set(h.getBounds());
            if (i != null)
            {
                i.mapRect(K);
            }
            if (q)
            {
                j1 = canvas.getSaveCount();
                canvas.drawRect(0.0F, 0.0F, getWidth(), getHeight(), f);
                canvas.save();
                canvas.clipRect(r);
                if (i != null)
                {
                    canvas.concat(i);
                }
                h.draw(canvas);
                canvas.restoreToCount(j1);
                canvas.drawRect(r, g);
            }
        }
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (x && !abs.a(B))
        {
            E.a(f1, f2);
        }
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        m = true;
        i1 = getWidth();
        j1 = getHeight();
        if (q)
        {
            s = Math.min(c, Math.min(i1, j1));
            i1 = (i1 - s) / 2;
            j1 = (j1 - s) / 2;
            k1 = s;
            l1 = s;
            r.set(i1, j1, k1 + i1, l1 + j1);
        }
        c(flag);
    }

    public void onLongPress(MotionEvent motionevent)
    {
    }

    protected void onMeasure(int i1, int j1)
    {
        if (l != -1)
        {
            super.onMeasure(i1, android.view.View.MeasureSpec.makeMeasureSpec(l, 0x80000000));
            setMeasuredDimension(getMeasuredWidth(), l);
            return;
        } else
        {
            super.onMeasure(i1, j1);
            return;
        }
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        if (x)
        {
            A = false;
            a(i() * scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY());
        }
        return true;
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (x)
        {
            B.a();
            A = true;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        float f3 = i();
        if (f3 > D)
        {
            float f5 = 1.0F / (1.0F - D / f3);
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
            B.a(f3, D, f1, f2);
        }
        if (x && A)
        {
            z = true;
            g();
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (x && !abs.a(B))
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
        if (w != null && !A)
        {
            w.onClick(this);
        }
        A = false;
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (v != null && u != null)
        {
            v.onTouchEvent(motionevent);
            u.a(motionevent);
            switch (motionevent.getAction())
            {
            case 2: // '\002'
            default:
                return true;

            case 1: // '\001'
            case 3: // '\003'
                break;
            }
            if (!abu.a(E))
            {
                j();
                return true;
            }
        }
        return true;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        w = onclicklistener;
    }

    public boolean verifyDrawable(Drawable drawable)
    {
        return h == drawable || super.verifyDrawable(drawable);
    }
}
