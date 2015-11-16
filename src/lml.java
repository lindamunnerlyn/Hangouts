// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.ResponseInfo;

public final class lml
    implements ResponseInfo
{

    public final org.chromium.net.CronetUrlRequest.HeadersList a = new org.chromium.net.CronetUrlRequest.HeadersList();
    private final String b[];
    private final int c;
    private final String d;
    private final boolean e;
    private final String f;
    private final String g;

    public lml(String as[], int i, String s, boolean flag, String s1, String s2)
    {
        b = as;
        c = i;
        d = s;
        e = flag;
        f = s1;
        g = s2;
    }
}
