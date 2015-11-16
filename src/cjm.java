// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cjm
    implements Runnable
{

    final BabelHomeActivity a;

    public cjm(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void run()
    {
        gxe gxe1 = (new gxe()).b().a(bzb);
        BabelHomeActivity.i(a);
        BabelHomeActivity.f(a).a(gxe1);
    }
}
