// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class dpq
    implements hfe
{

    final dpv a;
    final Map b;
    final dpo c;

    dpq(dpo dpo1, dpv dpv1, Map map)
    {
        c = dpo1;
        a = dpv1;
        b = map;
        super();
    }

    public boolean a(hfa hfa, Object obj)
    {
        hfa = (String)obj;
        if (!a.h().equals(hfa))
        {
            a.a(hfa);
            a.b((CharSequence)b.get(hfa));
            dpo.b(c).a(hfa);
        }
        return true;
    }
}
