// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class dqz
{

    final Uri a;
    boolean b;
    int c;
    private int d;

    public dqz(Uri uri)
    {
        b = false;
        a = uri;
    }

    public int a()
    {
        c;
        JVM INSTR tableswitch -1 8: default 60
    //                   -1 62
    //                   0 60
    //                   1 60
    //                   2 60
    //                   3 64
    //                   4 66
    //                   5 60
    //                   6 60
    //                   7 60
    //                   8 60;
           goto _L1 _L2 _L1 _L1 _L1 _L3 _L4 _L1 _L1 _L1 _L1
_L1:
        return 2;
_L2:
        return 0;
_L3:
        return 1;
_L4:
        if (d != 404)
        {
            return 1;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void a(int i, int j)
    {
        c = i;
        d = j;
        b = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DownloadResult:");
        stringbuilder.append(" destinationUri=").append(a);
        stringbuilder.append(" resultCode=").append(c);
        stringbuilder.append(" httpStatusCode=").append(d);
        return stringbuilder.toString();
    }
}
