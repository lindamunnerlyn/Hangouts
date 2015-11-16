// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.phone.BabelHomeActivity;

public final class cla
    implements Runnable
{

    final BabelHomeActivity a;

    public cla(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void run()
    {
        BabelHomeActivity.i(a);
        BabelHomeActivity.j(a);
        BabelHomeActivity.f(a).a((new hbo()).a().a(hbu, (new hbv()).b().c()));
    }
}
