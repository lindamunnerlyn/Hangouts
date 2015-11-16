// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fpk
{

    int a;

    public fpk()
    {
        a = -1;
    }

    public fpj a()
    {
        boolean flag;
        if (a >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag, "Must provide valid client application ID!");
        return new fpj(this);
    }

    public fpk a(int i)
    {
        a = i;
        return this;
    }
}
