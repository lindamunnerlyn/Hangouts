// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class bxg
    implements eey
{

    private static final int a;
    private static final ebo b;
    private long c;
    private final Context d;
    private final TextView e;
    private final TextView f;
    private final ebd g;

    public bxg(Context context, int i, View view)
    {
        d = context;
        e = (TextView)view.findViewById(h.iz);
        f = (TextView)view.findViewById(h.iA);
        g = new bxh(this, (hjm)hgx.b(context).a(hiv), i);
    }

    static int a()
    {
        return a;
    }

    static TextView a(bxg bxg1)
    {
        return bxg1.e;
    }

    static void a(bxg bxg1, long l)
    {
        bxg1.c = l;
        bxg1.c();
    }

    static ebd b(bxg bxg1)
    {
        return bxg1.g;
    }

    static ebo b()
    {
        return b;
    }

    private void c()
    {
        long l = System.currentTimeMillis();
        CharSequence charsequence = g.a(d, c, l, 0x40000);
        if (charsequence != null)
        {
            f.setText(charsequence);
            CharSequence charsequence1 = g.a(d, c, l, 0);
            TextView textview = f;
            if (!TextUtils.isEmpty(charsequence1))
            {
                charsequence = charsequence1;
            }
            textview.setContentDescription(charsequence);
            f.setVisibility(0);
            return;
        } else
        {
            f.setVisibility(8);
            return;
        }
    }

    static void c(bxg bxg1)
    {
        bxg1.c();
    }

    public void a(String s)
    {
        g.a(s);
    }

    static 
    {
        a = csz.f.j;
        b = ebo.a;
    }
}
