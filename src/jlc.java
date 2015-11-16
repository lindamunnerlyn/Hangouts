// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlc extends jls
{

    public jlc()
    {
    }

    public jlr a()
    {
        switch (b)
        {
        default:
            return new jps(b, a);

        case 0: // '\0'
            return jlb.e();

        case 1: // '\001'
            return jlb.a(a[0].getKey(), a[0].getValue());
        }
    }

    public jls a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }
}
