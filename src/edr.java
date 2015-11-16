// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.Random;

public final class edr
    implements Runnable
{

    final ani a;
    final EasterEggView b;

    public edr(EasterEggView eastereggview, ani ani)
    {
        b = eastereggview;
        a = ani;
        super();
    }

    public void run()
    {
        int i;
        if (EasterEggView.b().nextBoolean())
        {
            i = g.cv;
        } else
        {
            i = g.cu;
        }
        EasterEggView.a(b, a, EasterEggView.b(b), i);
        EasterEggView.c(b).postDelayed(this, 400L);
    }
}
