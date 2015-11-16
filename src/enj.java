// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class enj extends enb
{

    final ena e;

    public enj(ena ena1, int i, Bundle bundle)
    {
        e = ena1;
        super(ena1, i, bundle);
    }

    protected void a(ConnectionResult connectionresult)
    {
        ena.a(e).b(connectionresult);
        e.g();
    }

    protected boolean a()
    {
        ena.a(e).b(ConnectionResult.a);
        return true;
    }
}
