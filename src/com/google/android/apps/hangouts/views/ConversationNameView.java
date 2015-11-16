// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import g;
import gf;
import java.util.Locale;

public class ConversationNameView extends View
{

    private final Paint a;
    private String b;
    private String c[];
    private final int d;
    private final int e;
    private boolean f;
    private boolean g;

    public ConversationNameView(Context context)
    {
        this(context, null);
    }

    public ConversationNameView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Paint();
        b = "";
        c = new String[0];
        context = context.obtainStyledAttributes(attributeset, new int[] {
            g.cX, g.cW, g.cY, g.cU
        });
        d = context.getDimensionPixelSize(0, 36);
        e = context.getDimensionPixelSize(1, 28);
        a.setTextSize(d);
        a.setColor(context.getColor(2, 0xff000000));
        a.setFlags(a.getFlags() | 1);
        f = context.getBoolean(3, false);
        context.recycle();
    }

    private static int a(Paint paint, String as[], int i)
    {
        float f1 = paint.measureText(", ");
        int k = 0;
        int j = 0;
        for (; k < as.length; k++)
        {
            int l = (int)((float)j + paint.measureText(as[k]));
            j = l;
            if (k < as.length - 1)
            {
                j = (int)((float)l + f1);
            }
            if (j > i)
            {
                return 0;
            }
        }

        return j;
    }

    public static String b(String s)
    {
        String s1 = String.valueOf("T");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public void a(int i)
    {
        boolean flag = false;
        if (i > 0)
        {
            Object obj = Typeface.defaultFromStyle(i);
            a.setTypeface(((Typeface) (obj)));
            float f1;
            int j;
            if (obj != null)
            {
                j = ((Typeface) (obj)).getStyle();
            } else
            {
                j = 0;
            }
            i = ~j & i;
            obj = a;
            if ((i & 1) != 0)
            {
                flag = true;
            }
            ((Paint) (obj)).setFakeBoldText(flag);
            obj = a;
            if ((i & 2) != 0)
            {
                f1 = -0.25F;
            } else
            {
                f1 = 0.0F;
            }
            ((Paint) (obj)).setTextSkewX(f1);
            return;
        } else
        {
            a.setFakeBoldText(false);
            a.setTextSkewX(0.0F);
            a.setTypeface(null);
            return;
        }
    }

    public void a(String s)
    {
        if (!s.startsWith("L") && !s.startsWith("T"))
        {
            throw new IllegalArgumentException("the parameter to setText must be the output of ConversationNameView.title() or ConversationNameView.nameList()");
        }
        if (TextUtils.equals(b, s))
        {
            return;
        }
        b = s;
        String s1 = s.substring(1);
        setContentDescription(s1);
        if (s.startsWith("T"))
        {
            c = (new String[] {
                s1
            });
        } else
        {
            c = s1.split(", ");
        }
        requestLayout();
    }

    public void b(int i)
    {
        a.setColor(i);
    }

    public int getBaseline()
    {
        float f1 = getMeasuredHeight();
        float f2 = a.getTextSize();
        float f3 = a.descent();
        return (int)(f1 / 2.0F + (f2 - f3) / 2.0F);
    }

    public CharSequence getContentDescription()
    {
        return g.a(c, 3);
    }

    protected void onDraw(Canvas canvas)
    {
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        float f8;
        float f9;
        String s2;
        int i;
        int k;
        int l;
        int j1;
        boolean flag3;
        flag3 = gf.a().a(b);
        l = getMeasuredHeight();
        j1 = getMeasuredWidth();
        float f6;
        float f7;
        boolean flag;
        if (g)
        {
            f1 = e;
        } else
        {
            f1 = d;
        }
        a.setTextSize(f1);
        flag = false;
        i = ((flag) ? 1 : 0);
        if (!f) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
        if (c.length <= 1) goto _L2; else goto _L3
_L3:
        boolean flag1;
        if (a(a, c, j1) == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = ((flag1) ? 1 : 0);
        if (!flag1) goto _L2; else goto _L4
_L4:
        a.setTextSize(e);
        i = ((flag1) ? 1 : 0);
        if (a(a, c, j1) == 0) goto _L2; else goto _L5
_L5:
        k = 0;
_L16:
        String s;
        if (flag3)
        {
            s = " ,";
        } else
        {
            s = ", ";
        }
        f1 = a.getTextSize() - a.descent();
        f7 = a.measureText(" and 99 others");
        f5 = a.measureText(s);
        f8 = a.getFontSpacing();
        f2 = 0.0F;
        if (k != 0)
        {
            f1 = ((float)l - f1 - f8) / 2.0F + f1;
        } else
        {
            f1 = (float)(l / 2) + f1 / 2.0F;
        }
        l = 1;
        f3 = f1;
        i = 0;
        f1 = f2;
_L10:
        if (i >= c.length) goto _L7; else goto _L6
_L6:
label0:
        {
            boolean flag2;
            if (i == c.length - 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            s2 = c[i];
            f9 = a.measureText(s2);
            if (flag2)
            {
                f4 = 0.0F;
            } else
            {
                f4 = f5;
            }
            f6 = j1;
            f2 = f6;
            if (flag2)
            {
                break label0;
            }
            if (k != 0)
            {
                f2 = f6;
                if (l != 0)
                {
                    break label0;
                }
            }
            f2 = f6 - f7;
        }
        if (f1 + f9 + f4 <= f2)
        {
            break MISSING_BLOCK_LABEL_713;
        }
        if (f1 != 0.0F) goto _L9; else goto _L8
_L8:
        f4 = f2;
        if (i < c.length)
        {
            f4 = f2 - f5;
        }
        Paint paint = a;
        if (paint.measureText(s2) > f4)
        {
            f2 = (int)paint.measureText("\u2026");
            int j = s2.length();
            int i1;
            do
            {
                i1 = j;
                if (j <= 0)
                {
                    break;
                }
                i1 = j - Character.charCount(Character.codePointBefore(s2, j));
                j = i1;
            } while (paint.measureText(s2, 0, i1) > f4 - f2);
            s2 = String.format(Locale.getDefault(), "%s%s", new Object[] {
                s2.substring(0, i1), "\u2026"
            });
        }
        if (flag3)
        {
            f2 = (float)j1 - (f9 + f1);
        } else
        {
            f2 = f1;
        }
        canvas.drawText(s2, f2, f3, a);
        f1 = a.measureText(s2) + f1;
_L14:
        if (!flag2)
        {
            String s1;
            if (flag3)
            {
                f2 = (float)j1 - (f1 + f5);
            } else
            {
                f2 = f1;
            }
            canvas.drawText(s, f2, f3, a);
            f1 += f5;
        }
_L11:
        i++;
          goto _L10
_L9:
label1:
        {
            if (l == 0 || k == 0)
            {
                break label1;
            }
            l = 0;
            f1 = 0.0F;
            f3 += f8;
            i--;
        }
          goto _L11
        i = c.length - i;
        s1 = getResources().getQuantityString(g.hy, i, new Object[] {
            Integer.valueOf(i)
        });
        if (!flag3) goto _L13; else goto _L12
_L12:
        f2 = a.measureText(s1);
        canvas.drawText(s1, (float)j1 - (f2 + f1), f3, a);
_L7:
        return;
_L13:
        canvas.drawText(s1, f1, f3, a);
        return;
        if (flag3)
        {
            f2 = (float)j1 - (f1 + f9);
        } else
        {
            f2 = f1;
        }
        canvas.drawText(s2, f2, f3, a);
        f1 += f9;
          goto _L14
_L2:
        k = i;
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        j = getMeasuredWidth();
        if (android.view.View.MeasureSpec.getMode(i) != 0x80000000) goto _L2; else goto _L1
_L1:
        i = a(a, c, android.view.View.MeasureSpec.getSize(i));
        if (i <= 0) goto _L2; else goto _L3
_L3:
        if (!f)
        {
            setMeasuredDimension(i, (int)Math.ceil(a.getFontSpacing()));
        }
        return;
_L2:
        i = j;
        if (true) goto _L3; else goto _L4
_L4:
    }
}
