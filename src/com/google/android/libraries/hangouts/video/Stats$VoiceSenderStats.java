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

public class n extends Stats
{

    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  VoiceSender -- ssrc, codec, sent, lost, seq, rtt, jitter, level, echo, echoRetLoss");
    }

    public void addTo(itz itz1)
    {
        iuc iuc1 = Stats.a(1);
        iuc1.k = Integer.valueOf(0);
        iuc1.l = Integer.valueOf(a);
        iuc1.F = b;
        iuc1.g = Long.valueOf(c);
        iuc1.h = Integer.valueOf(d);
        iuc1.c = Integer.valueOf(e);
        iuc1.b = Integer.valueOf((int)(f * 100F));
        iuc1.d = Integer.valueOf(g);
        iuc1.f = Integer.valueOf(h);
        iuc1.e = Integer.valueOf(i);
        if (j != -1)
        {
            iuc1.m = Integer.valueOf(j);
        }
        if (k != -1)
        {
            iuc1.H = Integer.valueOf(k);
        }
        if (l != -1)
        {
            iuc1.I = Integer.valueOf(l);
        }
        if (m != -100)
        {
            iuc1.J = Integer.valueOf(m);
        }
        if (n != -100)
        {
            iuc1.K = Integer.valueOf(n);
        }
        int i1 = itz1.b.length;
        itz1.b = (iuc[])Arrays.copyOf(itz1.b, i1 + 1);
        itz1.b[i1] = iuc1;
    }

    public void print(PrintWriter printwriter, ts ts)
    {
        long l3 = a;
        ts = b;
        int i1 = d;
        int j1 = c;
        int k1 = e;
        float f1 = f;
        int l1 = g;
        int i2 = h;
        int j2 = i;
        int k2 = j;
        int l2 = k;
        int i3 = l;
        int j3 = m;
        int k3 = n;
        printwriter.println((new StringBuilder(String.valueOf(ts).length() + 205)).append(" -- VoiceSender -- ").append(l3 & 0xffffffffL).append(", ").append(ts).append(", ").append(i1).append(" (").append(j1).append("), ").append(k1).append(" (").append(f1).append("), ").append(l1).append(", ").append(i2).append(", ").append(j2).append(", ").append(k2).append(", ").append(l2).append(" (").append(i3).append("), ").append(j3).append(" (").append(k3).append(")").toString());
    }

    public ts(int i1, String s, int j1, int k1, int l1, float f1, int i2, 
            int j2, int k2, int l2, int i3, int j3, int k3, int l3)
    {
        a = i1;
        b = s;
        c = j1;
        d = k1;
        e = l1;
        f = f1;
        g = i2;
        h = j2;
        i = k2;
        j = l2;
        k = i3;
        l = j3;
        m = k3;
        n = l3;
    }
}
