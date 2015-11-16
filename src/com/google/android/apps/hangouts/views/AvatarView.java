// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahj;
import amy;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import ani;
import anv;
import apw;
import aqb;
import aqw;
import cey;
import dlb;
import dle;
import dlf;
import dmt;
import dpy;
import dqa;
import dzl;
import dzn;
import eab;
import eam;
import ean;
import ebh;
import ebw;
import g;
import gbh;
import he;
import hgx;

public class AvatarView extends View
    implements aqb, dle, dlf
{

    public static final boolean a = false;
    private int b;
    private String c;
    private amy d;
    private apw e;
    private Bitmap f;
    private ebh g;
    private Bitmap h;
    private Bitmap i;
    private final Rect j;
    private final Rect k;
    private final dpy l;
    private boolean m;
    private int n;
    private int o;
    private final Paint p;

    public AvatarView(Context context)
    {
        this(context, null);
    }

    public AvatarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AvatarView(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag = false;
        super(context, attributeset, i1);
        j = new Rect();
        k = new Rect();
        l = new dpy();
        m = true;
        n = 1;
        o = 0;
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, ahj.i);
            attributeset = typedarray.getString(ahj.k);
            context = attributeset;
            if (attributeset == null)
            {
                context = "small";
            }
            if ("tiny".equals(context))
            {
                i1 = 0;
            } else
            if ("small".equals(context))
            {
                i1 = 1;
            } else
            if ("medium".equals(context))
            {
                i1 = 2;
            } else
            if ("large".equals(context))
            {
                i1 = 3;
            } else
            if ("xlarge".equals(context))
            {
                i1 = 4;
            } else
            {
                context = String.valueOf(context);
                if (context.length() != 0)
                {
                    context = "Invalid avatar size: ".concat(context);
                } else
                {
                    context = new String("Invalid avatar size: ");
                }
                throw new IllegalArgumentException(context);
            }
            b = i1;
            context = typedarray.getString(ahj.j);
            if (context == null)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            if ("square".equals(context))
            {
                i1 = 1;
            } else
            if ("round".equals(context))
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                context = String.valueOf(context);
                if (context.length() != 0)
                {
                    context = "Invalid avatar shape: ".concat(context);
                } else
                {
                    context = new String("Invalid avatar shape: ");
                }
                throw new IllegalArgumentException(context);
            }
            n = i1;
            typedarray.recycle();
        } else
        {
            b = 2;
            n = 0;
        }
        p = new Paint(2);
        f();
    }

    private void a(String s)
    {
        int j1 = g();
        int i1;
        if (n == 0)
        {
            i1 = dqa.a;
        } else
        {
            i1 = dqa.b;
        }
        h = ean.a().b(j1, j1);
        if (dpy.a(getContext(), h, s, j1, i1, g.dt))
        {
            a(h);
            return;
        } else
        {
            ean.a().a(h);
            h = null;
            return;
        }
    }

    private void f()
    {
        Bitmap bitmap = null;
        if (o != 0) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR tableswitch 0 4: default 48
    //                   0 77
    //                   1 77
    //                   2 77
    //                   3 99
    //                   4 99;
           goto _L3 _L4 _L4 _L4 _L5 _L5
_L3:
        if (f != bitmap)
        {
            f = bitmap;
            if (g == null)
            {
                a(f);
            }
        }
        return;
_L4:
        if (n == 1)
        {
            bitmap = anv.d();
        } else
        {
            bitmap = anv.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (n == 1)
        {
            bitmap = anv.i();
        } else
        {
            bitmap = anv.h();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (o != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap = anv.p();
        if (true) goto _L3; else goto _L6
_L6:
        if (o == 3)
        {
            switch (b)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                if (n == 1)
                {
                    bitmap = anv.m();
                } else
                {
                    bitmap = anv.l();
                }
                break;

            case 3: // '\003'
            case 4: // '\004'
                if (n == 1)
                {
                    bitmap = anv.o();
                } else
                {
                    bitmap = anv.n();
                }
                break;
            }
        } else
        {
            boolean flag;
            if (o == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gbh.a(flag);
            if (n == 1)
            {
                bitmap = anv.k();
            } else
            {
                bitmap = anv.j();
            }
        }
        if (true) goto _L3; else goto _L7
_L7:
    }

    private int g()
    {
        switch (b)
        {
        default:
            gbh.a("Invalid avatar size");
            return 0;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return anv.b();

        case 3: // '\003'
            return anv.e();

        case 4: // '\004'
            return anv.f();
        }
    }

    private void h()
    {
        int i1 = getMeasuredHeight();
        int j1 = getMeasuredWidth();
        if (i1 == 0 || j1 == 0)
        {
            return;
        }
        int k1 = i.getWidth();
        int l1 = i.getHeight();
        if (j1 > i1)
        {
            int i2 = (int)(((float)k1 * (1.0F - (float)i1 / (float)j1)) / 2.0F);
            k.set(0, i2, l1, k1 - i2);
        } else
        {
            int j2 = (int)(((float)l1 * (1.0F - (float)j1 / (float)i1)) / 2.0F);
            k.set(j2, 0, l1 - j2, k1);
        }
        j.set(0, 0, j1, i1);
    }

    public void a()
    {
        b = 2;
        f();
    }

    public void a(int i1)
    {
        o = i1;
        f();
    }

    public void a(amy amy1)
    {
        d = null;
    }

    public void a(Bitmap bitmap)
    {
        if (i != bitmap)
        {
            i = bitmap;
            h();
            invalidate();
        }
    }

    public void a(cey cey, ani ani1)
    {
        d();
        d = dlb.a(cey, ani1, this);
    }

    public void a(ebh ebh1, eab eab, boolean flag, apw apw1, boolean flag1)
    {
        gbh.a(eab);
        if (a)
        {
            String s;
            if (ebh1 == null)
            {
                s = null;
            } else
            {
                s = ebh1.toString();
            }
            if (eab == null)
            {
                eab = null;
            } else
            {
                eab = eab.toString();
            }
            eab = String.valueOf(eab);
            ebw.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 72 + String.valueOf(eab).length())).append("AvatarView: setImageBitmap ").append(s).append("gifImage=").append(eab).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (e != apw1)
        {
            if (ebh1 != null)
            {
                ebh1.b();
            }
        } else
        {
            e = null;
            if (flag && ebh1 != null)
            {
                gbh.a(g);
                g = ebh1;
                a(g.e());
                return;
            }
        }
    }

    public void a(String s, String s1, int i1, aqw aqw, ani ani1)
    {
        a(s, s1, ((amy) (aqw)), ((String) (null)), ani1);
        if (i1 == 1)
        {
            a(3);
        }
    }

    public void a(String s, String s1, amy amy1, String s2, ani ani1)
    {
        d = null;
        a(s1, s, ani1);
    }

    public void a(String s, String s1, ani ani1)
    {
        if (TextUtils.isEmpty(s))
        {
            d();
            if (!TextUtils.isEmpty(s1))
            {
                a(s1);
            }
        } else
        if (!TextUtils.equals(s, c))
        {
            d();
            c = s;
            s = (new eam(s, ani1.a())).a(g()).d(true);
            boolean flag;
            if (n == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = new apw(s.b(flag), this, true, null);
            if (((dmt)hgx.a(getContext(), dmt)).a(e, false))
            {
                e = null;
                return;
            }
            if (!TextUtils.isEmpty(s1))
            {
                a(s1);
                return;
            }
        }
    }

    public void a(String s, boolean flag, ani ani1)
    {
        d();
        d = dlb.a(s, flag, ani1, this);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            p.setAlpha(100);
        } else
        {
            p.setAlpha(255);
        }
        invalidate();
    }

    public void b()
    {
        n = 0;
        f();
    }

    public String c()
    {
        return c;
    }

    public void d()
    {
        if (e != null)
        {
            e.b();
            e = null;
        }
        if (d != null)
        {
            d.b();
            d = null;
        }
        a(f);
        if (g != null)
        {
            g.b();
            g = null;
        }
        if (h != null)
        {
            ean.a().a(h);
            h = null;
        }
        c = null;
    }

    public void e()
    {
        m = false;
    }

    protected void onDetachedFromWindow()
    {
        if (m)
        {
            d();
        }
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas canvas)
    {
        if (a && i.isRecycled())
        {
            dzl dzl1 = ean.a();
            Bitmap bitmap = i;
            ebw.e("Babel", "Attempting to draw with a recycled bitmap", new Exception((Exception)dzl1.b.d.a(bitmap)));
        }
        canvas.drawBitmap(i, k, j, p);
    }

    protected void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i1), android.view.View.MeasureSpec.getSize(j1));
        h();
    }

    static 
    {
        hik hik = ebw.w;
    }
}
