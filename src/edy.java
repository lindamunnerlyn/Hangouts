// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.SparseIntArray;
import android.widget.TextView;
import java.lang.reflect.Field;

public class edy
{

    private static edy b = null;
    public final SparseIntArray a;

    protected edy()
    {
        Field afield[];
        int i;
        int i1;
        a = new SparseIntArray();
        afield = com/google/android/apps/hangouts/R$drawable.getFields();
        i1 = afield.length;
        i = 0;
_L5:
        Field field;
        if (i >= i1)
        {
            break MISSING_BLOCK_LABEL_159;
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
        ebw.f("Babel", s);
          goto _L3
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static edy a(Context context)
    {
        if (b == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                b = new edy();
            } else
            {
                b = new edz(context.getApplicationContext());
            }
        }
        return b;
    }

    public int a(int i)
    {
        return a.get(i, -1);
    }

    public SpannableString a(CharSequence charsequence, TextView textview)
    {
        return null;
    }

    public void a(Spannable spannable, TextView textview)
    {
    }

    public void a(Spanned spanned)
    {
    }

}
