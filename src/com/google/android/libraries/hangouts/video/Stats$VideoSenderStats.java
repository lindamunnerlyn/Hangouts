// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import inu;
import inx;
import iny;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class p extends Stats
{

    public final int a;
    public final SsrcGroup b[];
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  VideoSender -- ssrc, codec, sent, lost, rcvd, rtt, size, in, sent, rate");
    }

    public void addTo(inu inu1)
    {
        inx inx1 = Stats.a(2);
        inx1.k = Integer.valueOf(0);
        inx1.l = Integer.valueOf(a);
        inx1.F = c;
        inx1.g = Long.valueOf(d);
        inx1.h = Integer.valueOf(e);
        inx1.c = Integer.valueOf(f);
        inx1.b = Integer.valueOf((int)(g * 100F));
        inx1.n = Integer.valueOf(h);
        inx1.o = Integer.valueOf(i);
        inx1.f = Integer.valueOf(j);
        inx1.O = Integer.valueOf(k);
        inx1.P = Integer.valueOf(l);
        inx1.p = Integer.valueOf(m);
        inx1.q = Integer.valueOf(n);
        inx1.z = Integer.valueOf(p);
        inx1.B = Integer.valueOf(o);
        if (b != null)
        {
            ArrayList arraylist = new ArrayList(b.length);
            SsrcGroup assrcgroup[] = b;
            int k1 = assrcgroup.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                SsrcGroup ssrcgroup = assrcgroup[i1];
                iny iny1 = new iny();
                class SsrcGroup
                {

                    public final String a;
                    public final int b[];

            public SsrcGroup(String s, int ai[])
            {
                a = s;
                b = ai;
            }
                }

                iny1.a = ssrcgroup.a;
                iny1.b = (int[])ssrcgroup.b.clone();
                arraylist.add(iny1);
            }

            inx1.N = (iny[])arraylist.toArray(new iny[arraylist.size()]);
        }
        int j1 = inu1.b.length;
        inu1.b = (inx[])Arrays.copyOf(inu1.b, j1 + 1);
        inu1.b[j1] = inx1;
    }

    public void print(PrintWriter printwriter, ts ts)
    {
        com.google.android.libraries.hangouts.video.ts.a(ts).add(Float.valueOf(n));
        int i1 = a;
        ts = c;
        int j1 = e;
        int k1 = d;
        int l1 = f;
        float f1 = g;
        int i2 = h;
        int j2 = i;
        int k2 = j;
        int l2 = k;
        int i3 = l;
        int j3 = m;
        int k3 = n;
        int l3 = o;
        int i4 = p;
        printwriter.println((new StringBuilder(String.valueOf(ts).length() + 208)).append(" -- VideoSender -- ").append(i1).append(", ").append(ts).append(", ").append(j1).append(" (").append(k1).append("), ").append(l1).append(" (").append(f1).append("), ").append(i2).append(" (").append(j2).append("), ").append(k2).append(", ").append(l2).append("x").append(i3).append(", ").append(j3).append(", ").append(k3).append(", ").append(l3).append(" (").append(i4).append(")").toString());
    }

    public SsrcGroup(int i1, SsrcGroup assrcgroup[], String s, int j1, int k1, int l1, float f1, 
            int i2, int j2, int k2, int l2, int i3, int j3, int k3, 
            int l3, int i4)
    {
        a = i1;
        b = assrcgroup;
        c = s;
        d = j1;
        e = k1;
        f = l1;
        g = f1;
        h = i2;
        i = j2;
        j = k2;
        k = l2;
        l = i3;
        m = j3;
        n = k3;
        o = l3;
        p = i4;
    }
}
