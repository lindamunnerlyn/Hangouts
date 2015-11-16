// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;

public final class egx
{

    private static final int a[];
    private static final int b[];
    private static final int c[];
    private static final int d[];
    private static final int e[];

    public static AnimationDrawable a(bkm bkm1)
    {
        AnimationDrawable animationdrawable;
        gdv.a();
        animationdrawable = new AnimationDrawable();
        int j = b.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.drawable.Drawable drawable = bkm1.getResources().getDrawable(b[i]);
        char c1;
        if (i == j - 1)
        {
            c1 = '\u01F4';
        } else
        {
            c1 = '!';
        }
        animationdrawable.addFrame(drawable, c1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            animationdrawable.setOneShot(false);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            eev.e("Babel", "OutOfMemory trying to create animation ellipsis", outofmemoryerror);
        }
        bkm1.b(new egy(animationdrawable));
        return animationdrawable;
    }

    public static AnimationDrawable b(bkm bkm1)
    {
        AnimationDrawable animationdrawable;
        gdv.a();
        animationdrawable = new AnimationDrawable();
        int j = a.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.drawable.Drawable drawable = bkm1.getResources().getDrawable(a[i]);
        char c1;
        if (i == j - 1)
        {
            c1 = '\u01F4';
        } else
        {
            c1 = ',';
        }
        animationdrawable.addFrame(drawable, c1);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            animationdrawable.setOneShot(false);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            eev.e("Babel", "OutOfMemory trying to create animation ellipsis", outofmemoryerror);
        }
        bkm1.b(new egz(animationdrawable));
        return animationdrawable;
    }

    static 
    {
        a = (new int[] {
            com.google.android.apps.hangouts.R.drawable.j, com.google.android.apps.hangouts.R.drawable.k, com.google.android.apps.hangouts.R.drawable.l, com.google.android.apps.hangouts.R.drawable.k, com.google.android.apps.hangouts.R.drawable.j, com.google.android.apps.hangouts.R.drawable.m, com.google.android.apps.hangouts.R.drawable.n, com.google.android.apps.hangouts.R.drawable.m, com.google.android.apps.hangouts.R.drawable.j, com.google.android.apps.hangouts.R.drawable.o, 
            com.google.android.apps.hangouts.R.drawable.p, com.google.android.apps.hangouts.R.drawable.o, com.google.android.apps.hangouts.R.drawable.j
        });
        b = (new int[] {
            com.google.android.apps.hangouts.R.drawable.q, com.google.android.apps.hangouts.R.drawable.r, com.google.android.apps.hangouts.R.drawable.s, com.google.android.apps.hangouts.R.drawable.t, com.google.android.apps.hangouts.R.drawable.u, com.google.android.apps.hangouts.R.drawable.v, com.google.android.apps.hangouts.R.drawable.w, com.google.android.apps.hangouts.R.drawable.x, com.google.android.apps.hangouts.R.drawable.y, com.google.android.apps.hangouts.R.drawable.z, 
            com.google.android.apps.hangouts.R.drawable.A, com.google.android.apps.hangouts.R.drawable.B, com.google.android.apps.hangouts.R.drawable.C, com.google.android.apps.hangouts.R.drawable.D, com.google.android.apps.hangouts.R.drawable.E, com.google.android.apps.hangouts.R.drawable.F, com.google.android.apps.hangouts.R.drawable.G, com.google.android.apps.hangouts.R.drawable.H, com.google.android.apps.hangouts.R.drawable.I, com.google.android.apps.hangouts.R.drawable.J
        });
        c = (new int[] {
            com.google.android.apps.hangouts.R.drawable.K, com.google.android.apps.hangouts.R.drawable.L, com.google.android.apps.hangouts.R.drawable.M, com.google.android.apps.hangouts.R.drawable.N, com.google.android.apps.hangouts.R.drawable.O, com.google.android.apps.hangouts.R.drawable.P, com.google.android.apps.hangouts.R.drawable.Q, com.google.android.apps.hangouts.R.drawable.R, com.google.android.apps.hangouts.R.drawable.S
        });
        d = (new int[] {
            com.google.android.apps.hangouts.R.drawable.T, com.google.android.apps.hangouts.R.drawable.U, com.google.android.apps.hangouts.R.drawable.V, com.google.android.apps.hangouts.R.drawable.W, com.google.android.apps.hangouts.R.drawable.X, com.google.android.apps.hangouts.R.drawable.Y, com.google.android.apps.hangouts.R.drawable.Z, com.google.android.apps.hangouts.R.drawable.aa, com.google.android.apps.hangouts.R.drawable.ab, com.google.android.apps.hangouts.R.drawable.ac, 
            com.google.android.apps.hangouts.R.drawable.ad, com.google.android.apps.hangouts.R.drawable.ae, com.google.android.apps.hangouts.R.drawable.af, com.google.android.apps.hangouts.R.drawable.ag, com.google.android.apps.hangouts.R.drawable.ah, com.google.android.apps.hangouts.R.drawable.ai, com.google.android.apps.hangouts.R.drawable.aj, com.google.android.apps.hangouts.R.drawable.ak, com.google.android.apps.hangouts.R.drawable.al, com.google.android.apps.hangouts.R.drawable.am
        });
        e = (new int[] {
            com.google.android.apps.hangouts.R.drawable.an, com.google.android.apps.hangouts.R.drawable.ao, com.google.android.apps.hangouts.R.drawable.ap, com.google.android.apps.hangouts.R.drawable.aq, com.google.android.apps.hangouts.R.drawable.ar, com.google.android.apps.hangouts.R.drawable.as, com.google.android.apps.hangouts.R.drawable.at, com.google.android.apps.hangouts.R.drawable.au, com.google.android.apps.hangouts.R.drawable.av
        });
    }
}
