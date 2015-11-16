// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gsk
    implements kxx
{

    private final gsj a;
    private final kxx b;

    public gsk(gsj gsj, kxx kxx1)
    {
        a = gsj;
        b = kxx1;
    }

    public Object a()
    {
        gse gse1 = (gse)b.a();
        if (gse1 == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return gse1;
        }
    }
}
