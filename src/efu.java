// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;

public class efu
{

    private static final int d[] = {
        1, 2, 3, 0
    };
    private final String a;
    private final long b;
    private final int c;

    efu(Context context)
    {
        String s;
        String s1;
        s1 = null;
        s = s1;
        PackageInfo packageinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        s = s1;
        s1 = packageinfo.versionName;
        s = s1;
        int i = packageinfo.versionCode;
        s = s1;
_L2:
        c = a(context);
        context = s;
        if (s == null)
        {
            context = "(unk)";
        }
        a = context;
        b = i;
        return;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        String s2 = String.valueOf(namenotfoundexception);
        gdv.a((new StringBuilder(String.valueOf(s2).length() + 26)).append("couldn't get package info ").append(s2).toString());
        i = -1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(Context context)
    {
        context = hlp.c(context, eft).iterator();
        int i = 3;
label0:
        do
        {
            if (context.hasNext())
            {
                int k = ((eft)context.next()).a();
                int ai[] = d;
                int l = ai.length;
                int j = 0;
                do
                {
                    if (j >= l)
                    {
                        continue label0;
                    }
                    int i1 = ai[j];
                    if (i1 == k)
                    {
                        i = k;
                        continue label0;
                    }
                    if (i1 == i)
                    {
                        continue label0;
                    }
                    j++;
                } while (true);
            }
            return i;
        } while (true);
    }

    public boolean a()
    {
        return c == 1;
    }

    public boolean b()
    {
        return c == 2;
    }

    public String c()
    {
        return a;
    }

    public long d()
    {
        return b;
    }

    public ixb e()
    {
        ixb ixb1 = new ixb();
        ixb1.a = Integer.valueOf(1);
        ixb1.b = Integer.valueOf(c);
        ixb1.c = a;
        ixb1.d = Long.valueOf(b);
        ixb1.e = Build.FINGERPRINT;
        ixb1.f = Build.HARDWARE;
        return ixb1;
    }

}
