// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.Map;

public final class bxu
{

    public static float a = 0.0F;
    private static DecelerateInterpolator b = new DecelerateInterpolator(1.0F);
    private static int c = -1;
    private static int d;
    private static int e;
    private static int f;
    private static int g;
    private static float h;
    private static float i;
    private float j;
    private final bxz k;
    private final int l = 0;
    private final VelocityTracker m;
    private float n;
    private boolean o;
    private boolean p;
    private bya q;
    private View r;
    private boolean s;
    private float t;
    private float u;
    private float v;
    private Map w;

    public bxu(Resources resources, VelocityTracker velocitytracker, bxz bxz1, float f1, float f2)
    {
        w = new gz();
        k = bxz1;
        m = velocitytracker;
        t = f1;
        j = f2;
        if (c == -1)
        {
            c = resources.getInteger(g.mS);
            d = resources.getInteger(g.mO);
            e = resources.getInteger(g.mQ);
            f = resources.getInteger(g.mP);
            g = resources.getInteger(g.mR);
            h = resources.getDimension(g.mM);
            i = resources.getDimension(g.mN);
        }
    }

    private ObjectAnimator a(View view, float f1)
    {
        String s1;
        if (l == 0)
        {
            s1 = "translationX";
        } else
        {
            s1 = "translationY";
        }
        return ObjectAnimator.ofFloat(view, s1, new float[] {
            f1
        });
    }

    static bxz a(bxu bxu1)
    {
        return bxu1.k;
    }

    public static void a(View view)
    {
        a(view, new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
    }

    private static void a(View view, RectF rectf)
    {
        for (; view.getParent() instanceof View; view.invalidate((int)Math.floor(rectf.left), (int)Math.floor(rectf.top), (int)Math.ceil(rectf.right), (int)Math.ceil(rectf.bottom)))
        {
            view = (View)view.getParent();
            view.getMatrix().mapRect(rectf);
        }

    }

    private float b(View view)
    {
        if (l == 0)
        {
            return (float)view.getMeasuredWidth();
        } else
        {
            return (float)view.getMeasuredHeight();
        }
    }

    static Map b(bxu bxu1)
    {
        return bxu1.w;
    }

    public void a(float f1)
    {
        t = f1;
    }

    public boolean a(MotionEvent motionevent)
    {
        boolean flag = false;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 45
    //                   1 395
    //                   2 208
    //                   3 395;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        flag = o;
_L10:
        return flag;
_L2:
        u = motionevent.getY();
        o = false;
        p = false;
        Object obj = k.a(motionevent);
        if (obj instanceof bya)
        {
            obj = (bya)obj;
        } else
        {
            obj = null;
        }
        q = ((bya) (obj));
        m.clear();
        if (q != null)
        {
            if (w.containsKey(q))
            {
                ((ObjectAnimator)w.get(q)).cancel();
            }
            r = q.a();
            s = k.a(q);
            m.addMovement(motionevent);
            n = motionevent.getX();
            v = motionevent.getY();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (q == null) goto _L6; else goto _L5
_L5:
        if (u < 0.0F || o) goto _L8; else goto _L7
_L7:
        float f1;
        float f3;
        f3 = motionevent.getY();
        f1 = motionevent.getX();
        f3 = Math.abs(f3 - v);
        f1 = Math.abs(f1 - n);
        if (!p && (f3 <= 2.0F || f3 <= f1 * 1.2F)) goto _L8; else goto _L9
_L9:
        u = motionevent.getY();
        if (f3 > i)
        {
            p = true;
            return false;
        }
          goto _L10
_L8:
        m.addMovement(motionevent);
        float f2 = motionevent.getX() - n;
        if (Math.abs(f2) > j)
        {
            k.a(q, (int)Math.signum(f2));
            o = true;
            n = motionevent.getX() - r.getTranslationX();
            v = motionevent.getY();
        }
_L6:
        u = motionevent.getY();
        continue; /* Loop/switch isn't completed */
_L3:
        o = false;
        q = null;
        r = null;
        u = -1F;
        p = false;
        if (true) goto _L1; else goto _L11
_L11:
    }

    public void b(float f1)
    {
        j = f1;
    }

    public boolean b(MotionEvent motionevent)
    {
        if (!o)
        {
            return false;
        }
        m.addMovement(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 1 4: default 52
    //                   1 218
    //                   2 54
    //                   3 218
    //                   4 54;
           goto _L1 _L2 _L3 _L2 _L3
_L1:
        return true;
_L3:
        if (q != null)
        {
            float f1 = motionevent.getX() - n;
            if (Math.abs(f1) < h)
            {
                return true;
            }
            if (!k.a(q))
            {
                float f5 = b(r);
                float f3 = 0.05F * f5;
                if (Math.abs(f1) >= f5)
                {
                    if (f1 > 0.0F)
                    {
                        f1 = f3;
                    } else
                    {
                        f1 = -f3;
                    }
                } else
                {
                    f1 = f3 * (float)Math.sin((double)(f1 / f5) * 1.5707963267948966D);
                }
            }
            k.b(q, (int)Math.signum(f1));
            motionevent = r;
            if (l == 0)
            {
                motionevent.setTranslationX(f1);
            } else
            {
                motionevent.setTranslationY(f1);
            }
            a(q.a());
        }
          goto _L4
_L2:
        if (q == null) goto _L4; else goto _L5
_L5:
        float f2;
        float f4;
        int i1;
        boolean flag;
        f2 = f;
        f4 = t;
        m.computeCurrentVelocity(1000, f2 * f4);
        float f6 = c;
        float f7 = t;
        motionevent = m;
        float f8;
        float f9;
        ObjectAnimator objectanimator;
        if (l == 0)
        {
            f2 = motionevent.getXVelocity();
        } else
        {
            f2 = motionevent.getYVelocity();
        }
        motionevent = m;
        if (l == 0)
        {
            f4 = motionevent.getYVelocity();
        } else
        {
            f4 = motionevent.getXVelocity();
        }
        f8 = Math.abs(r.getTranslationX());
        f9 = b(r);
        if ((double)f8 > 0.40000000000000002D * (double)f9)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (Math.abs(f2) <= f6 * f7 || Math.abs(f2) <= Math.abs(f4)) goto _L7; else goto _L6
_L6:
        boolean flag1;
        if (f2 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (r.getTranslationX() > 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1 || (double)f8 <= (double)f9 * 0.050000000000000003D) goto _L7; else goto _L8
_L8:
        flag = true;
_L9:
        if (k.a(q) && (flag || i1 != 0))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            motionevent = q;
            View view;
            if (!flag)
            {
                f2 = 0.0F;
            }
            view = q.a();
            if (f2 < 0.0F || f2 == 0.0F && view.getTranslationX() < 0.0F || f2 == 0.0F && view.getTranslationX() == 0.0F && l == 1)
            {
                f4 = -b(view);
            } else
            {
                f4 = b(view);
            }
            i1 = e;
            if (f2 != 0.0F)
            {
                i1 = Math.min(i1, (int)((Math.abs(f4 - view.getTranslationX()) * 1000F) / Math.abs(f2)));
            } else
            {
                i1 = d;
            }
            if (view != null && view.isHardwareAccelerated())
            {
                view.setLayerType(2, null);
                view.buildLayer();
            }
            objectanimator = a(view, f4);
            objectanimator.setInterpolator(b);
            objectanimator.setDuration(i1);
            objectanimator.addListener(new bxv(this, view, motionevent));
            objectanimator.addUpdateListener(new bxw(this, view));
            objectanimator.start();
        } else
        {
            motionevent = q;
            View view1 = motionevent.a();
            ObjectAnimator objectanimator1 = a(view1, 0.0F);
            objectanimator1.setDuration(g);
            objectanimator1.addUpdateListener(new bxx(this, view1));
            objectanimator1.addListener(new bxy(this, motionevent, objectanimator1, view1));
            objectanimator1.start();
        }
_L4:
        if (true) goto _L1; else goto _L7
_L7:
        flag = false;
          goto _L9
    }

}
