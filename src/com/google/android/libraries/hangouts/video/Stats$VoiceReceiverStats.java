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

public class v extends Stats
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
    public final float n;
    public final float o;
    public final float p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  VoiceReceiver -- ssrc, rcvd, lost, seq, jitter, jbuf, delay, level, expand");
    }

    public void addTo(inu inu1)
    {
        inx inx1 = Stats.a(1);
        inx1.k = Integer.valueOf(1);
        inx1.l = Integer.valueOf(a);
        inx1.i = Long.valueOf(b);
        inx1.j = Integer.valueOf(c);
        inx1.c = Integer.valueOf(d);
        inx1.b = Integer.valueOf((int)(e * 100F));
        inx1.d = Integer.valueOf(f);
        inx1.e = Integer.valueOf(g);
        inx1.w = Integer.valueOf(h);
        inx1.W = Float.valueOf(l);
        inx1.X = Float.valueOf(m);
        inx1.Y = Float.valueOf(p);
        inx1.Z = Float.valueOf(o);
        inx1.aa = Float.valueOf(n);
        inx1.af = Integer.valueOf(q);
        inx1.ag = Integer.valueOf(r);
        inx1.ah = Integer.valueOf(s);
        inx1.ai = Integer.valueOf(t);
        inx1.aj = Integer.valueOf(u);
        inx1.ak = Integer.valueOf(v);
        if (j != -1)
        {
            inx1.y = Integer.valueOf(j);
        }
        if (k != -1)
        {
            inx1.m = Integer.valueOf(k);
        }
        int i1 = inu1.b.length;
        inu1.b = (inx[])Arrays.copyOf(inu1.b, i1 + 1);
        inu1.b[i1] = inx1;
    }

    public void print(PrintWriter printwriter,  )
    {
        long l3 = a;
        int i1 = c;
        int j1 = b;
        int k1 = d;
        float f1 = e;
        int l1 = f;
        int i2 = g;
        int j2 = h;
        int k2 = i;
        int l2 = j;
        int i3 = k;
        float f2 = l;
        printwriter.println((new StringBuilder(195)).append(" -- VoiceReceiver -- ").append(l3 & 0xffffffffL).append(", ").append(i1).append(" (").append(j1).append("), ").append(k1).append(" (").append(f1).append("), ").append(l1).append(", ").append(i2).append(", ").append(j2).append(" (").append(k2).append("), ").append(l2).append(", ").append(i3).append(", ").append(f2).toString());
    }

    public (int i1, int j1, int k1, int l1, float f1, int i2, int j2, 
            int k2, int l2, int i3, int j3, float f2, float f3, float f4, 
            float f5, float f6, int k3, int l3, int i4, int j4, int k4, 
            int l4)
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
        n = f4;
        o = f5;
        p = f6;
        q = k3;
        r = l3;
        s = i4;
        t = j4;
        u = k4;
        v = l4;
    }
}
