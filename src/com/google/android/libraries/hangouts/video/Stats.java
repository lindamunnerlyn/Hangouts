// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import itz;
import iuc;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Stats
{

    public Stats()
    {
    }

    static float a(ArrayList arraylist)
    {
        int k = arraylist.size();
        if (k == 0)
        {
            return 0.0F;
        }
        float af[] = new float[k];
        for (int i = 0; i < k; i++)
        {
            af[i] = ((Float)arraylist.get(i)).floatValue();
        }

        Arrays.sort(af);
        int j = k / 2;
        if (k % 2 == 1)
        {
            return af[j];
        } else
        {
            float f = af[j - 1];
            return (af[j] + f) / 2.0F;
        }
    }

    static int a(String s)
    {
        return parseConnectionType(s);
    }

    static iuc a(int i)
    {
        iuc iuc1 = new iuc();
        iuc1.a = Integer.valueOf(i);
        iuc1.b = Integer.valueOf(-1);
        iuc1.c = Integer.valueOf(-1);
        iuc1.d = Integer.valueOf(-1);
        iuc1.e = Integer.valueOf(-1);
        iuc1.f = Integer.valueOf(-1);
        iuc1.g = Long.valueOf(-1L);
        iuc1.h = Integer.valueOf(-1);
        iuc1.i = Long.valueOf(-1L);
        iuc1.j = Integer.valueOf(-1);
        return iuc1;
    }

    static int b(String s)
    {
        return parseConnectionProtocol(s);
    }

    private static int parseConnectionProtocol(String s)
    {
        if (s.equals("udp"))
        {
            return 1;
        }
        if (s.equals("tcp"))
        {
            return 2;
        }
        return !s.equals("ssltcp") ? 0 : 3;
    }

    private static int parseConnectionType(String s)
    {
        if (s.equals("local"))
        {
            return 1;
        }
        if (s.equals("stun"))
        {
            return 2;
        }
        return !s.equals("relay") ? 0 : 3;
    }

    public abstract void addTo(itz itz);

    public abstract void print(PrintWriter printwriter, AggregatePrintStats aggregateprintstats);
}
