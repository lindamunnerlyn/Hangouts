// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bts
    implements bpf
{

    final bpe a;
    final btp b;

    bts(btp btp1, bpe bpe)
    {
        b = btp1;
        a = bpe;
        super();
    }

    public void a(bpm bpm)
    {
    }

    public void a(gmt gmt1)
    {
        if (gmt1.g())
        {
            btp.a(b, a);
        }
    }
}
