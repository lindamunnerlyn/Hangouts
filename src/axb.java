// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

final class axb extends gdy
{

    int a;
    final avv b;
    private final gz c;
    private final aoa e;
    private final String f;

    axb(avv avv1)
    {
        b = avv1;
        super();
        a = 0;
        c = new gz(avv.A(b));
        e = avv.h(b);
        f = avv.N(b);
    }

    protected Object a()
    {
        aow aow1 = new aow(avv.aL(b), e.h());
        Iterator iterator = c.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s = (String)entry.getKey();
            aoz aoz1 = aow1.f(s);
            if (aoz1 != null)
            {
                String s1 = aow1.a(aoz1);
                eev.g("Babel", String.format(Locale.US, "possibly invalid merge detected: %s ==> %s (computed merge key %s)", new Object[] {
                    entry.getKey(), entry.getValue(), s1
                }));
                if (!aow.a(s) && g.f(aoz1.c) && !TextUtils.equals(s1, f))
                {
                    a = a + 1;
                }
            }
        } while (true);
        int i = a;
        eev.g("Babel", (new StringBuilder(55)).append("counted ").append(i).append(" non-GV, server-based, conversations").toString());
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        if (a > 1)
        {
            throw new IllegalStateException("merged more than one hangouts conversation");
        } else
        {
            return;
        }
    }
}
