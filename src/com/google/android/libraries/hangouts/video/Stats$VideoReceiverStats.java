// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import itz;
import iuc;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class m extends Stats
{

    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  VideoReceiver -- ssrc, rcvd, lost, firs, size, rcvd, dec, rendIn, rendOut");
    }

    public void addTo(itz itz1)
    {
        iuc iuc1 = Stats.a(2);
        iuc1.k = Integer.valueOf(1);
        iuc1.l = Integer.valueOf(a);
        iuc1.i = Long.valueOf(b);
        iuc1.j = Integer.valueOf(c);
        iuc1.c = Integer.valueOf(d);
        iuc1.b = Integer.valueOf((int)(e * 100F));
        iuc1.n = Integer.valueOf(f);
        iuc1.o = Integer.valueOf(g);
        iuc1.O = Integer.valueOf(h);
        iuc1.P = Integer.valueOf(i);
        iuc1.q = Integer.valueOf(j);
        iuc1.r = Integer.valueOf(k);
        iuc1.s = Float.valueOf(l);
        iuc1.u = Float.valueOf(m);
        int i1 = itz1.b.length;
        itz1.b = (iuc[])Arrays.copyOf(itz1.b, i1 + 1);
        itz1.b[i1] = iuc1;
    }

    public void print(PrintWriter printwriter,  )
    {
        .b.add(Float.valueOf(j));
        int i1 = a;
        int j1 = c;
        int k1 = b;
        int l1 = d;
        float f1 = e;
        int i2 = f;
        int j2 = g;
        int k2 = h;
        int l2 = i;
        int i3 = j;
        int j3 = k;
        float f2 = l;
        float f3 = m;
        printwriter.println((new StringBuilder(202)).append(" -- VideoReceiver -- ").append(i1).append(", ").append(j1).append(" (").append(k1).append("), ").append(l1).append(" (").append(f1).append("), ").append(i2).append(" (").append(j2).append("), ").append(k2).append("x").append(l2).append(", ").append(i3).append(", ").append(j3).append(", ").append(f2).append(", ").append(f3).toString());
    }

    public (int i1, int j1, int k1, int l1, float f1, int i2, int j2, 
            int k2, int l2, int i3, int j3, float f2, float f3)
    {
        a = i1;
        b = j1;
        c = k1;
        d = l1;
        e = f1;
        f = i2;
        g = j2;
        h = k2;
        i = l2;
        j = i3;
        k = j3;
        l = f2;
        m = f3;
    }
}
