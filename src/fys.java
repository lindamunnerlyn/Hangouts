// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class fys
    implements fyb
{

    private final ConnectionResult a;

    public fys(ConnectionResult connectionresult)
    {
        if (connectionresult == null)
        {
            throw new IllegalArgumentException("null connectionResult");
        } else
        {
            a = connectionresult;
            return;
        }
    }

    public String toString()
    {
        return a.toString();
    }
}
