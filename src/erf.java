// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public final class erf
{

    private final List a = new ArrayList();
    private final Object b;

    public erf(Object obj)
    {
        b = g.d(obj);
    }

    public erf a(String s, Object obj)
    {
        a.add((new StringBuilder()).append((String)g.d(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(b.getClass().getSimpleName()).append('{');
        int j = a.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)a.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }
}
