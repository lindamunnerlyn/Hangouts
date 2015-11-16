// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.NetworkChangeNotifier;

public final class lmv
    implements org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
{

    final NetworkChangeNotifier a;

    public lmv(NetworkChangeNotifier networkchangenotifier)
    {
        a = networkchangenotifier;
        super();
    }

    public void a(double d)
    {
        a.a(d);
    }

    public void a(int i)
    {
        a.b(i);
    }
}
