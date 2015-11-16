// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;

public final class edz extends edy
{

    private static Rect f = new Rect();
    private static Rect g = new Rect();
    private final dzn b;
    private final SparseArray c = new SparseArray();
    private Drawable d;
    private final android.graphics.Paint.FontMetrics e = new android.graphics.Paint.FontMetrics();

    protected edz(Context context)
    {
        b = eaf.a(context.getApplicationContext());
        c.put(0x1f1ef, new Pair(Integer.valueOf(0x1f1f5), Integer.valueOf(0xfe4e5)));
        c.put(0x1f1fa, new Pair(Integer.valueOf(0x1f1f8), Integer.valueOf(0xfe4e6)));
        c.put(0x1f1eb, new Pair(Integer.valueOf(0x1f1f7), Integer.valueOf(0xfe4e7)));
        c.put(0x1f1e9, new Pair(Integer.valueOf(0x1f1ea), Integer.valueOf(0xfe4e8)));
        c.put(0x1f1ee, new Pair(Integer.valueOf(0x1f1f9), Integer.valueOf(0xfe4e9)));
        c.put(0x1f1ec, new Pair(Integer.valueOf(0x1f1e7), Integer.valueOf(0xfe4ea)));
        c.put(0x1f1ea, new Pair(Integer.valueOf(0x1f1f8), Integer.valueOf(0xfe4eb)));
        c.put(0x1f1f7, new Pair(Integer.valueOf(0x1f1fa), Integer.valueOf(0xfe4ec)));
        c.put(0x1f1e8, new Pair(Integer.valueOf(0x1f1f3), Integer.valueOf(0xfe4ed)));
        c.put(0x1f1f0, new Pair(Integer.valueOf(0x1f1f7), Integer.valueOf(0xfe4ee)));
        c.put(49, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe82e)));
        c.put(50, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe82f)));
        c.put(51, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe830)));
        c.put(52, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe831)));
        c.put(53, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe832)));
        c.put(54, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe833)));
        c.put(55, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe834)));
        c.put(56, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe835)));
        c.put(57, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe836)));
        c.put(48, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe837)));
        c.put(35, new Pair(Integer.valueOf(8419), Integer.valueOf(0xfe82c)));
    }

    static Rect a()
    {
        return f;
    }

    private SpannableString a(CharSequence charsequence, Spannable spannable, float f1, View view)
    {
        Object obj1 = null;
        int i2 = charsequence.length();
        int j2 = (int)f1;
        int j = 0;
        eeb eeb1;
        Object obj;
        eec aeec[];
        int i;
        int i1;
        int j1;
        if (spannable != null)
        {
            aeec = (eec[])spannable.getSpans(0, spannable.length(), eec);
            Arrays.sort(aeec, new eed(spannable));
            i1 = aeec.length;
        } else
        {
            aeec = null;
            i1 = 0;
        }
        j1 = 0;
        i = 0;
        obj = spannable;
        eeb1 = null;
        while (j1 < i2) 
        {
label0:
            {
                int k = Character.codePointAt(charsequence, j1);
                int k1 = Character.charCount(k);
                Pair pair = (Pair)c.get(k);
                if (pair != null && j1 + k1 < charsequence.length())
                {
                    int l1 = Character.codePointAt(charsequence, j1 + k1);
                    if (l1 == g.a((Integer)pair.first, 0))
                    {
                        k = g.a((Integer)pair.second, 0);
                        k1 = Character.charCount(l1) + k1;
                    }
                }
                int k2 = a(k);
                if (k2 >= 0)
                {
                    int l;
                    boolean flag;
                    if (obj == null)
                    {
                        obj = new SpannableString(charsequence);
                        obj1 = obj;
                    } else
                    {
                        Object obj4 = obj1;
                        obj1 = obj;
                        obj = obj4;
                    }
                    l = 1;
                    flag = true;
                    if (j < i1 && spannable.getSpanStart(aeec[j]) == j1)
                    {
                        Object obj2;
                        if (!aeec[j].getSource().equals(Integer.toString(k2, 16)))
                        {
                            spannable.removeSpan(aeec[j]);
                            l = ((flag) ? 1 : 0);
                        } else
                        {
                            l = 0;
                        }
                        j++;
                    }
                    if (i > g.a(g.nS, "babel_emoji_max_per_message", 256))
                    {
                        l = 0;
                    }
                    if (l != 0)
                    {
                        if (eeb1 == null)
                        {
                            eeb1 = new eeb(view);
                        }
                        if (d == null || d.getMinimumHeight() != j2)
                        {
                            d = new ColorDrawable(0);
                            l = g.nS.getResources().getDimensionPixelOffset(g.el);
                            d.setBounds(0, 0, l * 2 + j2, j2);
                        }
                        obj2 = new eec(this, d, Integer.toString(k2, 16), j2, j2);
                        ((Spannable) (obj1)).setSpan(obj2, j1, j1 + k1, 33);
                        eeb1.a(k2, ((eec) (obj2)));
                        i++;
                        obj2 = obj1;
                        obj1 = obj;
                        obj = obj2;
                    } else
                    {
                        Object obj3 = obj;
                        obj = obj1;
                        obj1 = obj3;
                    }
                }
                obj2 = eeb1;
                if (eeb1 == null)
                {
                    break label0;
                }
                if (eeb1.b.size() < 20)
                {
                    obj2 = eeb1;
                    if (j1 + k1 < i2)
                    {
                        break label0;
                    }
                }
                (new eea(this, eeb1)).execute(new Void[0]);
                obj2 = null;
            }
            j1 += k1;
            eeb1 = ((eeb) (obj2));
        }
        return ((SpannableString) (obj1));
    }

    static dzn a(edz edz1)
    {
        return edz1.b;
    }

    static void a(edz edz1, eeb eeb1, android.graphics.BitmapFactory.Options options)
    {
        int j = eeb1.a.size();
        for (int i = 0; i < j; i++)
        {
            eec eec1 = (eec)eeb1.b.get(i);
            android.graphics.Bitmap bitmap = edz1.b.a(g.a((Integer)eeb1.a.get(i), 0), options, eec.a(eec1), eec.b(eec1));
            if (bitmap != null)
            {
                eec1.a(bitmap);
            }
        }

    }

    static android.graphics.Paint.FontMetrics b(edz edz1)
    {
        return edz1.e;
    }

    static Rect b()
    {
        return g;
    }

    public SpannableString a(CharSequence charsequence, TextView textview)
    {
        if (charsequence == null || textview == null)
        {
            return null;
        } else
        {
            android.graphics.Paint.FontMetrics fontmetrics = textview.getPaint().getFontMetrics();
            return a(charsequence, null, fontmetrics.descent - fontmetrics.ascent, ((View) (textview)));
        }
    }

    public void a(Spannable spannable, TextView textview)
    {
        if (spannable == null || textview == null)
        {
            return;
        } else
        {
            android.graphics.Paint.FontMetrics fontmetrics = textview.getPaint().getFontMetrics();
            a(((CharSequence) (spannable)), spannable, fontmetrics.descent - fontmetrics.ascent, ((View) (textview)));
            return;
        }
    }

    public void a(Spanned spanned)
    {
        int i = 0;
        if (spanned != null)
        {
            spanned = (eec[])spanned.getSpans(0, spanned.length(), eec);
            for (int j = spanned.length; i < j; i++)
            {
                spanned[i].a();
            }

        }
    }

}
