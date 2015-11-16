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
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public final class ehb extends eha
{

    private static Rect f = new Rect();
    private static Rect g = new Rect();
    private final SparseIntArray a;
    private final ecr b;
    private final SparseArray c;
    private Drawable d;
    private final android.graphics.Paint.FontMetrics e;

    protected ehb(Context context)
    {
        Field afield[];
        int i;
        int i1;
        e = new android.graphics.Paint.FontMetrics();
        a = new SparseIntArray();
        afield = com/google/android/apps/hangouts/R$drawable.getFields();
        i1 = afield.length;
        i = 0;
_L5:
        Field field;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        field = afield[i];
        if (!field.getName().startsWith("emoji_u")) goto _L2; else goto _L1
_L1:
        int j = -1;
        int k = Integer.parseInt(field.getName().substring(7), 16);
        j = k;
_L3:
        NumberFormatException numberformatexception;
        if (j >= 0)
        {
            try
            {
                int l = g.a((Integer)field.get(null), 0);
                a.put(j, l);
            }
            catch (IllegalArgumentException illegalargumentexception) { }
            catch (IllegalAccessException illegalaccessexception) { }
        }
_L2:
        i++;
        continue; /* Loop/switch isn't completed */
        numberformatexception;
        String s = String.valueOf(field.getName());
        if (s.length() != 0)
        {
            s = "Unable to parse resource: ".concat(s);
        } else
        {
            s = new String("Unable to parse resource: ");
        }
        eev.f("Babel", s);
          goto _L3
        b = edj.a(context.getApplicationContext());
        c = new SparseArray();
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
        return;
        if (true) goto _L5; else goto _L4
_L4:
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
        ehd ehd1;
        Object obj;
        ehe aehe[];
        int i;
        int i1;
        int j1;
        if (spannable != null)
        {
            aehe = (ehe[])spannable.getSpans(0, spannable.length(), ehe);
            Arrays.sort(aehe, new ehf(spannable));
            i1 = aehe.length;
        } else
        {
            aehe = null;
            i1 = 0;
        }
        j1 = 0;
        i = 0;
        obj = spannable;
        ehd1 = null;
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
                    if (j < i1 && spannable.getSpanStart(aehe[j]) == j1)
                    {
                        Object obj2;
                        if (!aehe[j].getSource().equals(Integer.toString(k2, 16)))
                        {
                            spannable.removeSpan(aehe[j]);
                            l = ((flag) ? 1 : 0);
                        } else
                        {
                            l = 0;
                        }
                        j++;
                    }
                    if (i > g.a(g.nU, "babel_emoji_max_per_message", 256))
                    {
                        l = 0;
                    }
                    if (l != 0)
                    {
                        if (ehd1 == null)
                        {
                            ehd1 = new ehd(view);
                        }
                        if (d == null || d.getMinimumHeight() != j2)
                        {
                            d = new ColorDrawable(0);
                            l = g.nU.getResources().getDimensionPixelOffset(g.ej);
                            d.setBounds(0, 0, l * 2 + j2, j2);
                        }
                        obj2 = new ehe(this, d, Integer.toString(k2, 16), j2, j2);
                        ((Spannable) (obj1)).setSpan(obj2, j1, j1 + k1, 33);
                        ehd1.a(k2, ((ehe) (obj2)));
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
                obj2 = ehd1;
                if (ehd1 == null)
                {
                    break label0;
                }
                if (ehd1.b.size() < 20)
                {
                    obj2 = ehd1;
                    if (j1 + k1 < i2)
                    {
                        break label0;
                    }
                }
                (new ehc(this, ehd1)).execute(new Void[0]);
                obj2 = null;
            }
            j1 += k1;
            ehd1 = ((ehd) (obj2));
        }
        return ((SpannableString) (obj1));
    }

    static ecr a(ehb ehb1)
    {
        return ehb1.b;
    }

    static void a(ehb ehb1, ehd ehd1, android.graphics.BitmapFactory.Options options)
    {
        int j = ehd1.a.size();
        for (int i = 0; i < j; i++)
        {
            ehe ehe1 = (ehe)ehd1.b.get(i);
            android.graphics.Bitmap bitmap = ehb1.b.a(g.a((Integer)ehd1.a.get(i), 0), options, ehe1.a, ehe1.b);
            if (bitmap != null)
            {
                ehe1.a(bitmap);
            }
        }

    }

    static android.graphics.Paint.FontMetrics b(ehb ehb1)
    {
        return ehb1.e;
    }

    static Rect b()
    {
        return g;
    }

    public int a(int i)
    {
        return a.get(i, -1);
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
            spanned = (ehe[])spanned.getSpans(0, spanned.length(), ehe);
            for (int j = spanned.length; i < j; i++)
            {
                spanned[i].a();
            }

        }
    }

}
