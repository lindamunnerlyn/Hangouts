// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class aqf
    implements aqd
{

    private final aqc a;

    protected aqf(aqc aqc)
    {
        a = aqc;
    }

    abstract boolean a(int i);

    public boolean a(int i, aqc aqc)
    {
        if (a == aqc)
        {
            return a(i);
        } else
        {
            return false;
        }
    }
}
