// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jld extends jlt
{

    private static final long serialVersionUID = 0L;

    jld(jlb jlb)
    {
        super(jlb);
    }

    Object readResolve()
    {
        return a(new jlc());
    }
}
