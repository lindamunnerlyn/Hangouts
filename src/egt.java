// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.Random;

public final class egt
    implements Runnable
{

    final aoa a;
    final EasterEggView b;

    public egt(EasterEggView eastereggview, aoa aoa)
    {
        b = eastereggview;
        a = aoa;
        super();
    }

    public void run()
    {
        int i;
        if (EasterEggView.b().nextBoolean())
        {
            i = g.cu;
        } else
        {
            i = g.ct;
        }
        EasterEggView.a(b, a, EasterEggView.b(b), i);
        EasterEggView.c(b).postDelayed(this, 400L);
    }
}
