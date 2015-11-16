// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public abstract class yo
{

    public final ze a;
    private int b;

    private yo(ze ze)
    {
        b = 0x80000000;
        a = ze;
    }

    yo(ze ze, byte byte0)
    {
        this(ze);
    }

    public abstract int a(View view);

    public void a()
    {
        b = f();
    }

    public abstract void a(int i);

    public int b()
    {
        if (0x80000000 == b)
        {
            return 0;
        } else
        {
            return f() - b;
        }
    }

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();
}
