// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUrlRequest;

public final class lmj
    implements Runnable
{

    final org.chromium.net.UrlRequest.StatusListener a;
    final int b;
    final CronetUrlRequest c;

    public lmj(CronetUrlRequest croneturlrequest, org.chromium.net.UrlRequest.StatusListener statuslistener, int i)
    {
        c = croneturlrequest;
        a = statuslistener;
        b = i;
        super();
    }

    public void run()
    {
        switch (b)
        {
        case 5: // '\005'
        default:
            throw new IllegalArgumentException("No request status found.");

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            return;
        }
    }
}
