// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class apu
    implements apv
{

    public String a;
    int b;

    public apu(int i)
    {
        b = i;
    }

    public boolean a(int i, StringBuilder stringbuilder)
    {
        if (i == b)
        {
            a = stringbuilder.toString();
            return false;
        } else
        {
            return true;
        }
    }
}
