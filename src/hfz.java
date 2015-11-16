// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;

public class hfz
    implements fsn, his
{

    public ps b;
    public hfh c;

    public hfz(ps ps1, hjm hjm1)
    {
        this(ps1, hjm1, (byte)0);
    }

    private hfz(ps ps1, hjm hjm1, byte byte0)
    {
        b = ps1;
        c = null;
        hjm1.a(this);
    }

    public Bundle a(Intent intent)
    {
        return null;
    }

    public hfh a()
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
            b.t_().a().a(g.tr, bundle).b();
        }
    }
}
