// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.google.android.libraries.hangouts.video.CallService;

public final class gce extends Binder
    implements gjn
{

    final CallService a;

    public gce(CallService callservice)
    {
        a = callservice;
        super();
    }

    public gjk a(gjl gjl)
    {
        gbh.a(CallService.b(a));
        CallService.a(a, new gbn(CallService.c(a), gjl));
        CallService.b(a).a(new gcf(this));
        return CallService.b(a);
    }

    public gjp a()
    {
        return new gjp(CallService.a(a).a());
    }

    public gjk b()
    {
        return CallService.b(a);
    }
}
