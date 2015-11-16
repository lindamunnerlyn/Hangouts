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
import gwb;
import hhm;
import hhp;
import hlf;
import hlp;

public final class AvatarView extends View
    implements hhp
{

    private static boolean a;
    private static Paint b;
    private static RectF c = new RectF();
    private static gwb d;
    private int e;
    private String f;
    private hhm g;
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
        boolean flag;
        flag = true;
        super(context, attributeset, i1);
        n = true;
        Resources resources = context.getResources();
        if (!a)
        {
            d = (gwb)hlp.a(context, gwb);
            context = new Paint();
            b = context;
            context.setAntiAlias(true);
            b.setStrokeWidth(4F);
            b.setColor(resources.getColor(g.sQ));
            b.setStyle(android.graphics.Paint.Style.STROKE);
            a = true;
        }
        q = resources.getDrawable(g.sS);
        q.setCallback(this);
        e = 2;
        l = 2;
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        context = attributeset.getAttributeValue(null, "size");
        if (context == null) goto _L4; else goto _L3
_L3:
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
_L12:
        e = i1;
_L4:
        context = attributeset.getAttributeValue(null, "shape");
        if (context == null) goto _L6; else goto _L5
_L5:
        if (!"normal".equals(context)) goto _L8; else goto _L7
_L7:
        i1 = 0;
_L10:
        l = i1;
_L6:
        context = attributeset.getAttributeValue(null, "selectable");
        if (context != null)
        {
            n = Boolean.parseBoolean(context);
        }
        k = attributeset.getAttributeBooleanValue(null, "allowNonSquare", false);
          goto _L2
_L8:
        i1 = ((flag) ? 1 : 0);
        if ("round".equals(context))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!"rounded_corners".equals(context))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 2;
        if (true) goto _L10; else goto _L9
_L9:
        context = String.valueOf(context);
        if (context.length() != 0)
        {
            context = "Invalid avatar shape: ".concat(context);
        } else
        {
            context = new String("Invalid avatar shape: ");
        }
        throw new IllegalArgumentException(context);
_L2:
        e = e;
        switch (e)
        {
        case 2: // '\002'
        default:
            h = g.B(getContext());
            return;

        case 0: // '\0'
            h = g.x(getContext());
            return;

        case 1: // '\001'
            h = g.z(getContext());
            return;

        case 3: // '\003'
            h = g.D(getContext());
            break;
        }
        return;
        if (true) goto _L12; else goto _L11
_L11:
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

    public void a(hhm hhm1)
    {
        if (hhm1.x() == 1)
        {
            int i1 = ((Bitmap)hhm1.z()).getWidth();
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
                return getResources().getString(g.sW, new Object[] {
                    o
                });
            } else
            {
                return getResources().getString(g.sV);
            }
        }
        if (isClickable())
        {
            return getResources().getString(g.sU);
        } else
        {
            return getResources().getString(g.sT);
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
        if (g != null && g.x() == 1)
        {
            bitmap = (Bitmap)g.z();
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
            if (g.sE == null)
            {
                g.sE = hlf.a(g.y(((Context) (obj))));
            }
            obj = g.sE;
            break;

        case 2: // '\002'
            if (g.sF == null)
            {
                g.sF = hlf.a(g.y(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sF;
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
            if (g.sH == null)
            {
                g.sH = hlf.a(g.A(((Context) (obj))));
            }
            obj = g.sH;
            break;

        case 2: // '\002'
            if (g.sI == null)
            {
                g.sI = hlf.a(g.A(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sI;
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
            if (g.sK == null)
            {
                g.sK = hlf.a(g.C(((Context) (obj))));
            }
            obj = g.sK;
            break;

        case 2: // '\002'
            if (g.sL == null)
            {
                g.sL = hlf.a(g.C(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sL;
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
            if (g.sN == null)
            {
                g.sN = hlf.a(g.E(((Context) (obj))));
            }
            obj = g.sN;
            break;

        case 2: // '\002'
            if (g.sO == null)
            {
                g.sO = hlf.a(g.E(((Context) (obj))), g.F(((Context) (obj))));
            }
            obj = g.sO;
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
        if (g != null && g.x() == 1)
        {
            k1 = ((Bitmap)g.z()).getWidth();
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
