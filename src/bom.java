// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.os.Bundle;

final class bom
    implements bvs
{

    final bol a;

    bom(bol bol)
    {
        a = bol;
        super();
    }

    public void a(Activity activity, Bundle bundle)
    {
        bpd bpd1 = bnd.a().t();
        if (bpd1 != null)
        {
            bpd1.a(bundle);
            gcg gcg1 = bpd1.r();
            if (gcg1 != null)
            {
                gcg1.a(bundle);
            }
            activity = dbf.e(((gmo)hgx.a(activity, gmo)).a());
            if (activity != null && g.d(activity))
            {
                bpd1.f("Triggering log upload for troubleshooting.");
            }
        }
    }
}
