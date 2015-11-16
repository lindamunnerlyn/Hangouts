// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            RequestStatus, StatusListener, CronetUrlRequest

class b
    implements Runnable
{

    final StatusListener a;
    final int b;
    final CronetUrlRequest c;

    public void run()
    {
        RequestStatus.a(b);
    }

    (CronetUrlRequest croneturlrequest, StatusListener statuslistener, int i)
    {
        c = croneturlrequest;
        a = statuslistener;
        b = i;
        super();
    }
}
