// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

public final class byc
    implements eia
{

    private static final int a;
    private static final eem b;
    private long c;
    private final Context d;
    private final TextView e;
    private final TextView f;
    private final csw g;

    public byc(Context context, int i, View view)
    {
        d = context;
        e = (TextView)view.findViewById(h.iv);
        f = (TextView)view.findViewById(h.iw);
        g = new byd(this, context, (hof)hlp.b(context).a(hnn), i);
    }

    static int a()
    {
        return a;
    }

    static TextView a(byc byc1)
    {
        return byc1.e;
    }

    static void a(byc byc1, long l)
    {
        byc1.c = l;
        byc1.c();
    }

    static csw b(byc byc1)
    {
        return byc1.g;
    }

    static eem b()
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

    static void c(byc byc1)
    {
        byc1.c();
    }

    public void a(String s)
    {
        g.a(s);
    }

    static 
    {
        a = cvc.f.j;
        b = eem.a;
    }
}
