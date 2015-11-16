// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;

final class eat
{

    int a;
    Uri b;
    boolean c;
    int d;
    float e;
    long f;
    boolean g;

    eat()
    {
    }

    public String toString()
    {
        int i = a;
        boolean flag = c;
        int j = d;
        String s = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 58)).append("{ code=").append(i).append(" looping=").append(flag).append(" stream=").append(j).append(" uri=").append(s).append(" }").toString();
    }
}
