// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.Random;

public final class eds
    implements Runnable
{

    final ani a;
    final EasterEggView b;

    public eds(EasterEggView eastereggview, ani ani)
    {
        b = eastereggview;
        a = ani;
        super();
    }

    public void run()
    {
        int i = EasterEggView.b().nextInt(EasterEggView.c().length);
        EasterEggView.a(b, a, EasterEggView.d(b), EasterEggView.c()[i]);
        if (EasterEggView.e(b) > 0)
        {
            EasterEggView.f(b);
            EasterEggView.c(b).postDelayed(this, 50L);
            return;
        } else
        {
            EasterEggView.g(b);
            return;
        }
    }
}
