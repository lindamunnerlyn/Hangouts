// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class dsj
    implements hjv
{

    final dso a;
    final Map b;
    final dsh c;

    dsj(dsh dsh1, dso dso1, Map map)
    {
        c = dsh1;
        a = dso1;
        b = map;
        super();
    }

    public boolean a(hjr hjr, Object obj)
    {
        hjr = (String)obj;
        if (!a.h().equals(hjr))
        {
            a.a(hjr);
            a.b((CharSequence)b.get(hjr));
            dsh.b(c).a(hjr);
        }
        return true;
    }
}
