// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.libraries.hangouts.video.DecoderManager;
import com.google.android.libraries.hangouts.video.EncoderManager;
import java.util.HashSet;
import java.util.Set;

public final class gco
{

    private static final Set a;
    private static final gfq b = new gfq(new gki(160, 100), 15);
    private static final gfq c = new gfq(new gki(320, 200), 15);
    private static final gfq d = new gfq(new gki(480, 300), 15);
    private static final gfq e = new gfq(new gki(640, 400), 30);
    private static final gfq f = new gfq(new gki(960, 600), 30);
    private static final gfq g = new gfq(new gki(1280, 800), 30);
    private Context h;
    private boolean i;

    public gco()
    {
    }

    protected static gfq a(int j)
    {
        if (j > (g.d() + f.d()) / 2)
        {
            return g;
        }
        if (j > (f.d() + e.d()) / 2)
        {
            return f;
        }
        if (j > (e.d() + d.d()) / 2)
        {
            return e;
        }
        if (j > (d.d() + c.d()) / 2)
        {
            return d;
        }
        if (j > (c.d() + b.d()) / 2)
        {
            return c;
        } else
        {
            return b;
        }
    }

    private void a(int j, int k)
    {
        gfq gfq5 = c;
        gfq gfq4 = b;
        gfq gfq1 = c;
        int l = gkj.a();
        String s;
        boolean flag;
        if ((DecoderManager.a(h) & k) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((EncoderManager.a(h) & k) != 0)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        if (l >= 2)
        {
            gfq gfq2 = e;
            if (l >= 4)
            {
                gfq2 = f;
            }
            if (flag)
            {
                gfq2 = g;
            }
            gfq gfq3 = b;
            if (flag)
            {
                gfq3 = c;
            }
            gfq1 = d;
            if (l >= 4 || flag)
            {
                gfq1 = e;
            }
            if (l >= 4 && flag)
            {
                gfq1 = f;
            }
            gfq5 = gfq2;
            gfq4 = gfq3;
            if (k != 0)
            {
                gfq1 = g;
                gfq4 = gfq3;
                gfq5 = gfq2;
            }
        }
        s = fwz.a(h.getContentResolver(), "babel_hangout_max_in_primary_video", null);
        if (s != null)
        {
            gfq5 = gfq.a(s);
        }
        s = fwz.a(h.getContentResolver(), "babel_hangout_max_in_secondary_video", null);
        if (s != null)
        {
            gfq4 = gfq.a(s);
        }
        s = fwz.a(h.getContentResolver(), "babel_hangout_max_out_nofx_video", null);
        if (s != null)
        {
            gfq1 = gfq.a(s);
        }
        gfq.a(j, gfq5);
        gfq.b(j, gfq4);
        gfq.c(j, gfq1);
    }

    public boolean a()
    {
        return i;
    }

    public boolean a(Context context)
    {
        boolean flag = false;
        h = context;
        a(0, 1);
        if ((EncoderManager.a(h) & 2) != 0)
        {
            a(1, 2);
        }
        gfq.b();
        if (!fwz.a(h.getContentResolver(), "babel_hangout_supported", true))
        {
            gkc.d("vclib", "GServices override - disabling hangout calls");
        } else
        {
            if (!h.getPackageManager().hasSystemFeature("android.hardware.microphone"))
            {
                gkc.d("vclib", "No microphone available for hangout calls");
            }
            if (a.contains(Build.CPU_ABI) || a.contains(Build.CPU_ABI2))
            {
                flag = true;
            } else
            {
                context = String.valueOf(Build.CPU_ABI);
                String s = String.valueOf(Build.CPU_ABI2);
                gkc.d("vclib", (new StringBuilder(String.valueOf(context).length() + 47 + String.valueOf(s).length())).append("ABI not supported (").append(context).append(",").append(s).append(") - disabling hangout calls").toString());
            }
        }
        i = flag;
        return i;
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add("armeabi-v7a");
        a.add("arm64-v8a");
        a.add("x86");
    }
}
