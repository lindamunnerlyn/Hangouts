// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class hhs
    implements android.os.Handler.Callback
{

    final hhr a;

    hhs(hhr hhr1)
    {
        a = hhr1;
        super();
    }

    public boolean handleMessage(Message message)
    {
        return a.a(message);
    }
}
