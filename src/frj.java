// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class frj
    implements eka, ekc
{

    private final frb a;
    private frk b;
    private boolean c;

    public frj(frb frb)
    {
        a = frb;
        b = null;
        c = true;
    }

    public void a()
    {
        c = true;
    }

    public void a(int i)
    {
        b.a(true);
    }

    public void a(ConnectionResult connectionresult)
    {
        b.a(true);
        if (c && a != null && connectionresult.a())
        {
            connectionresult.d();
        }
        c = false;
    }

    public void a(frk frk1)
    {
        b = frk1;
    }

    public void a_(Bundle bundle)
    {
        b.a(false);
        c = false;
    }
}
