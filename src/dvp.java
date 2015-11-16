// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.TextView;
import com.google.android.libraries.quantum.snackbar.Snackbar;

public final class dvp
    implements Runnable
{

    private final Snackbar a;
    private final dvg b;
    private final dvg c;
    private boolean d;
    private int e;

    public dvp(Snackbar snackbar, dvg dvg1, dvg dvg2)
    {
        d = true;
        e = -1;
        a = snackbar;
        b = dvg1;
        c = dvg2;
        if (TextUtils.isEmpty(dvg1.b()))
        {
            e = 0;
            d = false;
            return;
        } else
        {
            e = dvg1.b().length() - 1;
            d = true;
            return;
        }
    }

    private CharSequence a(String s, String s1)
    {
        return g.a(s, s1, (TextView)a.findViewById(h.dy));
    }

    public void run()
    {
        if (d)
        {
            if (e <= 0)
            {
                d = false;
                a.a(a(b.a(), ""));
            } else
            {
                String s = b.b();
                int i = s.codePointAt(e);
                e = e - Character.charCount(i);
                s = s.substring(0, e);
                a.a(a(b.a(), s));
            }
            g.a(this, 10L);
            return;
        }
        if (TextUtils.isEmpty(c.b()))
        {
            a.a(c.a());
            return;
        }
        if (e >= c.b().length())
        {
            a.a(a(c.a(), c.b()));
            return;
        } else
        {
            String s1 = c.b();
            int j = s1.codePointAt(e);
            int k = e;
            e = Character.charCount(j) + k;
            s1 = s1.substring(0, e);
            a.a(a(c.a(), s1));
            g.a(this, 10L);
            return;
        }
    }
}
