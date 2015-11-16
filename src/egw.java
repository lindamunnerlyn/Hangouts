// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.List;

final class egw
    implements Runnable
{

    final egv a;
    final egv b;

    egw(egv egv1, egv egv2)
    {
        b = egv1;
        a = egv2;
        super();
    }

    public void run()
    {
        b.a();
        EasterEggView.a(b.a).remove(a);
    }
}
