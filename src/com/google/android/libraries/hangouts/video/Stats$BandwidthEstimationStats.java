// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import itz;
import iuc;
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

    public void addTo(itz itz1)
    {
        iuc iuc1 = Stats.a(2);
        iuc1.k = Integer.valueOf(2);
        iuc1.z = Integer.valueOf(a);
        iuc1.A = Integer.valueOf(b);
        iuc1.B = Integer.valueOf(c);
        iuc1.C = Integer.valueOf(d);
        int i = itz1.b.length;
        itz1.b = (iuc[])Arrays.copyOf(itz1.b, i + 1);
        itz1.b[i] = iuc1;
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
