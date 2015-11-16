// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public class hkq
    implements hnk, hoy
{

    public pu b;
    public hjy c;

    public hkq(pu pu1, hof hof1)
    {
        this(pu1, hof1, (byte)0);
    }

    private hkq(pu pu1, hof hof1, byte byte0)
    {
        b = pu1;
        c = null;
        hof1.a(this);
    }

    public Bundle a(Intent intent)
    {
        return null;
    }

    public hjy a()
    {
        return c;
    }

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            bundle = a();
            if (bundle == null)
            {
                throw new IllegalStateException("A PreferenceFragment must be provided!");
            }
            Bundle bundle1 = a(b.getIntent());
            if (bundle1 != null)
            {
                bundle.setArguments(bundle1);
            }
            b.u_().a().a(o.h, bundle).b();
        }
    }
}
