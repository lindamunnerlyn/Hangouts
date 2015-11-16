// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jtu extends jqo
{

    final Object a[];
    final int b;

    jtu(int i, int j, Object aobj[], int k)
    {
        a = aobj;
        b = k;
        super(i, j);
    }

    protected Object a(int i)
    {
        return a[b + i];
    }
}
