// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            ExtendedResponseInfo, ResponseInfo

final class b
    implements ExtendedResponseInfo
{

    private final ResponseInfo a;
    private final long b;

    public ResponseInfo a()
    {
        return a;
    }

    (ResponseInfo responseinfo, long l)
    {
        a = responseinfo;
        b = l;
    }
}
