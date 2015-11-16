// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import iod;
import ioe;

public class ConnectivityReporter
{

    private ConnectivityReporter()
    {
    }

    public static iod a(NicInfo anicinfo[])
    {
        if (anicinfo == null || anicinfo.length == 0)
        {
            return null;
        }
        iod iod1 = new iod();
        iod1.a = new ioe[anicinfo.length];
        for (int i = 0; i < anicinfo.length; i++)
        {
            iod1.a[i] = anicinfo[i].a();
        }

        return iod1;
    }

    static Object[] a(Object aobj[])
    {
        return aobj;
    }

    private class NicInfo
    {

        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final int f;
        private final ConnectInfo g;
        private final ConnectInfo h;
        private final ConnectInfo i;
        private final ConnectInfo j;
        private final ConnectInfo k;
        private final ConnectInfo l;

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

        public NicInfo(String s, String s1, String s2, String s3, String s4, int i1, ConnectInfo connectinfo, 
                ConnectInfo connectinfo1, ConnectInfo connectinfo2, ConnectInfo connectinfo3, ConnectInfo connectinfo4, ConnectInfo connectinfo5)
        {
            a = s;
            b = s1;
            c = s2;
            d = s3;
            e = s4;
            f = i1;
            g = connectinfo;
            h = connectinfo1;
            i = connectinfo2;
            j = connectinfo3;
            k = connectinfo4;
            l = connectinfo5;
        }

        private class ConnectInfo
        {

            private final int a;
            private final int b;

            public iof a()
            {
                iof iof1 = new iof();
                iof1.a = Integer.valueOf(a);
                iof1.b = Integer.valueOf(b);
                return iof1;
            }

            public String toString()
            {
                return n.a(this).a("rtt", a).a("error", b).toString();
            }

            public ConnectInfo(int i1, int j1)
            {
                a = i1;
                b = j1;
            }
        }

    }

}
