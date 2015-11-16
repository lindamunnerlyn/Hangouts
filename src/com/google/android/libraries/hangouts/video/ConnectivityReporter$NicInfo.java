// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import ioe;
import iof;
import jgz;
import n;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            ConnectivityReporter

public class l
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final int f;
    private final nfo g;
    private final nfo h;
    private final nfo i;
    private final nfo j;
    private final nfo k;
    private final nfo l;

    public ioe a()
    {
        ioe ioe1 = new ioe();
        ioe1.a = a;
        ioe1.b = b;
        ioe1.d = c;
        ioe1.e = d;
        ioe1.c = e;
        ioe1.f = Integer.valueOf(f);
        if (g != null)
        {
            ioe1.h = (iof[])ConnectivityReporter.a(new iof[] {
                g.a()
            });
        }
        if (h != null)
        {
            ioe1.i = (iof[])ConnectivityReporter.a(new iof[] {
                h.a()
            });
        }
        if (i != null)
        {
            ioe1.j = (iof[])ConnectivityReporter.a(new iof[] {
                i.a()
            });
        }
        if (j != null)
        {
            ioe1.k = (iof[])ConnectivityReporter.a(new iof[] {
                j.a()
            });
        }
        if (k != null)
        {
            ioe1.l = (iof[])ConnectivityReporter.a(new iof[] {
                k.a()
            });
        }
        if (l != null)
        {
            ioe1.m = (iof[])ConnectivityReporter.a(new iof[] {
                l.a()
            });
        }
        return ioe1;
    }

    public String toString()
    {
        return n.a(this).a("externalIp", b).a("stunServerIp", c).a("mediaServerIp", d).a("proxyIp", e).a("proxyType", f).a("stun", g).a("http", h).a("https", i).a("udp", j).a("tcp", k).a("ssltcp", l).toString();
    }

    public nfo(String s, String s1, String s2, String s3, String s4, int i1, nfo nfo, 
            nfo nfo1, nfo nfo2, nfo nfo3, nfo nfo4, nfo nfo5)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = i1;
        g = nfo;
        h = nfo1;
        i = nfo2;
        j = nfo3;
        k = nfo4;
        l = nfo5;
    }
}
