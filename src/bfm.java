// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class bfm
    implements ekc
{

    final bfk a;

    bfm(bfk bfk)
    {
        a = bfk;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        connectionresult = String.valueOf(connectionresult);
        ebw.g("Babel", (new StringBuilder(String.valueOf(connectionresult).length() + 34)).append("People client connection failure: ").append(connectionresult).toString());
    }
}
