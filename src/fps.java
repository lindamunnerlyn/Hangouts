// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

final class fps extends fpa
{

    private final ekm a;

    public fps(ekm ekm1)
    {
        a = ekm1;
    }

    public void a(int i, Bundle bundle, DataHolder dataholder)
    {
        if (g.m(3))
        {
            (new StringBuilder("People callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder);
            g.m(3);
        }
        bundle = fpo.a(i, bundle);
        dataholder = fpo.a(dataholder);
        a.a(new fpv(bundle, dataholder));
    }
}
