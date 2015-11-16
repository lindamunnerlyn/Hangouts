// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.media.ToneGenerator;

public final class bms
{

    private boolean a;
    private final Context b;
    private final bmy c = new bmy();
    private ToneGenerator d;

    public bms(Context context)
    {
        b = context;
        try
        {
            d = new ToneGenerator(8, 80);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
            eev.f("Babel_dialer", (new StringBuilder(String.valueOf(context).length() + 54)).append("Exception caught while creating local tone generator: ").append(context).toString());
            d = null;
        }
        try
        {
            c.a(b, b.getResources().getBoolean(g.cZ));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eev.e("Babel_dialer", "Vibrate control bool missing.", context);
        }
        b();
    }

    public void a()
    {
        if (d != null)
        {
            d.release();
            d = null;
        }
    }

    public void a(int i)
    {
        if (a && d != null)
        {
            d.startTone(i, -1);
        }
    }

    public void b()
    {
        boolean flag = true;
        if (android.provider.Settings.System.getInt(b.getContentResolver(), "dtmf_tone", 1) != 1)
        {
            flag = false;
        }
        a = flag;
        c.a();
    }

    public void c()
    {
        while (!a || d == null) 
        {
            return;
        }
        d.stopTone();
    }

    public void d()
    {
        c.b();
    }
}
