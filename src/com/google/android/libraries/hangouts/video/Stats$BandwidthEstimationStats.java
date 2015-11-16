// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import inu;
import inx;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class d extends Stats
{

    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  BandwidthEstimation -- availSend, avilRecv, trans, retrans");
    }

    public void addTo(inu inu1)
    {
        inx inx1 = Stats.a(2);
        inx1.k = Integer.valueOf(2);
        inx1.z = Integer.valueOf(a);
        inx1.A = Integer.valueOf(b);
        inx1.B = Integer.valueOf(c);
        inx1.C = Integer.valueOf(d);
        int i = inu1.b.length;
        inu1.b = (inx[])Arrays.copyOf(inu1.b, i + 1);
        inu1.b[i] = inx1;
    }

    public void print(PrintWriter printwriter, d d1)
    {
        int i = a;
        int j = b;
        int k = c;
        int l = d;
        printwriter.println((new StringBuilder(77)).append(" -- BandwidthEstimation -- ").append(i).append(", ").append(j).append(", ").append(k).append(", ").append(l).toString());
    }

    public (int i, int j, int k, int l)
    {
        a = i;
        b = j;
        c = k;
        d = l;
    }
}
