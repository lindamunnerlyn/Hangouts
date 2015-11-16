// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.avatars.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import g;
import grq;
import hcv;
import hcy;
import hgn;
import hgx;

public final class AvatarView extends View
    implements hcy
{

    private static boolean a;
    private static Paint b;
    private static RectF c = new RectF();
    private static grq d;
    private int e;
    private String f;
    private hcv g;
    private int h;
    private Matrix i;
    private Paint j;
    private boolean k;
    private int l;
    private boolean m;
    private boolean n;
    private String o;
    private String p;
    private Drawable q;
    private String r;

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
        boolean flag = true;
        super(context, attributeset, i1);
        n = true;
        Resources resources = context.getResources();
        if (!a)
        {
            d = (grq)hgx.a(context, grq);
            context = new Paint();
            b = context;
            context.setAntiAlias(true);
            b.setStrokeWidth(4F);
            b.setColor(resources.getColor(g.sp));
            b.setStyle(android.graphics.Paint.Style.STROKE);
            a = true;
        }
        q = resources.getDrawable(g.sr);
        q.setCallback(this);
        e = 2;
        l = 2;
        if (attributeset != null)
        {
            context = attributeset.getAttributeValue(null, "size");
            if (context != null)
            {
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
                e = i1;
            }
            context = attributeset.getAttributeValue(null, "shape");
            if (context != null)
            {
                if ("normal".equals(context))
                {
                    i1 = 0;
                } else
                {
                    i1 = ((flag) ? 1 : 0);
                    if (!"round".equals(context))
                    {
                        if ("rounded_corners".equals(context))
                        {
                            i1 = 2;
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
                    }
                }
                l = i1;
            }
            context = attributeset.getAttributeValue(null, "selectable");
            if (context != null)
            {
                n = Boolean.parseBoolean(context);
            }
            k = attributeset.getAttributeBooleanValue(null, "allowNonSquare", false);
        }
        e = e;
        e;
        JVM INSTR tableswitch 0 3: default 264
    //                   0 439
    //                   1 453
    //                   2 264
    //                   3 467;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        h = g.B(getContext());
_L6:
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            setLayoutDirection(0);
        }
        return;
_L2:
        h = g.x(getContext());
        continue; /* Loop/switch isn't completed */
_L3:
        h = g.z(getContext());
        continue; /* Loop/switch isn't completed */
_L4:
        h = g.D(getContext());
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void a()
    {
label0:
        {
            boolean flag;
            if (getWindowToken() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (r == null)
                {
                    break label0;
                }
                g = d.a(getContext(), r, e, l, this);
            }
            return;
        }
        invalidate();
    }

    private void a(int i1, int j1)
    {
        if (i != null)
        {
            i.reset();
        }
        while (i1 == 0 || i1 == j1) 
        {
            return;
        }
        if (j == null)
        {
            j = new Paint(2);
        }
        if (i == null)
        {
            i = new Matrix();
        }
        float f1 = (float)i1 / (float)j1;
        i.setScale(f1, f1);
    }

    private void b()
    {
        if (g != null)
        {
            g.d(this);
            g = null;
        }
    }

    public void a(hcv hcv1)
    {
        if (hcv1.w() == 1)
        {
            int i1 = ((Bitmap)hcv1.y()).getWidth();
            a(getMeasuredWidth(), i1);
        }
        invalidate();
    }

    public void a(String s, String s1)
    {
        if (!TextUtils.equals(f, s) || !TextUtils.equals(r, s1))
        {
            b();
            f = s;
            r = s1;
            p = null;
            o = null;
            a();
        }
    }

    protected void drawableStateChanged()
    {
        q.setState(getDrawableState());
        invalidate();
        super.drawableStateChanged();
    }

    public CharSequence getContentDescription()
    {
        if (!TextUtils.isEmpty(p))
        {
            return p;
        }
        if (!TextUtils.isEmpty(o))
        {
            if (isClickable())
            {
                return getResources().getString(g.sv, new Object[] {
                    o
                });
            } else
            {
                return getResources().getString(g.su);
            }
        }
        if (isClickable())
        {
            return getResources().getString(g.st);
        } else
        {
            return getResources().getString(g.ss);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b();
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        Object obj;
        Bitmap bitmap;
        int i1;
        if (g != null && g.w() == 1)
        {
            bitmap = (Bitmap)g.y();
        } else
        {
            bitmap = null;
        }
        obj = bitmap;
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        e;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 201
    //                   1 290
    //                   2 378
    //                   3 466;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        obj = bitmap;
_L2:
        if (m)
        {
            c.set(0.0F, 0.0F, getWidth(), getHeight());
            canvas.saveLayerAlpha(c, 105, 31);
        }
        if (i != null)
        {
            canvas.drawBitmap(((Bitmap) (obj)), i, j);
        } else
        {
            canvas.drawBitmap(((Bitmap) (obj)), 0.0F, 0.0F, null);
        }
        if (m)
        {
            canvas.restore();
        }
        if (!n || !isPressed() && !isFocused() || m) goto _L9; else goto _L8
_L8:
        l;
        JVM INSTR tableswitch 0 2: default 200
    //                   0 565
    //                   1 574
    //                   2 601;
           goto _L9 _L10 _L11 _L12
_L9:
        return;
_L4:
        obj = getContext();
        switch (l)
        {
        default:
            obj = g.y(((Context) (obj)));
            break;

        case 1: // '\001'
            if (g.sd == null)
            {
                g.sd = hgn.a(g.y(((Context) (obj))));
            }
            obj = g.sd;
            break;

        case 2: // '\002'
            if (g.se == null)
            {
                g.se = hgn.a(g.y(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.se;
            break;
        }
        if (true) goto _L2; else goto _L13
_L13:
_L5:
        obj = getContext();
        switch (l)
        {
        default:
            obj = g.A(((Context) (obj)));
            break;

        case 1: // '\001'
            if (g.sg == null)
            {
                g.sg = hgn.a(g.A(((Context) (obj))));
            }
            obj = g.sg;
            break;

        case 2: // '\002'
            if (g.sh == null)
            {
                g.sh = hgn.a(g.A(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sh;
            break;
        }
        if (true) goto _L2; else goto _L14
_L14:
_L6:
        obj = getContext();
        switch (l)
        {
        default:
            obj = g.C(((Context) (obj)));
            break;

        case 1: // '\001'
            if (g.sj == null)
            {
                g.sj = hgn.a(g.C(((Context) (obj))));
            }
            obj = g.sj;
            break;

        case 2: // '\002'
            if (g.sk == null)
            {
                g.sk = hgn.a(g.C(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sk;
            break;
        }
        if (true) goto _L2; else goto _L15
_L15:
_L7:
        obj = getContext();
        switch (l)
        {
        default:
            obj = g.E(((Context) (obj)));
            break;

        case 1: // '\001'
            if (g.sm == null)
            {
                g.sm = hgn.a(g.E(((Context) (obj))));
            }
            obj = g.sm;
            break;

        case 2: // '\002'
            if (g.sn == null)
            {
                g.sn = hgn.a(g.E(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sn;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        q.draw(canvas);
        return;
_L11:
        i1 = getWidth() / 2;
        canvas.drawCircle(i1, i1, i1 - 2, b);
        return;
_L12:
        f1 = g.F(getContext());
        c.set(0.0F, 0.0F, getWidth(), getHeight());
        canvas.drawRoundRect(c, f1, f1, b);
        return;
        if (true) goto _L2; else goto _L16
_L16:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        super.onLayout(flag, i1, j1, k1, l1);
        if (l == 0)
        {
            q.setBounds(0, 0, k1 - i1, l1 - j1);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = h;
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        int k1;
        if (i2 == 0x40000000)
        {
            k1 = android.view.View.MeasureSpec.getSize(i1);
        } else
        {
            k1 = l1;
            if (i2 == 0x80000000)
            {
                k1 = Math.min(l1, android.view.View.MeasureSpec.getSize(i1));
            }
        }
        l1 = android.view.View.MeasureSpec.getMode(j1);
        if (k)
        {
            i1 = h;
            if (l1 == 0x40000000 || l1 == 0x80000000)
            {
                i1 = Math.min(i1, android.view.View.MeasureSpec.getSize(j1));
                j1 = k1;
            } else
            {
                j1 = k1;
            }
        } else
        {
            if (l1 == 0x40000000)
            {
                i1 = Math.min(k1, android.view.View.MeasureSpec.getSize(j1));
            } else
            {
                i1 = Math.min(k1, h);
            }
            j1 = i1;
            k1 = i1;
            i1 = j1;
            j1 = k1;
        }
        if (g != null && g.w() == 1)
        {
            k1 = ((Bitmap)g.y()).getWidth();
        } else
        {
            k1 = h;
        }
        a(j1, k1);
        setMeasuredDimension(j1, i1);
    }

    public void setContentDescription(CharSequence charsequence)
    {
        super.setContentDescription(charsequence);
        p = (String)charsequence;
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        if (drawable == q)
        {
            return true;
        } else
        {
            return super.verifyDrawable(drawable);
        }
    }

}
