// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.wearable.WearableService;

public final class ehj
    implements Runnable
{

    final String a;
    final String b;
    final int c;
    final WearableService d;

    public ehj(WearableService wearableservice, String s, String s1, int i)
    {
        d = wearableservice;
        a = s;
        b = s1;
        c = i;
        super();
    }

    public void run()
    {
        WearableService.a(d, a, b, c);
    }
}
