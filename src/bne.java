// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.Map;

public final class bne
{

    public static final Map a;
    private final Context b;
    private final bng c = new bng(this);
    private bnh d;

    public bne(Context context)
    {
        b = context;
    }

    static bnh a(bne bne1)
    {
        return bne1.d;
    }

    public void a()
    {
        if (d != null)
        {
            Object obj = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            obj = b.registerReceiver(null, ((IntentFilter) (obj)));
            if (((Intent) (obj)).getIntExtra("plugged", -1) != 2)
            {
                int i = ((Intent) (obj)).getIntExtra("level", -1);
                int j = ((Intent) (obj)).getIntExtra("scale", -1);
                if ((int)((100D * (double)i) / (double)j) <= 15)
                {
                    d.a(bnf.a);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 21 && ((PowerManager)b.getSystemService("power")).isPowerSaveMode())
            {
                d.a(bnf.c);
            }
        }
        Context context = b;
        bng bng1 = c;
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.BATTERY_LOW");
        intentfilter.addAction("android.intent.action.BATTERY_OKAY");
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            intentfilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        }
        context.registerReceiver(bng1, intentfilter);
    }

    public void a(bnh bnh1)
    {
        d = bnh1;
    }

    public void b()
    {
        b.unregisterReceiver(c);
    }

    static 
    {
        a = jso.a(bnf.a, Integer.valueOf(2805), bnf.b, Integer.valueOf(2806), bnf.c, Integer.valueOf(2803), bnf.d, Integer.valueOf(2804));
    }
}
