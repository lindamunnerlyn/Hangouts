// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbl extends kwm
{

    public lbl()
    {
        unknownFieldData = null;
        cachedSize = -1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L3:
        int i = kwj1.a();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 33;
           goto _L1 _L2
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L3; else goto _L2
_L2:
        return this;
    }
}
