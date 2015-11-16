// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;

final class amu extends eam
{

    final List a;
    private final String e;

    public amu(List list, String s, String s1, int i)
    {
        super(null, s);
        a(i);
        a(false);
        c(false);
        b();
        d(true);
        a = list;
        e = s1;
    }

    public void a()
    {
        StringBuilder stringbuilder = a(d(), e(), f(), true, false);
        b = null;
        StringBuilder stringbuilder1 = new StringBuilder();
        if (!TextUtils.isEmpty(e))
        {
            stringbuilder1.append(e).append("|");
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); stringbuilder1.append("|"))
        {
            stringbuilder1.append((String)iterator.next());
        }

        c = stringbuilder1.append(stringbuilder).toString();
    }
}
