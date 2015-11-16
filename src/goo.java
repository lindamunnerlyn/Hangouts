// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public class goo extends gop
{

    private gad a;
    private String b;

    public goo(gad gad1, String s)
    {
        a = gad1;
        b = s;
    }

    protected void a(lgm lgm1)
    {
        if (Log.isLoggable("ClearcutTransmitter", 3))
        {
            lgm1.toString();
        }
        a.a(b, null, 0, kws.toByteArray(lgm1));
    }
}
