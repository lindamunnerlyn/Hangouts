// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class drg
{

    final Uri a;
    final boolean b;
    boolean c;
    int d;
    byte e[];
    private int f;

    drg(Uri uri, boolean flag)
    {
        c = false;
        a = uri;
        b = flag;
    }

    int a()
    {
        d;
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
        if (f != 404)
        {
            return 1;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    void a(int i, int j, byte abyte0[])
    {
        d = i;
        f = j;
        e = abyte0;
        c = true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MmsSendResult:");
        stringbuilder.append(" pduContentUri=").append(a);
        stringbuilder.append(" resultCode=").append(d);
        stringbuilder.append(" httpStatusCode=").append(f);
        return stringbuilder.toString();
    }
}
