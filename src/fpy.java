// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

final class fpy extends fpa
{

    private final ekm a;

    public fpy(ekm ekm1)
    {
        a = ekm1;
    }

    public void a(int i, Bundle bundle, DataHolder dataholder)
    {
        if (g.m(3))
        {
            (new StringBuilder("Circles callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder);
            g.m(3);
        }
        com.google.android.gms.common.api.Status status = fpo.a(i, bundle);
        if (dataholder == null)
        {
            bundle = null;
        } else
        {
            bundle = new fqr(dataholder);
        }
        a.a(new fpw(status, bundle));
    }
}
