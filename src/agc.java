// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class agc
{

    int a;
    int b;
    final int c;
    final float d;

    public agc()
    {
        this(2500, 1, 1.0F);
    }

    public agc(int i, int j, float f)
    {
        a = i;
        c = j;
        d = f;
    }

    private boolean c()
    {
        return b <= c;
    }

    public int a()
    {
        return a;
    }

    public void a(agf agf)
    {
        b = b + 1;
        a = (int)((float)a + (float)a * d);
        if (!c())
        {
            throw agf;
        } else
        {
            return;
        }
    }

    public int b()
    {
        return b;
    }
}
