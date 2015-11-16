// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import iuj;
import iuk;
import jnt;
import n;

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

    public iuj a()
    {
        iuj iuj1 = new iuj();
        iuj1.a = a;
        iuj1.b = b;
        iuj1.d = c;
        iuj1.e = d;
        iuj1.c = e;
        iuj1.f = Integer.valueOf(f);
        if (g != null)
        {
            iuj1.h = (iuk[])(new iuk[] {
                g.a()
            });
        }
        if (h != null)
        {
            iuj1.i = (iuk[])(new iuk[] {
                h.a()
            });
        }
        if (i != null)
        {
            iuj1.j = (iuk[])(new iuk[] {
                i.a()
            });
        }
        if (j != null)
        {
            iuj1.k = (iuk[])(new iuk[] {
                j.a()
            });
        }
        if (k != null)
        {
            iuj1.l = (iuk[])(new iuk[] {
                k.a()
            });
        }
        if (l != null)
        {
            iuj1.m = (iuk[])(new iuk[] {
                l.a()
            });
        }
        return iuj1;
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
