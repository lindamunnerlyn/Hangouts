// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;

final class bfy
    implements end
{

    final bfw a;

    bfy(bfw bfw)
    {
        a = bfw;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        connectionresult = String.valueOf(connectionresult);
        eev.g("Babel", (new StringBuilder(String.valueOf(connectionresult).length() + 34)).append("People client connection failure: ").append(connectionresult).toString());
    }
}
