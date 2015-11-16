// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class ghz extends gdp
{

    final ghy a;

    ghz(ghy ghy1)
    {
        a = ghy1;
        super();
    }

    private void a(jiz jiz1)
    {
        ghu ghu1;
        if (jiz1.d.intValue() == 2)
        {
            if ((ghu1 = (ghu)a.a.get(jiz1.b)) != null)
            {
                ghu1.a(jiz1);
                return;
            }
        }
    }

    public volatile void a(kws kws)
    {
        a((jiz)kws);
    }

    public void a(kws kws, kws kws1)
    {
        a((jiz)kws1);
    }
}
