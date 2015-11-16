// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import itw;
import itz;
import iua;
import iub;
import java.io.PrintWriter;
import java.util.Arrays;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class m extends Stats
{

    public int a;
    public int b;
    public String c;
    public int d;
    public int e;
    public String f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public iub o;

    public static void printLegend(PrintWriter printwriter)
    {
        printwriter.println("  Connection -- media type, local address, type, protocol, remote address, type, protocol, received bitrate, sent bitrate, media network type, wifi signal strength, cell signal type, cell level, cell asu level");
    }

    public void addTo(itz itz1)
    {
        a;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 305
    //                   1 299;
           goto _L1 _L2 _L3
_L1:
        int i1 = 0;
_L5:
        itw itw1 = new itw();
        itw1.a = c;
        itw1.b = Integer.valueOf(i1);
        itw1.c = Integer.valueOf(b);
        itw1.d = Integer.valueOf(d);
        itw itw2 = new itw();
        itw2.a = c;
        itw2.b = Integer.valueOf(i1);
        itw2.c = Integer.valueOf(e);
        itw2.d = Integer.valueOf(g);
        iua iua1 = new iua();
        iua1.a = Integer.valueOf(i1);
        iua1.b = Integer.valueOf(m);
        iua1.c = Integer.valueOf(l);
        iua1.d = Long.valueOf(j);
        iua1.h = Long.valueOf(h);
        iua1.e = Integer.valueOf(k / 8);
        iua1.i = Integer.valueOf(i / 8);
        iua1.j = itw1;
        iua1.k = itw2;
        if (n > 0)
        {
            iua1.l = Integer.valueOf(n);
        }
        iua1.m = o;
        i1 = itz1.c.length;
        itz1.c = (iua[])Arrays.copyOf(itz1.c, i1 + 1);
        itz1.c[i1] = iua1;
        return;
_L3:
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        i1 = 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void print(PrintWriter printwriter, o o1)
    {
        String s;
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (3 == b || 3 == e)
        {
            o1.c = true;
        } else
        {
            o1.c = false;
        }
        if (a == 0)
        {
            o1 = "video";
        } else
        {
            o1 = "audio";
        }
        s = c;
        i1 = b;
        j1 = d;
        s1 = f;
        k1 = e;
        l1 = g;
        i2 = i;
        j2 = k;
        k2 = n;
        s2 = String.valueOf(o.a);
        s3 = String.valueOf(o.b);
        s4 = String.valueOf(o.c);
        s5 = String.valueOf(o.d);
        printwriter.println((new StringBuilder(String.valueOf(o1).length() + 121 + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append(" -- Connection -- ").append(o1).append(", ").append(s).append(", ").append(i1).append(", ").append(j1).append(", ").append(s1).append(", ").append(k1).append(", ").append(l1).append(", ").append(i2).append(", ").append(j2).append(", ").append(k2).append(", ").append(s2).append(", ").append(s3).append(", ").append(s4).append(", ").append(s5).toString());
    }

    public void setMediaNetworkType(int i1)
    {
        n = i1;
    }

    public void setSignalStrength(iub iub1)
    {
        o = iub1;
    }

    public (int i1, String s, String s1, String s2, String s3, String s4, String s5, 
            int j1, int k1, int l1, int i2, int j2, int k2)
    {
        n = 0;
        o = null;
        a = i1;
        b = Stats.a(s);
        c = s1;
        d = Stats.b(s2);
        e = Stats.a(s3);
        f = s4;
        g = Stats.b(s5);
        h = j1;
        i = k1;
        j = l1;
        k = i2;
        l = j2;
        m = k2;
    }
}
