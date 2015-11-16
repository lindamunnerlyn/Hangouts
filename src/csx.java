// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class csx
{

    public long a;
    public Object b;

    public csx(Object obj, long l)
    {
        b = obj;
        a = l;
    }

    public boolean a(Object obj)
    {
        return obj == b || obj != null && obj.equals(b);
    }
}
