// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.ChromiumUrlRequestContext;

public final class lmb
    implements Runnable
{

    final ChromiumUrlRequestContext a;

    public lmb(ChromiumUrlRequestContext chromiumurlrequestcontext)
    {
        a = chromiumurlrequestcontext;
        super();
    }

    public void run()
    {
        ChromiumUrlRequestContext.a(a, a.a);
    }
}
