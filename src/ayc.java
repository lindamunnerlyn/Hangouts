// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ayc
{

    String a;
    int b;
    long c;
    boolean d;
    int e;
    String f;
    public long g;
    public long h;

    ayc()
    {
        e = -1;
    }

    public void a(aoa aoa)
    {
        e = RealTimeChatService.l(aoa, a);
    }

    public String toString()
    {
        String s = a;
        int i = b;
        String s1 = f;
        boolean flag = d;
        long l = c;
        return (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(s1).length())).append(s).append("/").append(i).append("/").append(s1).append("/").append(flag).append("/").append(l).toString();
    }
}
