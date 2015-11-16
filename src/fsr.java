// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import java.util.Arrays;

final class fsr extends frw
{

    private final frn a;

    public fsr(frn frn1)
    {
        a = frn1;
    }

    public void a(int i, Bundle bundle, DataHolder adataholder[])
    {
        if (g.m(3))
        {
            (new StringBuilder("People callback: status=")).append(i).append("\nresolution=").append(bundle).append("\nholders=").append(Arrays.toString(adataholder));
            g.m(3);
        }
        bundle = fsj.b(i, bundle);
        a.a(bundle, adataholder);
    }
}
