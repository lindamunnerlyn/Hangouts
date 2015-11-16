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

public final class gfg
{

    private static final Set a;
    private static final giq b = new giq(new gnk(160, 100), 15);
    private static final giq c = new giq(new gnk(320, 200), 15);
    private static final giq d = new giq(new gnk(480, 300), 15);
    private static final giq e = new giq(new gnk(640, 400), 30);
    private static final giq f = new giq(new gnk(960, 600), 30);
    private static final giq g = new giq(new gnk(1280, 800), 30);
    private Context h;
    private boolean i;

    public gfg()
    {
    }

    protected static giq a(int j)
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
        giq giq5 = c;
        giq giq4 = b;
        giq giq1 = c;
        int l = gfi.a();
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
            giq giq2 = e;
            if (l >= 4)
            {
                giq2 = f;
            }
            if (flag)
            {
                giq2 = g;
            }
            giq giq3 = b;
            if (flag)
            {
                giq3 = c;
            }
            giq1 = d;
            if (l >= 4 || flag)
            {
                giq1 = e;
            }
            if (l >= 4 && flag)
            {
                giq1 = f;
            }
            giq5 = giq2;
            giq4 = giq3;
            if (k != 0)
            {
                giq1 = g;
                giq4 = giq3;
                giq5 = giq2;
            }
        }
        s = fzd.a(h.getContentResolver(), "babel_hangout_max_in_primary_video", null);
        if (s != null)
        {
            giq5 = giq.a(s);
        }
        s = fzd.a(h.getContentResolver(), "babel_hangout_max_in_secondary_video", null);
        if (s != null)
        {
            giq4 = giq.a(s);
        }
        s = fzd.a(h.getContentResolver(), "babel_hangout_max_out_nofx_video", null);
        if (s != null)
        {
            giq1 = giq.a(s);
        }
        giq.a(j, giq5);
        giq.b(j, giq4);
        giq.c(j, giq1);
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
        giq.b();
        if (!fzd.a(h.getContentResolver(), "babel_hangout_supported", true))
        {
            gne.a(5, "vclib", "GServices override - disabling hangout calls");
        } else
        {
            if (!h.getPackageManager().hasSystemFeature("android.hardware.microphone"))
            {
                gne.a(5, "vclib", "No microphone available for hangout calls");
            }
            if (a.contains(Build.CPU_ABI) || a.contains(Build.CPU_ABI2))
            {
                flag = true;
            } else
            {
                context = String.valueOf(Build.CPU_ABI);
                String s = String.valueOf(Build.CPU_ABI2);
                gne.a(5, "vclib", (new StringBuilder(String.valueOf(context).length() + 47 + String.valueOf(s).length())).append("ABI not supported (").append(context).append(",").append(s).append(") - disabling hangout calls").toString());
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
