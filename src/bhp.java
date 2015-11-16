// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Random;

public abstract class bhp extends bjx
    implements aqj, efa
{

    public static final Random f = new Random();

    public bhp()
    {
    }

    public static boolean a(dqb dqb1)
    {
        switch (bhq.a[dqb1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public abstract void C();

    public abstract void D();

    public abstract void G();

    public abstract boolean H();

    public abstract ceu M();

    public abstract String O();

    public abstract int R();

    public abstract Handler T();

    public abstract ani a();

    public abstract void a(bhr bhr);

    public abstract void a(CharSequence charsequence);

    public abstract boolean a(long l);

    public abstract void c(int i);

    public abstract String d(cey cey);

    public abstract void d(String s);

    public abstract String e(cey cey);

    public abstract String f(cey cey);

    public abstract String g(cey cey);

    public abstract boolean u();

}
