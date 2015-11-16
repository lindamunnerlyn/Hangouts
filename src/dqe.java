// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class dqe extends hjf
    implements hkm
{

    private final hkl e;

    public dqe()
    {
        e = new hkl(this, c);
    }

    public void a()
    {
        e.a(new dqn());
        e.a(new drh());
        e.a(new drd());
        dbo dbo1 = (dbo)b.b(dbo);
        if (dbo1 != null)
        {
            e.a(dbo1.a());
        }
        e.a(new dri());
        e.a(new dqf());
        e.a(new drb());
    }

    protected void a(Bundle bundle)
    {
        super.a(bundle);
        b.a(hkp, e);
    }
}
