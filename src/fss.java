// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class fss extends frw
{

    private final eor a;

    public fss(eor eor1)
    {
        a = eor1;
    }

    public void a()
    {
        a.a();
    }

    public void a(int i, Bundle bundle, Bundle bundle1)
    {
        if (g.m(3))
        {
            (new StringBuilder("Bundle callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nbundle=").append(bundle1);
            g.m(3);
        }
        if (i != 0)
        {
            g.m(5);
            return;
        } else
        {
            a.a(new eot(bundle1.getString("account"), bundle1.getString("pagegaiaid"), bundle1.getInt("scope")));
            return;
        }
    }
}
