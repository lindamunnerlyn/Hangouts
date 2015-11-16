// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

public final class o
    implements a
{

    public static final int A = 0x7f0c02d9;
    public static final int B = 0x7f0c00c0;
    public static final int C = 0x7f0c02e3;
    public static final int D = 0x7f0c008d;
    public static final int E = 0x7f0c0080;
    public static final int F = 0x7f0c0258;
    public static final int G = 0x7f0c018a;
    public static final int H = 0x7f0c02b5;
    public static final int I = 0x7f0c02b2;
    public static final int J = 0x7f0c0081;
    public static final int K = 0x7f0c02b3;
    public static final int a = 0x7f0c0002;
    public static final int b = 0x7f0c012a;
    public static final int c = 0x7f0c02c3;
    public static final int d = 0x7f0c02c4;
    public static final int e = 0x7f0c00a5;
    public static final int f = 0x7f0c02dc;
    public static final int g = 0x7f0c02e0;
    public static final int h = 0x7f0c02da;
    public static final int i = 0x7f0c02d7;
    public static final int j = 0x7f0c02db;
    public static final int k = 0x7f0c00ac;
    public static final int l = 0x7f0c00c1;
    public static final int m = 0x7f0c00ab;
    public static final int n = 0x7f0c0024;
    public static final int o = 0x7f0c00e4;
    public static final int p = 0x7f0c00e6;
    public static final int q = 0x7f0c00e7;
    public static final int r = 0x7f0c023b;
    public static final int s = 0x7f0c00e3;
    public static final int t = 0x7f0c00e5;
    public static final int u = 0x7f0c00bf;
    public static final int v = 0x7f0c02df;
    public static final int w = 0x7f0c02de;
    public static final int x = 0x7f0c00e2;
    public static final int y = 0x7f0c02d8;
    public static final int z = 0x7f0c02dd;
    private TimeInterpolator L;

    o()
    {
    }

    public void a(View view)
    {
        if (L == null)
        {
            L = (new ValueAnimator()).getInterpolator();
        }
        view.animate().setInterpolator(L);
    }
}
