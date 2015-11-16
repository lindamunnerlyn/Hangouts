// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

final class awn extends gbk
{

    int a;
    final ave b;
    private final gz c;
    private final ani e;
    private final String f;

    awn(ave ave1)
    {
        b = ave1;
        super();
        a = 0;
        c = new gz(ave.B(b));
        e = ave.h(b);
        f = ave.N(b);
    }

    protected Object a()
    {
        aoe aoe1 = new aoe(ave.aN(b), e.h());
        Iterator iterator = c.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s = (String)entry.getKey();
            aoh aoh1 = aoe1.f(s);
            if (aoh1 != null)
            {
                String s1 = aoe1.a(aoh1);
                ebw.g("Babel", String.format(Locale.US, "possibly invalid merge detected: %s ==> %s (computed merge key %s)", new Object[] {
                    entry.getKey(), entry.getValue(), s1
                }));
                if (!aoe.a(s) && g.f(aoh1.c) && !TextUtils.equals(s1, f))
                {
                    a = a + 1;
                }
            }
        } while (true);
        int i = a;
        ebw.g("Babel", (new StringBuilder(55)).append("counted ").append(i).append(" non-GV, server-based, conversations").toString());
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
