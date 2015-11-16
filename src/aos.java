// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Html;
import android.text.TextUtils;

public final class aos
{

    public final int A;
    public final int B;
    public final String C;
    public final int D;
    public final String E;
    public final String F;
    public final String G;
    public final int H;
    public final long I;
    private String J;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final dqb f;
    public final dqc g;
    public final long h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final double r;
    public final double s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final String y;
    public final int z;

    public aos(String s1, String s2, String s3, String s4, String s5, dqb dqb, dqc dqc, 
            long l1, long l2, String s6, String s7, String s8, 
            String s9, String s10, String s11, String s12, double d1, double d2, String s13, String s14, int i1, String s15, int j1, int k1, 
            int i2, String s16, int j2, String s17, String s18, String s19, int k2, 
            String s20, String s21, String s22, long l3)
    {
        J = null;
        a = s1;
        b = s2;
        c = s3;
        d = s4;
        e = s5;
        f = dqb;
        g = dqc;
        h = l1;
        i = l2;
        j = s6;
        k = s7;
        l = s8;
        m = s9;
        n = s10;
        o = s11;
        p = s12;
        q = s22;
        r = d1;
        s = d2;
        t = s13;
        u = s14;
        v = s20;
        w = s21;
        x = i1;
        y = s15;
        z = j1;
        A = k1;
        B = i2;
        C = s16;
        D = j2;
        E = s17;
        F = s18;
        G = s19;
        H = k2;
        I = l3;
    }

    public String a()
    {
        if (J == null)
        {
            if (TextUtils.isEmpty(e))
            {
                J = "";
            } else
            if (x == 3)
            {
                J = e;
            } else
            {
                J = Html.fromHtml(e).toString();
            }
        }
        return J;
    }
}
