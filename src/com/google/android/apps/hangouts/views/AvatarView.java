// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ahb;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import anq;
import aoa;
import aon;
import aqn;
import aqs;
import arn;
import cgd;
import dny;
import dob;
import doc;
import dpn;
import dsr;
import dst;
import ecp;
import ecr;
import edf;
import edq;
import edr;
import eef;
import eev;
import g;
import gdv;
import he;
import hlp;

public class AvatarView extends View
    implements aqs, dob, doc
{

    public static final boolean a = false;
    private int b;
    private String c;
    private anq d;
    private aqn e;
    private Bitmap f;
    private eef g;
    private Bitmap h;
    private Bitmap i;
    private final Rect j;
    private final Rect k;
    private final dsr l;
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
        l = new dsr();
        m = true;
        n = 1;
        o = 0;
        if (attributeset != null)
        {
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, ahb.i);
            attributeset = typedarray.getString(ahb.k);
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
            context = typedarray.getString(ahb.j);
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
            i1 = dst.a;
        } else
        {
            i1 = dst.b;
        }
        h = edr.a().b(j1, j1);
        if (dsr.a(getContext(), h, s, j1, i1, g.ds))
        {
            a(h);
            return;
        } else
        {
            edr.a().a(h);
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
            bitmap = aon.d();
        } else
        {
            bitmap = aon.c();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (n == 1)
        {
            bitmap = aon.i();
        } else
        {
            bitmap = aon.h();
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (o != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap = aon.p();
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
                    bitmap = aon.m();
                } else
                {
                    bitmap = aon.l();
                }
                break;

            case 3: // '\003'
            case 4: // '\004'
                if (n == 1)
                {
                    bitmap = aon.o();
                } else
                {
                    bitmap = aon.n();
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
            gdv.a("Expected condition to be true", flag);
            if (n == 1)
            {
                bitmap = aon.k();
            } else
            {
                bitmap = aon.j();
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
            gdv.a("Invalid avatar size");
            return 0;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            return aon.b();

        case 3: // '\003'
            return aon.e();

        case 4: // '\004'
            return aon.f();
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

    public void a(Bitmap bitmap)
    {
        if (i != bitmap)
        {
            i = bitmap;
            h();
            invalidate();
        }
    }

    public void a(anq anq1)
    {
        d = null;
    }

    public void a(cgd cgd, aoa aoa1)
    {
        d();
        d = dny.a(cgd, aoa1, this);
    }

    public void a(eef eef1, edf edf, boolean flag, aqn aqn1, boolean flag1)
    {
        gdv.a("Expected null", edf);
        if (a)
        {
            String s;
            if (eef1 == null)
            {
                s = null;
            } else
            {
                s = eef1.toString();
            }
            if (edf == null)
            {
                edf = null;
            } else
            {
                edf = edf.toString();
            }
            edf = String.valueOf(edf);
            eev.b("Babel_medialoader", (new StringBuilder(String.valueOf(s).length() + 72 + String.valueOf(edf).length())).append("AvatarView: setImageBitmap ").append(s).append("gifImage=").append(edf).append(" success=").append(flag).append(" loadedFromCache=").append(flag1).toString());
        }
        if (e != aqn1)
        {
            if (eef1 != null)
            {
                eef1.b();
            }
        } else
        {
            e = null;
            if (flag && eef1 != null)
            {
                gdv.a("Expected null", g);
                g = eef1;
                a(g.e());
                return;
            }
        }
    }

    public void a(String s, String s1, int i1, arn arn, aoa aoa1)
    {
        a(s, s1, ((anq) (arn)), ((String) (null)), aoa1);
        if (i1 == 1)
        {
            a(3);
        }
    }

    public void a(String s, String s1, anq anq1, String s2, aoa aoa1)
    {
        d = null;
        a(s1, s, aoa1);
    }

    public void a(String s, String s1, aoa aoa1)
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
            s = (new edq(s, aoa1.a())).a(g()).d(true);
            boolean flag;
            if (n == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            e = new aqn(s.b(flag), this, true, null);
            if (((dpn)hlp.a(getContext(), dpn)).a(e, false))
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

    public void a(String s, boolean flag, aoa aoa1)
    {
        d();
        d = dny.a(s, flag, aoa1, this);
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
            edr.a().a(h);
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
            ecp ecp1 = edr.a();
            Bitmap bitmap = i;
            eev.e("Babel", "Attempting to draw with a recycled bitmap", new Exception((Exception)ecp1.b.d.a(bitmap)));
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
        hnc hnc = eev.w;
    }
}
