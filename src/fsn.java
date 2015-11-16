// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;

final class fsn extends frw
{

    private final enn a;

    public fsn(enn enn1)
    {
        a = enn1;
    }

    public void a(int i, Bundle bundle, DataHolder dataholder)
    {
        if (g.m(3))
        {
            (new StringBuilder("People callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholder=").append(dataholder);
            g.m(3);
        }
        bundle = fsj.a(i, bundle);
        dataholder = fsj.a(dataholder);
        a.a(new fsq(bundle, dataholder));
    }
}
