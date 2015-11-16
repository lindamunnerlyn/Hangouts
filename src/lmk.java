// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.ExtendedResponseInfo;
import org.chromium.net.ResponseInfo;

public final class lmk
    implements ExtendedResponseInfo
{

    private final ResponseInfo a;
    private final long b;

    public lmk(ResponseInfo responseinfo, long l)
    {
        a = responseinfo;
        b = l;
    }
}
